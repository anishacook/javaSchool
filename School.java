
/**
 * School
 * 
 * @author Anisha Cook
 * @version 16 Oct 2013
 */
public class School
{
    public static Classroom room0;
    public static Classroom room1;
    public static Classroom room2;
    public static Classroom room3;
    public static Classroom room4;
    //public static Playground playground;
    private double percentVaccinated;
    private int numberInfected;

    /**
     * Constructor for objects of class School
     * @param percentVaccinated double percent of students vaccinated
     * @param numberInfected int number infected
     */
    
    //Classroom(double percentVaccinated, boolean isOneInfected, int roomNumber)
    public School(double percentVaccinated, int numberInfected)
    {
        //need to det. where someone is infected
        this.percentVaccinated = percentVaccinated;
        this.numberInfected = numberInfected;
        room1 = new Classroom(percentVaccinated, false, 0);
        room2 = new Classroom(percentVaccinated, false, 1);
        room3 = new Classroom(percentVaccinated, false, 2);
        room4 = new Classroom(percentVaccinated, false, 3);
        room5 = new Classroom(percentVaccinated, false, 4);

    }
     /**
     * Constructor for objects of class School
     * assumes one is vaccinated
     * @param percentVaccinated double percent of students vaccinated
     * 
     */
    public School(double percentVaccinated)
    {
        this.percentVaccinated = percentVaccinated;
        numberInfected = 0;
        room0 = new Classroom(percentVaccinated, false, 0);
        room1 = new Classroom(percentVaccinated, false, 1);
        room2 = new Classroom(percentVaccinated, false, 2);
        room3 = new Classroom(percentVaccinated, false, 3);
        room4 = new Classroom(percentVaccinated, false, 4);
        
        Classroom[] classrooms =
        {
            room0, room1, room2, room3, room4
        };
       
    }


}
