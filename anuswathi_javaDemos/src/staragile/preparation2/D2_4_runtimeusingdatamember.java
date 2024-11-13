package staragile.preparation2;
class Bike {
    int speedlimit = 90;
}
public class D2_4_runtimeusingdatamember extends  Bike{
//    Since we are accessing the data member which is not overridden, hence it
//    will access the data member of Parent class always.
    int speedlimit = 150;
    public static void main(String[] args) {
        Bike obj = new D2_4_runtimeusingdatamember();
        System.out.println(obj.speedlimit);
//        D2_4_runtimeusingdatamember obj2 = new Bike();//cant be able to create like this
//        System.out.println(obj2.speedlimit);
        System.out.println(obj.speedlimit);
    }
}
