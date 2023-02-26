package client;
import pills.AcheAway;
import pills.Dreamly;

public class Demo
{
    public static void main(String args[])
    {
        double acheAwayStrength = 2.00;
        double acheAwaySize = 5.00;
        String acheAwayColor = "yellow";
        
        double dreamlyStrength = 1.00;
        double dreamlySize = 7.00;
        String dreamlyColor = "white";

        AcheAway acheAway = new AcheAway(acheAwayStrength, 
                                         acheAwaySize, acheAwayColor);
        System.out.println(acheAway);
        System.out.println(acheAway.description());

        Dreamly dreamly = new Dreamly(dreamlyStrength, 
                                      dreamlySize, dreamlyColor);
        System.out.println(dreamly);
        System.out.println(dreamly.description());

    }
}
