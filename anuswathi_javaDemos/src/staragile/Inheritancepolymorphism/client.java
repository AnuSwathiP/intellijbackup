package staragile.Inheritancepolymorphism;

public class client {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.displaydata();
        System.out.println("Net Salary:"+m1.calculatesalary());
        //Constructor sequence will be like
        //first it will call constructor of base class then call constructor of derived class
        //Employee->Manager
        System.out.println("===============");
        Manager m2 =new Manager(123,"kavitha",50000,"Female",50000,0.5);
        m2.displaydata();
        System.out.println("Net salary :"+m2.calculatesalary());
    }
}
