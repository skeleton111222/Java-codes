import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password for MySQL database
        String url = "jdbc:mysql://localhost:3306/StudentDB"; // Change "localhost" and port if necessary
        String username = "root";  // Your MySQL username
        String password = "password";  // Your MySQL password

        // Initialize the connection object
        Connection connection = null;

        try {
            // Load and register the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Check if the connection is successful
            if (connection != null) {
                System.out.println("Successfully connected to the database: StudentDB");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing the connection.");
                e.printStackTrace();
            }
        }
    }
}
