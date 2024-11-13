package staragile.preparation2;
//If the class contains two or more methods having the same name and different arguments
//        then it is method overloading.
class Adder {
//     int add(int a, int b) {
//        return a + b;
//    }
static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static double add(double a, double b) {
        return a + b;
    }
}
public class D2_2compiletimepolymorphism {
//    1. Compile time polymorphism or method overloading or static banding
//2. Runtime polymorphism or method overriding or dynamic binding
//When a type of the object is determined at a compiled time(by the compiler), it is known
//    as static binding.
//    When a type of the object is determined at run-time, it is known as dynamic binding.
public static void main(String[] args) {
//    if not static
    Adder a = new Adder();
    System.out.println(a.add(11, 11));
    System.out.println(Adder.add(11, 11));
    System.out.println(Adder.add(11, 11, 11));
    System.out.println(Adder.add(12.3, 12.6));
}
}
