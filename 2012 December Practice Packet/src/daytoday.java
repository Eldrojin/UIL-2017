import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by nguyenl on 9/29/2016.
 */
public class daytoday {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("daytoday.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            Calendar date1 = new GregorianCalendar(Integer.parseInt(line[2]), Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            Calendar date2 = new GregorianCalendar(Integer.parseInt(line[5]), Integer.parseInt(line[3]) , Integer.parseInt(line[4]));
            long date3 = Math.abs(date2.getTimeInMillis() - date1.getTimeInMillis());
            //-1 due to day starting at 0
            System.out.println(TimeUnit.DAYS.convert(date3, TimeUnit.MILLISECONDS) - 1);
        }
    }
}
