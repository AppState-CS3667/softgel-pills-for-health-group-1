package client;
import java.util.ArrayList;
import java.util.Scanner;

import pills.GelCap;
import pills.SoftGelPillStore;

/**
 * Demo class that provides an interface to use the SoftGelPillStore.
 * 
 * @author Thayer Ackerman
 * @version 1.1
 */
public class Demo 
{
    /**
     * An interface to interact with the SoftGelPillStore.
     * 
     * @param args unused
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        SoftGelPillStore store = new SoftGelPillStore(input, System.out);
        ArrayList<GelCap[]> orders = new ArrayList<>();
        String seperator = "------------------------------------";
        String clearScreen = "\033[H\033[2J";

        // Display log in page
        System.out.print(clearScreen);
        System.out.println(seperator);
        System.out.println("|         ePharm - Log In          |");
        System.out.println(seperator);
        store.logIn();

        boolean exit = false;
        while (!exit) 
        {
            String choice = "";
            while (!validSelection(choice)) 
            {
                System.out.print(clearScreen);
                System.out.println(seperator);
                System.out.println("|        ePharm - Main Menu        |");
                System.out.println(seperator);
                System.out.println("|  Choose from the following menu  |");
                System.out.println(seperator);
                System.out.println("|   1) Logout                      |");
                System.out.println(seperator);
                System.out.println("|   2) Add to Cart                 |");
                System.out.println(seperator);
                System.out.println("|   3) View Cart                   |");
                System.out.println(seperator);
                System.out.println("|   4) Checkout                    |");
                System.out.println(seperator);
                System.out.println("|   5) File a Complaint            |");
                System.out.println(seperator);
                System.out.print("Choose an Option Number: ");
                choice = input.nextLine();
                if (!validSelection(choice)) 
                {
                    System.out.print(clearScreen);
                    System.out.println(seperator);
                    System.out.println("|        ePharm - Main Menu        |");
                    System.out.println(seperator);
                    System.out.println("|  Choose from the following menu  |");
                    System.out.println(seperator);
                    System.out.println("|   1) Logout                      |");
                    System.out.println(seperator);
                    System.out.println("|   2) Add to Cart                 |");
                    System.out.println(seperator);
                    System.out.println("|   3) View Cart                   |");
                    System.out.println(seperator);
                    System.out.println("|   4) Checkout                    |");
                    System.out.println(seperator);
                    System.out.println("|   5) File a Complaint            |");
                    System.out.println(seperator);
                    System.out.println("         INVALID  SELECTION         ");

                    System.out.print("Press enter/return to exit.");
                    input.nextLine();
                }
            }
            switch (Integer.parseInt(choice)) 
            {
                case 1:
                    // Display log out page
                    System.out.print(clearScreen);
                    System.out.println(seperator);
                    System.out.println("|          ePharm - Logout         |");
                    System.out.println(seperator);
                    System.out.println("|           LOGGING OUT            |");
                    System.out.println(seperator);
                    exit = store.logOut();

                    System.out.print("Press enter/return to exit.");
                    input.nextLine();
                    break;

                case 2: 
                    // Display order page
                    System.out.print(clearScreen);
                    System.out.println(seperator);
                    System.out.println("|       ePharm - Add to Cart       |");
                    System.out.println(seperator);
                    store.order();
                    
                    System.out.print("Press enter/return to exit.");
                    input.nextLine();
                    break;
                case 3: 
                    // Display checkout page
                    GelCap[] order = store.checkOut();
                    if (order != null) orders.add(order);
                    System.out.print(clearScreen);
                    System.out.println(seperator);
                    System.out.println("|         ePharm - Your Cart       |");
                    System.out.println(seperator);
                    if (!orders.isEmpty())
                    {
                        int orderNum = 0;
                        for (GelCap[] o : orders) 
                        {
                            System.out.printf("Order Number %d\n", ++orderNum);
                            for (GelCap g : o)
                            { 
                                System.out.printf("\t- %s\n", g);
                            }
                            System.out.println();
                        }
                    }
                    else 
                    {
                        System.out.println("            Cart is Empty           ");
                    }
                    
                    System.out.print("Press enter/return to exit.");
                    input.nextLine();
                    break;

                case 4:
                    // Display exit checkout page
                    System.out.print(clearScreen);
                    System.out.println(seperator);
                    System.out.println("|         ePharm - Checkout        |");
                    System.out.println(seperator);
                    if (orders.size() == 0) 
                    {
                        System.out.println("|         No current order         |");
                        System.out.println(seperator);
                        System.out.print("Press enter/return to exit.");
                    }
                    else 
                    {
                        System.out.println("|  Your order is being processed   |");
                        System.out.println("|  Thank you for choosing ePharm!  |");
                        System.out.println(seperator);
                        exit = true;
                        System.out.print("Press enter/return to confirm.");
                    }
                    
                    input.nextLine();
                    break;
                case 5:
                    // Display file complaint page
                    System.out.print(clearScreen);
                    System.out.println(seperator);
                    System.out.println("|     ePharm - File Complaint      |");
                    System.out.println(seperator);
                    System.out.println("|  We are sorry to hear that you   |");
                    System.out.println("|  are disappointed with our       |");
                    System.out.println("|  services. I hope we can better  |");
                    System.out.println("|  assist you in the future.       |");
                    System.out.println(seperator);
                    System.out.print("Describe your grievances here: ");
                    input.nextLine();

                    System.out.print("Press enter/return to submit your complaint.");
                    input.nextLine();
                    break;
                default:
                    break;
            }
        }
        System.out.print(clearScreen);
        input.close();
    }

    /**
     * Helper method that checks if use input is a 1, 2, or 3.
     * @param selection the string entered by the user
     * @return true if the selection was valid, false otherwise
     */
    private static boolean validSelection(String selection) 
    {
        try 
        {
            int choice = Integer.parseInt(selection);
            return choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }
}
