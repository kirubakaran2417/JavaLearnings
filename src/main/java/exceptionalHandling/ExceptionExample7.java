package exceptionalHandling;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample7 {
    public static void readFile(String fileName)  {
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

}

}
