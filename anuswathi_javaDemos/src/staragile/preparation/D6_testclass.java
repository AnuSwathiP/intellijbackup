package staragile.preparation;
// A simple interface
interface In1 {

    // public, static and final
     final int a = 10;//cannot assign a value to final ,whether u write final oor not,it is final only
//    because it is defined in interface

    // public and abstract
     void display();
     private void check()//private methods in interface should have body
     {
         System.out.println("I am private and not abstract");
     }
    default void display2()
    {
        System.out.println("hello");
    }//features added to Interfaces in JDK 8
    static void print()//feature that was added in JDK 8
    {
        System.out.println("i am static ");
    }
}

public class D6_testclass implements In1{
    public static void main(String[] args) {
        D6_testclass t = new D6_testclass();
        t.display();
        System.out.println(t.a);
        t.display2();
        In1.print();

//        t.a = 5;//cannot assign a value to final
//        t.check();//private methods cannot able to access here
    }


    @Override
    public void display() {

    }
}
