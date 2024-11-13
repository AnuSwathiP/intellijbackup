package staragile.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        for loop syntax
//        for (statement 1; statement 2; statement 3) {
//            // code block to be executed
//        }
        System.out.println("-----------------for------------------------");
        int number = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println("----------------for-------------------------");
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("----------------nested loop-------------------------");
//        nested loop
//         Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
        System.out.println("--------------for,string array---------------------------");
//        for each syntax
//        for (type variableName : arrayName) {
//            // code block to be executed
//        }
//        string array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("----------------foreach,string array-------------------------");
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("----------------for,int array-------------------------");
        //int array
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int length = ages.length;
        System.out.println("length: " + length);
        for (int age : ages) {
            sum += age;
        }
        System.out.println("sum: " + sum);
        avg = sum / length;
        System.out.println("The average age is: " + avg);
        System.out.println("-----------------for,2dimensional------------------------");
//        2 dimensional array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("----------------each element-------------------------");
        System.out.println(myNumbers[0][0]);
        System.out.println(myNumbers[0][1]);
        System.out.println(myNumbers[1][0]);
        System.out.println(myNumbers[1][2]);
        System.out.println("-----------------foreach,2 dimensional------------------------");
        int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers2) {
            for (int i : row) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-------------for,break----------------------------");
        //break vs continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("--------------for,continue---------------------------");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------while,break---------------------------");
//        using while loop
//        while (condition) {
//            // code block to be executed
//        }
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
        System.out.println("---------------while,continue--------------------------");
        int i2 = 0;
        while (i2 < 10) {
            if (i2 == 4) {
                i2++;
                continue;
            }
            System.out.println(i2);
            i2++;
        }
        System.out.println("---------------do while--------------------------");
//        do {
//            // code block to be executed
//        }
//        while (condition);
        int i3 = 0;
        do {

            i3++;
            System.out.println( i3);
        }
        while (i3 < 5);
        System.out.println("------------for,collections-----------------------------");
        List<String> cars2 = new ArrayList<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        for (int i4 = 0; i4 < cars2.size(); i4++) {
            System.out.println(cars2.get(i4));
        }
        System.out.println("-------------for,collections----------------------------");
        ArrayList<String> cars3 = new ArrayList<String>();
        cars3.add("Volvo");
        cars3.add("BMW");
        cars3.add("Ford");
        cars3.add("Mazda");
        for (int i4 = 0; i4 < cars3.size(); i4++) {
            System.out.println(cars3.get(i4));
        }
        System.out.println("-----------------------------------------");
        //we use a=5,b=3 and n=5 to produce some series, s0,s1,..sn-1
        //s0=5+1.3=8
        //s1=5+1.3+2.3=14
        //s2=5+1.3+2.3+4.3=26
        //s3=5+1.3+2.3+4.3+8.3=50
        //s4=5+1.3+2.3+4.3+8.3+16.3=98
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value");
            int a = in.nextInt();//5
        System.out.println("Enter b value");
            int b = in.nextInt();//3
        System.out.println("Enter n value");
            int n = in.nextInt();//5
            int k = 1;
            int[] result = new int[n];
            for (int i5 = 0, k2 = 1, e = a + k2 * b; i5 < n; ++i5, k2 *= 2, e += k2 * b) {
                result[i5] = e;
            }
            System.out.println(Arrays.toString(result));
        in.close();
    }
}
