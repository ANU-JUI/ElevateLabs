package LibraryMgmtSys;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User("Alice", "alice@example.com", "U001");
        User user2 = new User("Bob", "bob@example.com", "U002");    
        library.addUser(user1);
        library.addUser(user2);
        Book book1 = new Book("1984", "George Orwell", "ISBN001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");
        library.addBook(book1);
        library.addBook(book2);
        boolean issued = library.issueBook("ISBN001", "U001");
        if (issued) {
            System.out.println("Book issued successfully to " + user1.getName());
        } else {
            System.out.println("Failed to issue book.");
        }
        library.returnBook(book1);
        System.out.println("Book returned: " + book1.getTitle());
        boolean issuedAgain = library.issueBook("ISBN001", "U002");
        if (issuedAgain) {
            System.out.println("Book issued successfully to " + user2.getName());
        } else {
            System.out.println("Failed to issue book.");
        }
        library.returnBook(book2);
        System.out.println("Book returned: " + book2.getTitle());
    }
    }
