package staragile.loops;

import java.util.Scanner;

public class D01assignment {
    //1)Accept any number and print its multiplication table
//    1*5=5
//    2*5=10
//2)print the multiplication table of numbers from 1 to 10
    public static void main(String[] args) {
        int no=0,result=0,no2;
        Scanner scn = new Scanner(System.in);
           System.out.println("Enter number");
               no = scn.nextInt();
        for(int i=1;i<=10;i++)
        {
            result=i*no;
            System.out.println(i+"*"+no+"="+result);
        }
        System.out.println("-------------------------");

        for(int j=1;j<=10;j++)
        {
            System.out.println("-----------Table"+j+"--------------");
            for(int i=1;i<=10;i++) {
                result = i * j;
                System.out.println(i + "*" + j + "=" + result);
            }
        }
    }
}
