import java.util.*;

public class prob05 {
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
            int c = Integer.parseInt(line.split(" ")[0]);
            String code = line.split(" ")[1];
            String g = "";
            for(int m = 0; m < code.length(); m++) {
                if(m%c==0){
                    continue;
                }
                g += code.toCharArray()[m];
            }
            o += g + " " + g.length() + "\n";
        }
        System.out.println(o);
        in.close();
    }
}