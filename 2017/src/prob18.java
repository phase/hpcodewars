import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
8
KayoTick M P B 130 Lash 3 60 Torment 4 100
Rariticuno S P A 120 Darken 2 40 BlackOut 4 90
Rhinopony B L N 110 Trample 2 30 Skewer 4 90
RainbowSlash N F W 60 Shine 1 20 Dash 3 60
Valkysiren A M S 70 EnchantingSong 1 30 FlyBy 3 50
Ponyta F W N 70 Kindle 1 10 Burninate 2 40
TwilightPony P P X 80 Gallop 1 20 PlasmaBeam 4 80
Pinkachu L B S 60 Zapu 1 10 PikaLunch 3 70
5
RainbowSlash Ponyta
Pinkachu KayoTick
Rariticuno TwilightPony
Ponyta Valkysiren
Valkysiren Ponyta

 */
public class prob18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        List<PonyMon> ponymons = new ArrayList<>();
        for (int a = 0; a < amount; a++) {

            PonyMon p = new PonyMon(in.next(), in.next().charAt(0), in.next().charAt(0), in.next().charAt(0), in.nextInt(), null);
            System.out.println(p.name);
            p.attacks = new Attack[]{new Attack(
                    in.next(),
                    in.nextInt(),
                    in.nextInt()),
                    new Attack(
                            in.next(),
                            in.nextInt(),
                            in.nextInt())};
            ponymons.add(p);

        }

        int battles = in.nextInt();
        for (int battle = 0; battle < battles; battle++) {
            String f = in.next();
            String s = in.next();
            PonyMon first = null;
            PonyMon second = null;

            for (PonyMon p : ponymons) {
                if (p.name.equals(f))
                    first = p;
                else if (p.name.equals(s))
                    second = p;
            }

            float fm = 1;
            if (first.type == second.weakness) {
                fm = 2;
            } else if (first.type == second.resistance) {
                fm = 0.5f;
            }
            float sm = 1;
            if (second.type == first.weakness) {
                sm = 2;
            } else if (second.type == first.resistance) {
                sm = 0.5f;
            }

            Attack firstAttack;
            if (first.sameTurns()) {
                firstAttack = first.getMostDamage();
            } else {
                firstAttack = first.getLeastTurns();
            }

            Attack secondAttack;
            if (second.sameTurns()) {
                secondAttack = second.getMostDamage();
            } else {
                secondAttack = second.getLeastTurns();
            }

            double fc = Math.ceil((first.health / (secondAttack.damage * sm))) * secondAttack.charge; // seocnd to kill first
            double sc = Math.ceil((second.health / (firstAttack.damage * fm))) * firstAttack.charge; // first to kill second

            if (fc > sc) {
                System.out.println(f + " defeats " + s + " with " + (int) (first.health - (Math.floor((sc-1)) / secondAttack.charge) * (secondAttack.damage * sm)) + " HP remaining.");
            } else {
                System.out.println(s + " defeats " + f + " with " + (int) (second.health - Math.floor(fc / firstAttack.charge) * (firstAttack.damage * fm)) + " HP remaining.");
            }
        }

        in.close();
    }

    static class PonyMon {
        String name;
        char type;
        char weakness;
        char resistance;
        int health;
        Attack[] attacks;

        public PonyMon(String name, char type, char weakness, char resistance, int health, Attack[] attacks) {
            this.name = name;
            this.type = type;
            this.weakness = weakness;
            this.resistance = resistance;
            this.health = health;
            this.attacks = attacks;
        }

        public Attack getLeastTurns() {
            if (attacks[0].charge < attacks[1].charge) {
                return attacks[0];
            } else return attacks[1];
        }

        public boolean sameTurns() {
            return attacks[0].charge == attacks[1].charge;
        }

        public Attack getMostDamage() {
            if (attacks[0].damage > attacks[1].damage) {
                return attacks[0];
            } else return attacks[1];
        }
    }

    static class Attack {
        String name;
        int charge;
        int damage;

        public Attack(String name, int charge, int damage) {
            this.name = name;
            this.charge = charge;
            this.damage = damage;
        }
    }
}
