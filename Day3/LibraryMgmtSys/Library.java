package LibraryMgmtSys;
import java.util.*;
//import LibraryMgmtSys.*;
public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    //book issue
    public boolean issueBook(String isbn, String userId) {
        Book bookToIssue = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToIssue = book;
                break;
            }
        }
        if (bookToIssue == null) {
            return false; // Book not found
        }
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                books.remove(bookToIssue);
                return true; // Book issued successfully
            }
        }
        return false; // User not found
    }
    //return book
    public void returnBook(Book book) {
        books.add(book);
    }
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    public List<User> getUsers() {
        return users;
    }
}
