package pills;

/**
 * This is the AcetaminophenActive class that implements ActiveGenerator.
 * @author Subteam A
 * @version 1.0
 */
public class AcetaminophenActive implements ActiveGenerator {

    @Override
    public String generateActive(double amount) {
        String output = String.format("Acetylating para-aminophenol with acetic anhydride\nCarefully extracting %.2fmg of acetaminophen\nReturning %.2fmg of acetaminophen\n", amount, amount);
        System.out.print(output);
        return "acetaminophen";
    }
    
}
