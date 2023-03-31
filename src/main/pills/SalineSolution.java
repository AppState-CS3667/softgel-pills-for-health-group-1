package pills;

/**
 * This is the SalineSolution class that implements SolutionGenerator.
 * @author Subteam B
 * @version 1.0
 */
public class SalineSolution implements SolutionGenerator{
    
    @Override
    public String generateSolution() {
        String output = String.format("Mixing salt and water...\nVerifying ratio...\nReturning saline solution\n");
        System.out.print(output);
        return "saline";
    }
}