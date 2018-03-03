import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        do {
            s = in.nextLine();
            if (s.equals("0")) break;
            String o = "MAGNANIMOUS";
            for (int i = 0; i < s.length() - 1; i++) {
                int a = Integer.parseInt(s.substring(0, i + 1));
                int b = Integer.parseInt(s.substring(i + 1, s.length()));
                int c = a + b;
//                System.out.println(a + " + " + b + " = " + c + " isPrime: " + isPrime(c));
                if (!isPrime(c)) {
                    o = "PETTY";
                }
            }
            System.out.println(s + " " + o);
        } while (!s.equals("0"));
        in.close();
    }

    public static boolean isPrime(int a) {
        if (a == 2) return true;
        if (a == 1) return false;
        int s = (int) Math.ceil(Math.sqrt(a));
//        System.out.println("s " + s);
        for (int i = s; i > 1; i--) {
            double d = a / ((double) i);
//            System.out.println("d " + d);
            if (d == Math.ceil(d)) {
                return false;
            }
        }
        return true;
    }
}
