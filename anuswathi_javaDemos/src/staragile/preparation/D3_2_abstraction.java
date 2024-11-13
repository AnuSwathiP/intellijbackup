package staragile.preparation;

import staragile.preparation.D3_2_circle;
import staragile.preparation.D3_2_shape;

public class D3_2_abstraction {
    public static void main(String[] args) {
        D3_2_shape s1 = new D3_2_circle(5);
        s1.calculatearea();
        s1.sayhello();
//        s1.saywelcome();//not possible because it is private
        D3_2_circle c1 = new D3_2_circle(5);//9.35
        c1.calculatearea();
        c1.sayhello();
    }
}
