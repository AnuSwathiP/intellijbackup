package staragile.preparation2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D4_3_Readfile {
    public static void main(String[] args) {
        System.out.println("----------method1------------");
//        try {
//            File myObj = new File("Demo.txt");
////            File myObj = new File("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting\\directorydemo\\Demo2.txt");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNext()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
        System.out.println("----------method2------------");
        // Creating file object and specifying path
        File file = new File("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting\\directorydemo\\Demo2.txt");

        try {
            FileInputStream input= new FileInputStream(file);
            int character;
            // read character by character by default
            // read() function return int between 0 and 255.

            while ((character = input.read()) != -1) {
                System.out.print((char)character);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
