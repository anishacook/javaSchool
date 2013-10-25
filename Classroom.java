
/**
 * Classroom calls Human class for people in classroom. always assumes 4 stud, 1 teach per room
 * 
 * @author Anisha Cook
 * @version 15 Oct 13
 */
public class Classroom
{
    public static Human[] student;

    /**
     * Constructor for objects of class Classroom
     */
    public Classroom(int numberHumans)
    {
 

        student = new Human[numberHumans];
        for(int i=0; i<numberHumans; i++)
        {
            student[i] = new Human();
        }
    }


}
