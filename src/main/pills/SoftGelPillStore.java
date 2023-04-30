package pills;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class that implements a store for pill orders.
 * @author Subteam A
 * @version 1.5
 */
public class SoftGelPillStore 
{
    private final double ACCEPTABLE_FAIL_RATE = 0.10;

    private GelCapFactory factory;
    private ArrayList<GelCap> currentOrder;
    private Scanner input;
    private PrintStream output;
    private String customerName;
    private int customerAge;
    private boolean isLoggedIn;
    /**
     * Constructor to set all necessary fields
     * @param input a scanner to obtain input
     * @param output PrintStream object
     */
    public SoftGelPillStore(Scanner input, PrintStream output) 
    {
        this.input = input;
        this.output = output;
        this.isLoggedIn = false;
        this.customerAge = -1;
        this.customerName = "";
    }
    /**
     * Second consructor
     * @param output a PrintStream object
     */
    public SoftGelPillStore(PrintStream output) 
    {
        this(new Scanner(System.in), output);
    }
    /**
     * Third constructor of class
     * @param input a scanner object
     */
    public SoftGelPillStore(Scanner input) 
    {
        this(input, System.out);
    }
    /**
     * No-arg constructor for class
     */
    public SoftGelPillStore() 
    {
        this(new Scanner(System.in), System.out);
    }
    /**
     * Method that allows client to checkout their order
     * @return a GelCap array that consists of a pill order.
     */
    public GelCap[] checkOut() 
    {
        // Changes still need to be done here
        
        if (!this.isLoggedIn || this.currentOrder.size() == 0)
        {
            this.output.print("Your cart is empty, please place an order\n");
            return null;
        }
        else if (!consistentOrder()) 
        {
            this.output.print("Your order is not consistent\n");
            return null;
        }
        else if (tooBigFailRate(checkFailRate())) 
        {
            this.output.print("Too many failures creating your order\n");
            return null;
        }
        else
        {
            this.output.print("|   Contains the following orders  |\n");
            printCurrentOrder();
            GelCap orderArray[] = new GelCap[this.currentOrder.size()];
            orderArray = this.currentOrder.toArray(orderArray);
            this.currentOrder.clear();
            return orderArray;
        }
    }
    /**
     * Method that implements the concept of client-ordering.
     */
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
                        Dreamly pendingOrder;
                        do 
                        {
                            pendingOrder = this.factory.produceDreamly();
                            
                        } while (pendingOrder instanceof NullDreamly);

                        this.currentOrder.add(pendingOrder);
                    }
                    else if (userChoice == 2)
                    {
                        AcheAway pendingOrder;
                        do 
                        {
                            pendingOrder = this.factory.produceAcheAway();
                            
                        } while (pendingOrder instanceof NullAcheAway);

                        this.currentOrder.add(pendingOrder);
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
    /**
     * Method that creates the concept of client-logging in.
     */
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
    /**
     * Method for directing client to correct factory
     * as provided by the parameters.
     * @param name of the client
     * @param age of the client
     */
    public void logIn(String name, int age) 
    {
        this.customerName = name;
        this.customerAge = age;
        final int ADULTAGE = 18;
        if (age < ADULTAGE)
        {
            this.factory = ChildGelCapFactory.getInstance();
        }
        else
        {
            this.factory = AdultGelCapFactory.getInstance();
        }
        this.isLoggedIn = true;
        this.currentOrder = new ArrayList<GelCap>();
    }
    /**
     * Method that creates the logging out concept
     * @return whether or not the client is logged out
     * as a boolean
     */
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
    /**
     * Sets the PrintStream field.
     * @param output PrintStream object
     */
    public void setOutput(PrintStream output) 
    {
        this.output = output;
    }
    /**
     * Sets the scanner field
     * @param input a scanner object
     */
    public void setInput(Scanner input) 
    {
        this.input = input;
    }
    /**
     * Obtaines the output
     * @return the output field
     */
    public PrintStream getOutput() 
    {
        return this.output;
    }
    /**
     * Obtaines the input
     * @return the input field
     */
    public Scanner getInput() 
    {
        return this.input;
    }
    /**
     * Obtaines the strength of dreamly pills in 
     * an order using the StrengthInspector class.
     * @return the strength
     */
    public double getDreamlyStrength()
    {
        StrengthInspector sid = new StrengthInspector();
        for (GelCap g : this.currentOrder)
        {
            g.accept(sid);
        }
        return sid.getDreamlyStrength();
    }
    /**
     * Obtaines the strength of AcheAway pills in 
     * an order using the StrengthInspector class.
     * @return the strength
     */
    public double getAcheAwayStrength()
    {
        // Use StrengthInspector somewhere in here
        StrengthInspector sia = new StrengthInspector();
        for (GelCap g : this.currentOrder)
        {
            g.accept(sia);
        }
        return sia.getAcheAwayStrength();
    }
    /**
     * Method prints the current order
     * by iterating through thr GelCap array.
     */
    public void printCurrentOrder()
    {
        for (GelCap g : this.currentOrder)
        {
            this.output.println(g.toString());
        }
    }
    /**
     * Decides whether the failRate is too large
     * @param failRate the failure rate in question
     * @return TRUE or FALSE depending on the acceptable 
     * failure rate
     */
    private boolean tooBigFailRate(double failRate)
    {
        return (failRate > ACCEPTABLE_FAIL_RATE);
    }
    /**
     * Obtains the failure rate in an order using the 
     * FailureInspector class. 
     * @return the failure rate given by the FailureInspector
     */
    private double checkFailRate()
    {
        FailureInspector fi = new FailureInspector(); 
		for (GelCap g: this.currentOrder)
        {
			g.accept(fi); 
		}
		return fi.getFailRate();
    }
    /**
     * Returns whether the order is consistent(has no adult and child
     * pill mixing)
     * @return TRUE or FALSE depending on the ConsistencyInspector
     */
    private boolean consistentOrder()
    {
		ConsistencyInspector ci = new ConsistencyInspector(); 
		for (GelCap g: this.currentOrder)
        {
			g.accept(ci);
		}        
		return ci.soFarSoConsistent();
    }
}
