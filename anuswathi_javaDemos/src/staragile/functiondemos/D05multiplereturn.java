package staragile.functiondemos;

public class D05multiplereturn {
    public static int findmax(int n1,int n2)
    {
        if(n1>n2)
        {
            return n1;
        }
        else
        {
            return  n2;
        }

    }
    public static void main(String[] args) {
         int no1=6,no2=8;
         int max = findmax(no1,no2);
         System.out.println("maximum="+max);
    }
}
