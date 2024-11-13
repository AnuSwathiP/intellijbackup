package staragile.preparation;

public class D5_inheritance {
//    The Inheritance is a process of obtaining the data members and methods from one
//    class to another class, plus can have its own is known as inheritance.
//    Inheritance - IS-A relationship between a superclass and its subclasses.
//    Super Class: The class whose features are inherited is known as a superclass (or a base class
//    or a parent class).
//    Sub Class: The class that inherits the other class is known as a subclass(or a derived class,
//    extended class, or child class). The subclass can add its own fields and methods in addition to
//    the superclass fields and methods.
//    Ex:The real-life example of inheritance is child and parents, all the properties of a father
//    are inherited by his son.
//The keyword used for inheritance is extends.
//    syntax
//class derived-class extends base-class
//    {
//        //methods and fields
//    }
//Why multiple inheritance is not supported in java?
    //To reduce the complexity and simplify the language, multiple inheritance is not supported in
//    java.
//    Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes.
//    If A and B classes have the same method and you call it from child class object, there will be
//            ambiguity to call a method of A or Bclass.
//    Since compile-time errors are better than runtime errors, java renders compile-time error if
//    you inherit 2 classes. So whether you have the same method or different, there will be
//    compile time error now.
//In inheritance, each child has an ‘is-a’
//    relationship with its parent. For example, an apple ‘is-a’ fruit. A triangle ‘is-a’
//    shape. Red ‘is-a’ color.
    public static void main(String[] args) {
        D5_Animal dog = new D5_Dog();
        dog.setId(123); // inherited from super class
        dog.sound(); // overrided behavior of sub class
    }
}
