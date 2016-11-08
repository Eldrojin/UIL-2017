/**
 * Created by nguyenl on 11/4/2016.
 */
public class Test {
    public static void main(String[] args) {
        String s = "8b1a9953c4611296a827abf8c47804d7";
        String s2 = "Hi " + s + " Bye";
        System.out.println(s.matches("\\d{32}"));
        System.out.println(s2.matches("\\d{32}"));

        System.out.println(s.matches("[A-F0-9]{32}"));
        System.out.println(s2.matches("[A-F0-9]{32}"));

        System.out.println(s.matches("^[a-f0-9]{32}$"));
        System.out.println(s2.matches("^[a-f0-9]{32}$"));

        System.out.println(s.matches("\\A[0-9a-f]{32}\\Z"));
        System.out.println(s2.matches("\\A[0-9a-f]{32}\\Z"));

        System.out.println(s.matches("\\A[a-f0-9]{32}$"));
        System.out.println(s2.matches("\\A[a-f0-9]{32}$"));
    }
}
