package staragile.preparation;

public class D5_Dog extends D5_Animal{
    // Own behavior
    private void bark() {
        D5_Animal animal = new D5_Animal();
        System.out.println("Dog '" + getId() + "' is barking");
    }


    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}
