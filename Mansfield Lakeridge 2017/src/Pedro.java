/**
 * Created by uil on 2/11/2017.
 */

import java.util.*;
import java.io.*;

public class Pedro {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("pedro.dat"));

        while (in.hasNextLine()) {
            ArrayList<String> cats = new ArrayList<>();
            String[] line = in.nextLine().trim().split("\\s+");
            int num = new Integer(line[0]);
            for (int i = 1; i < line.length; i++)
                cats.add(line[i]);
            TreeSet<String> set = new TreeSet<>();
            for (int i = 0; i < 10000; i++) {
                TreeSet<String> temp = new TreeSet<>();
                ArrayList<String> catsTemp = new ArrayList<>();
                for (String s: cats)
                    catsTemp.add(s);
                for (int e = 0; e < num; e++) {
                    int random = (int)Math.random() * catsTemp.size();
                    temp.add(catsTemp.get(random));
                    catsTemp.remove(random);
                }
                String s ="";
                for (String s1: temp) {
                    s+= s1+" ";
                }
                set.add(s);
            }
            for (String s: set) {
                    System.out.print(s + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
