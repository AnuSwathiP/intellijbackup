package staragile.conditionalstatements;

import java.util.Scanner;

public class D02Assignment {
    //1)Accept a bankbalance from user and show the message as "Low Balance if balance is <2000
    //2)Accept a number from user and check it is positive or negative
    //3)Accept selling amount and purchase amount from user and whether it is profit or loss and how much?
     //4)Accept a year from user and check whether it is leap or not?
    //5)Accept a bankbalance from user and show the message as "Low Balance" if balance is <2000 else display message as
   // balance is ok
    //6)Accept age from user ,if age>18,show message as "You are valid for voting" else "you are not valid for voting"
    //7)Accept marks of 5 subjects and calculatae total and average marks
    //8)Accept marks of 5 subjects and calculatae total and average marks and also display the grade as follows
   // Marks          Grade
//      >=85           Distinction
//    <85 & >75        A
//    <75 &?=60        B
//    <60 & >=50       c
//    <50 & >=35       D
//    <35                fail
    public static void main(String[] args) {
        int bankbalance=0,sp=0,cp=0,year=0,age=0,science=0,social=0,maths=0,english=0,hindi=0;
        double avg=0,total=0.0,per=0.0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Bank balance:" );
        bankbalance = scn.nextInt();
        if(bankbalance<2000) {
            System.out.println("Low balance");
        }
        else
        {
            System.out.println("balance is ok");
        }
        System.out.println("--------------------------------" );
        if(bankbalance>=0) {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
        System.out.println("--------------------------------" );
        System.out.println("Enter selling price:" );
        sp = scn.nextInt();
        System.out.println("Enter purchase amount:" );
        cp = scn.nextInt();
        if((sp-cp)>0)
        {
            System.out.println("Profit="+(sp-cp) );
        }
        else if((cp-sp)>0)
        {
            System.out.println("loss="+(cp-sp) );
        }
        else
        {
            System.out.println("No profit No loss" );
        }
        System.out.println("--------------------------------" );
        //To be a leap year, the year number must be divisible by four – except for end-of-century years, which must be divisible by 400.
        // This means that the year 2000 was a leap year, although 1900 was not.
        System.out.println("Enter year:" );
        year = scn.nextInt();
        if(year%4==0&&(year%100!=0 || year%400==0))
        {
            System.out.println("Its leap year" );
        }
        else
        {
            System.out.println("Not leap year" );
        }
        System.out.println("-------------------------------" );
        System.out.println("Enter Age from user:" );
        age = scn.nextInt();
        if(age>18) {
            System.out.println("You are valid for voting");
        }
        else
        {
            System.out.println("you are not valid for voting");
        }
        System.out.println("-------------------------------" );
        System.out.println("Enter marks of 5 subjects:" );
        science = scn.nextInt();
        social = scn.nextInt();
        maths = scn.nextInt();
        english = scn.nextInt();
        hindi = scn.nextInt();
        total=science+social+maths+english+hindi;
        avg=total/5;
        per = (total/500)*100;
            System.out.println("total="+total);
        System.out.println("avg="+avg);
        System.out.println("per="+per);
        if(per>=85) {
            System.out.println("Disctinction");
        }
        else if(per<85&&per>=75) {
            System.out.println("You grade is 'A'");
        }
        else if(per<75&&per>=60) {
            System.out.println("You grade is 'B'");
        }
        else if(per<60&&per>=50) {
            System.out.println("You grade is 'c'");
        }
        else if(per<50&&per>=35) {
            System.out.println("You grade is 'D'");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
