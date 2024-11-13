package staragile.preparation2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class D4_2_directorycontent {
//    Scanner is used for parsing tokens from the contents of the stream while BufferedReader just reads the stream and does not do any special parsing.
//    In fact you can pass a BufferedReader to a scanner as the source of characters to parse.
//BufferedReader is more suitable for reading files with long String
    public static void main(String[] args) throws IOException {
        // enter the path and dirname from keyboard
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(System.in));
//
//        System.out.println("Enter dirpath:");
////        C:\Users\ravir\Desktop\AutomationTesting\Java\Filedirectory
////        C:\Users\ravir\Desktop\AutomationTesting\Java\
//        String dirpath = br.readLine();
//        System.out.println("Enter the dirname");
//        //codewriting
//        String dname = br.readLine();
//
//        // create File object with dirpath and dname
//        File f = new File(dirpath, dname);
//
//        // if directory exists,then
//        if (f.exists()) {
//            // get the contents into arr[]
//            // now arr[i] represent either a File or
//            // Directory
//            String arr[] = f.list();
//
//            // find no. of entries in the directory
//            int n = arr.length;
//            System.out.println(" no. of entries in the directory="+n );
//            // displaying the entries
//            for (int i = 0; i < n; i++) {
//                System.out.println("Entry"+i+"="+arr[i]);
//                // create File object with the entry and
//                // test if it is a file or directory
//                File f1 = new File(arr[i]);
//                if (f1.isFile()) {
//                    System.out.println(f1 + ": is a file");
//                }
//                else if (f1.isDirectory()) {
//                    System.out.println(f1 + ": is a directory");
//                }
//                else
//                {
//                    System.out.println(f1 + ": is a something else");
//                }
//            }
//            System.out.println(
//                    "No of entries in this directory " + n);
//        }
//        else
//            System.out.println("Directory not found");

        // Directory
//        File f3 = new File("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting");
        // file
//        File f3 = new File("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting\\check.txt");
// pdf file
        File f3 = new File("file:///C:/Users/ravir/Desktop/AutomationTesting/Java/Filedirectory/codewriting/ho_st_830252024-06-1806-53-13.pdf");

        // Check if the specified path
        // is a directory or not
        if (f3.isDirectory())
            System.out.println("Directory");
        else if (f3.isFile())
                    System.out.println("File");
        else
            System.out.println("is not Directory or file");
    }
}
