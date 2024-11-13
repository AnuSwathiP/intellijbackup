package staragile.preparation;

public  class D3_1_1_Contractor extends D3_1_Employee {
//    The Contractor class inherits all properties from its parent abstract Employee class
//    but have to provide its own implementation to calculateSalary() method.
    private int workingHours;

    public D3_1_1_Contractor(String name, int paymentPerHour, int workingHours) {
//        Employee e = new Employee(name, paymentPerHour);//Abstract class cannot be instantiated so use extends
        super(name, paymentPerHour);//extends employee,must implement default constructor if available using super keyword
        this.workingHours = workingHours;
    }
    @Override
    public int calculateSalary() {  //extends abstract employee,must implement abstract methods
        return getPaymentPerHour() * workingHours;
    }
}
