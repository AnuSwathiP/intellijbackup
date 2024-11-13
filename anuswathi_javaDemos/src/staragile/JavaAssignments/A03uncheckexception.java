package staragile.JavaAssignments;

public class A03uncheckexception {
    //3. Write a Java Program to handle given uncheck exception
    //
    //                       a.ArrayIndexOutOfBound
    //
    //                        b.NullPointerException
    public static void main(String[] args) {
        System.out.println("---------ArrayIndexOutOfBound-------------");
        String[] arr = new String[10];
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        System.out.println("---------Null pointer exception-------------");
        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr.equals null or works fine.
        try
        {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("hello"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}
