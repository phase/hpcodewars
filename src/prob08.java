import java.util.*;

public class prob08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        String o = "";
        for (int a = 0; a < lines; a++) {
            String line = in.nextLine();
            if (line.trim().equals("")) {
                a--;
                continue;
            }
            int l = line.length() - 1;
            String total = "";
            for (int spaces = 0; spaces < l; spaces++)
                total += " ";
            total += line;
            for (int spaces = 0; spaces < l; spaces++)
                total += " ";
            for (int i = 0; i < line.length() * 2 - 1; i++) {
                for(int j = i; j < i + line.length(); j++) {
                    o += total.toCharArray()[j];
                }
                o += "\n";
            }
            o += "\n";
        }
        System.out.println(o);
        in.close();
    }
}