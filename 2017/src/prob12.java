import java.util.Scanner;

public class prob12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String o = "";
        int pairs = in.nextInt();
        for (int pair = 0; pair < pairs; pair++) {
            int[] tutors = new int[in.nextInt()];
            for (int t = 0; t < tutors.length; t++) tutors[t] = in.nextInt();
            int[] tutees = new int[in.nextInt()];
            for (int t = 0; t < tutees.length; t++) tutees[t] = in.nextInt();

            long total = 0;
            for (int tutor : tutors) {
                for (int tutee : tutees) {
                    if (tutor > tutee)
                        total++;
                }
            }
            o += total + "\n";
        }
        System.out.println(o);
        in.close();
    }
}
