import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/30/2016.
 */
public class Snapshot {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("snapshot.dat"));
        ArrayList<Classroom> classes = new ArrayList<>();

        while (in.hasNext()) {
            String[] line = in.nextLine().split(" ");
            classes.add(new Classroom(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])));
        }

        Collections.sort(classes);

        int sum1 = 0;
        int sum2 = 0;
        for (Classroom aClass : classes) {
            sum1 += aClass.totEnrolled;
            sum2 += aClass.numTardy;
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(classes.get(0).index);
        for (Classroom aClass : classes) {
            System.out.print(aClass.index + " ");
        }
        System.out.println();
    }
}

class Classroom implements Comparable {
    public int totEnrolled;
    public int numAbsent;
    public int numTardy;
    public static int indexes = 0;
    public int index;

    public Classroom(int totEnrolled, int numAbsent, int numTardy) {
        this.totEnrolled = totEnrolled;
        this.numAbsent = numAbsent;
        this.numTardy = numTardy;
        ++indexes;
        this.index = indexes;
    }

    @Override
    public int compareTo(Object o) {
        Classroom other = (Classroom)o;
        if (other.numAbsent > numAbsent) {
            return -1;
        } else
            return 1;
    }
}
