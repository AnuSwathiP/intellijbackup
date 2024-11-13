package staragile.ArrayDemos;

import java.util.Arrays;

public class D02Initializearray2 {
    public static void main(String[] args) {
        //int mark[]= new int[]{10,30,20,40,50};
        int mark[]= {20,30,10,50,40};//supports like this also,because it is first class object in java
        //mark.length =>will give total no of elements in array
        //mark[0],mark[1] etc is subscript operators
        for (int i=0;i<mark.length;i++)
        {
            System.out.println(mark[i]);
        }
        Arrays.sort(mark);
        System.out.println("Array after sorting");
//        for (int i=0;i<mark.length;i++)
//        {
//            System.out.println(mark[i]);
//        }
        //enhanced forloop i.e.,for eachloop
        //it is forward only loop
        //it is read only loop
        for(int m:mark)
        {
            System.out.println(m);
        }

    }
}
