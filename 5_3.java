import java.io.*;
public class Practical5_3 {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

       // Reading source file using read method 
        // and write to file using write method
      try {
         in = new FileReader("source.txt");
         out = new FileWriter("destination.txt");
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
       finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
