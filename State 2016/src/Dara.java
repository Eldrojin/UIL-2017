import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by nguyenl on 12/7/2016.
 */
public class Dara {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("dara.dat"));

        while (in.hasNext()) {
            String mainExpression = in.nextLine();
            String[] parseExpression = mainExpression.split("( \\+ )|( - )");
            String[] operatorsRead = mainExpression.split("(X\\^\\d+)|(\\d+X\\^\\d+)|(\\d+X)|(\\d+)|(X)");
            LinkedList<String> operators = new LinkedList<>();
            for (String s : operatorsRead) {
                if (s.length() > 1)
                operators.add(s);
            }
            System.out.println(operators);
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

    public static String addOperators(LinkedList<String> operators, String[] build) {
        String fin = "";
        if (operators.size() > 0 && build.length > 1) {
            for (int i = 1; i < build.length; i++) {
                if (build[i].equals("0")) {
                    fin += build[i - 1];
                }
                 else if (build[i].length() > 0 && !build[i].equals("0")) {
                    fin += build[i - 1] + operators.poll();
                }
                else {
                    fin += build[i];
                }
            }
            return fin;
        }
        for (String s : build) {
            fin += s;
        }
        return fin;
    }
}
