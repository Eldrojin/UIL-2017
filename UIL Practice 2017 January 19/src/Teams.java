import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.io.*;

public class Teams {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("teams.dat"));
        int sets = new Integer(in.nextLine().trim());
        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (sets-- > 0) {
            String[] line = in.nextLine().trim().split("\\s+");
            list.add(new Integer(line[0]));
            Collections.sort(list);
            map.put(new Integer(line[0]), new Integer(line[1]));
            int mid = 0;
            if (list.size() % 2 == 1)
                mid = list.get(list.size() / 2);
            else
                mid = list.get(list.size() / 2 - 1);
            Map<Integer, Integer> young = map.subMap(list.get(0), true, mid, true);
            //System.out.println(young.keySet().toString());
            Map<Integer, Integer> old = map.subMap(mid, false, list.get(list.size() - 1), true);
            //System.out.println(old.keySet().toString());
            int yt = 0;
            int ot = 0;
            for (int i: young.keySet())
                yt += young.get(i);
            for (int i: old.keySet())
                ot += old.get(i);
            System.out.println(Math.abs(yt - ot));
        }
    }
}
