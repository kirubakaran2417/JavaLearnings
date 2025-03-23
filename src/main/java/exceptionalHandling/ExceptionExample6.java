package exceptionalHandling;


public class ExceptionExample6 {

    public static void ageCheck(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
    ageCheck(19);

}}
