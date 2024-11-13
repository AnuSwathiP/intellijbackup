package staragile.functiondemos;

public class D06functionoverloading {
    public static void calAddition(int n1,int n2)
    {
          int add =n1+n2;
          System.out.println("Addition"+add);

    }
    public static void calAddition(int n1,int n2,int n3)
    {
        int add =n1+n2+n3;
        System.out.println("Addition"+add);

    }
    public static void calAddition(double n1,double n2)
    {
        double add =n1+n2;
        System.out.println("Addition"+add);

    }
    public static void calAddition(int n1,double n2)
    {
        double add =n1+n2;
        System.out.println("Addition"+add);

    }
    public static void calAddition(double n1,int n2)
    {
        double add =n1+n2;
        System.out.println("Addition"+add);

    }
    public static void main(String[] args) {
        calAddition(10,20);
        calAddition(10,20,30);
        calAddition(10.0,20.0);
        calAddition(10,20.0);
        calAddition(10.0,20);
    }
}
