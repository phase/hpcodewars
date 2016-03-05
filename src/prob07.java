import java.util.*;

public class prob07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        String o = "";
        for (int i = 0; i < times; i++) {
            String line = in.nextLine();
            if (line.trim().equals("")) {
                i--;
                continue;
            }
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
            System.out.println(Arrays.toString(inputs));
            ArrayList<Character> countedChars = new ArrayList<Character>();
            for (int a1 = 0; a1 < inputs[0].length(); a1++) {
                char c1 = inputs[0].toCharArray()[a1];
                boolean yes = false;
                for (int a2 = 0; a2 < inputs[1].length(); a2++) {
                    char c2 = inputs[1].toCharArray()[a2];
                    if (c1 == c2) {
                        yes = true;
                    }
                }
                if (yes) {
                    for (int a3 = 0; a3 < inputs[2].length(); a3++) {
                        char c3 = inputs[1].toCharArray()[a3];
                        if (c1 == c3) {
                            yes = true;
                        }
                    }
                }
            }
            String letters = "";
            for (char c : countedChars) {
                letters += c;
            }
            System.out.println(letters);
            o += letters + "\n";
        }
        System.out.println(o);
        in.close();
    }
}