package staragile.preparation;
// Interface 1
interface GPI {

    // Default method
    default void show()
    {

        // Print statement
        System.out.println("Default GPI");
    }
}

// Interface 2
// Extending the above interface
interface PI1 extends GPI {
}

// Interface 3
// Extending the above interface
interface PI2 extends GPI {
}

public class D5_Mul_Inh_daimond implements PI1, PI2{
//    It is a mix of two or more of the above types of inheritance. Since java doesn’t support
//    multiple inheritances with classes, the hybrid inheritance is also not possible with classes.

    public static void main(String[] args) {
    // Creating object of this class
    // in main() method
        D5_Mul_Inh_daimond d = new D5_Mul_Inh_daimond();

    // Now calling the function defined in interface 1
    // from whom Interface 2and 3 are deriving
    d.show();
}
}
