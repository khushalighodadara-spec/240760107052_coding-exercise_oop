
class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}
class Library {
    int availableBooks;
    Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }
    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println(count + " book(s) issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}
public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library(3);

        try {
            // Valid issue
            lib.issueBook(2);

            // Invalid issue
            lib.issueBook(2);
        } 
        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

/*
Sample Output:

2 book(s) issued successfully
Remaining books: 1
Exception: Requested books not available
*/
