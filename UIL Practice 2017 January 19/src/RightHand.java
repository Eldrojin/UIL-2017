import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 1/23/2017.
 */
public class RightHand {
    public static boolean hey = false;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("righthand.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            hey = false;
            int size = new Integer(in.nextLine());
            char[][] map = new char[size][size];

//            fill map
            for (int i = 0; i < size; i++) {
                char[] line = in.nextLine().toCharArray();
                for (int j = 0; j < line.length; j++) {
                    map[i][j] = line[j];
                }
            }

            recurse(0, 0, map);
            System.out.println(hey ? "YES" : "NO");
        }
    }

    public static void recurse(int r, int c, char[][] map) {
        if (r >= 0 && r < map.length && c >= 0 && c < map[r].length && map[r][c] != '#' && map[r][c] != 'V') {
            if (r == map.length - 1 && c == map[r].length - 1) {
                hey = true;
                return;
            }
            map[r][c] = 'V';
            recurse(r, c + 1, map);
            recurse(r + 1, c, map);
            recurse(r, c - 1, map);
            recurse(r - 1, c, map);
        }
    }
}
