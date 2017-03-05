import java.util.Scanner;

/*
2
7 -321 524 12 0 924 -658 -2
5 246 -651 -650 -650 31
 */

public class prob06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        String o = "";
        for (int i = 0; i < amount; i++) {
            int count = in.nextInt();
//            List<Integer> out = new ArrayList<>(count);
            int[] nums = new int[count];
            for (int j = 0; j < count; j++) {
                nums[j] = in.nextInt();
            }

            int[] deltas = new int[count - 1];
            for (int l = 0; l < count - 1; l++) {
                deltas[l] = nums[l] - nums[l + 1];
            }

            for (int d = 0; d < count - 1; d++) {
                nums[d + 1] = nums[d] + deltas[d];
            }

            for (int n = 0; n < count; n++) {
                o += nums[n] + (n == count - 1 ? "" : " ");
            }
            o += "\n";
        }
        System.out.println(o);
        in.close();
    }
}
