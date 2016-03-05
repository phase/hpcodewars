import java.util.*;

public class prob02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        String o = "";
        while((i = in.nextInt()) != 0) {
            o += i + " gallons per week will last " + ((int)Math.ceil(10000/i)) + " weeks\n";
        }
        System.out.println(o);
        in.close();
    }
}