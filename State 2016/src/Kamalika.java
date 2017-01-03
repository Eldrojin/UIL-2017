import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nguyenl on 1/3/2017.
 */
public class Kamalika {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("kamalika.dat"));

        while (in.hasNext()) {
            String[] line = in.nextLine().split(" ");
            double operand1 = new Double(line[0]);
            double operand2 = new Double(line[1]);
            Operated[] operateds = new Operated[]{
                    new Operated("Dif", operand1 - operand2),
                    new Operated("Div", operand1 / operand2),
                    new Operated("Mod", operand1 % operand2),
                    new Operated("Sum", operand1 + operand2),
                    new Operated("Prd", operand1 * operand2),
                    new Operated("B^A", Math.pow(operand2, operand1)),
                    new Operated("A^B", Math.pow(operand1, operand2))
            };
            Arrays.sort(operateds);
            System.out.printf("|%s%6.2f|%s%6.2f|%s%6.2f|%s%6.2f|%s%6.2f|%s%6.2f|%s%6.2f|%n",
                    operateds[0].type, operateds[0].operated,
                    operateds[1].type, operateds[1].operated,
                    operateds[2].type, operateds[2].operated,
                    operateds[3].type, operateds[3].operated,
                    operateds[4].type, operateds[4].operated,
                    operateds[5].type, operateds[5].operated,
                    operateds[6].type, operateds[6].operated);
        }
    }
}

class Operated implements Comparable{
    public String type;
    public double operated;

    public Operated(String type, double operated) {
        this.type = type;
        this.operated = operated;
    }

    @Override
    public int compareTo(Object o) {
        Operated d = (Operated) o;
        if (d.operated < operated) {
            return 1;
        } else if (d.operated > operated) {
            return -1;
        } else
            return 0;
    }
}