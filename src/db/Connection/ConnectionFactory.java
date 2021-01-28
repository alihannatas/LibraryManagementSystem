package db.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static final String user = "postgres";
    public static final String pass = "root";

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", user, pass);
            }catch (SQLException | ClassNotFoundException e) {
                // TODO:: log error message
                return null;
            }
        }
}

