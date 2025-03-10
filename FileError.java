import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        try {
            // 🚨 Trying to read a file that does not exist
            File file = new File("nonexistent.txt"); 
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("❌ Exception Caught: " + e);
        }

        System.out.println("✅ Program Ended");
    }
}
