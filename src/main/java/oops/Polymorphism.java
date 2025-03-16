package oops;

public class Polymorphism {

    //method overloading->same method name but different parameters
    //method overriding->same method name but same parameters but different implementation

    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public void add(int a,double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Polymorphism obj=new Polymorphism();

        obj.add(10,23.45);
    }
}
