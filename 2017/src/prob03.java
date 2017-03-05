import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String o = "";
        for (int i = 0; i < 3; i++) {
            float f = (float) in.nextInt();
            o += (f * 0.299792) + "\n";
        }
        System.out.println(o);
        in.close();
    }
}
