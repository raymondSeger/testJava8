import java.util.StringJoiner;

public class Main {


    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(", ");
        sj.add("alpha");
        sj.add("theta");
        String theResult = sj.toString();
        System.out.println(theResult);

    }
}
