import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        try {
            InputStream input  = new FileInputStream("C://test.txt");
            int intVal;

            try {
                while((intVal = input.read()) >= 0) {
                    char byteVal = (char) intVal;
                    System.out.println(byteVal);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
