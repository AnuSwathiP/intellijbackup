package staragile.preparation;

public class D7_nonstatic {
    public static void sayhello()//called function
    {
        System.out.println("Welcome to static method!");
    }
    public void sayhello2()
    {
        System.out.println("Welcome to nonstatic method!");
    }
    public static void main(String[] args) {
        sayhello();//static,single copy for every object
        D7_nonstatic ns = new D7_nonstatic();//non static methos cant be accessed directly,so create object
        ns.sayhello2();
            }
}
