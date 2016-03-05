import java.util.*;

public class prob12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dimensions = in.nextLine();
        int h = Integer.parseInt(dimensions.split(" ")[0]);
        int l = Integer.parseInt(dimensions.split(" ")[1]);
        
        char[][] program = new char[h][l];
        
        for(int i = 0; i < h; i++) {
            String line = in.nextLine();
            if(line.trim().equals("")) {
                i--;
                continue;
            }
            program[i] = line.toCharArray();
        }
        
        int y = (int) Math.ceil(((float)h)/2);
        int x = (int) Math.ceil(((float)l)/2);
        
        
        in.close();
    }
}
