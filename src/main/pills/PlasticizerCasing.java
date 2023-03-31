package pills;

/**
 * This is the SalineSolution class that implements SolutionGenerator.
 * @author Subteam A
 * @version 1.0
 */
public class PlasticizerCasing implements CasingGenerator{
    
    @Override
    public String generateCasing() {
        String output = String.format("Mixing starch, water, opacifier, and glycerin...\nShaping...\nReturning plasticizer casing...\n");
        System.out.print(output);
        return "plasticizer";
    }
}