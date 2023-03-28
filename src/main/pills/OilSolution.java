package pills;

/**
 * This is the OilSolution class that implements SolutionGenerator.
 * @author Subteam B
 * @version 1.0
 */
public class OilSolution implements SolutionGenerator{
    
    @Override
    public String generateSolution() {
        String output = String.format("Extracting pill-sized quantity of oil .\nReturning oil solution\n");
        System.out.print(output);
        return "oil";
    }
}
