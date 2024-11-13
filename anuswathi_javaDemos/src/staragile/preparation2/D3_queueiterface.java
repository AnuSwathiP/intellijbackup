package staragile.preparation2;

import java.util.*;

public class D3_queueiterface {
//    Queue Interface
//    Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
//Queue<String> q1 = new PriorityQueue();
//    Queue<String> q2 = new ArrayDeque();
    public static void main(String[] args) {
        System.out.println("-----PriorityQueue:---");
        Queue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("-----iterating the queue elements:---");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } System.out.println("-----Removing:---");
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
//        Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
//        Deque d = new ArrayDeque();
        System.out.println("-----ArrayDeque:---");
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
//Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }


}
