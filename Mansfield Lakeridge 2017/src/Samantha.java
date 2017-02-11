/**
 * Created by uil on 2/11/2017.
 */

import java.util.*;
import java.io.*;

public class Samantha {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("samantha.dat"));

        while (in.hasNextLine()) {
            String[] line = in.nextLine().trim().split("\\s+");
            int x = new Integer(line[0]);
            int n = new Integer(line[1]);
            ArrayList<Integer> list = new ArrayList<>();
            int i = 2;

            while (n-- > 0)
                list.add(new Integer(line[i++]));
            Collections.sort(list);
            int total = 0;
            for (int i1: list)
                total += i1;
            int mean = total / (line.length - 2);
            int median;

            if (list.size() % 2 == 1)
                median = list.get(list.size() / 2);
            else
                median = (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2;
            int ls = 0;
            int hs = 0;
            for (int i1: list) {
                if (i1 < mean)
                    ls += i1;
                else
                    hs += i1;
            }
            int sf = (int)(((.06 + x *  .07) * ls) + (4 * x * .0789  * hs));
            System.out.println(mean + " " + median + " " + sf);

        }
    }
}
