public class ClassError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        try {
            // 🚨 Trying to load a non-existent class
            Class.forName("NonExistentClass"); 
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Exception Caught: " + e);
        }

        System.out.println("✅ Program Ended");
    }
}
