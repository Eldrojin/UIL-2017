import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/14/2016.
 */
public class Joust {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("joust.dat"));
        int sets = new Integer(in.nextLine());
        int cases = 1;
        while (sets-- > 0) {
            int kNum = new Integer(in.nextLine());
            LinkedList<Knight> knights = new LinkedList<>();
            for (int i = 0; i < kNum; i++) {
                String[] line = in.nextLine().split(" ");
                knights.offer(new Knight(line[0], new Integer(line[1])));
            }
            while (knights.size() > 4) {
                Knight k1 = knights.poll();
                Knight k2 = knights.poll();
                Knight winner;

                if (k1.skill > k2.skill)
                    winner = k1;
                else
                    winner = k2;
                knights.offer(winner);
            }

            Knight k1 = knights.poll();
            Knight k2 = knights.poll();

            Knight first;
            Knight second;
            Knight third;
            Knight winner1;
            Knight winner2;
            Knight loser1;
            Knight loser2;

            if (k1.skill > k2.skill){
                winner1 = k1;
                loser1 = k2;
            } else {
                winner1 = k2;
                loser1 = k1;
            }

            Knight k3 = knights.poll();
            Knight k4 = knights.poll();

            if (k3.skill > k4.skill){
                winner2 = k3;
                loser2 = k4;
            } else {
                winner2 = k4;
                loser2 = k3;
            }

            if (winner1.skill > winner2.skill){
                first = winner1;
                second = winner2;
            } else {
                first = winner2;
                second = winner1;
            }

            if (loser1.skill > loser2.skill){
                third = loser1;
            } else {
                third = loser2;
            }

            System.out.println("Case " + cases++ + ":");
            System.out.println("1: " + first);
            System.out.println("2: " + second);
            System.out.println("3: " + third);
            System.out.println();
        }
    }
}

class Knight {
    public String name;
    public int skill;

    public Knight(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return name + " " + skill;
    }
}
