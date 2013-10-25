
/**
 * For each human
 * 
 * @author Anisha Cook
 * @version 15 Oct 13
 */
public class Human
{
    private int humanType; //0 = Student, 1 = Teacher
    private boolean isVaccinated;
    private boolean isInfected;
    private int location; //Classroom #s, 6=playground
    
    
    
    /**
     * Constructor for objects of class Human
     */
    public Human(int humanType, boolean isVaccinated, boolean isInfected,  int location)
    {
        this.humanType = humanType;
        this.isVaccinated = isVaccinated;
        this.isInfected = isInfected;
        this.location = location;
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
    
    /**
     * getLocation
     * 
     * @return isInfected int value where person is (rooms 1-5, playground '6')
     */
    public int getLocation()
    {
        return location;
    }
    
    public void infect()
    {
        isInfected = true;
    }
}
