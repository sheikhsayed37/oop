class LibraryBook {
    String title;
    String author;
    String bookID;

    LibraryBook(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
    }
}

public class LIBRARYCARD {
    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook(
                "Java Programming",
                "James Gosling",
                "E253045");

        book1.displayBookInfo();
    }
}