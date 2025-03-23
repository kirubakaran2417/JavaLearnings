package exceptionalHandling;


public class ExceptionExample2 {


    public static void main(String[] args) {
        //try,catch,finally
        System.out.println("Im line no 1");
        System.out.println("Im line no 2");
        System.out.println("Im line no 3");
        System.out.println("Im line no 4");
        try{
            System.out.println(5/0);
        } catch (ArithmeticException e) {
            System.out.println("which is unable to divide by zero");
        }
        System.out.println("Im line no 6");
        System.out.println("Im line no 7");
        System.out.println("Im line no 8");
        System.out.println("Im line no 9");
        System.out.println("Im line no 10");
    }
}
