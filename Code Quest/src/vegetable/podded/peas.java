package vegetable.podded;
import vegetable.squash;
/**
 * Created by dystr on 5/21/2017.
 */
public class peas extends squash{
    public static void main(String[] args) {
        squash s = new peas();
        peas p = new peas();
        System.out.println(p.pizza);
    }

    public void Imstupid () {
        throw new ImStupidException();
    }
}

class ImStupidException extends RuntimeException {

}
