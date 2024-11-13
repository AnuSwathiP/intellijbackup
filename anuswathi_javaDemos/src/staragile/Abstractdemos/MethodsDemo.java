package staragile.Abstractdemos;

public class MethodsDemo {
    //Accept 2 nos,pass to function and caluclate sum in function
    //display the output in function
    public static  void calculateAddition(int n1,int n2)
    {
        int sum = n1+n2;
        System.out.println("Addition"+sum);
    }

    //Accept radius,pass function,caluclate area in function
    //display result in calling function(main)
    public static double calarea(int rd)
    {
       return 3.14*rd*rd;
    }
    public static void main(String[] args) {
        calculateAddition(22,23);
        double area = calarea(4);
        System.out.println("Area of circle"+area);
    }
}
