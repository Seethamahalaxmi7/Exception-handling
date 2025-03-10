import java.lang.reflect.Field;

class Demo {
    public int existingField;
}

public class FieldError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        try {
            // Getting the class object of Demo
            Class<?> demoClass = Demo.class;

            // 🚨 Trying to access a field that does not exist
            Field field = demoClass.getDeclaredField("nonExistentField"); 

        } catch (NoSuchFieldException e) {
            System.out.println("❌ Exception Caught: " + e);
        }

        System.out.println("✅ Program Ended");
    }
}
