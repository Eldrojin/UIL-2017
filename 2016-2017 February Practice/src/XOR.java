/**
 * Created by uil on 2/9/2017.
 */

import java.util.*;
import java.io.*;

public class XOR {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("xor.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            int num = new Integer(in.nextLine().trim());
            String[] line = in.nextLine().trim().split("\\s+");
            ArrayList<Integer> list = new ArrayList<>();
            for (String s: line)
                list.add(new Integer(s));
            //while (list.size() > 1) {
                for (int i = 0; i < list.size() - 1; i++) {
                    for (int e = i + 1; e < list.size(); e++)
                        if (list.get(e) == list.get(i)) {
                            list.remove(e);
                            list.remove(i);
                        }
                }
            //}

            System.out.println(list.get(0));
        }
    }
}
