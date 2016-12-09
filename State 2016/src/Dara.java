import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by nguyenl on 12/7/2016.
 */
public class Dara {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("dara.dat"));

        while (in.hasNext()) {
            String mainExpression = in.nextLine();
            String[] parseExpression = mainExpression.split("( \\+ )|( - )");
            String[] operatorsRead = mainExpression.split("(\\d+X\\^\\d+)|(\\d+X)|(\\d+)");
            LinkedList<String> operators = new LinkedList<>();
            for (String s : operatorsRead) {
                operators.add(s);
            }
            String[] build1 = derivatives(parseExpression);
            String[] build2 = derivatives(derivatives(parseExpression));
            System.out.println(addOperators(operators, build1));
        }
    }

    public static String[] derivatives(String[] parseExpression) {
        String[] build = new String[parseExpression.length];
        for (int i = 0; i < parseExpression.length; i++) {
            if (!parseExpression[i].contains("X")) {
                build[i] = "" + 0;
            } else {
                if (parseExpression[i].contains("^")) {
                    String[] term = parseExpression[i].split("X\\^");
                    int operand1 = 0, operand2 = 0;
                    if (term[0].equals("")) {
                        build[i] = term[1] + "X^" + (Integer.parseInt(term[1]) - 1);
                    } else {
                        operand1 = new Integer(term[0]);
                        operand2 = new Integer(term[1]);
                        operand1 *= operand2--;
                        build[i] = operand1 + "X^" + operand2;
                    }
                } else {
                    build[i] = (parseExpression[i].split("X").length <= 0) ?
                    "" + 1 : (parseExpression[i].split("X")[0]);
                }
            }
            build[i] = build[i].replace("X^1", "X");
        }
        return build;
    }

    public static ArrayList<String> addOperators(LinkedList<String> operators, String[] build) {
        ArrayList<String> finalBuild = new ArrayList<>();
        for (int i = 0; i < build.length; i++) {
            if (!build[i].equals("0")) {
                finalBuild.add(build[i]);
                operators.add(operators.remove(i));
            } else
                operators.remove();
        }
        return finalBuild;
    }
}
