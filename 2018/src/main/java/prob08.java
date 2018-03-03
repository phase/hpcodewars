import java.util.Scanner;

public class prob08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int length = 0;
        do {
            String s = in.nextLine();
            start = Integer.parseInt(s.split(" ")[0]);
            length = Integer.parseInt(s.split(" ")[1]);
            if (start == 0 && length == 0) break;
//            System.out.println(start + " " + length);
            String buffer = "";
            int i = 0;
            for (int j = start; buffer.length() + (j + "").length() < length + 1; j++) {
                i = buffer.length();
                buffer += j;
//                System.out.println(buffer);
            }
            String result = buffer.substring(i);
            if (result.equals("")) result = "0";
            System.out.println(s + " " + result);
        } while (!(start == 0 && length == 0));
        in.close();
    }
}
