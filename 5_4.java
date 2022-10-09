import java.io.*;

public class Practical5_4 {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("C:\\Users\\Kaivan\\OneDrive\\Desktop\\JAVA\\Part-5\\input.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
        } finally {
            if (sourceStream != null)
                sourceStream.close();
        }
        
    }
}
