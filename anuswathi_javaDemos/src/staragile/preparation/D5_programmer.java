package staragile.preparation;

public class D5_programmer extends D5_employee{
    int bonus=10000;
    public static void main(String[] args) {
        D5_programmer p=new D5_programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
