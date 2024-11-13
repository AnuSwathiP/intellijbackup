package staragile.preparation;

public class D4person {
    private double id;//private means “only visible within the enclosing class”.
    private String name;

    public D4person() {
        // Only Person class can access and assign
        id = Math.random();
        sayHello();
    }

    // This method is protected for giving access within Person class only
    private void sayHello() {//setid
        System.out.println("Ur Id is " + getId());
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
