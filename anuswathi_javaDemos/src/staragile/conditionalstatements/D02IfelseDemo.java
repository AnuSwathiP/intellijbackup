package staragile.conditionalstatements;

import java.util.Scanner;

public class D02IfelseDemo {
    public static void main(String[] args) {
        int amt;
        double dis=0,net;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Amount:" );
        amt = scn.nextInt();
        if(amt>=1000) {
            dis = amt * 0.10;
        }
        else
        {
            dis = amt * 0.05;
        }
        net = amt-dis;
        System.out.println(" discount.i.e., Rs."+ dis);
        System.out.println("net amount, Rs."+ net);
    }
}
