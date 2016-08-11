import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public void testMethodThatHaveException() throws IOException {
        throw new IOException("a");
    }

    public static void main(String[] args) {

        try {
            new testClass().testMethodThatHaveException();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
