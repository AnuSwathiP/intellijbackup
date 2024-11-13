package staragile.preparation2;

import java.io.FileWriter;
import java.io.IOException;

public class D4_5_writefile {
    public static void main(String[] args) {
        try {
            FileWriter Writer
                    = new FileWriter("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting\\directorydemo\\Demo5.txt");
            Writer.write(
                    "U r reading what i wrote");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
