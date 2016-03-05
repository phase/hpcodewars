import java.util.*;

public class prob11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line, o = "";
        while (!(line = in.nextLine()).equals("")) {
            String[] inputs = new String[] { "", "", "" };
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
                    inputs[count] += c;
                }
            }
            float[] inf = new float[] { Float.parseFloat(inputs[0]), Float.parseFloat(inputs[1]),
                    Float.parseFloat(inputs[2]) };
            
        }
        in.close();
    }
}