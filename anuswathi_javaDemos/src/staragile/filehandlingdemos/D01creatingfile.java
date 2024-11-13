package staragile.filehandlingdemos;

import java.io.*;

public class D01creatingfile {
    public static void main(String[] args) throws IOException {
//        File is an class through which you can handle any kind of files
        File f = new File("Demo1.txt");
        FileOutputStream  fos = new FileOutputStream(f);
        System.out.println("File created");
        FileWriter writer = new FileWriter(f);
        writer.write("File in java are seriouslly good");
        writer.close();
        System.out.println("Successfully written");

    }
}
