import java.util.Scanner;

public class prob04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        String o = "";
        for (int i = 0; i < amount; i++) {
            float a = Float.parseFloat(in.next());
            float b = Float.parseFloat(in.next()) / 60;
            o += (a / b) + "\n";
        }
        System.out.println(o);
        in.close();
    }
}
