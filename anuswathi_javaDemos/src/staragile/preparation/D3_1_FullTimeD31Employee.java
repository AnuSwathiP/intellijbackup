package staragile.preparation;

public class D3_1_FullTimeD31Employee extends D3_1_Employee {
    public D3_1_FullTimeD31Employee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() { //abstract methods must implement
        return getPaymentPerHour() * 8;
    }
}
