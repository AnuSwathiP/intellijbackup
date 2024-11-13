package staragile.preparation2;

import staragile.preparation.D4_public;

public class D1public {
    public static void main(String args[])
    {
        // Accessing class D4_public from package preparation
        D4_public obj = new D4_public();
        obj.display(); //can access because of public
//        obj.display2();//cannot access because of default
    }
}
