/**
 * Created by uil on 2/11/2017.
 */

import java.util.*;
import java.io.*;

public class Isidora {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("isidora.dat"));

        while (in.hasNextLine()) {
            String[] line = in.nextLine().trim().split("\\s+");
            if (line[0].matches("RS..+"))
                System.out.println(Long.toBinaryString(new Long(line[1]) >> new Long(line[0].substring(3))));
            else if (line[0].matches("LS..+"))
                System.out.println(Long.toBinaryString(new Long(line[1]) << new Long(line[0].substring(3))));
            else if (line[0].matches("RC..+")) {
                String num = Long.toBinaryString(new Long(line[1]));
                String front = num.substring(0, num.length() - new Integer(line[0].substring(3)) % num.length());
                String back = num.substring(num.length() - (new Integer(line[0].substring(3))) % num.length());
                System.out.println(back + front);
            }
            else if (line[0].matches("LC..+")) {
                String num = Long.toBinaryString(new Long(line[1]));
                String front = num.substring(0, (new Integer(line[0].substring(3))) % num.length());
                String back = num.substring(new Integer(line[0].substring(3)) % num.length());
                System.out.println(back + front);
            }
        }
    }
}
