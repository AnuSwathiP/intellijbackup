package staragile.Inheritancepolymorphism;

public class Employee {
    private int empid;
    private String empname;
    private double basicsalary;
    private String gender;

    public Employee()   //plain/default/no parameter constructor
    {
        empid = 100;
        empname="Anu";
        basicsalary=50000.0;
        gender="Female";
        System.out.println("Employee Constructor called");
    }
    public Employee(int id,String nm,double bs,String g)//parameterized constructor
    {
        empid = id;
        empname=nm;
        basicsalary=bs;
        gender=g;
        System.out.println("Constructor called");
    }
    //    public  void setemployeedata() //Mutator  function
//    {
//        empid = 100;
//        empname="Anu";
//        basicsalary=50000.0;
//        gender="Female";
//    }
    public  void setempid(int id) //Mutator  function
    {
        empid = id;
    }

    public  int getempid() //Accessor function
    {
        return empid ;
    }
    public void displaydata() //Facilitator function
    {
        System.out.println("Employee Id"+empid);//here empid or this.empid
        System.out.println("Employee Name"+this.empname);
        System.out.println("Employee Basic Salary"+basicsalary);
        System.out.println("Gender"+gender);

    }
    public double calculatesalary()
    {
        double da,hra,pf,net;
        da = basicsalary*0.50;
        hra = basicsalary*0.20;
        pf = basicsalary*0.05;
        net= da+hra -pf;
        return net;
    }
}
