/**
 * Created by uil on 2/11/2017.
 */

import java.util.*;
import java.io.*;

public class Danna {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("danna.dat"));

        int total = 0;
        int u = 0;
        int n = 0;
        int ov = 0;
        int ob = 0;

        while (in.hasNextLine()) {
            String[] line = in.nextLine().trim().split("\\s+");
            int h = new Integer(line[0]);
            int w = new Integer(line[1]);
            double height = h * 0.0254;
            double weight = w * 0.453592;
            double bmi = weight / Math.pow(height, 2);
            String c;
            if (bmi < 18.5) {
                u++;
                c = "underweight";
            }
            else if (bmi < 25.0) {
                c = "normal";
                n++;
            }
            else if (bmi < 30) {
                c = "overweight";
                ov++;
            }
            else {
                c = "obese";
                ob++;
            }
            total++;
            System.out.printf("%d %d %.2f %s%n", h, w, bmi, c);
        }
        System.out.println(total + " total students surveyed");
        System.out.printf("%.2f%s%n", (double)u / (double)total * 100, "% underweight");
        System.out.printf("%.2f%s%n", (double)n / (double)total * 100, "% normal");
        System.out.printf("%.2f%s%n", (double)ov / (double)total * 100, "% overweight");
        System.out.printf("%.2f%s%n", (double)ob / (double)total * 100, "% obese");
    }
}
