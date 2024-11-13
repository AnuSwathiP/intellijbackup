package staragile.collectionsDemo;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D04setDemo {
    public static void main(String[] args) {

        Set<String> students = new HashSet<String>();
        students.add("Anu");
        students.add("kavitha");
        students.add("Bunty");
        students.add("Bunty");
        students.add("priya");
        System.out.println("Total students"+students.size());
        System.out.println(students);
        System.out.println("------list---");
        for(String st:students)
            System.out.println(st);

       //iterator is an interface through which you can iterate over the set
        System.out.println("------forloop---");
        Iterator<String> itr =students.iterator();
        for(int i=0;i<students.size();i++)
        {
//            System.out.println(""+students.get(i));//method get(i) not there in set
            System.out.println(""+itr.next());

        }
        System.out.println("-----while-list---");
//        itr.remove();
        Iterator<String> itr2 =students.iterator();
        while ( itr2.hasNext())
        System.out.println(""+itr2.next());

        //.next returns the value at the location of itr object and moves to next element

    }
}
