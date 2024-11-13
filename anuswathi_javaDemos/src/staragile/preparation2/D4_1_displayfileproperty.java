package staragile.preparation2;

import java.io.File;

public class D4_1_displayfileproperty {
//    File:Word processing document,photo,audio clip,video etc
    //Folder:Is used to organize files
//    The File class from the java.io package, allows us to work with files.
//    To use the File class, create an object of the class, and specify the filename or directory name:
//    import java.io.File;  // Import the File class
//    File myObj = new File("filename.txt"); // Specify the filename
//   Method	  Type	Description
//    canRead()	Boolean	Tests whether the file is readable or not
//    canWrite()	Boolean	Tests whether the file is writable or not
//    createNewFile()	Boolean	Creates an empty file
//    delete()	Boolean	Deletes a file
//    exists()	Boolean	Tests whether the file exists
//    getName()	String	Returns the name of the file
//    getAbsolutePath()	String	Returns the absolute pathname of the file
//    length()	Long	Returns the size of the file in bytes
//    list()	String[]	Returns an array of the files in the directory
//    mkdir()	Boolean	Creates a directory
public static void main(String[] args) {
//    System.out.println("args[0]" + args[0]);
//    System.out.println("args[1]" + args[1]);
//    System.out.println("args[2]" + args[2]);
    //run->editconfigurations->Program arguments->Demo.txt(this file is here inside src)(note:in run  name should match with this class name)
    // accept file name or directory name through
    // command line args
//    String fname = args[0];

    // pass the filename or directory name to File
    // object
//    File f = new File(fname);
    File f = new File("C:\\Users\\ravir\\Desktop\\AutomationTesting\\Java\\Filedirectory\\codewriting\\Demo.txt");
    // apply File class methods on File object
    System.out.println("File name :" + f.getName());
    //The system looks for the specified file in the current working directory.
    // path=C:\Users\ravir\Desktop\AutomationTesting\Java\Filedirectory\codewriting\Demo.txt
    System.out.println("Path: " + f.getPath());
    //Absolute path=C:\Users\ravir\Desktop\AutomationTesting\Java\Filedirectory\codewriting\Demo.txt
    System.out.println("Absolute path:"
            + f.getAbsolutePath());
    //Parent=C:\Users\ravir\Desktop\AutomationTesting\Java\Filedirectory\codewriting
    System.out.println("Parent:" + f.getParent());
    System.out.println("Exists :" + f.exists());

    if (f.exists()) {
        System.out.println("Is writable:"
                + f.canWrite());
        System.out.println("Is readable" + f.canRead());
        System.out.println("Is a directory:"
                + f.isDirectory());
        System.out.println("File Size in bytes "
                + f.length());
    }
}
}
