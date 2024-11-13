package staragile.collectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class D05MapDemo {
    public static void main(String[] args) {
        //Map is collection of key valuepair where
        //key cannot be duplicate but value can be
        // Creating an empty HashMap
        Map<Integer,String> students
                = new HashMap<>();

        // Inserting pairs in above Map
        // using put() method
        students.put(1,"Poonam");
        students.put(2,"kavitha");
        students.put(3,"Rohini");
        students.put(4,"Poonam");
        System.out.println("--4 list--");
       System.out.println(students);
        students.put(2,"Anu");
        System.out.println("--after replace--");
        System.out.println(students);
        if(students.containsKey(4))
        {
            System.out.println("Roll no already exists");
        }
        else
        {
            students.put(4,"Dhana");
        }
        if(students.containsValue("Manasa"))
        {
            System.out.println("Name already present");
        }
        else
        {
            students.put(5,"Manasa");
        }
        students.put(6,"Poonam");
        System.out.println("--final students--");
        System.out.println(students);
        System.out.println("Roll no 5="+students.get(5));
        // Traversing through Map using for-each loop
        for (Map.Entry<Integer, String> s :
                students.entrySet()) {

            // Printing keys
            System.out.print(s.getKey() + ":");
            System.out.println(s.getValue());
        }
    }
}
