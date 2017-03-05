import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prob07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        for (int l = 0; l < lines; l++) {
            int[] nums = new int[6];
            List<Float> temp = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                nums[i] = in.nextInt();
            }
            float error = in.nextFloat();
            int step = 0;
            temp.add((float) nums[0]);
            boolean flag = true;
            while (flag) {
                temp.add(nums[3] + (nums[1] * temp.get(step) + nums[4]) / (nums[2] * temp.get(step) + nums[5]));
                float e = Math.abs(temp.get(step + 1) - temp.get(step));
                if (e < error) {
                    System.out.println(temp.get(step + 1));
                    flag = false;
                }
                step++;
                if (step >= 100) {
                    System.out.println("DIVERGES");
                    flag = false;
                }
            }
        }
        in.close();
    }
}
