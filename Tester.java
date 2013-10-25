
/**
 * Not part of program, only to test
 */
public class Tester
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Tester
     */
    public static void main(String[] args)
    {
        /*
        Classroom room1 = new Classroom(44, false, 1);
        room1.fillClassroom(10, false, 1);
        System.out.println(room1.student1.getLocation());*/
        Human [] student;
        student = new Human[5];
        for(int i=0; i <5; i++)
        {
            student[i] = new Human(0, true, false, 1);
        }
    }
}
