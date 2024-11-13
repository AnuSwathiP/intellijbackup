package staragile.Abstractdemos;

public class client {
    public static void main(String[] args) {
        shape s1 = new circle(5);
        s1.calculatearea();
        s1.sayhello();
        ((circle) s1).print();
        //s1.print();//not possible because shape not have print method
        Rectangle R1 = new Rectangle(5,6);//9.35
        R1.calculatearea();
        R1.sayhello();
        R1.print();
       // printable p1 = new printable() //not possible because intrface cant instantiate
        printable p1 = new circle(5);
        p1.print();
        square sq1 = new square(0,0,5);
        sq1.calculatearea();
        Trailclass t1= new Trailclass();
        t1.sayhelo();
        t1.goodbye();
    }
}
