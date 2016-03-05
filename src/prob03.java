import java.util.*;

public class prob03 {
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
            boolean like = false;
            char b = 'b';
            for (char c : line.toCharArray()) {
                if (c == b) {
                    like = true;
                }
                b = c;
            }
            if (like) {
                o += "likes " + line + "\n";
            }
            else {
                o += "hates " + line + "\n";
            }
        }
        System.out.println(o);
        in.close();
    }
}