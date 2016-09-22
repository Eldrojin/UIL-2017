import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Long on 9/21/2016.
 */
public class Puddle {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("puddle.dat"));
        char[][] map = new char[in.nextInt()][in.nextInt()];
        in.nextLine();
        for (int i = 0; i < map.length; i++) {
            char[] line = in.nextLine().toCharArray();
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = line[j];
            }
        }

        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            String[] coords = in.nextLine().split(" ");
            if (map[Integer.parseInt(coords[0])][Integer.parseInt(coords[1])] == 'G') {

            }
        }
    }
}
