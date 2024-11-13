package staragile.functiondemos;

public class D01passingarguments {
    public static void calculateaddtion(int no1,int no2)
    {
        int sum = no1+no2;
        System.out.println("Addition="+sum);
    }
    public static void main(String[] args) {
        int no1=9,no2=7;
        calculateaddtion(33,44);
        calculateaddtion(no1,no2);
    }
}
