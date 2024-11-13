package staragile.preparation2;

import java.util.*;

public class D3_mapinterface {
    private static Integer Null;

    //    Parameters	TreeMap	HashMap	LinkedHashMap
//    Null Keys	It does not allow any null key.	It only allows a single null key.	It only allows a single null key.
//    Null Values	It allows null values.	It allows multiple numbers of null values.	It allows multiple numbers of null values.
//    Maintaining Order	The primary function of TreeMap is to maintain order. It helps us in the storage of keys in a sorted manner in ascending order.	The HashMap does not function to maintain any order.	The primary function of the LinkedHashMap is to maintain an order in which we would insert the key-value pairs.
    public static void main(String[] args) {
        System.out.println("---------- HashMap,No order,Allow single null key,muliple null value--------");
//        The HashMap does not function to maintain any order.  It only allows a single null key, but it allows multiple numbers of null values.
        // Creating an empty HashMap
        Map<String, Integer> hm
                = new HashMap<String, Integer>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a",100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        hm.put(null, 600);
        hm.put("e",null );
        hm.put("f",null );
        hm.put(null,null );
        hm.put(null,900 );

        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        hm.put("b",500);

        System.out.println("After replacing b value =" + hm);
        hm.remove("c");

        // Final Map
        System.out.println("After removing c key value pair ="+hm);

        System.out.println("----------Linked HashMap, order,Allow single null key,muliple null value--------");
//        The primary function of the LinkedHashMap is to maintain an order in which we would insert the key-value pairs. It also allows us with a single null key as well as multiple numbers of null values.        // Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Inserting pair entries in above Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put(null, 40);
        map.put("bhargav",null );
        map.put("rahul",null );
        map.put(null,null );
        map.put(null,50 );
        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());

        System.out.println("linked list =" + map);
        System.out.println("----------TreeMap,order(key in ascending order),allows no null key but null values--------");
//        The primary function of TreeMap is to maintain order. It helps us in the storage of keys in a sorted manner in ascending order.
//        It does not allow any null key, but it definitely allows null values.
                // Creating an empty TreeMap
        Map<String, Integer> map3 = new TreeMap<>();

        // Inserting custom elements in the Map
        // using put() method
        map3.put("vishal", 10);
        map3.put("sachin", 30);
        map3.put("vaibhav", 20);
//        map3.put(null, 40);//null pointerexception
        map3.put("bhargav",null );
        map3.put("rahul",null );
        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e : map3.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
        System.out.println("Tree list =" + map3);
        System.out.println("----------Count the Occurrence  \n" +
                "// of numbers using Hashmap --------");
        int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };

        // put all elements in arraylist
        ArrayList<Integer> aa = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            aa.add(a[i]);
        }

        Map<Integer, Integer> h = new HashMap();

        // counting occurrence of numbers
        for (int i = 0; i < aa.size(); i++) {
            Collections.frequency(
                    aa, aa.get(i));
            h.putIfAbsent(aa.get(i), Collections.frequency(
                    aa, aa.get(i)));
        }
        System.out.println(h);

    }
}
