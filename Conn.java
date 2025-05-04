package ASimulatorSystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC driver
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "admin123");
            s = c.createStatement(); // Create statement object
        } catch (Exception e) {
            System.out.println("Database Connection Error: " + e);
        }
    }
}
