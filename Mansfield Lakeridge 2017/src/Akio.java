/**
 * Created by uil on 2/11/2017.
 */

import java.util.*;
import java.io.*;

public class Akio {

    static int shortestPath = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("akio.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            char[][] map = new char[10][10];
            for (int i = 0; i < map.length; i++) {
                map[i] = in.nextLine().toCharArray();
            }
            for (int i = 0; i < map.length; i++) {
                if(map[0][i]=='.') shortest(0,i,map,1);
            }
            for (int i = 0; i < map.length; i++) {
                if(map[map.length-1][i]=='.') shortest(map.length-1, i , map, 1);
            }
            for (int i = 0; i < map.length; i++) {
                if(map[i][0]=='.') shortest(i, 0, map, 1);
            }
            for (int i = 0; i < map.length; i++) {
                if(map[i][map.length-1] == '.') shortest(i,map.length-1,map, 1);
            }
            if(shortestPath==Integer.MAX_VALUE) shortestPath = 0;
            System.out.println(shortestPath);
            shortestPath = Integer.MAX_VALUE;
            in.nextLine();
        }
    }

    static void shortest(int x, int y, char[][]map, int count)
    {
        if(x<map.length && x>=0 && y<map[x].length && y>=0 && count < shortestPath)
        {
            if(map[x][y]=='o')
            {
                shortestPath = count < shortestPath? count : shortestPath;
            }
            else if(map[x][y] == '.')
            {
                map[x][y] = 'x';
                shortest(x+1,y,map,count+1);
                shortest(x-1,y,map,count+1);
                shortest(x,y-1,map,count+1);
                shortest(x,y+1,map,count+1);
                map[x][y] = '.';
            }
        }
    }
}
