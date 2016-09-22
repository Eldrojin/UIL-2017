import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/22/2016.
 */
public class Puddle {
    public static char[][] map;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("puddle.dat"));
        String[] line = in.nextLine().split(" ");
        char[][] map1 = new char[Integer.parseInt(line[1])][Integer.parseInt(line[0])];
        for (int i = 0; i < map1.length; i++) {
            char[] line1 = in.nextLine().toCharArray();
            for (int j = 0; j < map1[i].length; j++) {
                map1[i][j] = line1[j];
            }
        }

        map = map1.clone();

        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            String[] coordinates = in.nextLine().split(" ");
            int x = Integer.parseInt(coordinates[0]), y = Integer.parseInt(coordinates[1]);
            if (map[x][y] == 'R' || map[x][y] == 'S') {
                System.out.println("OOPS!");
                continue;
            } if (map[x][y] == 'G') {
                System.out.println("OK");
            } if (map[x][y] == 'W') {
                System.out.println("PUDDLE");
                freezeWAter(x, y);
            }
        }
        System.out.println();
        for (char[] line1 : map) {
            for (char c : line1) {
                System.out.print(Character.toString(c));
            }
            System.out.println();
        }
    }

    public static void freezeWAter(int x, int y) {
        if (x >= 0 && x < map[x].length && y >= 0 && y < map.length && map[x][y] != 'G' && map[x][y] != 'R' && map[x][y] != 'S' && map[x][y] != 'F') {
            map[x][y] = 'F';
            freezeWAter(x + 1, y);
            freezeWAter(x, y + 1);
            freezeWAter(x - 1, y);
            freezeWAter(x, y - 1);
        }
    }
}
