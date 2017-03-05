import java.util.Scanner;

public class prob11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int threshold = in.nextInt();
        int wordCount = in.nextInt();
        int[] wordLengths = new int[wordCount];
        for (int i = 0; i < wordCount; i++) {
            wordLengths[i] = in.nextInt();
        }

        char[][] letters = new char[rows][cols];
        int[] letterCount = new int[26];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                letters[r][c] = in.next().charAt(0);
                letterCount[letters[r][c] - 'A']++;
            }
        }

        int currentLength = 0;
        int lengthIndex = 0;
        int maxLength = wordLengths[lengthIndex++];
        l:
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (letterCount[letters[r][c] - 'A'] < threshold) {
                    System.out.print(letters[r][c]);
                    currentLength++;
                    if (currentLength == maxLength) {
                        if (lengthIndex + 1 > wordLengths.length) {
                            break l;
                        }
                        maxLength = wordLengths[lengthIndex++];
                        currentLength = 0;
                        System.out.print(' ');
                    }
                }
            }
        }

        /*
        int row = 0;
        int col = 0;
        for (int i = 0; i < wordCount; i++) {
            for (int j = 0; j < wordLengths[i]; j++) {
                l:
                for (int r = row; r < rows; r++) {
                    for (int c = col; c < cols; c++) {

                        if (letterCount[letters[r][c] - 'A'] < threshold) {
                            System.out.print(letters[r][c]);
                            if (col + 1 >= cols - 1) {
                                col = 0;
                                row = r + 1;
                            } else {
                                col = c + 1;
                            }
                            break l;
                        }
                    }
                    col = 0;
                }
            }
            System.out.print(" ");
        }
*/
        in.close();
    }
}
