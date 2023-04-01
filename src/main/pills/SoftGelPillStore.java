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

    }

    public void logIn() {
        boolean valid = false;
        while(valid){
            try{
                this.output.println("What is your name?");
                String inputName = this.input.nextLine();
                this.output.println("What is your age?");
                int inputAge = this.input.nextInt();
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
