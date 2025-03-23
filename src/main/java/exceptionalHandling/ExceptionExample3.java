package exceptionalHandling;


public class ExceptionExample3 {


    public static void main(String[] args) {
    try{
        int[] numbers={1,2,3};
        System.out.println(numbers[5]);
        int a=10/0;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: Array index is out of bounds.Thant mens you are trying to access an element " +
                "that does not exist in the array.");
    }catch( ArithmeticException e){
        System.out.println("Error: You are trying to divide by zero.");
    }
}}
