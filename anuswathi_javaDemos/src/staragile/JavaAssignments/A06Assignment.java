package staragile.JavaAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A06Assignment {

    public static void main(String[] args) {
        int first=0,last=0;
        String word = "amazonaanazz";
        System.out.println("Word is :"+word);
        char[] wordarray = word.toCharArray();
        List<Integer> ilist = new ArrayList<>();
        for(int i=0;i<wordarray.length;i++)
        {
            if(wordarray[i]=='a')
            {
                ilist.add(i);
            }
        }
        System.out.println("ilist is :"+ilist);
        first =ilist.get(0)+1;
        last = ilist.get(ilist.size()-1)+1;
        System.out.println("First occurence of the letter 'a': " + first);
        System.out.println("Last occurence of the letter 'a': " + last);
    }
}
