package pills;

public class GelatinCasing implements CasingGenerator
{

    @Override
    public String generateCasing()
    {
        String output = String.format("Mixing gelatin, water, opacifier," 
                                      + " and glycerin .\nShaping .\nReturning"
                                      + " gelatin casing .\n");
        System.out.print(output);
        return "gelatin";
    }
}
