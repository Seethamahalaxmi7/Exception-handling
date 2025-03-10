public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("✅ Inside try block");
            int result = 10 / 0; // 🚨 This will cause an exception
            System.out.println("This line won't execute.");
        } catch (ArithmeticException e) {
            System.out.println("❌ Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("🛠️ Finally block executed!");
        }

        System.out.println("✅ Program continues...");
    }
}
