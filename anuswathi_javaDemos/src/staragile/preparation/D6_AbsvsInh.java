package staragile.preparation;
//Creating interface that has 4 methods
interface AB{
    void a();//bydefault, public and abstract
    void b();
    void c();
    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class BC implements AB{
    public void c(){System.out.println("I am C");}
    public void e(){System.out.println("I am e");}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M extends BC{

    @Override
    public void a() {
        System.out.println("I am a");
    }

    @Override
    public void b() {
        System.out.println("I am b");
    }

    @Override
    public void d() {
        System.out.println("I am d");
    }
}
///Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class N implements AB{


    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}
public class D6_AbsvsInh {
//    Abstract class	Interface
//1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
//            2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
//            3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
//4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
//            5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
//            6) An abstract class can extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
//            7) An abstract class can be extended using keyword "extends".	An interface can be implemented using keyword "implements".
//            8) A Java abstract class can have class members like private, protected, etc.	Members of a Java interface are public by default.
//            9)Example:
//    public abstract class Shape{
//        public abstract void draw();
//    }	Example:
//    public interface Drawable{
//        void draw();
//    }
    public static void main(String[] args) {
        AB a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
