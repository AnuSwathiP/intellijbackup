package staragile.JavaAssignments;

import java.util.*;

public class A01stringreverse {
    //1. Write a Java program to reverse a string with and without reverse() function
    public static void main(String[] args) {
        String  enteredstring="";
        String  finalstring = "";
         char ch;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name");
          enteredstring= scn.next();//for string
        System.out.print("Original word: ");
        System.out.println(enteredstring);
        System.out.println("===method1: (without reverse)======");
        for (int i=0; i<enteredstring.length(); i++)
        {
            ch= enteredstring.charAt(i); //extracts each character
            finalstring= ch+finalstring; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ finalstring);
        System.out.println("===method2:stringbuilder (with reverse)======");
        StringBuilder sb = new StringBuilder();
        // append a string into StringBuilder input1
        sb.append(enteredstring);
        System.out.println("Reversed word:"+sb.reverse());
        System.out.println("===method3:stringbuffer (with reverse)======");
        StringBuffer  sb2=new StringBuffer(enteredstring);
        System.out.println("Reversed word:"+sb2.reverse());
        System.out.println("===method4:collections (with reverse)======");
        List<Character> outputarray = new ArrayList<>();
        char[] inputarray = enteredstring.toCharArray();
        for(char ch2 : inputarray)
        {
            outputarray.add(ch2);
        }
         Collections.reverse(outputarray);
        ListIterator li = outputarray.listIterator();
        System.out.print("Reversed word:");
        while (li.hasNext())
        System.out.print(li.next());
        System.out.print("\n");
        System.out.println("===method5:Stack(push/pop) without reverse======");
        //initializing a stack of type char
        Stack<Character> stack=new Stack<>();
        String outputarray2="";
        char[] inputarray2 = enteredstring.toCharArray();
        for(char ch3 : inputarray2)
        {
            //pushing all the characters
            stack.push(ch3);
        }
        while(!stack.isEmpty())
        {
            //popping all the chars and appending to temp
            outputarray2+=stack.pop();
        }
        System.out.println("Reversed word:"+outputarray2);
    }
}
