package staragile.preparation2;

import java.util.*;

public class D3_setinterface {
//    Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
//    Set<data-type> s1 = new HashSet<data-type>();
//    Set<data-type> s2 = new LinkedHashSet<data-type>();
//    Set<data-type> s3 = new TreeSet<data-type>();
    public static void main(String[] args) {
//        HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.
        //Creating HashSet and adding elements
        System.out.println("-----HashSet------");
        Set<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----LinkedHashSet------");
        Set<String> set2=new LinkedHashSet<String>();
        set2.add("Ravi");
        set2.add("Vijay");
        set2.add("Ravi");
        set2.add("Ajay");
        Iterator<String> itr2=set2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("-----Treeset------");
//        SortedSet is the alternate of Set interface that provides a total ordering on its elements. The elements of the SortedSet are arranged in the increasing (ascending) order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements.
//        SortedSet<data-type> set = new TreeSet();
        //Creating and adding elements
        Set<String> set3=new TreeSet<String>();
        set3.add("Ravi");
        set3.add("Vijay");
        set3.add("Ravi");
        set3.add("Ajay");
//traversing elements
        Iterator<String> itr3=set3.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("Given string 'hackerearth',display unique chracters only in this string");
        String str = "hackerearth";
        Set<Character> uniquechars=new HashSet<Character>();
        Set<Character> duplicatechars=new HashSet<Character>();
        for(char C:str.toCharArray())
        {
            if(!uniquechars.add(C))
            {
                duplicatechars.add(C);
            }
            System.out.println("uniquechars="+uniquechars);
            System.out.println("duplicatechars"+duplicatechars);
        }
        uniquechars.removeAll(duplicatechars);
        System.out.println("unique characters in string 'hackerearth' are:"+uniquechars);

    }

}
