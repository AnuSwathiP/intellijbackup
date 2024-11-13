package staragile.functiondemos;

public class D03returnvalue {
    public static double calculatearea(int rd)
    {
        double area=3.142*rd*rd;
        return area;
    }
    //Points to be noted about return statement
    //Return statement return values to calling function
    //Return statement is used to break/terminate the function
    //return statement can return single value at a time but function may have a multiple return statements
    public static void main(String[] args) {
//        double val = calculatearea(5);
//        System.out.println("area="+val);
        System.out.println("area="+calculatearea(5));
    }
}
