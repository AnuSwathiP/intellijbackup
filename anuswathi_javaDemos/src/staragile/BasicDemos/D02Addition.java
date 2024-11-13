package staragile.BasicDemos;

public class D02Addition {

        public static void main(String[] args) {
            int no1=10,no2=20,sum;
            sum = no1+no2;
            System.out.println("Addition of two numbers"+sum);
            no1+=5;
            System.out.println("no1"+no1);
            no1++;
            System.out.println("no1"+no1);
            no1--;
            System.out.println("no1"+no1);
            no1=5;no2=2;
            double ans = no1/no2;
            System.out.println("Answer:"+ans);
            double ans2 = (double)no1/no2;
            System.out.println("Answer:"+ans2);
            System.out.println("Answer:"+no1%no2);//reminder always work in integers

        }

}
