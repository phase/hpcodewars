import java.util.Scanner;

public class prob08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long min = in.nextLong();
        long max = in.nextLong();
        while (!(min == 0 && max == 0)) {
            int amount = 0;
            for (long i = min; i <= max; i++) {
                int p = 0;
                for (char c : Long.toBinaryString(i).toCharArray()) {
                    if (c == '1') p++;
                }
                if (p % 2 == 0) amount++;
            }
            System.out.println(amount);
            min = in.nextLong();
            max = in.nextLong();
        }
        in.close();
    }
}
