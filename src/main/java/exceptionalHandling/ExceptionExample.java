package exceptionalHandling;


import java.io.FileReader;

public class ExceptionExample {


    public static void main(String[] args) {

        //FileReader fr=new FileReader("abc.txt");-->compile time Exception.(checked exception)-->SQLException,FileNotFoundException
        System.out.println("Im line no 1");
        System.out.println("Im line no 2");
        System.out.println("Im line no 3");
        System.out.println("Im line no 4");
        System.out.println(5/0);//-->runtime exception(unchecked exception)->ArithmeticException,NullPointerException,ExceptionExampleArrayIndexOutOfBoundsException
        System.out.println("Im line no 6");
        System.out.println("Im line no 7");
        System.out.println("Im line no 8");
        System.out.println("Im line no 9");
        System.out.println("Im line no 10");
    }
}
