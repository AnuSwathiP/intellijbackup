package staragile.ExceptionDemos;

public class exceptionhandlingdemo2 {
    public static void showmessage() throws InterruptedException {
        System.out.println("I am in method");
        Thread.sleep(5000);
        System.out.println("Method End..");

    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main started..");
        Thread.sleep(5000);
        showmessage();//exception propagation //transferring exception from one method to another
        System.out.println("Main End..");
    }
}
