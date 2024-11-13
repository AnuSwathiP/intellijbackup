package staragile.preparation2;

import java.io.File;

public class D4_6_deletfile {
    public static void main(String[] args) {
        File Obj = new File("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting\\directorydemo\\Demo3.txt");
        if (Obj.delete()) {
            System.out.println("The deleted file is : "
                    + Obj.getName());
        }
        else {
            System.out.println(
                    "Failed in deleting the file.");
        }
    }
}
