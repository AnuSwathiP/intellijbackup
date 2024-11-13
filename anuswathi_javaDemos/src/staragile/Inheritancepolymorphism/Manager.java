package staragile.Inheritancepolymorphism;

public class Manager extends Employee{
    private double sales;
    private double rate;
    public  Manager()
    {
        System.out.println("Manager Constructor called");
        sales=0;
        rate=0;
    }
    public  Manager(int id,String nm,double bs,String gn,double s,double r)
    {

        sales = s;
        rate=r;
    }
    public double calculateinsentive()
    {
        return sales*rate;
    }
    public double calculatesalary()
    {
        return super.calculatesalary()+calculateinsentive();
    }
    public void displaydata()
    {
        super.displaydata();
        System.out.println("Total sales:"+sales);
        System.out.println("Rate of commision:"+rate);
    }
}
