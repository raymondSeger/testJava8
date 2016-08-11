import java.io.*;

public class Main {


    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("C://test.txt"));
            String inValue;
            try {

                while((inValue = br.readLine()) != null) {
                    System.out.println(inValue);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
