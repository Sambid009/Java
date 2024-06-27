package unit1;
import java.sql.*;

public class javanew {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "";

            // Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Check if the connection is closed
            if (con.isClosed()) {
                System.out.println("Connection is closed.");
            } else {
                System.out.println("Connection is open.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
