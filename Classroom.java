
/**
 * Classroom calls Human class for people in classroom
 * 
 * @author Anisha Cook
 * @version 15 Oct 13
 */
public class Classroom
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Classroom
     */
    public Classroom()
    {
        Human student1;
        Human student2;
        Human student3;
        Human student4;
        Human teacher;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void fillClassroom(double percentVaccinated, boolean isOneInfected, int roomNumber)
    {
        // NAME.human(int humanType, boolean isVaccinated, boolean isInfected, int location)
        if(isOneInfected == true)
        {
            Human student1 = new Human(0,true, true, roomNumber);
        }
        else
        {
            Human student1 = new Human(0,true,false,roomNumber);
        }
        Human student2 = new Human(0,true,false,roomNumber);
        Human student3 = new Human(0,true,false,roomNumber);
        Human student4 = new Human(0,true,false,roomNumber);
        Human teacher = new Human(0,true,false,roomNumber);
        
    }
}
