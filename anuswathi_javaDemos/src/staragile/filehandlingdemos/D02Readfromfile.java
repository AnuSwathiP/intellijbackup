package staragile.filehandlingdemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D02Readfromfile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Demo1.txt");
        Scanner scn = new Scanner(file);
        while (scn.hasNext())
        System.out.println(scn.nextLine());
        scn.close();

    }
}
