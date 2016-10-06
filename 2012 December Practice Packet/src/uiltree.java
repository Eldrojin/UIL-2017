import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/5/2016.
 */
public class uiltree {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("ytree.dat"));
        while (in.hasNext()) {
            int size = in.nextInt();
            int spaces = 0;

            //Calculate the Width
            int width = 1;
            for (int i = 2; i < size; i++) {
                width += 2;
            }

            for (int i = 0; i < size - 1; i++, spaces++, width-=2) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("***");
                for (int j = 0; j < width; j++) {
                    System.out.print(" ");
                }
                System.out.print("***");
                System.out.println();
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*****\n");

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < spaces + 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("***");
                System.out.println();
            }
        }
    }
}
