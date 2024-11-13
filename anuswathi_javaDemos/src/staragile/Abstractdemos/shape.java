package staragile.Abstractdemos;

public abstract class shape {
    public abstract void calculatearea();
//    private abstract void testing();//illegal combination modifiers,abstract and private
    public void sayhello()
    {
        System.out.println("Hello friends!!");
    }
    private void saywelcome()
    {
        System.out.println("welcome friends!!");
    }
}
