package staragile.JavaAssignments;

//public class check {
//
//}
interface A {
    void attack();
}

interface B {
    void Defend();
}

class Worrier implements A, B {
    @Override
    public void Defend() {
        // TODO Auto-generated method stub
        System.out.println("interface A");
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println("INTERFACE B");
    }
}

class check implements A, B {

    @Override
    public void Defend() {
        // TODO Auto-generated method stub
        System.out.println("ATTACK WITH KNIFE");
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println("DEFEND WITH KNIFE");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Worrier d = new Worrier();
        d.attack();
        d.Defend();

        check e = new check();

        e.attack();
        e.Defend();

    }

}
