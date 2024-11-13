package staragile.functiondemos;

public class demos {
    //If you don't use any modifier, it is treated as default by default.
    // The default modifier is accessible only within package.
    // It cannot be accessed from outside the package.
    // It provides more accessibility than private. But, it is more restrictive than protected, and public.
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    static void checkAge(int age) {
        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    static int myMethod3(int x) {
        return 5 + x;
    }
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("----------method-------------");
        myMethod();
        System.out.println("----------same method-------------");
        myMethod2("Liam", 5);
        myMethod2("Jenny", 8);
        myMethod2("Anja", 31);
        System.out.println("----------method with if else-------------");
        checkAge(20);
        System.out.println("----------method with return-------------");
        System.out.println(myMethod3(3));
        System.out.println("----------method overloading/static polymorphism(check matching with noofarguments,datatypes,sequence of arguments)------------");
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        System.out.println("----------method recursion------------");
        //Recursion is the technique of making a function call itself.
        int result = sum(10);
        System.out.println(result);
        System.out.println("----------method recursion------------");
        int result2 = sum2(5, 10);
        System.out.println(result2);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    //10 + sum(9)
    //10 + ( 9 + sum(8) )
    //10 + ( 9 + ( 8 + sum(7) ) )
    //...
    //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
    //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
    public static int sum2(int start, int end) {//5,10
        if (end > start) {
            return end + sum2(start, end - 1);
        } else {
            return end;
        }
    }

    //10+sum2(5,9)
    //10+9+sum2(5,8)
    //10+9+8+sum2(5,7)
    //10+9+8+7+sum2(5,6)
    //10+9+8+7+6+sum2(5,5)
    //10+9+8+7+6+5=45
}
