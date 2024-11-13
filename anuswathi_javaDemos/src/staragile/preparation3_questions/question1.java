package staragile.preparation3_questions;
class P {
    public void print() {
        System.out.println("This is P class");
    }
}
class Q {
    public  Q() {
        System.out.println("This is Q constructor");
    }
    public void print2() {
        System.out.println("This is Method in Q");
    }
}
class R {
    public  R() {
        System.out.println("This is R constructor");
    }
    public  R(int k,int l) {
        System.out.println("This is Parameterized R Constructor");
    }
    public void print3() {
        System.out.println("This is Method in R");
    }
}
public class question1 {
    public static void main(String[] args) {
    P i = new P();
        i.print();
                Q j = new Q();
                j.print2();
                R k = new R();
                k.print3();
                R f = new R(1,2);
                k.print3();

    }


}


