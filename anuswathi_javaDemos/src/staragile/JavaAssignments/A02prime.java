package staragile.JavaAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A02prime {
    //2. Write a Java Program to find prime numbers between 1 to 100
//    A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
//    For example 2, 3, 5, 7, 11,….. are prime numbers.
    public static void main(String[] args) {
         int flag=0;
        List<Integer> primenumbers = new ArrayList<Integer>();
        System.out.println("1 is not a Prime number");
        for(int i=2;i<=100;i++)
        {
            flag=0;
            for(int j=2;j<i;j++) {
                if (i%j == 0) {
                    flag=1;
                    break;
                }

            }
            if (flag== 0) {
                primenumbers.add(i);
//                System.out.println(i + "is Prime number");
            } else {
//                System.out.println(i + "is not prime number");
            }

        }
        System.out.print("primenumbers are : ");
        System.out.println(primenumbers);

    }
}
