import java.util.ArrayList;

class LibraryBooks{
    public String bAuthor;
    public String bTitle;
    public String bOrigin;
}

public class Library extends Book {
    public String LibraryName;

    public Library(String libraryName) {
        this.LibraryName = libraryName;
    }

    ArrayList<LibraryBooks> listBook = new ArrayList<>();

    public void AddBook(String bookAuthor, String bookTitle, String bookOrigin) {
        LibraryBooks lb = new LibraryBooks();
        SetBookAuthor(bookAuthor);
        SetBookTitle(bookTitle);
        SetBookOrigin(bookOrigin);
        lb.bAuthor = GetBookAuthor();
        lb.bTitle = GetBookTitle();
        lb.bOrigin = GetBookOrigin();
        listBook.add(lb);
    }

    public ArrayList<LibraryBooks> getBookList() {
        return listBook;
    }
}