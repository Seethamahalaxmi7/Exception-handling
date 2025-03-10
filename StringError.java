public class StringError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        try {
            // 🚨 Declaring a string
            String str = "Hello";

            // 🚨 Trying to access an invalid index (out of bounds)
            char ch = str.charAt(10); 

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("❌ Exception Caught: " + e);
        }

        System.out.println("✅ Program Ended");
    }
}
