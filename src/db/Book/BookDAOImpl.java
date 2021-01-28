package db.Book;

import db.Connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO{
    @Override
    public boolean addBook(Book b) {
        return false;
    }

    @Override
    public boolean updateBook(Book b) {
        return false;
    }

    @Override
    public List<Book> listBooks() {
        Connection conn = ConnectionFactory.getConnection();
        List<Book> l = new ArrayList<Book>();

        try {
            assert conn != null;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM book");

            while(rs.next()){
                // can be written better
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Book b = new Book(id, name);
                l.add(b);
            }
            return l;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Book getBookById(int id) {
        return null;
    }

    @Override
    public boolean removeBookById(int id) {
        return false;
    }
}
