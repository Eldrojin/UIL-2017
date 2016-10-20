import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by isenseed on 10/19/2016.
 */
public class DeerTags {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("deertags.dat"));

        int dead = 0;
        int alive = 0;
        int coyote = 0;
        int mountainLion = 0;
        int bear = 0;
        int naturalCauses = 0;
        double deadPercentage = 0;
        double alivePercentage = 0;
        double coyotePercentage = 0;
        double mountainLionPercentage = 0;
        double bearPercentage = 0;
        double naturalCausesPercentage = 0;
        int total = 0;

        LinkedList<Deer> deers = new LinkedList<>();
        while (in.hasNext()) {
            String[] line = in.nextLine().split(" ");
            if (line[1].equalsIgnoreCase("NEW")) {
                deers.add(new Deer(line[0], line[1], ""));
                alive++;
                total++;
            }
            else if (line[1].equalsIgnoreCase("DEAD")){
                deers.set(Integer.parseInt(line[0].substring(1)) - 1, new Deer(line[0], "DEAD", line[3]));
                dead++;
                alive--;
                switch (line[3]) {
                    case "NATURAL":
                        naturalCauses++;
                        break;
                    case "COYOTE":
                        coyote++;
                        break;
                    case "MOUNTAIN":
                        mountainLion++;
                        break;
                    case "BEAR":
                        bear++;
                        break;
                }
            }
        }
        System.out.printf("ALIVE %.0f%c%n", (double) alive / total * 100, '%');
        coyotePercentage = (double) coyote / total * 100;
        mountainLionPercentage = (double) mountainLion / total * 100;
        naturalCausesPercentage = (double) naturalCauses / total * 100;
        bearPercentage = (double) bear / total * 100;
        double[] toSort = new double[]{coyotePercentage, mountainLionPercentage, naturalCausesPercentage, bearPercentage};
        Arrays.sort(toSort);
        for (int i = toSort.length - 1; i >= 0; i--) {
            if (toSort[i] == mountainLionPercentage) {
                System.out.printf("MOUNTTAIN LION %.0f%c%n", mountainLionPercentage, '%');
            } if (toSort[i] == naturalCausesPercentage) {
                System.out.printf("NATURAL CAUSES %.0f%c%n", naturalCausesPercentage, '%');
            } if (toSort[i] == coyotePercentage) {
                System.out.printf("COYOTE %.0f%c%n", coyotePercentage, '%');
            } if (toSort[i] == bearPercentage) {
                System.out.printf("BEAR %.0f%c%n", bearPercentage, '%');
            }
        }
    }
}

class Deer {
    public String id;
    public String status;
    public String CoD;
    public int index = -1;

    public Deer(String id, String status, String CoD) {
        this.id = id;
        this.status = status;
        this.CoD = CoD;
        index++;
    }


}
