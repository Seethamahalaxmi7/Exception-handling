public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // Division by zero will cause ArithmeticException
        int result = a / b; // 🚨 Exception occurs here
        System.out.println("Result: " + result); // This line won't execute
    }
}
