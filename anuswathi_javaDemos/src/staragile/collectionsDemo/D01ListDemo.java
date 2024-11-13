package staragile.collectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class D01ListDemo {
    public static void main(String[] args) {

        List<String> students= new ArrayList<String>();
        students.add("Anu");
        students.add("kavitha");
        students.add("Rajlakshmi");
        students.add("Rohini");
        students.add("Bunty");
        students.add("Thushar");
        students.size();
        System.out.println("Total students in list:"+students.size());
        students.add("Dhana");
        System.out.println("Total students in list:"+students.size());
        System.out.println("4th student"+ students.get(3));
        System.out.println("4th student"+ students);
        for(int i=0;i<students.size();i++)
        {
            System.out.println( students.get(i));
        }
        Collections.sort(students);
        System.out.println("After sorting");
        for(String st : students)
            System.out.println(st);
        //delete element from the list
        students.remove(0);
        System.out.println("After removing"+students);
        students.remove("Bunty");
        System.out.println("After removing"+students);
        StringBuffer s = new StringBuffer();
                s.append("Bunty");
        s.append("Nayak");
        System.out.println("buffer"+s);//it is safe to use in threads
        StringBuilder s2 = new StringBuilder();
        s2.append("star");
        s2.append("agile");
        System.out.println("builder"+s2);
    }
}
