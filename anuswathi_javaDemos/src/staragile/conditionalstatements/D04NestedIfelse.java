package staragile.conditionalstatements;

import java.util.Scanner;

public class D04NestedIfelse {
    public static void main(String[] args) {
        int amt;
        double dis=0,net;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Amount:" );
        amt = scn.nextInt();
        if(amt<1000) {
            dis = amt * 0.02;
        }
        else
        {
            if(amt>=1000 && amt<3000)//if(amt<3000)
            {
                dis = amt * 0.05;
            }
            else
            {
                if(amt>=3000 && amt<5000)//if(amt<5000)
                {
                    dis = amt * 0.10;
                }
                else
                {
                    dis=amt*0.15;
                }
            }
        }
        net = amt-dis;
        System.out.println("we will give 10% discount.i.e., Rs."+ dis);
        System.out.println("net amount, Rs."+ net);
    }
}
