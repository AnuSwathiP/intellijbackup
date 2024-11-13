package staragile.preparation;

public class D4_protected_same {
    public static void main(String args[])
    {
        D4_protected obj2 = new D4_protected();
        obj2.display(); //can access display() eventhough it is protected because of same package
    }
}
