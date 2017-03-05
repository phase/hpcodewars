import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class prob16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cubeCount = in.nextInt();
        char[][] cubes = new char[cubeCount][6];
        for (int cube = 0; cube < cubeCount; cube++) {
            for (int i = 0; i < 6; i++) {
                cubes[cube][i] = in.next().charAt(0);
            }
        }

        int wordCount = in.nextInt();
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = in.next();
        }

        for (String word : words) {
            if (word.length() > cubeCount) {
                System.out.println(word + " CANNOT be formed");
                continue;
            }

            boolean[] flags = new boolean[word.length()];
            List<Integer> usedCubes = new ArrayList<>();
            for (int c = 0; c < word.length(); c++) {
                boolean flag = false;
                char want = word.charAt(c);
                l:
                for (int k = 0; k < cubeCount; k++) {
                    for (int d = 0; d < 6; d++) {
                        if (usedCubes.contains(k)) {
                            flag = false;
                            continue;
                        }
                        if (cubes[k][d] == want) {
                            usedCubes.add(k);
                            flag = true;
                            break l;
                        } else {
                            flag = false;
                        }
                    }
                }
                flags[c] = flag;
            }

            boolean c = true;
            for (int f = 0; f < flags.length; f++) {
                if (flags[f] == false) {
                    c = false;
                }
            }
            if (c)
                System.out.println(word + " can be formed");
            else
                System.out.println(word + " CANNOT be formed");
        }
        in.close();
    }
}
