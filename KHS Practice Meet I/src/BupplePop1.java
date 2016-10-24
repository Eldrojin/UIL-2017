import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/24/2016.
 */
public class BupplePop1 {
    static char[][] map = new char[10][10];
    static int counter = 0;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("bubblepop1.dat"));
        for (int i = 0; i < 10; i++) {
            char[] line = in.nextLine().toCharArray();
            for (int j = 0; j < 10; j++) {
                map[i][j] = line[j];
            }
        }

        int sets = Integer.parseInt(in.nextLine().trim());
        while (sets-- > 0) {
            int rows = in.nextInt();
            int col = in.nextInt();
            counter = 0;
            char letter = map[rows][col];
            change(rows, col, letter);
            System.out.println(counter > 2 ? "YES " + counter : "NO");
        }
    }

    static void change(int r, int c, char l) {
        if (r >= 0 && r < map.length && c >= 0 && c < map[r].length && map[r][c] == l && map[r][c] != 'V') {
            counter++;
            map[r][c] = 'V';
            change(r + 1, c, l);
            change(r - 1, c, l);
            change(r, c - 1, l);
            change(r, c + 1, l);
        }
    }
}
