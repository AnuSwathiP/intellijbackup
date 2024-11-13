package staragile.preparation;

public class D4Encapsulation {
    //Encapsulation is a process of wrapping of data and methods in a single unit is called
    //encapsulation.
//    Ex:Capsule, it is wrapped with different medicines. In a capsule, all medicine is
//    encapsulated inside a capsule.
    public static void main(String[] args) {
        D4person p1 = new D4person();
        p1.setName("Ramesh");
/*
* Note: As id and name are encapsulated in Person class, those cannot be
accessed
* directly here. Also there is no way to assign id in this
* class. Try to uncomment below code and you would find compile time
error.
*/
// p1.id = "123";
// p1.name = "this will give compile time error";
// p1.sayHello(); // You can't access this method, as it is private to D4person
        System.out.println("Person :" + p1.getId() + " : " + p1.getName());
    }
}
