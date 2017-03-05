import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int m = Integer.parseInt(s.split(" ")[0]);
        int v = Integer.parseInt(s.split(" ")[1]);
        System.out.println(m * v);
        in.close();
    }
}
