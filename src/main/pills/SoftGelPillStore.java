package pills;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftGelPillStore {
    private GelCapFactory factory;
    private ArrayList<GelCap> currentOrder;
    private Scanner input;
    private PrintStream output;
    private String customerName;
    private int customerAge;
    private boolean isLggedIn;

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

    }

    public void logIn(String name, int age) {

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
