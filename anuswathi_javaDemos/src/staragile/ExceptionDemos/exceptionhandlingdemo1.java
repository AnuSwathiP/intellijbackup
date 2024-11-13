package staragile.ExceptionDemos;

import java.util.Scanner;

public class exceptionhandlingdemo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int index;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Index");
        index = scn.nextInt();
        try {
            System.out.println(arr[index]);
        }catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Error:Index is out of bound");
        }
        catch(NullPointerException E)
        {
            System.out.println("Error:"+E);
        }
        catch(ArithmeticException E)
        {
            System.out.println("Error:"+E);
        }
        catch(SecurityException E)
        {
            System.out.println("Error:"+E);
        }
        catch(Exception E)
        {
            System.out.println("Error:"+E);
        }
        finally {
            //finally block executed with or without exception
            System.out.println("This is finally block");
        }
        System.out.println("Program ends");
    }
}
