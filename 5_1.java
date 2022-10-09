import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream; // USED IN METHOD 2 
import java.util.Scanner; // USED IN METHOD 2 
import java.nio.file.*; // USED IN METHOD 3


public class Practical5_1 {
    public static void main(String[] args) {
        // METHOD 1: Using File.createNewFile() method

        // initialize File object and passing path as argument
        File file = new File("C:\\Users\\Kaivan\\OneDrive\\Desktop\\JAVA\\Part-5\\Prac-5.txt");
        boolean result;

        try {
            result = file.createNewFile(); // creates a new file
            if (result) {
                System.out.println("File Created.");
            } else {
                System.out.println("File was not created.");
            }

            // applying File class methods on File object

            System.out.println("File name :" + file.getName());

            System.out.println("Path: " + file.getPath());

            System.out.println("Absolute path:" + file.getAbsolutePath());

            System.out.println("Parent:" + file.getParent());

            System.out.println("Exists :" + file.exists());

        } catch (IOException e) {
            e.printStackTrace(); // prints exception if any
        }

        // METHOD 2: Using FileOutputStream class

        /*
         * try {
         * 
         * Scanner sc = new Scanner(System.in); // object of Scanner class
         * System.out.print("Enter the file name: ");
         * 
         * String name = sc.nextLine(); // variable name to store the file name
         * 
         * FileOutputStream fos = new FileOutputStream(name, true); // true for append
         * mode
         * 
         * System.out.print("Enter file content: ");
         * 
         * String str = sc.nextLine() + "\n"; // str stores the string which we have
         * entered
         * 
         * byte[] b = str.getBytes(); // converts string into bytes
         * 
         * fos.write(b); // writes bytes into file
         * fos.close(); // close the file
         * 
         * System.out.println("file saved.");
         * 
         * }
         * catch (Exception e) {
         * e.printStackTrace();
         * }
         */

        // METHOD-3: Using File.createFile() method

        /*
         * Path path =
         * Paths.get("C:\\Users\\Kaivan\\OneDrive\\Desktop\\JAVA\\Part-5\\Prac-5.txt");
         * // creates Path instance
         * 
         * try {
         * 
         * Path p = Files.createFile(path); // creates file at specified location
         * System.out.println("File Created at Path: " + p);
         * 
         * }
         * catch (IOException e) {
         * 
         * e.printStackTrace();
         * 
         * }
         */

    }
}
