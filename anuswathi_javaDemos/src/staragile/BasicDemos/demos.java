package staragile.BasicDemos;

public class demos {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
		/*
		 * There are various types of Operators in Java that are used for operating. These are,
				Arithmetic operators in Java
				Relational operators in Java
				Logical operators in Java
				Assignment operator in Java
				Unary operator in Java
				Bitwise operator in Java
				Ternary operator in Java
		 */

        //1: Arithmetic Operator
        System.out.println("Arithmetic Operator / :");
        double x1=22,y1=23;
        System.out.println(x1/y1);
        System.out.println("----------------------------------------");
        //2:Assignment Operator just like z=a+b, right hand side is calculated and value is stored in left hand side
        int x=1;
        //x=x+2
        x+=2;//x+=2 is the shortcut of x=x+2
        System.out.println("Assignment Operator += :");
        System.out.println(x);
        System.out.println("----------------------------------------");
        // 3:Relational Operator
        System.out.println("Relational Operator / :");
        System.out.println(22>22);
        System.out.println(22>=22);
        System.out.println("----------------------------------------");
        //4: Unary Operator
        System.out.println("Unary Operator / :");

        x=2;
        ++x;// you can write it as x=x+1,x+=1
        System.out.println(x);
        System.out.println("----------------------------------------");
	   /*1) Post-Increment (i++):
	    * we use i++ in our statement if we want to use the current value, and then we want to increment the value of i by 1.

         2) Pre-Increment(++i):
         We use ++i in our statement if we want to increment the value of i by 1 and then use it in our statement.
	   */
        System.out.println("pre Increment Operator / :");
        int a=3,b=4,c;
        c=++a - b;// 3 operaors are used in this statement i.e. =(Assignment),++(pre increment),-(Arthemetic minus)
        // first ++a : so a is now become 4
        //Second  4-4=0
        //Third c=0
        System.out.println(c);
        System.out.println(a);

        System.out.println("------------------------------");
        System.out.println("post Increment Operator / :");
        int n=3,m=4,r;
        r=n++ - m;
        //first n-m :3-4=-1
        //second assign r=-1
        //n will increment by 1 so n=4
        System.out.println(r);
        System.out.println(n);
        System.out.println();
        System.out.println("------------------------------");
//4:Ternary Operators
        System.out.println("Ternary Operator / :");
        int n1 = 10,n2=30,max;
        max=n1>n2?n1:n2;
        System.out.println("The maximum is:"+max);
        System.out.println("------------------------------");
//5:Logical Operators
        System.out.println("Logical Operator / :");
        System.out.println(2>5 || 5>=5);//
    }
}
