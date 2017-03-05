import java.util.Scanner;

public class prob05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        String o = "";
        float minTime = -1;
        for(int i = 0; i < amount; i++) {
            String teamName = in.next();
            float a = in.nextFloat();
            float b = in.nextFloat();
            float c = a / b;
            if(minTime == -1 || c < minTime) {
                minTime = c;
                o = teamName + " " + c;
            }
        }
        System.out.println(o);
        in.close();
    }
}
