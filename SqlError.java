import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlError {
    public static void main(String[] args) {
        System.out.println("✅ Program Started");

        try {
            // 🚨 Invalid database URL (causes SQLException)
            String url = "jdbc:mysql://localhost:3306/nonexistentdb";
            String user = "wrongUser";
            String password = "wrongPassword";

            // 🚨 Attempt to connect (fails and throws SQLException)
            Connection conn = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            System.out.println("❌ Exception Caught: " + e);
        }

        System.out.println("✅ Program Ended");
    }
}
