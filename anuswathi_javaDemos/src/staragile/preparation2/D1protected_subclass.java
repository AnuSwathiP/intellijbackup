package staragile.preparation2;

import staragile.preparation.D4_protected;

public class D1protected_subclass extends  D4_protected{
    public static void main(String args[])
    {
        D1protected_subclass obj2 = new D1protected_subclass();
        obj2.display();//possible
//        D4_protected obj2 = new D4_protected();
//        obj2.display();//not possible
    }
}
