import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = Integer.parseInt(in.nextLine());
        for (int i = 0; i < c; i++) {
            String s = in.nextLine();
            int top = (int) Math.sqrt(Integer.parseInt(s.split(" ")[0]));
            int layers = Integer.parseInt(s.split(" ")[1]);
            int leaders = 0;
            for (int j = top; j < top + layers; j++) {
                if (j == top) {
                    leaders += j * j;
                } else {
                    leaders += (j - 2) * 2 + 3;
                }
                if (j == 1) {
                    leaders += 4;
                } else {
                    leaders += 4 * j;
                }
            }
            System.out.println(leaders + " liters");
        }
        in.close();
    }
}
