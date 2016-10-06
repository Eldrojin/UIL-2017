import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/5/2016.
 */
public class mazemap {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("mazemap.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            //Read line in
            String[] line = in.nextLine().split(" ");
            //Maze size
            int size = Integer.parseInt(line[0]);
            //Column locations read in
            char[] columns = line[1].toCharArray();
            char[] rows = line[2].toCharArray();

            //Each hex character representative
            String build = "";
            //Final combined string stitched together to be printed out in the end
            String fullBuild = "";
            //Columns
            for (int j = 0; j < columns.length; j++) {
                //integer value of hex character
                int num = Integer.parseInt("" + columns[j], 16);
                //binary representation of the hex character
                build = Integer.toString(Integer.parseInt("" + columns[j], 16), 2);
                //realign the numbers less than 8 to have 4 bits
                if (num < 8 && num >= 4) {
                    build = "0" + build;
                } else if (num <= 4 && num > 1) {
                    build = "00" + build;
                } else if (num == 1) {
                    build = "000" + build;
                } else if (num == 0) {
                    build = "0000";
                }
                fullBuild += build;
            }
            for (int i = 0; i < fullBuild.length() - 1;) {
                int b = 0;
                for (int j = 0; j < size - 1 && i < fullBuild.length() - 1 && i + j < fullBuild.length(); j++, b++) {
                    if (b == 4) {
                        b = 0;
                    }
                    System.out.print(fullBuild.charAt(i + j));
                }
                i += size - 1;
                System.out.print(" ");
                for (int j = 0; j < 4 - b; j++) {
                    i++;
                }
            }
            System.out.println();
            //Rows
            build = ""; fullBuild = "";
            for (int j = 0; j < rows.length; j++) {
                //integer value of hex character
                int num = Integer.parseInt("" + rows[j], 16);
                //binary representation of the hex character
                build = Integer.toString(Integer.parseInt("" + rows[j], 16), 2);
                //realign the numbers less than 8 to have 4 bits
                if (num < 8 && num >= 4) {
                    build = "0" + build;
                } else if (num < 4 && num > 1){
                    build = "00" + build;
                } else if (num == 1) {
                    build = "000" + build;
                } else if (num == 0) {
                    build = "0000";
                }
                //System.out.println(build);
                fullBuild += build;
            }
            //System.out.println(fullBuild);
            for (int i = 0; i < fullBuild.length() - 1;) {
                int b = 0;
                for (int j = 0; j < size - 1 && i < fullBuild.length() - 1 && i + j < fullBuild.length(); j++, b++) {
                    if (b == 4) {
                        b = 0;
                    }
                    System.out.print(fullBuild.charAt(i + j));
                }
                i += size - 1;
                System.out.print(" ");
                for (int j = 0; j < 4 - b; j++) {
                    i++;
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}
