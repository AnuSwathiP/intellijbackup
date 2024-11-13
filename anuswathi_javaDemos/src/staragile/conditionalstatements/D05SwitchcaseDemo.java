package staragile.conditionalstatements;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class D05SwitchcaseDemo {
    public static void main(String[] args) {
        int day;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no:" );
        day = scn.nextInt();
         //1.switch case work only in integer
        //2.case values need not be in sequence order
        //3.No duplicate case value is allowed

       switch (day)
        {
            case 1:
            System.out.println("Sunday" );
            break;
            case 2:
                System.out.println("Monday" );
                break;
            case 3:
                System.out.println("Tuesday" );
                break;
            case 4:
                System.out.println("Wednesday" );
                break;
            case 5:
                System.out.println("Thursday" );
                break;
            case 6:
                System.out.println("Friday" );
                break;
            case 7:
                System.out.println("Saturday" );
                break;
            default:
                System.out.println("Wrong Input" );
                break;
        }
    }
}
