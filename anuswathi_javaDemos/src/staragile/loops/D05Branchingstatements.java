package staragile.loops;

import java.util.Scanner;

public class D05Branchingstatements {
    public static void main(String[] args) {
        int i ;
        for (i = 1; i <=20; i++) {
             if(i%5==0)
             {
                 continue;//skip the loop
             }
            System.out.println(i);
        }
        System.out.println("-----");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number");
        int no= scn.nextInt();
         for(i=2;i<=no;i++)
         {
             if(no%i==0)
             {
                break;
             }

         }
         if(no==i)
         {
             System.out.print("Number is prime");
         }
         else
         {
             System.out.print("Number is not prime");
         }
    }
}
