
/**
 * Classroom calls Human class for people in classroom. always assumes 4 stud, 1 teach per room
 * 
 * @author Anisha Cook
 * @version 15 Oct 13
 */
public class Classroom
{
    //public static Human student0;
    public static Human student1;
    public static Human student2;
    public static Human student3;
    public static Human student4;
    public static int roomNumber;

    /**
     * Constructor for objects of class Classroom
     */
    public Classroom(double percentVaccinated, boolean isOneInfected, int roomNumber)
    {
        // NAME.human(int humanType, boolean isVaccinated, boolean isInfected, int location)
        this.roomNumber = roomNumber;
        if(isOneInfected == true)
        {
            student1 = new Human(0,true, true, roomNumber);
        }
        else
        {
            student1 = new Human(0,true,false,roomNumber);
        }
        student2 = new Human(0,true,false,roomNumber);
        student3 = new Human(0,true,false,roomNumber);
        student4 = new Human(0,true,false,roomNumber);
        //teacher = new Human(0,true,false,roomNumber);
        
        Human[] roomStudents = 
        {
            student1, student2, student3, student4
        };
    }


}
