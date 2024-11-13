package staragile.preparation2;

import java.util.*;

public class D3_listinterface {
//    List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.
//        List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
//    List <data-type> list1= new ArrayList();
//    List <data-type> list2 = new LinkedList();
//    List <data-type> list3 = new Vector();
//    List <data-type> list4 = new Stack();
//The List is an ordered sequence.	The Set is an unordered sequence.
//    List allows duplicate elements	Set doesn’t allow duplicate elements.
//    Elements by their position can be accessed.	Position access to elements is not allowed.
//            Multiple null elements can be stored.	The null element can store only once.
//    List implementations are ArrayList, LinkedList, Vector, Stack	Set implementations are HashSet, LinkedHashSet.
    public static void main(String[] args) {
        //------ArrayList--------
        System.out.println("//------ArrayList using for loop-------//");
        List<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        //------or--------
        System.out.println("//------Arraylist using iterator--------//");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//------LinkedList--------
//     LinkedList is a class that is implemented in the collection framework which inherently implements the linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. Let’s see how to create a list object using this class.
        System.out.println("//------LinkedList-------//");
        List<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr2=al.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        //------Vector--------
//        It is similar to ArrayList. Vector is a kind of a dynamic array and can grow or shrink in size.
        //vector if u exceed the limit,it will increase the capacity by 100% ,threadsafe,slow,since jdk1.0,,most methods are synchronized=>at a time only one thread isallow to operate
        //Arraylst if u exceed the limit,it will increase the capacity by 50%,not threadsafe,fast since jdk 1.2,all methods are non synchronized =>multiple threads are allow to operate on arraylist at a time
//        Synchronization means process of adjusting speed of tool with speed of application
        Vector<Integer> ve = new Vector<Integer>();
        ve.add(1);
        ve.add(4);
        ve.add(3);
        ve.add(7);
        ve.add(5);
        ve.add(9);
        ve.add(7);
        ve.add(12);
        ve.add(9);
        ve.add(14);
        ve.add(11);
        System.out.println("vector capacity"+ve.size());
        System.out.println("vector capacity"+ve.capacity());//capcity means vector can contain those elements in future,size means it contains elements at this moment
        ArrayList<Integer> Ae = new ArrayList<Integer>();
//        System.out.println("Arraylist capacity"+Ae.capacity());//wecannot print capacity,size is different from capacity
        System.out.println("//------Vector-------//");
        List<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        System.out.println("capacity"+ve.capacity());
        Iterator<String> itr3=v.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        //------Stack--------
//        The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

        System.out.println("//------ Stack using iterator-------//");
        Stack<String> stack = new Stack<String>();
        stack.add("Ayush");
        stack.add("Garvit");
        stack.add("Amit");
        stack.add("Ashish");
        stack.add("Garima");
        Iterator<String> itr4=stack.iterator();
        while(itr4.hasNext()){
            System.out.println(itr4.next());
        }
        System.out.println("//------Stack using push,pop-------//");

        Stack<String> stack2 = new Stack<String>();
        stack2.push("Ayush");
        stack2.push("Garvit");
        stack2.push("Amit");
        stack2.push("Ashish");
        stack2.push("Garima");
        while(!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
        System.out.println("//------List in detail-------//");
        List<Integer> l1 = new ArrayList<Integer>();
        // Adding elements to object of List interface
        // Custom inputs
        l1.add(0, 1);
        l1.add(1, 2);
        // Print the elements inside the object
        System.out.println("l1="+l1);
        // Now creating another object of the List
        // interface implemented ArrayList class
        // Declaring object of integer type
        List<Integer> l2 = new ArrayList<Integer>();
        // Again adding elements to object of List interface
        // Custom inputs
        l2.add(3);
        l2.add(4);
        l2.add(5);
        System.out.println("l2="+l2);
        // Will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println("l1 after adding "+l1);
        // Removes element from index 1
        l1.remove(1);
        // Printing the updated List 1
        System.out.println("l1 after removing first index "+l1);
        // Prints element at index 3 in list 1
        // using get() method
        System.out.println("l1 3rd index element="+l1.get(3));
        // Replace 0th element with 5
        // in List 1
        l1.set(0, 5);
        // Again printing the updated List 1
        System.out.println("l1 after replacing first element="+l1);
        // use indexOf() to find the first occurrence of an
        // element in the list
        int index = l1.indexOf(5);
        System.out.println(
                "The first occurrence of 5 is at index "
                        + index);
        // use lastIndexOf() to find the last occurrence of
        // an element in the list
        int lastIndex = l1.lastIndexOf(5);
        System.out.println(
                "The last occurrence of 5 is at index "
                        + lastIndex);
        System.out.println("//------remove operation,contains operation  in list-------//");
        // Creating List class object
        List<String> l3 = new ArrayList<>();
        // Adding elements to the object
        // Custom inputs
        l3.add("Hi");
        l3.add("welcome");
        l3.add("to all");
        l3.add("staragile");
        l3.add("friends");
        // Now remove element from the above list
        // present at 1st index
        l3.remove(1);
        // Print the List after removal of element
        System.out.println("After the Index Removal " + l3);
        // Now remove the current object from the updated
        // List
        l3.remove("Hi");
        // Finally print the updated List now
        System.out.println("After the Object Removal "
                + l3);
        // Checking if element is present using contains()
        // method
        boolean isPresent = l3.contains("friends");
        // Printing the result
        System.out.println("Is friends present in the list? "
                + isPresent);
    }
}


