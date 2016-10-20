import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by isenseed on 10/19/2016.
 */
public class KoolAid {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("koolaid.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            int totPeeps = in.nextInt();
            int halfLiter = 0, oneLiter = 0, twoLiter = 0;
            while (totPeeps >= 4) {
                totPeeps -= 4;
                twoLiter++;
            }
            while (totPeeps >= 2) {
                totPeeps -= 2;
                oneLiter++;
            }
            while (totPeeps >= 1) {
                totPeeps -= 1;
                halfLiter++;
            }
            String output = "";
            if (twoLiter > 0) {
                output += twoLiter + " large ";
            }
            if (oneLiter > 0) {
                output += oneLiter + " medium ";
            }
            if (halfLiter > 0) {
                output += halfLiter + " small ";
            }
            System.out.println(output.substring(0, output.length() - 1));
        }
    }
}
