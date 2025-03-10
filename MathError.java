public class MathError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        // Generating Arithmetic Exception
        int a = 10;
        int b = 0;
        int result = a / b; // 🚨 Division by zero (throws ArithmeticException)

        System.out.println("Result: " + result); // This line won't execute
    }
}
