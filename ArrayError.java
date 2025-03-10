public class ArrayError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        int[] numbers = {1, 2, 3, 4, 5};

        // 🚨 Accessing an invalid index (Index 10 does not exist)
        System.out.println(numbers[10]); // Throws ArrayIndexOutOfBoundsException

        System.out.println("✅ Program Ended"); // This line won't execute
    }
}
