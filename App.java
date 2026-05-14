import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        LibraryManager manager = new LibraryManager();

        System.out.println("=================================");
        System.out.println("LIBRARY INVENTORY SYSTEM");
        System.out.println("=================================");

        boolean running = true;

        while(running)
        {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Movie");
            System.out.println("3. Add Magazine");
            System.out.println("4. Print Inventory");
            System.out.println("5. Check Out Item");
            System.out.println("6. Check In Item");
            System.out.println("7. Print checkecked out items");
            System.out.println("8. Swap Items");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter item name: ");
                    String name = input.nextLine();

                    System.out.print("Enter description: ");
                    String desc = input.nextLine();

                    System.out.print("Enter ID: ");
                    String id = input.nextLine();

                    System.out.print("Enter title: ");
                    String title = input.nextLine();

                    System.out.print("Enter author: ");
                    String author = input.nextLine();

                    System.out.print("Enter copyright date: ");
                    String copyright = input.nextLine();

                    Books book = new Books(
                        name,
                        desc,
                        id,
                        0,
                        0,
                        title,
                        author,
                        copyright,
                        "Genre",
                        "English",
                        100,
                        2025,
                        "Available"
                    );

                    if(manager.addItem(book))
                    {
                        System.out.println("Book added successfully.");
                    }
                    else
                    {
                        System.out.println("Library is full.");
                    }

                    break;



                case 2:

                    System.out.print("Enter item name: ");
                    String movieName = input.nextLine();

                    System.out.print("Enter description: ");
                    String movieDesc = input.nextLine();

                    System.out.print("Enter ID: ");
                    String movieID = input.nextLine();

                    System.out.print("Enter title: ");
                    String movieTitle = input.nextLine();

                    System.out.print("Enter director: ");
                    String director = input.nextLine();

                    Date releaseDate = new Date();
                    ArrayList<String> actors = new ArrayList<>();

                    System.out.print("How many actors? ");
                    int numActors = input.nextInt();
                    input.nextLine(); // clear buffer

                    for(int i = 0; i < numActors; i++)
                    {
                        System.out.print("Enter actor " + (i + 1) + ": ");
                        String actor = input.nextLine();
                        actors.add(actor);
                    }

                    Movie movie = new Movie(
                        movieName,
                        movieDesc,
                        movieID,
                        0,
                        0,
                        movieTitle,
                        director,
                        releaseDate,
                        actors
                    );

                    if(manager.addItem(movie))
                    {
                        System.out.println("Movie added successfully.");
                    }
                    else
                    {
                        System.out.println("Library is full.");
                    }

                    break;


                case 3:

                    System.out.print("Enter item name: ");
                    String magName = input.nextLine();

                    System.out.print("Enter description: ");
                    String magDesc = input.nextLine();

                    System.out.print("Enter ID: ");
                    String magID = input.nextLine();

                    System.out.print("Enter magazine title: ");
                    String magazineTitle = input.nextLine();

                    System.out.print("Enter edition: ");
                    String edition = input.nextLine();

                    System.out.print("Enter main article title: ");
                    String article = input.nextLine();

                    System.out.print("Enter publisher: ");
                    String publisher = input.nextLine();

                    Magazine mag = new Magazine(
                        magName,
                        magDesc,
                        magID,
                        "",                 
                        null,               
                        0,
                        0,
                        magazineTitle,
                        edition,
                        article,
                        publisher
                    );

                    if(manager.addItem(mag))
                    {
                        System.out.println("Magazine added successfully.");
                    }
                    else
                    {
                        System.out.println("Library is full.");
                    }

                    break;


                case 4:

                    manager.printItemsInStorage();
                    break;


                case 5:

                    System.out.print("Enter item ID: ");
                    String checkoutID = input.nextLine();

                    System.out.print("Enter your name: ");
                    String person = input.nextLine();

                    if(manager.checkOutItem(checkoutID, person))
                    {
                        System.out.println("Item checked out.");
                    }
                    else
                    {
                        System.out.println("Checkout failed.");
                    }

                    break;


                case 6:

                    System.out.print("Enter item ID: ");
                    String checkinID = input.nextLine();

                    if(manager.checkInItem(checkinID))
                    {
                        System.out.println("Item checked in.");
                    }
                    else
                    {
                        System.out.println("Check in failed.");
                    }

                    break;


                case 7:

                    manager.printCheckedOutItems();
                    break;


                case 8:

                    System.out.print("Enter first item's shelf number: ");
                    int row1 = input.nextInt() - 1;
                    
                    System.out.print("Enter first item's compartment number: ");
                    int col1 = input.nextInt() - 1;
                    
                    int first = manager.mapLinearIndex(row1, col1);


                    System.out.print("Enter second item's shelf number: ");
                    int row2 = input.nextInt() - 1;
                    
                    System.out.print("Enter second item's compartment number: ");
                    int col2 = input.nextInt() - 1;
                    
                    int second = manager.mapLinearIndex(row2, col2);

                    if(manager.swapItems(first, second) == 1)
                    {
                        System.out.println("Items swapped.");
                    }
                    else
                    {
                        System.out.println("Swap failed.");
                    }

                    break;


                case 9:

                    running = false;
                    System.out.println("Program ended.");
                    
                    break;


                default:

                    System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}
// import java.util.Scanner;
// import java.util.ArrayList;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner input = new Scanner(System.in);
//         LibraryManager manager = new LibraryManager();

//         manager.printItemsInStorage();
//         manager.printCheckedOutItems();

//         System.out.print("Enter item to find (Name/ID): ");
//         String item = input.next();

//         ArrayList<Integer> matches = manager.findItem(item);

//         if(matches.isEmpty())
//             System.out.println("No matches found");
//         else if(matches.size() == 1)
//         {
//             System.out.println(manager.printSingleItem(matches.get(0)));
//         }
//         else if(matches.size() > 1)
//         {
//             for(int i = 0; i < matches.size(); i++)
//             {
//                 System.out.println(manager.printSingleItem(matches.get(i)));
//             }
//         }
        

//         input.close();
//     }

// }
