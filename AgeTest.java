// Custom Exception with Short Name
class AgeEx extends Exception {
    public AgeEx(String msg) {
        super(msg);
    }
}

public class AgeTest {
    static void check(int age) throws AgeEx {
        if (age < 18) {
            throw new AgeEx("❌ Age must be 18+!");
        } else {
            System.out.println("✅ Access granted! Age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            check(20); // ✅ Valid
            check(16); // 🚨 Throws Exception
        } catch (AgeEx e) {
            System.out.println(e.getMessage());
        }

        System.out.println("✅ Program continues...");
    }
}
