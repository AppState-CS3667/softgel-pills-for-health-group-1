package pills;

import java.util.HashMap;

public class GelCapRecipes {
    public static HashMap<String, CasingGenerator> CASINGS;
    public static HashMap<String, SolutionGenerator> SOLUTIONS;
    public static HashMap<String, ActiveGenerator> ACTIVES;

    private static HashMap<String, CasingGenerator> getCasings()
    {
        CASINGS = new HashMap<String, CasingGenerator>();
        return CASINGS;
    }

    private static HashMap<String, SolutionGenerator> getSolutions()
    {
        SOLUTIONS = new HashMap<String, SolutionGenerator>();
        return SOLUTIONS;
    }

    private static HashMap<String, ActiveGenerator> getActives()
    {
        ACTIVES = new HashMap<String, ActiveGenerator>();
        return ACTIVES;
    }
}
