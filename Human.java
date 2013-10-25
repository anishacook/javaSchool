
/**
 * For each human
 * 
 * @author Anisha Cook
 * @version 15 Oct 13
 */
public class Human
{

    private boolean isVaccinated;
    private boolean isInfected = true;

    
    
    
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
    public boolean getInfectState()
    {
        return isInfected;
    }
    /**
     * getVaccineState
     * 
     * @return isVaccinated boolean value whether or not person is vaccinated
     */
    public boolean getVaccineState()
    {
        return isVaccinated;
    }
    

    public void infect()
    {
        isInfected = true;
    }
}
