import javax.print.DocFlavor;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dystr on 5/6/2017.
 */
/* Pages to keep track of
    Pg 136: Method Audtoboxing when overloading I

 */
public class Playground implements Testable {
    static int pp;
    public Playground() {
        pp++;
    }
    //Playground p = new Playground();
    public static void main(String[] args) {
        Playground p = new Playground();
        System.out.println(pp);
        int[] test[] = new int[3][3];
        //String Pool Notes
//        String s1 = "funny poop";
//        String s2 = "funny poop";
//        String s3 = new String("funny poop");
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s3);

        //Time Notes
//        LocalDate date1 = LocalDate.of(2017, Month.MAY, 21);
//        LocalTime time1 = LocalTime.of(11, 39, 20);
//        LocalTime time2 = LocalTime.of(11, 39);
//        LocalDateTime dateTime1 = LocalDateTime.of(1, 2, 3, 4, 5, 6);
//        Period period1 = Period.of(1, 2, 3);
//        Period period2 = Period.ofYears(1);
////        System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
////        System.out.println(time1.format(DateTimeFormatter.ISO_LOCAL_TIME));
////        System.out.println(dateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        // VarArgs Notes
//        varArg(1, 2, 5, 1234, 351, 83);
//        varArg(new int[]{1, 561, 1234});
//        varArg(new Integer("234"), new Integer("593q1"));
//        varArg(new Integer[]{new Integer("431"), new Integer("123"), new Integer("38383")});
//        varArg(new Integer[]{1234, 1266, 8938});


        //Lambda Expressions Test
//        ArrayList<String> test = new ArrayList<>();
//        test.add("a");
//        test.add("b");
//        test.add("3");
//        test.removeIf((String a) -> a.contains("a"));
//        System.out.println(test);
//        byte a = 5;
//        int b = 5;
//        int1(b);

        //No Generic Collection Test
//        List<Integer> list = Arrays.asList(4, 5, 1234, 56, 535, 1234, 6676, 439);
//        ArrayList list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add("test");
//        System.out.println(list);

//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(3);
//        intList.add("test");

        //Mutable String Test
//        StringBuilder a = new StringBuilder("test");
//        changeString(a);
//        System.out.println(a);
//        changeString(a);
//        System.out.println(a);

//        ArrayList<String> listy = new ArrayList<>();
//        listy.add("poop");
//        ICantHoldItIn(listy);
//        System.out.println(listy);
//        ICantHoldItIn(listy);
//        System.out.println(listy);

        //Testing interfaces and abstract classes
//        Testable.analysis();

        //Testing Switch Statement
//        int aa = 4;
//        int poop = 3;
//        switch (aa) {
//            case 1:
//                System.out.println("p");
//                break;
//            case 2:
//                System.out.println("po");
//                break;
//            case 4:
//                System.out.println("poop");
//                break;
//            case 5:
//                System.out.println("stop it");
//                break;
//            default:
//                System.out.println("diarrhea");
//                break;
//        }
        //Interface static final public variables
//        System.out.println(Testable.tess);
//        System.out.println(Testable.test);
//        System.out.println(Testable.tests);
        //Switch ordering
//        switch (10 % 4) {
//            default:
//                System.out.println("not divisible by 4");
//            case 0:
//                System.out.println("divisible by 4");
//        }
        //String Builder Constructors
//        StringBuilder b = new StringBuilder(5);
//        StringBuilder b1 = new StringBuilder(5.0);
//        StringBuilder b2 = new StringBuilder(false);
//        StringBuilder b3 = new StringBuilder();
        int1(new Integer("5"));
        //Try catch ordering
//        try {
//
//        } finally { }
//         catch (Exception e) { }

//        if (new Object() == new int[] {4132}) {
//
//        }
//        if (new Object() == new Integer(5)) {
//
//        }
//        if (new Object() == 5) {
//
//        }

    }

    public void poopInTheWoods() {
        System.out.println("I couldn't hold it in!");
    }

    public static void changeString (StringBuilder a) {
        a.append(" poop");
    }

    public static void ICantHoldItIn(ArrayList<String> arrayList) {
        arrayList.add("in the woods ");
    }
    final static  public strictfp void test(){}
    public final static void tests() {}
    public static final void testss() {}
    static final public void testsss() {}

    public static void varArg(int... woah) {
        for (int q : woah) {
            System.out.println("Integer " + q);
        }
    }
    public static void int1(byte i) {
        System.out.println("byte");
    }

    public static void int1(Potato potato) {
        System.out.println("potato");
    }

//    public static void int1(Integer integer) {
//        System.out.println("integer");
//    }

    public static void int1(int i) {
        System.out.println("int");
    }
//    public static void int1(Object i) {
//        System.out.println("object");
//    }

    public static void int1(int... ints) {
        System.out.println("ints1");
    }

}

abstract class Potato implements Testable {
    public abstract void poopInTheWoods();
}

class mammal {
    public mammal(int age) {

    }
}

//class hippo extends mammal{
//    public hippo() {
//
//    }
//}

interface Testable {
    public static final int test = 4;
    static final int tess = 5;
    final int tests = 3;
    void poopInTheWoods();
    default void uhOh() {
        System.out.println("Looks like there's an accident");
    }

    static void analysis() {
        System.out.println("looks particularly brown.");
    }
}
