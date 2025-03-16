package oops;

class Parent {
    void show() {
        System.out.println("Parent");
    }
}
class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child");
    }
}
public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
