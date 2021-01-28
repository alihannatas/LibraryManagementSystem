package db.Connection;

import java.sql.Connection;

public class testConnectionFactory {
    public static void main(String[] args) {
        Connection c = ConnectionFactory.getConnection();
        System.out.println(c);
    }
}
