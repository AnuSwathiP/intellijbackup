package staragile.BasicDemos;

import java.util.Scanner;

public class D03CalculateArea {
    public static void main(String[] args) {
        int rd;
        double area;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Radius:");
        rd=scn.nextInt();
        area=3.142*rd*rd;
        System.out.println("Area of circle: "+area);
    }
}
