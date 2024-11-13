package staragile.preparation;
// Interface 1
interface API {
    // Default method
    default void show()
    {

        // Print statement
        System.out.println("Default API");
    }
}

// Interface 2
// Extending the above interface
interface Interface1 extends API {
    // Abstract method
    void display();
}

// Interface 3
// Extending the above interface
interface Interface2 extends API {
    // Abstract method
    void print();
}

public class D6_MulInh_inte implements Interface1, Interface2{
    // Overriding the abstract method from Interface1
    public void display()
    {
        System.out.println("Display from Interface1");
    }
    // Overriding the abstract method from Interface2
    public void print()
    {
        System.out.println("Print from Interface2");
    }
    public static void main(String[] args) {
// Creating object of this class
        // in main() method
        D6_MulInh_inte d = new D6_MulInh_inte();

        // Now calling the methods from both the interfaces
        d.show(); // Default method from API
        d.display(); // Overridden method from Interface1
        d.print(); // Overridden method from Interface2
    }
}
