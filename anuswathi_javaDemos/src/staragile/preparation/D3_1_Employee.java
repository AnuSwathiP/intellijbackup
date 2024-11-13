package staragile.preparation;

public abstract class D3_1_Employee {// the class to be abstract,which means it can not be instantiated  directly
    //if we remove abstract here,then it says class must either declare abstract or add body to calculatesalary method
    private String name;
    private int paymentPerHour;

    public D3_1_Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary( );
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
