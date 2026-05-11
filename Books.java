public class Books extends Item 
{
    // Variables
    private String bookTitle;
    private String author;
    private String publisher;
    private String genre;
    private String copyrightDate;
    private int numberOfPages;
    private String lexileLevel;

    public Books()
    {
        super();

        bookTitle = "Of Mice and Men";
        author = "John Steinbeck";
        publisher = "Covici Friede";
        genre = "Fiction";
        copyrightDate = "February 6, 1937";
        numberOfPages = 112;
        lexileLevel = "630L";
    }

    public Books(String name, String description, String id, int lastShelf, int lastCompartment, 
                 String bookTitle, String author, String publisher, String genre, 
                 String copyrightDate, int yearPublished, int numberOfPages, String lexileLevel)
    {
        super(name, description, id, lastShelf, lastCompartment);

        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.copyrightDate = copyrightDate;
        this.numberOfPages = numberOfPages;
        this.lexileLevel = lexileLevel;
    }

    // Methods
    public String getBookTitle()
    {
        return bookTitle;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public String getCopyrightDate()
    {
        return copyrightDate;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public String getLexileLevel()
    {
        return lexileLevel;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void setCopyrightDate(String copyrightDate)
    {
        this.copyrightDate = copyrightDate;
    }

    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    public void setLexileLevel(String lexileLevel)
    {
        this.lexileLevel = lexileLevel;
    }

    @Override
    public String toString() 
    {
        return super.toString() + 
               "Book Title: " + bookTitle + 
               "\nAuthor: " + author + 
               "\nPublisher: " + publisher + 
               "\nGenre: " + genre + 
               "\nCopyright Date: " + copyrightDate + 
               "\nNumber of Pages: " + numberOfPages + 
               "\nLexile Level: " + lexileLevel + 
               "\n";
    }
}
