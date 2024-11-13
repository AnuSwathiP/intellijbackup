package staragile.classdemos;

public class client {

    public static void main(String[] args) {
        Employee.setcompany("Tata");
        Employee e1 =new Employee();
        //Employee is class name or Data type and e1 is an object
//        e1.setcompany("Star agile");
        e1.setempid(101);
        e1.displaydata();
        System.out.println("Employee Id:"+e1.getempid());
        System.out.println("\n========");
        Employee e2 =new Employee();
        e2.setcompany(" agile");
//        e2.setemployeedata();
        e2.displaydata();
        System.out.println("\n========");
        Employee e3 =new Employee(200,"arjun",50000.0,"Male");
        e3.displaydata();
        System.out.println("\n========");
        e1.displaydata();
    }
}
