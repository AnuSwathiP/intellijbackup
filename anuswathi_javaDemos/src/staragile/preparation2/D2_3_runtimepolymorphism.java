package staragile.preparation2;
class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}
class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}
public class D2_3_runtimepolymorphism {
//    Runtime polymorphism is a process in which a call to an overridden method is resolved at
//    runtime rather than compile-time.
//    In this process, an overridden method is called through the reference variable of a
//    superclass.

    public static void main(String[] args) {
//        Shape s = new Shape();//possible
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}
