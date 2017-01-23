import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Bank {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("bank.dat"));
        int sets = new Integer(in.nextLine().trim());
        while (sets-- > 0) {
            String[] nums = in.nextLine().trim().split("\\D");
            BigInteger total = new BigInteger("0");
            if (nums.length == 0)
                System.out.println("-");
            else {

                for (String s : nums)
                    if (!s.equals("")) {
                        total = total.add(new BigInteger(s));
                        System.out.print(new Integer(s) + " ");
                    }
                System.out.println();
            }
            System.out.println(total);
        }
    }
}
