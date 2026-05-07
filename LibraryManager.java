import java.util.ArrayList;

public class LibraryManager {
    private final int NUM_ROWS = 3;
    private final int NUM_COLS = 15;
    private Item[][]  libraryInventory = new Item[NUM_ROWS][NUM_COLS];

    public LibraryManager()
    {
        for (int row = 0; row < libraryInventory.length; row++) {
        for (int col = 0; col < libraryInventory[row].length; col++) {
            String number = String.valueOf(1000000000L + (long)(Math.random() * 9000000000L));
            libraryInventory[row][col] = new Item("Empty", "Item", number, row, col); // create object
            }
        }

        libraryInventory[1][1].setName("Robert");
        libraryInventory[1][2].setName("Robert");
        libraryInventory[2][14].setName("Jensen");
        libraryInventory[0][3].setName("Drew");
        libraryInventory[0][3].checkItem("Barry");

    }

    public void printItemsInStorage()
    {
        System.out.println("All Items in storage: ");

        int count = 1;
        for(int row = 0; row < libraryInventory.length; row++)
        {
            for(int col = 0; col < libraryInventory[row].length; col++)
            {
                if(libraryInventory[row][col].getName() != "Empty")
                    System.out.println(count++ + ". " + libraryInventory[row][col].toString());
            }
        }
    }

    

    public void printCheckedOutItems()
    {
        System.out.println("All Checked Items: ");
        int count = 1;
        for(int row = 0; row < libraryInventory.length; row++)
        {
            for(int col = 0; col < libraryInventory[row].length; col++)
            {
                if(libraryInventory[row][col].getName() != "Empty" && libraryInventory[row][col].isChecked())
                    System.out.println(count++ + ". " + libraryInventory[row][col].toString());
            }
        }
    }

    public String printSingleItem(int index)
    {
        int row = reverseMapRow(index);
        int col = reverseMapCol(index);

        return libraryInventory[row][col].toString();
    }

    public int swapItems(int index1, int index2)
    {
        int row1 = reverseMapRow(index1);
        int col1 = reverseMapCol(index1);
        int row2 = reverseMapRow(index2);
        int col2 = reverseMapCol(index2);

        if(libraryInventory[row1][col1].getName() == "Empty" || libraryInventory[row2][col2].getName() == "Empty")
            return -1;
        else
        {
            Item temp = libraryInventory[row1][col1];
            libraryInventory[row1][col1] = libraryInventory[row2][col2];
            libraryInventory[row2][col2] = temp;
            return 1;
        }

    }

    public ArrayList<Integer> findItem(String n)
    {
        ArrayList<Integer> matches = new ArrayList<>();

        for(int row = 0; row < libraryInventory.length; row++)
        {
            for(int col = 0; col < libraryInventory[row].length; col++)
            {
                if(libraryInventory[row][col].getName().equals(n) || libraryInventory[row][col].getID().equals(n)){
                    matches.add(mapLinearIndex(row, col));
                }
            }
        }
        return matches;
    }

    public int mapLinearIndex(int row, int col)
    {
        return row * NUM_COLS + col;
    }

    public int reverseMapRow(int index)
    {
        return index / NUM_COLS;
    }

    public int reverseMapCol(int index)
    {
        return index % NUM_COLS;
    }


}
