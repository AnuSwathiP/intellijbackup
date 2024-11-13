package staragile.preparation3_questions;
// Java program to illustrate the
// concept of Abstraction
abstract class Shape {
    abstract void area();
}
public class question2   extends  Shape{

    public static void main(String[] args) {
        Shape ob = new question2();


    }

    @Override
    void area() {
        System.out.println("area");
    }
}
//abstract class Shape {
//    abstract void area();
//}
//public class question2   extends  Shape{
//
//    public static void main(String[] args) {
//        Shape ob = new question2();
//
//
//    }
//
//    @Override
//    void area() {
//       System.out.println("area");
//    }
//}
//---------
//abstract class Shape {
//    abstract void area();
//    public Shape()
//    {
//        System.out.println("Shape constructor called");
//
//    }
//}
//public class question2 extends  Shape{
//
//    public static void main(String[] args) {
//        question2 ob = new question2();
//        ob.area();
//
//    }
//
//    @Override
//    void area() {
//        System.out.println("area");
//    }
//}
////------
//abstract class Shape {
//    abstract void area();
//    public Shape(String color)
//    {
//        System.out.println("Shape constructor called");
//
//    }
//}
//public class question2 extends  Shape{
//
//    public question2(String color) {
//        super(color);
//    }
//
//    public static void main(String[] args) {
//        question2 ob = new question2("red");
//        ob.area();
//
//    }
//
//    @Override
//    void area() {
//        System.out.println("area");
//    }
//}
////------------
//abstract class Shape {
//
//    abstract void area();
//}
//class Circle extends Shape {
//    double radius;
//
//    public Circle() {
//
//        System.out.println("Circle constructor called");
//
//    }
//
//    @Override
//    void area() {
//        System.out.println("circle area");
//    }
//}
//public class question2 {
//
//    public static void main(String[] args) {
//        Shape ob = new Circle();
//        ob.area();
//
//    }
//
//
//}
////-----------
//abstract class Shape {
//    public Shape(String color) {
//        System.out.println("This is shape constructor");
//}
//    public Shape(String color,int value) {
//        System.out.println("This is parametrized shape constructor");
//    }
//    abstract void area();
//}
//class Circle extends Shape {
//    double radius;
//
//    public Circle() {
////        super("red");
//        super("blue",5);
//
//        System.out.println("Circle constructor called");
//
//    }
//    public Circle(int s) {
//        super("yellow");
//
//        System.out.println(" parametrized circle constructor called");
//
//    }
//
//    @Override
//    void area() {
//        System.out.println("circle area");
//    }
//}
//public class question2 {
//
//    public static void main(String[] args) {
//        Shape ob = new Circle();
//        ob.area();
//
//    }
//
//
//}
//abstract class Shape {
//    public Shape(String color) {
//    }
//
//    abstract void area();
//}
//class Circle extends Shape {
//    double radius;
//
//    public Circle(String color, double radius) {
//
//        // calling Shape constructor
//        super(color);
//        System.out.println("Circle constructor called");
//        this.radius = radius;
//    }
//
//    @Override
//    void area() {
//        System.out.println("circle area");
//    }
//}
//public class question2 {
//
//    public static void main(String[] args) {
//        Shape ob = new Circle("red",2.14);
//        ob.area();
//
//    }
//
//
//}
