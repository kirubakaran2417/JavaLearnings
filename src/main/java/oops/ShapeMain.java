package oops;

public class ShapeMain {
    public static void main(String[] args) {
        Shape square=new Square();
        square.calculateArea();
        square.setColor("red");
        Shape circle=new Circle();
        circle.calculateArea();
        circle.setColor("blue");
    }
}
