package staragile.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D02ListDemo2 {
    public static void main(String[] args) {
        List<Integer> nos = new ArrayList<Integer>() ;
                //we cannot create collection of primitive datatypes
        //primitive datatypes are stored in stack
        //wrapper class represents primitive data type to non primitive datatpe
        nos.add(45);
        nos.add(1235);
        nos.add(1);
        nos.add(30);
        System.out.println("original list");
        System.out.println(nos);
        Collections.sort(nos);
        System.out.println("After sorting");
        System.out.println(nos);
        System.out.println("After reversing");
        Collections.reverse(nos);
        System.out.println(nos);
    }
}
