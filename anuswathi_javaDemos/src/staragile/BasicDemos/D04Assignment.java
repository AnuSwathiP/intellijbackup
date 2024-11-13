package staragile.BasicDemos;

import java.util.Scanner;

public class D04Assignment {
    //1.Accept amount from user and calculate and display 10% discount and net amount

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Amount:" );
        int amount = scn.nextInt();
         float discount = amount*0.1f;
        System.out.println("we will give 10% discount.i.e., Rs."+ discount);
        float finalamount = amount-discount;
        System.out.println("net amount, Rs."+ finalamount);
    }

}
