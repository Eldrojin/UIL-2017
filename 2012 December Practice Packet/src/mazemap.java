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
            String[] line = in.nextLine().split(" ");
            int size = Integer.parseInt(line[0]);
            char[] columns = line[1].toCharArray();

            String build = "";
            String fullBuild = "";
            for (int j = 0; j < columns.length; j++) {
                int num = Integer.parseInt("" + columns[j], 16);
                build = Integer.toString(Integer.parseInt("" + columns[j], 16), 2);
                if (num < 8 && num > 4) {
                    build = "0" + build;
                } else if (num <= 4 && num > 1) {
                    build = "0" + build;
                } else if (num == 1) {
                    build = "00" + build;
                } else if (num == 0) {
                    build = "0000";
                }
                System.out.print(build + " ");
                if (build.lastIndexOf("1") < size - 1) {
                    //System.out.print(build.substring(0, size - 1) + " | ");
                    fullBuild += build.substring(0, size - 1);
                } else
                    //System.out.print(build.substring(0, build.lastIndexOf("1") > 0 ? build.lastIndexOf("1") + 1 : 0) + " | ");
                    fullBuild += build.substring(0, build.lastIndexOf("1") > 0 ? build.lastIndexOf("1") + 1 : 0);
            }
            for (int i = size - 1; i < fullBuild.length(); i+=size - 1) {
                System.out.print(fullBuild.substring(i - (size - 1), i) + " ");
            }
            System.out.println();
        }
    }
}
