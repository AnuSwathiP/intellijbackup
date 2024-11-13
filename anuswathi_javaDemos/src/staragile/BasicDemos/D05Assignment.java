package staragile.BasicDemos;

import java.util.Scanner;

public class D05Assignment {
    //Accept basic salary of employeeand calculate net salary(use the following fromulas)
//    da=50%of basic salary
//    hra = 20 % of basic salary
//            pf = 5% of basic salary
//    net = basic salary + da + hra - pf
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Basic Salary:Rs.");
        int salary = scn.nextInt();
        float da = salary *0.5f;
        System.out.println("Your da=Rs."+da);
        float hra = salary *0.2f;
        System.out.println("Your hra=Rs."+hra);
        float pf = salary *0.05f;
        System.out.println("Your pf=Rs."+pf);
        float net =salary+da+hra-pf;
        System.out.println("Your net salary=Rs."+net);

    }
}
