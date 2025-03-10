public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // 🚨 ArithmeticException (Division by zero)
            
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // 🚨 ArrayIndexOutOfBoundsException
            
            String text = null;
            System.out.println(text.length()); // 🚨 NullPointerException
            
        } catch (ArithmeticException e) {
            System.out.println("⚠ Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ Error: Array index is out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("⚠ Error: Null reference encountered!");
        } catch (Exception e) {
            System.out.println("⚠ General Exception: " + e.getMessage());
        }
        
        System.out.println("✅ Program continues after handling exceptions.");
    }
}
