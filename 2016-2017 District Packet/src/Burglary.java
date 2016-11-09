import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/9/2016.
 */
public class Burglary {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("burglary.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            int rooms = Integer.parseInt(in.nextLine());
            ArrayList<Room> list = new ArrayList<>();
            String[] line = in.nextLine().split(" ");
            Room.total = 0;
            Room.roomNum = -1;
            for (int i = 0; i < rooms; i++) {
                list.add(new Room(new Double(line[i])));
            }

            double probability = 1.00;
            double maxMoney = Double.MIN_VALUE;
            int roomVal = -1;
            double sum = 0;
            for (int i = 0; i < rooms; i++) {
                sum += list.get(i).money;
                if (sum * probability > maxMoney) {
                    maxMoney = sum * probability;
                    roomVal = list.get(i).roomNum;
                }
                probability -= .05;
            }

            System.out.printf("%d %.2f%n", roomVal, maxMoney);
        }
    }
}

class Room {
    public double money;
    public static int roomNum = -1;
    public static double total;

    public Room(double money) {
        this.money = money;
        roomNum++;
        total += money;
    }
}
