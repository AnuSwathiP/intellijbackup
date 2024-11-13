package staragile.BasicDemos;

import java.util.Scanner;

public class D04CalculateSquare {
    public static void main(String[] args) {
        int no,sq;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number:");
        no= scn.nextInt();
        sq=no*no;
        System.out.println("Square of no "+ no +" is:"+sq);
    }
}
