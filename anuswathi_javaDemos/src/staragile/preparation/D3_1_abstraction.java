package staragile.preparation;

public class D3_1_abstraction {
    //Abstraction means hiding lower-level details and exposing only the essential and
    //relevant details to the users.
//    Ex: a Car, which abstracts the internal details and
//    exposes to the driver only those details that are relevant to the interaction of
//    the driver with the Car.
    public static void main(String[] args) {
        D3_1_Employee contractor = new D3_1_1_Contractor("contractor_Aravind", 10, 10);
        D3_1_Employee fullTimeD3Employee = new D3_1_FullTimeD31Employee("fulltime employee_Arjun", 20);
        System.out.println("contractorAravind salary =Rs."+contractor.calculateSalary());//100
        System.out.println("fulltime employee_Arjun salary is =Rs."+fullTimeD3Employee.calculateSalary());//160
    }
}
