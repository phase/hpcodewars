import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        double v = Double.parseDouble(s.split(" ")[0]);
        double a = Double.parseDouble(s.split(" ")[1]);
        double t = Double.parseDouble(s.split(" ")[2]);
        while (true) {
            double d = (v * t) + (0.5d) * (a * (Math.pow(t, 2)));
            System.out.println(d);
            if (in.hasNext()) {
                s = in.nextLine();
                v = Double.parseDouble(s.split(" ")[0]);
                a = Double.parseDouble(s.split(" ")[1]);
                t = Double.parseDouble(s.split(" ")[2]);
            } else break;
            if (a == 0 && v == 0 && t == 0) break;
        }
        in.close();
    }
}
