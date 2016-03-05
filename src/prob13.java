import java.util.*;

public class prob13 {
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
            // get values into object
            String[] values = new String[] { "", "", "", "", "", "", "", "" };
            int count = 0;
            boolean started = false;
            for (char c : line.toCharArray()) {
                if (c == ' ') {
                    if (started) {
                        started = false;
                        count++;
                    }
                }
                else {
                    started = true;
                    values[count] += c;
                }
            }
            String name = values[0];
            double raHours = Double.parseDouble(values[1]);
            double raMinutes = Double.parseDouble(values[2]);
            double decDegrees = Double.parseDouble(values[3]);
            double decMinutes = Double.parseDouble(values[4]);
            String starClass = values[5];
            double magnitude = Double.parseDouble(values[6]);
            double ly = Double.parseDouble(values[7]);
            // math
            double r = ly;
            double theta = (90 - (decDegrees + ((decDegrees > 0 ? decMinutes : -decMinutes) / 60))) * Math.PI / 180;
            double phi = ((raHours * 15) + (raMinutes / 4)) * Math.PI / 180;
            // System.out.println(phi + " : " + theta);
            double x = r * Math.sin(theta) * Math.cos(phi);
            double y = r * Math.sin(theta) * Math.sin(phi);
            double z = r * Math.cos(theta);
            o += name + " x=" + x + ", y=" + y + ", z=" + z + "\n";
        }
        System.out.println(o);
        in.close();
    }
}
