package staragile.functiondemos;

public class D01functionclass {
    public static void sayhello()//called function
    {
       System.out.println("Welcome to function!");
    }
    public  void sayhello2()
    {
        System.out.println("Welcome to function2 without static!");
    }

    //Rteurn Type=>Type of value which is supposed to return by the function
    //Parameter/argument=>The value which needs to be passed to function for processing
    public static void main(String[] args) {//calling function
        D01functionclass d1 = new D01functionclass();
        d1.sayhello2();
       sayhello();
       System.out.println("Something new");
        sayhello();

    }
}
