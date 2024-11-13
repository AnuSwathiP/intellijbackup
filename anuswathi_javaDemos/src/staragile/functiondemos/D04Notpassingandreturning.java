package staragile.functiondemos;

import java.util.Scanner;

public class D04Notpassingandreturning {
    public static int findsqu()
    {
        int no;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number:" );
        no = scn.nextInt();
        int ans=no*no;
        return ans;
    }
    public static void main(String[] args) {
      int squ = findsqu();
        System.out.println("square"+squ);
    }
}
