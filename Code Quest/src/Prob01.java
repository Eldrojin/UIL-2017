/*
ID: 18nguye1
LANG: JAVA
PROG: 
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prob01 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob01.in.txt"));
        while (in.hasNext()) {
            int dim = new Integer(in.nextLine());
            for (int i = 0; i < dim; i++) {
                String build = "";
                for (int j = 0; j < dim; j++) {
                    build += "# ";
                }
                System.out.println(build.trim());
            }
        }
    }
}
