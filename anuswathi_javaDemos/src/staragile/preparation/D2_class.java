package staragile.preparation;

import staragile.classdemos.Employee;

public class D2_class {
    //    class:A class is a group of objects which have common properties. It is a template or blueprint
    //from which objects are created
    public static void main(String[] args) {
//        Employee.setcompany("Tata");
        D1_Student s1 = new D1_Student("John","Staragile");
        //D1_Student is class name or Data type and s1 is an object
        String name = s1.getName();
        System.out.println("name :"+name);
    }
}
