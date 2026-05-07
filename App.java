import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        manager.printItemsInStorage();
        manager.printCheckedOutItems();

        System.out.print("Enter item to find (Name/ID): ");
        String item = input.next();

        ArrayList<Integer> matches = manager.findItem(item);

        if(matches.isEmpty())
            System.out.println("No matches found");
        else if(matches.size() == 1)
        {
            System.out.println(manager.printSingleItem(matches.get(0)));
        }
        else if(matches.size() > 1)
        {
            for(int i = 0; i < matches.size(); i++)
            {
                System.out.println(manager.printSingleItem(matches.get(i)));
            }
        }
        

        input.close();
    }

}
