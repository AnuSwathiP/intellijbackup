package staragile.preparation;
// Interface 1
interface PI11 {
   //interface abstract methods cannot have body,use default
    // Default method
    default void show()
    {

        // Print statement if method is called
        // from interface 1
        System.out.println("Default PI1");
    }
}
// Interface 2
interface PI22 {

    // Default method
    default void show()
    {

        // Print statement if method is called
        // from interface 2
        System.out.println("Default PI2");
    }
}

// Main class
// Implementation class code
public class D5_Mulinh_udingdefault implements PI11, PI22{





    //Method for only executing the show() of PI1
    public void showOfPI1() {
        PI11.super.show();//Should not be used directly in the main method;
    }

    //Method for only executing the show() of PI2
    public void showOfPI2() {
        PI22.super.show(); //Should not be used directly in the main method;
    }
    public static void main(String[] args) {
        // Creating object of this class in main() method
        D5_Mulinh_udingdefault d = new D5_Mulinh_udingdefault();
        d.show();
        System.out.println("Now Executing showOfPI1() showOfPI2()");
        d.showOfPI1();
        d.showOfPI2();
    }

    @Override
    public void show() {
        // Using super keyword to call the show
        // method of PI1 interface
        PI11.super.show();//Should not be used directly in the main method;

        // Using super keyword to call the show
        // method of PI2 interface
        PI22.super.show();//Should not be used directly in the main method;
    }
}
