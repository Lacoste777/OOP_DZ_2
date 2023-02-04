public class Book {
    private String BookAuthor;
    private String BookTitle ;
    private String BookOrigin;


    public void SetBookAuthor (String bookAuthor){
        this.BookAuthor = bookAuthor;
    }
    public void SetBookTitle (String bookTitle){
        this.BookTitle = bookTitle;
    }
    public void SetBookOrigin (String bookOrigin){
        this.BookOrigin = bookOrigin;
    }

    public String GetBookAuthor (){
        return BookAuthor;
    }
    public String GetBookTitle (){
        return BookTitle;
    }
    public String GetBookOrigin (){
        return BookOrigin;
    }


}