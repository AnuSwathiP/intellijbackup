package staragile.preparation;
class A{
    void msg(){System.out.println("Hello");}
}
class B{
    void msg(){System.out.println("Welcome");}
}
public class D5_c  extends A{//A,B not possible
    public static void main(String[] args) {
        D5_c obj=new D5_c();
        obj.msg();//Now which msg() method would be invoked?
    }
}
