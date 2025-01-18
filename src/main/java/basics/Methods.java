package basics;

public class Methods {

    //what is methods?
    //a method is a block of code that performs a specific task

    //how to create a method?
    //access modifier + return type + method name + parameters + body

    //access modifiers-public
    //return type-void, int, String, double, boolean

    public void display(){
        System.out.println("Hello Aravind");
    }
    public int display2(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        //how to call a method?-you can call methods by using object->object name.method name
        //how to create object?
        //class name object name(user defined)==new class name();
        Methods obj;//declaration
        obj=new Methods();//object creation
        //why new keyword is used?
        //it is used to create an object
        obj.display();
        System.out.println(obj.display2());

    }
}
