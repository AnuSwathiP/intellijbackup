package staragile.secondpackage;

//import staragile.Abstractdemos.Trailclass;
//import staragile.Abstractdemos.circle;
import staragile.Abstractdemos.*;

import java.util.Scanner;

public class Defaultdemo {
    public static void main(String[] args) {
        Trailclass t1= new Trailclass();//with import u can use beacuse it is public
        staragile.Abstractdemos.Trailclass t2 = new staragile.Abstractdemos.Trailclass();//this is other way
        t1.sayhelo();
        //t1.goodbye();//not possible because the access specifier is default
        circle  c1= new circle(5);
          int arr[]= new int[5];
        Scanner scn = new Scanner(System.in);
          for (int i=0;i<arr.length;i++)
          {
              System.out.println("Enter elemnet");
              arr[i]=scn.nextInt();
          }
        System.out.println(arr[5]);
          for(int n:arr)
          {
            System.out.println(n);
          }
    }
}
