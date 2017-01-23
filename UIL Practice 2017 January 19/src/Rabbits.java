import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Rabbits {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("rabbits.dat"));
        int sets = new Integer(in.nextLine().trim());
        while (sets-- > 0) {
            int num = new Integer(in.nextLine().trim());
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println(recurse(num, list));
        }

    }

    public static int recurse(int n, ArrayList<Integer> list) {
        if (n <= 2)
            return 1;
        else
            return recurse(n - 1, list) + recurse(n - 2, list);
    }
}
