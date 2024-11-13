package staragile.JavaAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class A04arrayascending {
    //4. Write a Java Program to sort the ArrayList in Ascending order
    public static void main(String[] args) {
        int numbers[]= new int[10];
        Scanner scn = new Scanner(System.in);
        System.out.println("--Enter 10 numbers in any order--");
        for (int i=0;i<numbers.length;i++)
        {
            numbers[i]= scn.nextInt();
        }
        System.out.println("--ArrayList in Ascending order--");
        Arrays.sort(numbers);
        for (int i:numbers)
        {
            System.out.println(i);
        }
    }
}
