import java.util.*;

public class prob04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        String o = "";
        while (!(line = in.nextLine()).equals("0 0")) {
            double a = Double.parseDouble(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);
            double d = (a * (Math.pow(10, b + 2)));
            d = Math.round(d);
            d /= 100;
            String ds = d + "";
            char last0 = ds.toCharArray()[ds.length()-1];
            char last1 = ds.toCharArray()[ds.length()-2];
            if(last1 == '.' && last0 == '0') ds += "0";
            o += ds + "\n";
        }
        System.out.println(o);
        in.close();
    }
}