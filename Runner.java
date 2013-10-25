
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{

    
    public static void main(String[] args)
    {
        int NUMBER_CLASSROOMS = 5;
        int NUMBER_STUDENTS_PER_ROOM = 5;
        School poly = new School(NUMBER_CLASSROOMS, NUMBER_STUDENTS_PER_ROOM);
        System.out.println(poly.classroom[2].student[1].getInfectState());
    }
}
