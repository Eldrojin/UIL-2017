import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by isenseed on 10/19/2016.
 */
public class ForeignShoes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("foreignshoes.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            if (line[0].equals("Women")) {
                if (line[1].equals("UK")) {
                    System.out.println("Women US " + (Integer.parseInt(line[2]) + 2));
                } else {
                    System.out.println("Women UK " + (Integer.parseInt(line[2]) - 2));
                }
            }
            else if (line[0].equals("Men")) {
                if (line[1].equals("UK")) {
                    System.out.println("Men US " + (Integer.parseInt(line[2]) + 1));
                } else {
                    System.out.println("Men UK " + (Integer.parseInt(line[2]) - 1));
                }
            }
        }
    }
}
