import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/24/2016.
 */
public class BubblePop2 {
    static char[][] map = new char[10][10];
    static int count = 0;
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
            char letter = map[rows][col];
            for (int i = rows; i >= 1; i--) {
                char temp = map[i - 1][col];
                map[i - 1][col] = map[i][col];
                map[i][col] = temp;
            }
            change(rows, col, letter);
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void change(int r, int c, char l) {
        if (r >= 0 && r < map.length && c >= 0 && c < map[r].length && map[r][c] == l && map[r][c] != 'X') {
            map[r][c] = 'X';
            change(r + 1, c, l);
            change(r - 1, c, l);
            change(r, c - 1, l);
            change(r, c + 1, l);
        }
    }
}
