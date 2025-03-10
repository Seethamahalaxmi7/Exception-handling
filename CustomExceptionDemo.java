public class CustomExceptionDemo {
    // Method that throws an exception with a custom message
    static void checkNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("❌ Error: Negative numbers are not allowed!");
        } else {
            System.out.println("✅ Valid number: " + number);
        }
    }

    public static void main(String[] args) {
        checkNumber(10); // ✅ Valid case
        checkNumber(-5); // 🚨 This will throw an exception with a custom message
        System.out.println("This line will not execute after exception!");
    }
}
