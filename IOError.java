import java.io.IOException;

public class IOError {
    public static void main(String[] args) throws IOException {
        System.out.println("✅ Program Started");

        // 🚨 Manually throwing an IOException
        throw new IOException("Custom IO Error Occurred!");

        // System.out.println("✅ Program Ended"); // This line won't execute
    }
}
