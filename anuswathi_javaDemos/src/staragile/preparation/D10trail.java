package staragile.preparation;

//interface->implements
//abstract->extends
//inheritance->extends
// Creating Interface
interface  GfG{

    public default void display() {
        System.out.println("hello");
    }
     void display2();

}

public class D10trail implements  GfG{
    public static void main(String[] args) {
        GfG obj = new D10trail();

        // Calling Interface
        obj.display();
    }

    @Override
    public void display2() {

    }
}
//abstract class GfG{
//    abstract void run();
//}
//public class D10trail extends   GfG{
//    public static void main(String[] args) {
//        GfG obj = new D10trail();
//        obj.run();
//    }
//
//    @Override
//    void run() {
//
//    }
//}
// Parent class
//class One {
//    public void print()
//    {
//        System.out.println("hello");
//    }
//
//}
//public class D10trail extends  One{//
//    public static void main(String[] args) {
//        One obj = new D10trail();
//
//        // Calling Interface
//        obj.print();
//        One obj2 = new One();
//
//        // Calling Interface
//        obj2.print();
//        D10trail obj3 = new D10trail();
//
//        // Calling Interface
//        obj3.print();
//    }
//
//
//}
//class One {
//    public void print()
//    {
//        System.out.println("one");
//    }
//}
//
//class Two extends One {
//    public void print_for() { System.out.println("two"); }
//}
//
//// Driver class
//public class D10trail {
//    // Main function
//    public static void main(String[] args)
//    {
//        Two g = new Two();
////        g.print();
////        g.print_for();
//
//    }
//}


