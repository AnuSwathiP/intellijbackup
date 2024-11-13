package staragile.preparation2;
/**
 * This represents payment interface
 */
interface Payment {
    public void pay();
}
/**
 * Cash IS-A Payment type
 *
 * @author tirthalp
 *
 */
class CashPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }

}
/**
 * Creditcard IS-A Payment type
 */
class CreditPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }

}

public class D2_1Polymorphism {
//    The process of representing one form in multiple forms is known as Polymorphism.
//    Different definitions of Polymorphism are:
//            1. Polymorphism let us perform a single action in different ways.
//            2. Polymorphism allows you to define one interface and have multiple
//            implementations
//3. We can create functions or reference variables which behaves differently in a different
//    programmatic context.
//            4. Polymorphism means many forms.
//    Suppose if you are in a classroom that time you behave like a student, when you are in the
//    market at that time you behave like a customer, when you at your home at that time you
//    behave like a son or daughter, Here one person present in different-different behaviors.
public static void main(String[] args) {
    // Here the runtime polymorphism fundamental is not applied,
    // as it is of single CashPayment form
    CashPayment c = new CashPayment();
    c.pay();

    // Now the initialization is done using runtime polymorphism and
    // it can have many forms at runtime
    // Single payment "p" instance can be used to pay by cash and credit card
    Payment p = new CashPayment();
    p.pay(); // Pay by cash

    p = new CreditPayment();
    p.pay(); // Pay by creditcard
//    u can use like below also
//    CreditPayment p4 = new CreditPayment();
//    p4.pay(); // Pay by creditcard
//    Payment p5 = new CreditPayment();
//    p5.pay(); // Pay by cash
//    D2Polymorphism p6 = new D2Polymorphism();//if implements,this also possible
//    p6.pay(); // Pay by cash
}
}
