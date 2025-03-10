public class NumberError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        try {
            // 🚨 Trying to convert a non-numeric string to an integer
            String str = "abc123";  
            int num = Integer.parseInt(str); 

        } catch (NumberFormatException e) {
            System.out.println("❌ Exception Caught: " + e);
        }

        System.out.println("✅ Program Ended");
    }
}
