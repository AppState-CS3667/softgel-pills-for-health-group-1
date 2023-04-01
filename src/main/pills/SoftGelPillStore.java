package pills;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class SoftGelPillStore {
    private GelCapFactory factory;
    private ArrayList<GelCap> currentOrder;
    private Scanner input;
    private PrintStream output;
    private String customerName;
    private int customerAge;
    private boolean isLoggedIn;

    public SoftGelPillStore(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
        this.isLoggedIn = false;  // Might not need this
    }

    public SoftGelPillStore(PrintStream output) {
        this(new Scanner(System.in), output);
    }

    public SoftGelPillStore(Scanner input) {
        this(input, new PrintStream(System.out));
    }

    public SoftGelPillStore() {
        this(new Scanner(System.in), new PrintStream(System.out));
    }

    public GelCap [] checkOut() {

    }

    public void order() {
        boolean valid = false;
        if (!this.isLoggedIn)
        {
            this.output.println("You must log in before you can order.\n");
            return;
        }
        else
        {
            this.output.printf("Hello, %s. What would you like to order?\n", this.customerName);
        }
        this.output.println("Options:\n1) Dreamly\n2) AcheAway\n3) Cancel");
        while (!valid)
        {
            try
            {
                int userInput = this.input.nextInt();
                String newLine = this.input.nextLine();
                if (userInput != '1' || userInput != '2' || userInput != '3')
                {
                    valid = false;
                    this.output.println("Please enter a 1, 2, or 3\n");
                }
                else
                {
                    valid = true;
                    if (userInput == '1')
                    {
                        this.currentOrder.add(this.factory.produceDreamly());
                    }
                    if (userInput == '2')
                    {
                        this.currentOrder.add(this.factory.produceAcheAway());
                    }
                    else
                    {
                        return;
                    }
                }
            }
            catch (Exception e)
            {
                valid = false;
                this.output.println("Please enter a 1, 2, or 3\n");
            }
        }
    }

    public void logIn() {
        boolean valid = false;
        while(!valid){
            try{
                this.output.println("What is your name?");
                String inputName = this.input.nextLine();
                this.output.println("What is your age?");
                int inputAge = this.input.nextInt();
                String newLine = this.input.nextLine();
                for (int i = 0; i < inputName.length(); i++)
                {
                    if (inputName.charAt(i) <= '0' || inputName.charAt(i) >= '9')
                    {
                        valid = false;
                    }
                }
                if (inputAge < 0)
                {
                    valid = false;
                }
                else
                {
                    valid = true;
                    logIn(inputName, inputAge);
                }
            }
            catch (Exception e){
                valid = false;
            }
        }

    }

    public void logIn(String name, int age) {
        this.customerName = name;
        this.customerAge = age;
        if (age < 18)
        {
            this.factory = new ChildGelCapFactory();
        }
        else{
            this.factory = new AdultGelCapFactory();
        }
        this.isLoggedIn = true;
        this.currentOrder = new ArrayList<GelCap>();
    }

    public boolean logOut() {

    }

    public void setOutput(PrintStream output) {
        this.output = output;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public PrintStream getOutput() {
        return this.output;
    }

    public Scanner getInput() {
        return this.input;
    }
}
