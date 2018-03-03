import java.util.Scanner;

public class prob09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        do {
            a = Integer.parseInt(in.nextLine());
            if (a == 0) break;
            String b = Integer.toBinaryString(a);
            int ones = 0;
            int zeros = 0;
            for (char c : b.toCharArray()) {
                if (c == '1') ones++;
                else if (c == '0') zeros++;
            }
            if (zeros > ones) {
                System.out.println(a + " LIGHT");
            } else if (ones > zeros) {
                System.out.println(a + " HEAVY");
            } else if (zeros == ones) {
                System.out.println(a + " BALANCED");
            }
        } while (a != 0);
        in.close();
    }
}
