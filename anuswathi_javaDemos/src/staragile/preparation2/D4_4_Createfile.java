package staragile.preparation2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class D4_4_Createfile {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("----------method1------------");
//        try {
//            File Obj = new File("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting\\directorydemo\\Demo3.txt");
//            if (Obj.createNewFile()) {
//                System.out.println("File created: "
//                        + Obj.getName());
//            }
//            else {
//                System.out.println("File already exists.");
//            }
//        }
//        catch (IOException e) {
//            System.out.println("An error has occurred.");
//            e.printStackTrace();
//        }
        System.out.println("----------method2------------");
        File f = new File("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting\\directorydemo\\Demo5.txt");
        FileOutputStream fos = new FileOutputStream(f);

    }
}
