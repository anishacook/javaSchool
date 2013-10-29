
/**
 * For each human
 * 
 * @author Anisha Cook
 * @version 15 Oct 13
 */
public class Human
{

    private boolean isVaccinated = false;
    private boolean isInfected = false;
    public static int interactions = 0;

    
    
    
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        
    }

    /**
     * getInfectState 
     * 
     * @return isInfected boolean value whether or not person is infected
     */
    public boolean isInfected()
    {
        return isInfected;
    }
    /**
     * getVaccineState
     * 
     * @return isVaccinated boolean value whether or not person is vaccinated
     */
    public boolean isVaccinated()
    {
        return isVaccinated;
    }
    
    public void makeInfected()
    {
        isInfected = true;
    }
    
    
}
