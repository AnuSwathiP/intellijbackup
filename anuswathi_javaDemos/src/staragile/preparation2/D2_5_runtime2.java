package staragile.preparation2;
class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }
}
public class D2_5_runtime2 extends Dog{
    public static void main(String[] args) {
        Animal a = new D2_5_runtime2();
        a.eat();//if override it will call override method only
    }
//    @Override
//    void eat() {
//        System.out.println("myclass is eating...");
//    }
}
