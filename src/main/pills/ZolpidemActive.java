package pills;

/**
 * This is the ZolpidemActive class that implements ActiveGenerator.
 * @author Subteam A
 * @version 1.0
 */
public class ZolpidemActive implements ActiveGenerator {

    @Override
    public String generateActive(double amount) {
        String output = String.format("Opening secure storage area...\nCarefully extracting %.2fmg of zolpidem\nReturning %.2fmg of zolpidem\n", amount, amount);
        System.out.print(output);
        return "zolpidem";
    }
    
}