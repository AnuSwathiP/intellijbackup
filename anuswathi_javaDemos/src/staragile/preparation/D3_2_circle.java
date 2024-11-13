package staragile.preparation;

import staragile.Abstractdemos.printable;
import staragile.Abstractdemos.shape;

public class D3_2_circle extends D3_2_shape  {
    private int rd;
    public D3_2_circle(int rd)
    {
        this.rd = rd;
        System.out.println("Hello circle class");
    }


    @Override
    public void calculatearea() {//when extend abstract class must implement abstract method
            double area= (3.14*rd*rd);
            System.out.println("Area="+(3.14*rd*rd));

    }
}
