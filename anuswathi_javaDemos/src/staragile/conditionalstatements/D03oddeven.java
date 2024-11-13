package staragile.conditionalstatements;

import java.util.Scanner;

public class D03oddeven {
    public static void main(String[] args) {
        int no;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number:" );
        no = scn.nextInt();
        if(no%2==0) {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
       scn.close();
    }
}
