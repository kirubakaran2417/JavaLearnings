package exceptionalHandling;


public class ExceptionExample5 {


    public static void main(String[] args) {
    try {
        String str = null;
        System.out.println(str.length());
        int num = Integer.parseInt(str);
    }catch (NullPointerException | NumberFormatException e){
        System.out.println("Error: String is null.");
    }finally {
        System.out.println("clean up.");
    }
}}
