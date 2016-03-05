import java.util.*;

public class prob06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String o = "";
        for (int i = 0; i < a; i++) {
            String line = in.nextLine();
            if (line.trim().equals("")) {
                i--;
                continue;
            }
            double t = Double.parseDouble(line.split(" ")[0]);
            double t0 = Double.parseDouble(line.split(" ")[1]);
            double t1 = Double.parseDouble(line.split(" ")[2]);
            double c0 = Double.parseDouble(line.split(" ")[3]) / 8;
            double c1 = Double.parseDouble(line.split(" ")[4]) / 8;
            double slope = (c1 - c0) / (t1 - t0);
            double y = slope * (t - t0) + c0;
            o += y + "\n";
        }
        System.out.println(o);
        in.close();
    }
}