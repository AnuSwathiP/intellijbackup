package staragile.JavaAssignments;
interface Grandparent {

    // Default method
    default void show()
    {
        // Print statement
        System.out.println("Default Grandparent");
    }
}
interface Parent1 extends  Grandparent{

}
interface Parent2 extends  Grandparent{

}
public class A05multipleinheritance implements Parent1,Parent2{

    public static void main(String[] args) {
        A05multipleinheritance test = new A05multipleinheritance();
        test.show();

    }



}
