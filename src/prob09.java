import java.util.*;

public class prob09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line, o = "";
        while (!(line = in.nextLine()).equals("0 0 0")) {
            int l = Integer.parseInt(line.split(" ")[0]);
            int w = Integer.parseInt(line.split(" ")[1]);
            int d = Integer.parseInt(line.split(" ")[2]);
            int total = l * w * d;
            int notPainted = (l - 2) * (w - 2) * (d - 2);
            int painted = total - notPainted;
            o += "A " + l + "x" + w + "x" + d + " block is ";
            if (painted == notPainted) {
                o += "PERFECT.";
            }
            else if (painted > notPainted) {
                o += "MORE than Perfect.";
            }
            else if (notPainted > painted) {
                o += "LESS than Perfect.";
            }
            o += "\n";
        }
        System.out.println(o);
        in.close();
    }
}