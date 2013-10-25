
/**
 * School
 * 
 * @author Anisha Cook
 * @version 16 Oct 2013
 */
public class School
{

    private int numberClassrooms;
    private int numberInfected;

    public static Classroom[] classroom;
     /**
     * Constructor for objects of class School
     * assumes one is vaccinated
     * @param percentVaccinated double percent of students vaccinated
     * 
     */
    public School(int numberClassrooms, int numberHumans)
    {
        this.numberClassrooms = numberClassrooms;
        numberInfected = 0;
       

        classroom = new Classroom[numberClassrooms];
        for(int i=0; i<numberClassrooms; i++)
        {
            classroom[i] = new Classroom(numberHumans);
        }
        
       
    }


}
