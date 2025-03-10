public class ArithmeticExceptionHandled {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // Division by zero

        try {
            int result = a / b; // 🚨 This will throw an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("⚠ Error: Division by zero is not allowed!");
        }

        System.out.println("✅ Program continues after handling the exception.");
    }
}
