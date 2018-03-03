import java.util.Arrays;
import java.util.Scanner;

public class prob07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        do {
            int firstSpace = s.indexOf(' ');
            String nums = s.substring(firstSpace + 1);
            String[] n = nums.split(" ");
            int[] ni = new int[n.length];
            int ini = 0;
            for (String ns : n) {
                ni[ini] = Integer.parseInt(ns);
                ini++;
            }
            Arrays.sort(ni);
//            System.out.println(Arrays.toString(ni));
            if (ni[0] < 0 && ni[1] < 0) {
                int f = ni[0] * ni[1];
                int t = ni[ni.length - 3] * ni[ni.length - 2];
                int v = Math.max(f, t);
                int i = ni[ni.length - 1] * v;
                System.out.println(i);
            } else {
                int i = ni[ni.length - 3] * ni[ni.length - 2] * ni[ni.length - 1];
                System.out.println(i);
            }

            s = in.nextLine();
        } while (!s.equals("0"));
        in.close();
    }
}
