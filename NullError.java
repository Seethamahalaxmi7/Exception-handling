public class NullError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        try {
            // 🚨 Declaring a null object
            String str = null;

            // 🚨 Trying to call a method on a null reference
            int length = str.length(); 

        } catch (NullPointerException e) {
            System.out.println("❌ Exception Caught: " + e);
        }

        System.out.println("✅ Program Ended");
    }
}
