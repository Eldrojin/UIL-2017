import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/30/2016.
 */
public class gender_race {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("gender_race.dat"));
        int sets = Integer.parseInt(in.nextLine());
        ArrayList<Person> racers = new ArrayList<>();

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            racers.add(new Person(line[0], Integer.parseInt(line[1]), line[2]));
        }

        Collections.sort(racers);
        System.out.println(racers.get(0));
        System.out.println(racers.get(1));
        for (int i = 0, maleCounter = 0; i < racers.size(); i++) {
            if (racers.get(i).isMale) {
                System.out.println(racers.get(i));
                maleCounter++;
            }
            if (maleCounter == 2) {
                break;
            }
        }

        for (int i = 0, maleCounter = 0; i < racers.size(); i++) {
            if (!racers.get(i).isMale) {
                System.out.println(racers.get(i));
                maleCounter++;
            }
            if (maleCounter == 2) {
                break;
            }
        }
        //System.out.println(racers);
    }
}

class Person implements Comparable {
    public int speed;
    public String name;
    public String gender;
    public boolean isMale;

    public Person(String name, int speed, String gender) {
        this.name = name;
        this.speed = speed;
        this.gender = gender;
        isMale = gender.equals("M") ? true : false;
    }

    @Override
    public int compareTo(Object a) {
        Person tester = (Person)a;
        if (tester.speed > this.speed) {
            return -1;
        } else
            return 1;
    }

    @Override
    public String toString() {
        return name + " " + speed + " " + gender;
    }
}
