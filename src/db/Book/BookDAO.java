package db.Book;

import java.util.List;

public interface BookDAO {
    public boolean addBook(Book b);
    public boolean updateBook(Book b);
    public List<Book> listBooks();
    public Book getBookById(int id);
    public boolean removeBookById(int id);
}
