import java.util.Scanner;

public class prob04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = Integer.parseInt(in.nextLine());
        for (int line = 0; line < lines; line++) {
            String l = in.nextLine();
            int g = Integer.parseInt(l.split(" ")[0]);
            int s = Integer.parseInt(l.split(" ")[1]);
            int b = Integer.parseInt(l.split(" ")[2]);
            //
            int d = b / 5;
            s += d;
            b %= 5;
            d = s / 10;
            s %= 10;
            g += d;
//            System.out.println("silver=" + s);
            if (s == 0) {
                g--;
                s += 10;
            }
            if (b == 0) {
                s--;
                b += 5;
            }
            if (s == 0) {
                g--;
                s += 10;
            }
            System.out.println(g + " " + s + " " + b);
        }
        in.close();
    }
}
