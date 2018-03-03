import java.util.Scanner;

public class prob06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        for (int i = 0; i < a; i++) {
            String s = in.nextLine();
            int n = 0;
            String o = "VALID";
            char five = '0';
            char six = '0';
            l:
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    if (n == 4) five = c;
                    if (n == 5) six = c;
                    if (n >= 6) break l;
//                    System.out.println("n=" + n + ";c=" + c);
                    switch (n) {
                        case 0:
                        case 3:
                            if (c == '0' || c == '1') {
                                o = "INVALID";
                                break l;
                            }
                            break;
                        case 1:
                            if (c == '9') {
                                o = "INVALID";
                                break l;
                            }
                            break;
                        case 5:
                            if (five == '1' && six == '1') {
                                o = "INVALID";
                                break l;
                            }
                            break;
                    }
                    n++;
                }
            }
            System.out.println(s + " " + o);
        }
        in.close();
    }
}
