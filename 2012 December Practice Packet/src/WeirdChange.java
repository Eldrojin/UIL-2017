import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/3/2016.
 */
public class WeirdChange {
    static int coin1 = Integer.MAX_VALUE, coin5 = Integer.MAX_VALUE, coin13 = Integer.MAX_VALUE, coin23 = Integer.MAX_VALUE, coin37 = Integer.MAX_VALUE, coin47 = Integer.MAX_VALUE;
    static ArrayList<Integer[]> list = new ArrayList<>();
    static int uilUILCoins;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("weirdChange.dat"));
        while (in.hasNext()) {
            int uilCoins = in.nextInt();
            //Total Coin Amount
            uilUILCoins = uilCoins;
            double cost = uilCoins * .03;
            coin1 = Integer.MAX_VALUE; coin5 = Integer.MAX_VALUE; coin13 = Integer.MAX_VALUE; coin23 = Integer.MAX_VALUE; coin37 = Integer.MAX_VALUE; coin47 = Integer.MAX_VALUE;
            list = new ArrayList<>();
            int index = 0, max = Integer.MAX_VALUE;
            findInt(uilCoins, 0, 0, 0, 0, 0, 0);
            //Find the least amount of coins
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)[0] < max) {
                    max = list.get(i)[0];
                    index = i;
                }
            }
            //Store the coins with the least
            Integer[] list2 = list.get(index);
            System.out.printf("$%.2f %d %d %d %d %d %d%n", cost, list2[1], list2[2], list2[3], list2[4], list2[5], list2[6]);
        }
    }

    public static void findInt(int uilCoins, int coin47, int coin37, int coin23, int coin13, int coin5, int coin1) {
        if (uilCoins <= 0) {
            //If it adds up then add it to the total list of solutions
            if ((coin47 * 47) + (coin37 * 37) + (coin23 * 23) + (coin13 * 13) + (coin5 * 5) + coin1 <= uilUILCoins)
            list.add(new Integer[] {coin47 + coin37 + coin23 + coin13 + coin5 + coin1 ,coin47, coin37, coin23, coin13, coin5, coin1});
        }
        else {
            //Test each combination
            if (uilCoins >= 47) {
                coin47++;
                findInt(uilCoins - 47, coin47, coin37, coin23, coin13, coin5, coin1);
                coin47--;
            }
            if (uilCoins >= 37) {
                coin37++;
                findInt(uilCoins - 37, coin47, coin37, coin23, coin13, coin5, coin1);
                coin37--;
            }
            if (uilCoins >= 23) {
                coin23++;
                findInt(uilCoins - 23, coin47, coin37, coin23, coin13, coin5, coin1);
                coin23--;
            }
            if (uilCoins >= 13) {
                coin13++;
                findInt(uilCoins - 13, coin47, coin37, coin23, coin13, coin5, coin1);
                coin13--;
            }
            if (uilCoins >= 5) {
                coin5++;
                findInt(uilCoins - 5, coin47, coin37, coin23, coin13, coin5, coin1);
                coin5--;
            } else {
                coin1++;
                findInt(uilCoins - 1, coin47, coin37, coin23, coin13, coin5, coin1);
                coin1--;
            }
        }
    }
}
