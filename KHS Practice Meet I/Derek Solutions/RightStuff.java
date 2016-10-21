/**
 * Created by isenseed on 10/19/2016.
 */
import java.io.*;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
public class RightStuff {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("rightstuff.dat"));
        int sets = Integer.parseInt(in.nextLine());
        boolean accu = false;
        boolean prec = false;

        while (sets-- > 0) {
            String[] s = in.nextLine().split(" ");
            double acc = Double.parseDouble(s[0]); //accepted answer

            //accuracy work
            double avg = 0; double inc = 0;
            for (int i = 0; i < s.length; i++) {
                avg += Double.parseDouble(s[i]);
                inc++;
            }
            avg /= inc;

            if(1-(avg/acc)<=.05) {
                accu = true;
            }
            //accuracy work done

            //precision work, got highest value
            double high = 0; double valOne = 0; double valTwo = 0;
            for (int i = 1; i < s.length-1; i++) {
                valOne = Double.parseDouble(s[i]); valTwo = Double.parseDouble(s[i+1]);
                if(valOne > valTwo)
                    if(valOne > high)
                        high = valOne;
                if(valTwo > valOne)
                    if(valTwo > high)
                        high = valTwo;
            }

            //for lowest value
            double low = Double.parseDouble(s[1]); valOne = 0; valTwo = 0;
            for (int i = 1; i < s.length-1; i++) {
                valOne = Double.parseDouble(s[i]); valTwo = Double.parseDouble(s[i+1]);
                if(valOne < valTwo)
                    if(valOne < low)
                        low = valOne;
                if(valTwo < valOne)
                    if(valTwo < low)
                        low = valTwo;
            }
            System.out.println((1-(high-low))/acc);
            if((1-(high-low))/acc<=.1 && !(((1-(high-low))/acc < 0))) //fix how prec is being trued/falsed
                prec = true;
            //precision work done
            System.out.println("prec: " + prec + " accu: " + accu);


            if (prec && accu) {
                System.out.println("Both");
            }
            else if(prec)
                System.out.println("Precise");
            else if (accu) {
                System.out.println("Accurate");
            }
            else
                System.out.println("Neither");
            System.out.println();
        }
    }
}
