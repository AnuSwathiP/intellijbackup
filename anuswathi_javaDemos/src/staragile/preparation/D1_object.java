package staragile.preparation;

public class D1_object {
//    The core OOPs concepts:
//1. Object
//2. Class
//3. Abstraction
//4. Encapsulation
//5. Inheritance
//6. Polymorphism

//    1. Object
    //A class is a template or blueprint from which objects are created. So, an object is the
    //instance(result) of a class.
//The Object is the real-time entity having some state and behavior.
//Dogs have state (name, color, breed, hungry) and behavior (barking, fetching,
//    wagging tail).
// In Java, Object is
//    an instance of the class having the instance variables like the state of the object and
//            the methods as the behavior of the object.
//Student student1; //Declaration, you will use a student1 to refer to data whose type is a Student, this declaration also reserves the proper amount of memory for the
//variable.
//Student student1 = new //Instantiation,The new operator instantiates a class by allocating memory for a new object and
//returning a reference to that memory.
//Student student1 = new Student("Pramod", "IIT");//Initialization,The new keyword is followed by a call to a constructor, which initializes the new object.
public static void main(String[] args) {

    D1_Student d1Student = new D1_Student("Ramesh", "BVB");
    D1_Student d1Student2 = new D1_Student("Prakash", "GEC");
    D1_Student d1Student3 = new D1_Student("Pramod", "IIT");
}
}
