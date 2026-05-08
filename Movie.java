import java.util.*;

public class Movie extends Item 
{
    private String            title, director;
    private Date              releaseDate;
    private ArrayList<String> mainActors;

    public Movie()
    {
        super();

        title       = "Title";
        director    = "Robin Banks";
        releaseDate = new Date();
        mainActors  = new ArrayList<String>();
    }

    public Movie(String name, String description, String id, int lastShelf, int lastCompartment,String title, String director, Date releaseDate, ArrayList<String> mainActors)
    {
        super(name, description, id, lastShelf, lastCompartment);

        this.title       = title;
        this.director    = director; 
        this.releaseDate = releaseDate;
        this.mainActors  = new ArrayList<String>(mainActors);
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    public void setDirector(String newDirector)
    {
        director = newDirector;
    }

    public void setReleaseDate(Date newReleaseDate)
    {
        releaseDate = newReleaseDate;
    }

    public void changeActorList(ArrayList<String> newMainActors)
    {
        mainActors = new ArrayList<String>(newMainActors);
    }

    public String getTitle()
    {
        return title;
    }

    public String getDirector()
    {
        return director;
    }

    public Date getReleaseDate()
    {
        return releaseDate;
    }

    public ArrayList<String> getActors()
    {
        return mainActors;
    }

    @Override
    public String toString() 
    {
        String actors = "";

        for(int i = 0; i < mainActors.size(); ++i)
        {
            actors += mainActors.get(i) + "\n";
        }

        return super.toString() + "\nMovie Title: " + title + "\nDirector: " + director + "\nRelease Date: " + releaseDate.toString() + "\nMain Actors:\n" + actors;
    }
}
