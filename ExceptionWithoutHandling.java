public class ExceptionWithoutHandling {
    // Method that explicitly throws an ArithmeticException
    static void throwException() {
        throw new ArithmeticException("🔥 Exception thrown from method!");
    }

    public static void main(String[] args) {
        // Calling the method without try-catch block
        throwException(); // 🚨 This will cause the program to crash
        System.out.println("This line will not execute!"); // Unreachable code
    }
}
