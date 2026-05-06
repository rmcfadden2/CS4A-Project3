import java.util.*;

public abstract class Item {
    //Constants
    private final long DUE_LIMIT;

    //Variables
    private String name;
    private String description;
    private String id;
    private boolean checked;
    private String checkedPerson;
    private Date dueDate;
    private int lastShelf;
    private int lastCompartment;

    //Constructors
    protected Item() {
        DUE_LIMIT = 259200000; //3 days in milliseconds

        name = "Robin Banks";
        description = "He robs banks";
        id = "R0BB3D1";
        checked = true;
        checkedPerson = "Robbed";
        dueDate = new Date();
        lastShelf = -1;
        lastCompartment = -1;
    }

    //Constructor for an unchecked book
    protected Item(String n, String d, String id, int ls, int lc) {
        DUE_LIMIT = 259200000; //3 days in milliseconds

        name = n;
        description = d;
        this.id = id;
        checked = false;
        checkedPerson = "Shelf: " + this.lastShelf + " Compartment: " + this.lastCompartment;
        dueDate = new Date();
        lastShelf = ls;
        lastCompartment = lc;
    }

    //Constructor for an already checked book
    protected Item(String n, String d, String id, String cp, Date dd, int ls, int lc) {
        DUE_LIMIT = 259200000; //3 days in milliseconds

        name = n;
        description = d;
        this.id = id;
        checked = true;
        checkedPerson = cp;
        dueDate = dd;
        lastShelf = ls;
        lastCompartment = lc;
    }

    //Getters and setters

    public long getDueLimit() {
        return DUE_LIMIT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getCheckedPerson() {
        return checkedPerson;
    }

    public void setCheckedPerson(String checkedPerson) {
        this.checkedPerson = checkedPerson;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getLastShelf() {
        return lastShelf;
    }

    public int getLastCompartment() {
        return lastCompartment;
    }

    @Override
    public String toString() {
        return  "\nName: " + name + 
                "\nDescription: " + description + 
                "\nID: " + id + 
                "\nChecked: " + checked + 
                "\nChecked Person: " + checkedPerson + 
                "\nDue Date: " + dueDate + 
                "\nLast Shelf: " + (lastShelf + 1) + 
                "\nLast Compartment: " + (lastCompartment + 1) + 
                "\n";
    }

    //Function to checkout a book, sets the boolean, name of person and Due Date 3 days after the item was checked
    public void checkItem(String checkedPerson) {
        checked = true;
        this.checkedPerson = checkedPerson;

        Date temp = new Date();
        this.dueDate = new Date(temp.getTime() + DUE_LIMIT);
    }

    public void setLocation(int shelf, int compartment) {
        this.lastShelf = shelf;
        this.lastCompartment = compartment;
    }
}

