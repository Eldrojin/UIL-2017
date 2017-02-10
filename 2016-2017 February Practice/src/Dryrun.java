/**
 * Created by uil on 2/9/2017.
 */

import java.util.*;
import java.io.*;

public class Dryrun {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dryrun.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            System.out.println("I like " + in.nextLine() + ".");
        }
    }
}
