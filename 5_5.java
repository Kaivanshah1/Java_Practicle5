import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.util.*;

public class Practical5_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        FileReader in = null;
        FileWriter out = null;
        String filelocation = "C:\\Users\\Kaivan\\OneDrive\\Desktop\\JAVA\\Part-5\\Even.txt";
        File file = new File("C:\\Users\\Kaivan\\OneDrive\\Desktop\\JAVA\\Part-5\\Even.txt");
        
            out = new FileWriter("Even.txt");
            bufw = new BufferedWriter(out);
            ArrayList<Integer> num = new ArrayList < Integer > (15);
            System.out.println("Please  Enter  15  Numbers...");
            for (int i = 0; i < 15; i++) {
                Scanner sc = new Scanner(System.in);
                num.add(sc.nextInt());
            }
            for (int i = 0; i < 15; i++) {
                if (((num.get(i)) % 2 == 0)) {
                    bufw.write(num.get(i));
                }
            }
            bufw.close();
            int ans;
            in = new FileReader("Even.txt");
            bufr = new BufferedReader(in);
            System.out.println("");
            System.out.println("Printing  Even  Numbers ");
            while ((ans = bufr.read()) != -1) {
                System.out.println((ans));
            }
        
        
    }
}
