import java.util.*;

public class prob17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, ArrayList<Crate>> docks = new HashMap<>();
        docks.put("A", new ArrayList<>());
        docks.put("B", new ArrayList<>());
        docks.put("C", new ArrayList<>());
        ArrayList<String> sentTrainNames = new ArrayList<>();
        ArrayList<ArrayList<Crate>> sentTrains = new ArrayList<>();
        String l = in.nextLine();
        ArrayList<Crate> queue = new ArrayList<>();
        while (!l.equals("DONE")) {
            String command = l.substring(0, 4);
            if (command.equals("RECV")) {
                String name = l.split(" ")[1];
                int size = Integer.parseInt(l.split(" ")[2]);
                Crate c = new Crate(name, size);
                queue.add(c);
//                System.out.println(name + " added to queue");
            } else if (command.equals("LOAD")) {
                Crate c = queue.get(0);
                queue.remove(0);
                String dock = l.split(" ")[1];
                docks.get(dock).add(c);
//                System.out.println("loaded " + c.name + " to " + dock);
            } else if (command.equals("XFER")) {
                String a = l.split(" ")[1];
                String b = l.split(" ")[2];
                ArrayList<Crate> t = docks.get(a);
                Crate ac = t.get(t.size() - 1);
                docks.get(a).remove(t.size() - 1);
                docks.get(b).add(ac);
//                System.out.println("xfer " + ac.name + " from " + a + " to " + b);

            } else if (command.equals("SEND")) {
                String d = l.split(" ")[1];
//                System.out.println("sending " + d);
                sentTrains.add(docks.get(d));
                docks.put(d, new ArrayList<>());
                sentTrainNames.add(d);
            }
            l = in.nextLine();
        }
//        System.out.println("Sent train size " + sentTrains.size());
        for (ArrayList<Crate> crates : sentTrains) {
            int index = sentTrains.indexOf(crates);
            System.out.println("VACTRAIN " + (index + 1));
            Collections.reverse(crates);
            for (Crate c : crates) {
                System.out.println(c.name + " " + c.size);
            }
        }

        in.close();
    }

    public static class Crate {
        public String name;
        public int size;

        public Crate(String n, int s) {
            name = n;
            size = s;
        }
    }
}
