package pills;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftGelPillStore 
{
    private GelCapFactory factory;
    private ArrayList<GelCap> currentOrder;
    private Scanner input;
    private PrintStream output;
    private String customerName;
    private int customerAge;
    private boolean isLoggedIn;

    public SoftGelPillStore(Scanner input, PrintStream output) 
    {
        this.input = input;
        this.output = output;
        this.isLoggedIn = false;
        this.customerAge = -1;
        this.customerName = "";
    }

    public SoftGelPillStore(PrintStream output) 
    {
        this(new Scanner(System.in), output);
    }

    public SoftGelPillStore(Scanner input) 
    {
        this(input, System.out);
    }

    public SoftGelPillStore() 
    {
        this(new Scanner(System.in), System.out);
    }

    public GelCap[] checkOut() 
    {
        if (!this.isLoggedIn || this.currentOrder.size() == 0)
        {
            this.output.print("You need to log in and order before you can checkout\n");
            return null;
        }
        else
        {
            this.output.print("Thanks for shopping!\nHere is your order\n");
            for (GelCap g : this.currentOrder)
            {
                this.output.println(g.toString());
            }
            GelCap orderArray[] = new GelCap[this.currentOrder.size()];
            orderArray = this.currentOrder.toArray(orderArray);
            this.currentOrder.clear();
            return orderArray;
        }
    }

    public void order() 
    {
        boolean valid = false;
        if (!this.isLoggedIn)
        {
            this.output.print("You must log in before you can order.\n");
            return;
        }
        else
        {
            this.output.printf("Hello, %s. What would you like to order?\n", this.customerName);
        }
        this.output.print("Options:\n1) Dreamly\n2) AcheAway\n3) Cancel\n");
        while (!valid)
        {
            String userInput = this.input.nextLine();
            try
            {
                int userChoice = Integer.parseInt(userInput);
                
                if (userChoice != 1 && userChoice != 2 && userChoice != 3)
                {
                    valid = false;
                    this.output.print("Please enter a 1, 2, or 3\n");
                }
                else
                {
                    valid = true;
                    if (userChoice == 1)
                    {
                        Dreamly pendingOrder = this.factory.produceDreamly();
                        if (!(pendingOrder instanceof NullDreamly))
                        { 
                            this.currentOrder.add(pendingOrder);
                        }
                    }
                    else if (userChoice == 2)
                    {
                        AcheAway pendingOrder = this.factory.produceAcheAway();
                        if (!(pendingOrder instanceof NullAcheAway))
                        {
                            this.currentOrder.add(pendingOrder);
                        }
                    }
                    else
                    {
                        return;
                    }
                }
            }
            catch (NumberFormatException e)
            {
                valid = false;
                this.output.print("Please enter a 1, 2, or 3\n");
            }
        }
    }

    public void logIn() 
    {
        boolean valid = false;
        while (!valid)
        {
            try
            {
                this.output.println("What is your name?");
                String customerName = this.input.nextLine();
                this.output.println("What is your age?");
                this.customerAge = this.input.nextInt();
                this.input.nextLine();
                for (int i = 0; i < customerName.length(); i++)
                {
                    if (customerName.charAt(i) <= '0' || customerName.charAt(i) >= '9')
                    {
                        valid = false;
                    }
                }
                if (customerAge < 0)
                {
                    valid = false;
                }
                else
                {
                    valid = true;
                    logIn(customerName, customerAge);
                }
            }
            catch (Exception e)
            {
                valid = false;
            }
        }

    }

    public void logIn(String name, int age) 
    {
        this.customerName = name;
        this.customerAge = age;
        final int ADULTAGE = 18;
        if (age < ADULTAGE)
        {
            this.factory = new ChildGelCapFactory();
        }
        else
        {
            this.factory = new AdultGelCapFactory();
        }
        this.isLoggedIn = true;
        this.currentOrder = new ArrayList<GelCap>();
    }

    public boolean logOut() 
    {
        if (!this.isLoggedIn)
        {
            this.output.println("You are not logged in.");
            return false;
        }
        else if (this.currentOrder.size() > 0)
        {
            this.output.println("You have an order that you have not checked out. "
                                + "Are you sure you want to log out? (y/N)");

            String userInput = this.input.nextLine();
            if (!userInput.equals("y"))
            {  
                return false;
            }

        }
        this.isLoggedIn = false;
        this.currentOrder = null;
        this.customerName = "";
        this.customerAge = -1;
        return true;
    }

    public void setOutput(PrintStream output) 
    {
        this.output = output;
    }

    public void setInput(Scanner input) 
    {
        this.input = input;
    }

    public PrintStream getOutput() 
    {
        return this.output;
    }

    public Scanner getInput() 
    {
        return this.input;
    }
}
