import java.util.Date;

public class Magazine extends Item
{   // Constructors


    // Parameters: Item + Magazine
    public Magazine(String name, String description, String id, String checkedPerson, Date dueDate,  int lastShelf, int lastCompartment, String magazineTitle,
                    String edition,
                    String mainArticle,
                    String publisher)
    {
        // Checked book
        super(name, description, id, checkedPerson, dueDate, lastShelf, lastCompartment);
        this.magazineTitle = magazineTitle;
        this.edition = edition;
        this.mainArticle = mainArticle;
        this.publisher = publisher;
    }

    // No arg - defualt constructor
    public Magazine()
    {
        super();
        magazineTitle = "Unknown Title";
        edition = "Unknown Edition";
        mainArticle = "Unknown Article";
        publisher = "Unknown Publisher";
    }

    // Variables
    private String magazineTitle;
    private String edition;
    private String mainArticle;
    private String publisher;

    // Methods
    public String getMagazineTitle()
    {
        return magazineTitle;
    }

    public String getEdition()
    {
        return edition;
    }

    public String getMainArticle()
    {
        return mainArticle;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setMagazineTitle(String magazineTitle)
    {
        this.magazineTitle = magazineTitle;
    }

    public void setEdition(String edition)
    {
        this.edition = edition;
    }

    public void setMainArticle(String mainArticle)
    {
        this.mainArticle = mainArticle;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    @Override
    public String toString()
    {
        /* Reflect Item's data
           field, while also adding its own unique 
           magazine data field. 
           Wanted to learn what StringBuilder does/is */
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());     // Add item info
        sb.append("Title: ").append(magazineTitle).append("\n");         // Append - adds to the end
        sb.append("Edition: ").append(edition).append("\n");
        sb.append("Main Article: ").append(mainArticle).append("\n");
        sb.append("Publisher: ").append(publisher).append("\n");
        
        return sb.toString();   
    }
}