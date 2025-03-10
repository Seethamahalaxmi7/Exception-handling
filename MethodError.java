import java.lang.reflect.Method;

class Demo {
    public void existingMethod() {
        System.out.println("This is an existing method.");
    }
}

public class MethodError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        try {
            // Getting the class object of Demo
            Class<?> demoClass = Demo.class;

            // 🚨 Trying to access a method that does not exist
            Method method = demoClass.getDeclaredMethod("nonExistentMethod");

        } catch (NoSuchMethodException e) {
            System.out.println("❌ Exception Caught: " + e);
        }

        System.out.println("✅ Program Ended");
    }
}
