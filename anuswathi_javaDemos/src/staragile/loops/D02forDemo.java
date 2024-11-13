package staragile.loops;

import java.util.Scanner;

public class D02forDemo {
    public static void main(String[] args) {

        for( int i=1;i<20;i=i+2)
        {

            System.out.println(i);
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter new number:");
                int input = scn.nextInt();

        for(int i=1;i<=input;i++)
        {
            System.out.println(i);
        }
    }
}
