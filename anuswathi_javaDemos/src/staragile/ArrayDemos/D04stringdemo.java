package staragile.ArrayDemos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class D04stringdemo {
    //string is collection of characters
    //Id array of characters
    //first class object in java
    //string is non primitive data type
    public static void main(String[] args) {
        //String name = new String("Manasa");
        String name = "Manasa";
        String str1="Tushar";
        String str2 = "Tushar";
        String str3 = "tushar";
        System.out.println("Total characters:"+name.length());
        for (int i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));
        }
        System.out.println("Name:"+name);
        name="Manasa starAgile";
        System.out.println("Name:"+name);
        System.out.println("Character at 5th index:"+name.charAt(5));
        System.out.println("Index of A:"+name.indexOf("A"));
         name = name.replace("A","a");
        System.out.println("After Replacement:"+name);
        name = name.replace("a","A");
        System.out.println("After Replacement:"+name);
        name=name.toUpperCase();
        System.out.println("After upper:"+name);
        name=name.toLowerCase();
        System.out.println("After lower:"+name);
        if(str1==str2)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
        if(str2.contains(str1))
            System.out.println("yes");
        else
            System.out.println("no");
        if(str2.contains(str3))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
