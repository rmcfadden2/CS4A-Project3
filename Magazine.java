public class Magazine extends Item
{
    // Magazine(String magazineTitle, String publisher, )
    // {
        
    // }

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

    public void getPublisher(String publisher)
    {
        this.publisher = publisher;
    }
}