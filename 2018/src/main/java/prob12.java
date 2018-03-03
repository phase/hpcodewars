import java.util.*;

public class prob12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = Integer.parseInt(in.nextLine());
        int[][] harvey = new int[h][26];
        ArrayList<String> harveyCases = new ArrayList<>();

        for (int i = 0; i < h; i++) {
            String s = in.nextLine();
            harveyCases.add(s);
        }
        Collections.sort(harveyCases);

        for (int i = 0; i < h; i++) {
            String s = harveyCases.get(i);
            harveyCases.add(s);
            s = s.replaceAll(" ", "");
            for (char c : s.toCharArray()) {
                harvey[i][c - 'A']++;
            }
        }

        int p = Integer.parseInt(in.nextLine());
        int[][] phil = new int[p][26];
        ArrayList<String> philCases = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            String s = in.nextLine();
            philCases.add(s);
            s = s.replaceAll(" ", "");
            for (char c : s.toCharArray()) {
                phil[i][c - 'A']++;
            }
        }

        ArrayList<String> iv = new ArrayList<>();
        ArrayList<Boolean> ib = new ArrayList<>();
        Map<int[], Boolean> indexes = new HashMap<>();
        l:for (int i = 0; i < phil.length; i++) {
            int[] k = phil[i];
            for (int j = 0; j < harvey.length; j++) {
                int[] l = harvey[j];
                boolean b = Arrays.equals(k, l);
                if (b) {
                    /*for (int[] is : indexes.keySet()) {
                        if (is[0] == i) {
                            int oldHIndex = is[1];
                            int newHIndex = is[2];
                        }
                    }*/
                    iv.add(harveyCases.get(j));
                    ib.add(true);
                    indexes.put(new int[]{i, j}, true);
                    continue l;
                }
            }
            iv.add("-2");
            ib.add(false);
            indexes.put(new int[]{i, -1}, false);
        }

        for(int i = 0; i < iv.size(); i++) {
            String key = iv.get(i);
            boolean v = ib.get(i);
            if(v) {
                System.out.println("Yes: " + key);
            } else {
                System.out.println("No: No matching case");
            }
        }

//        for (int i = 0; i < indexes.size(); i++) {
//            int[] key = (int[]) indexes.keySet().toArray()[i];
//            boolean value = indexes.get(key);
//            if(value) {
//                int hi = key[0];
//                String name = harveyCases.get(hi);
//                System.out.println("Yes: " + name);
//            } else {
//                System.out.println("No: No matching case");
//            }
//        }


        in.close();
    }
}
