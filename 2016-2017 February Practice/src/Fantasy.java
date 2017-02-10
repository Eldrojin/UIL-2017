/**
 * Created by uil on 2/9/2017.
 */

import java.util.*;
import java.io.*;

public class Fantasy {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("fantasy.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().trim().split("\\s+");
            int members = new Integer(line[2]);
            double[] aStats = new double[11];
            double[] bStats = new double[11];

            for (int i = 0; i < members; i++) {
                String[] stats = in.nextLine().trim().split("\\s+");
                for (int e = 0; e < 11; e++)
                    aStats[e] += new Double(stats[e]);
            }
            for (int i = 0; i < members; i++) {
                String[] stats = in.nextLine().trim().split("\\s+");
                for (int e = 0; e < 11; e++)
                    bStats[e] += new Double(stats[e]);
            }
            int aPoints = 0;
            int bPoints = 0;

            if (!(aStats[1] == 0.0 && bStats[1] == 0.0)) {
                if (!(aStats[0] / aStats[1] == bStats[0] / bStats[1]))
                    if (aStats[0] / aStats[1] > bStats[0] / bStats[1])
                        aPoints++;
                    else
                        bPoints++;
            }
            else if (aStats[0] > bStats[0])
                aPoints++;
            else
                bPoints++;

            if (!(aStats[3] == 0.0 && bStats[3] == 0.0)) {
                if (!(aStats[2] / aStats[3] == bStats[2] / bStats[3]))
                    if (aStats[2] / aStats[3] > bStats[2] / bStats[3])
                        aPoints++;
                    else
                        bPoints++;
            }
            else if (aStats[2] > bStats[2])
                aPoints++;
            else
                bPoints++;

            if (!(aStats[4] == bStats[4]))
                if (aStats[4] > bStats[4])
                    aPoints++;
                else
                    bPoints++;
            if (!(aStats[5] == bStats[5]))
                if (aStats[5] > bStats[5])
                    aPoints++;
                else
                    bPoints++;
            if (!(aStats[6] == bStats[6]))
                if (aStats[6] > bStats[6])
                    aPoints++;
                else
                    bPoints++;
            if (!(aStats[7] == bStats[7]))
                if (aStats[7] > bStats[7])
                    aPoints++;
                else
                    bPoints++;
            if (!(aStats[8] == bStats[8]))
                if (aStats[8] > bStats[8])
                    aPoints++;
                else
                    bPoints++;
            if (!(aStats[9] == bStats[9]))
                if (aStats[9] > bStats[9])
                    aPoints++;
                else
                    bPoints++;
            if (!(aStats[10] == bStats[10]))
                if (aStats[10] > bStats[10])
                    bPoints++;
                else
                    aPoints++;

            if (aPoints > bPoints)
                System.out.println(line[0] + " wins!");
            else if (bPoints > aPoints)
                System.out.println(line[1] + " wins!");
            else
                System.out.println("Tie.");
        }
    }
}
