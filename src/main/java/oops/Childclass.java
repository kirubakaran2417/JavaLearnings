package oops;

public class Childclass extends Baseclass{
    int a=45;
    int b=65;
    public void display(){

        int c=super.a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Childclass c=new Childclass();

        c.display();
    }
}
