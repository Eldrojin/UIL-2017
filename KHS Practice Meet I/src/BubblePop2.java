import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/24/2016.
 */
public class BubblePop2 {
    //Editing Array
    static char[][] map = new char[10][10];
    static int count = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("bubblepop2.dat"));
        //Fill Array Up
        for (int i = 0; i < 10; i++) {
            char[] line = in.nextLine().toCharArray();
            for (int j = 0; j < 10; j++) {
                map[i][j] = line[j];
            }
        }

        //Data sets
        int sets = Integer.parseInt(in.nextLine().trim());
        while (sets-- > 0) {
            int rows = in.nextInt();
            int col = in.nextInt();
            char letter = map[rows][col];
            //Pop!
            change(rows, col, letter);
            //Go through all columns and search for any possible 'X'
            for (int i = 0; i <= 9; i++) {
                //bubble sort the 'X' up
                for (int k = 0; k < 9; k++) {
                    for (int j = 9; j > 0; j--) {
                        //Swap
                        if (map[j][i] == 'X') {
                            char temp = map[j - 1][i];
                            map[j - 1][i] = map[j][i];
                            map[j][i] = temp;
                        }
                    }
                }
            }
        }
        //Print everything out
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    //Pop
    static void change(int r, int c, char l) {
        //If in bounds and is linked to the pop chain
        if (r >= 0 && r < map.length && c >= 0 && c < map[r].length && map[r][c] == l && map[r][c] != 'X') {
            //Start popping
            map[r][c] = 'X';
            change(r + 1, c, l);
            change(r - 1, c, l);
            change(r, c - 1, l);
            change(r, c + 1, l);
        }
    }
}
