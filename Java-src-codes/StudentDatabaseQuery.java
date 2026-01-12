import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDatabaseQuery {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/StudentDB"; // Change "localhost" and port if necessary
        String username = "root";  // Your MySQL username
        String password = "password";  // Your MySQL password

        // SQL query to fetch student records
        String query = "SELECT * FROM students";

        // Establish the connection
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Check if we have any results
            if (resultSet.next()) {
                System.out.println("Student Records from the 'students' table:");
                System.out.println("------------------------------------------------");
                // Loop through the result set and print student details
                do {
                    int studentId = resultSet.getInt("student_id"); // Assuming 'student_id' is the column name
                    String name = resultSet.getString("name"); // Assuming 'name' is the column name
                    int age = resultSet.getInt("age"); // Assuming 'age' is the column name
                    String major = resultSet.getString("major"); // Assuming 'major' is the column name
                    
                    System.out.println("Student ID: " + studentId);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Major: " + major);
                    System.out.println("------------------------------------------------");
                } while (resultSet.next()); // Continue until all rows are processed
            } else {
                System.out.println("No student records found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
