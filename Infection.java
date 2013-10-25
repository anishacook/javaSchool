
/**
 * Write a description of class Infection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Infection
{
            
        //more efficient way? while loop string name? 
        //can make an array while declaring variables?!
        

        Human zero_one = School.room0.student1;
        Human zero_two = School.room0.student2;
        Human zero_three = School.room0.student3;
        Human zero_four = School.room0.student4;
        
        Human one_one = School.room1.student1;
        Human one_two = School.room1.student2;
        Human one_three = School.room1.student3;
        Human one_four = School.room1.student4;
        
        Human two_one = School.room2.student1;
        Human two_two = School.room2.student2;
        Human two_three = School.room2.student3;
        Human two_four = School.room2.student4;
        
        Human three_one = School.room3.student1;
        Human three_two = School.room3.student2;
        Human three_three = School.room3.student3;
        Human three_four = School.room3.student4;
        
        Human four_one = School.room4.student1;
        Human four_two = School.room4.student2;
        Human four_three = School.room4.student3;
        Human four_four = School.room4.student4;
        
        Human[] students =
        {
            zero_one, zero_two, zero_three, zero_four, 
            one_one, one_two, one_three, one_four, 
            two_one, two_two, two_three, two_four, 
            three_one, three_two, three_three, three_four, 
            four_one, four_two, four_three, four_four 
        };
        
        
        public void runPrimary()
        {
            for(int i=0; i<=students.length; i++)
            {
                boolean isInfected = students[i].getInfectState();
                if(isInfected == true)
                {
                    int loc = students[i].getLocation();
                    Classroom hotClassroom = School.classrooms[loc];
                    Human[] hotStudents;
                    System.arraycopy(hotClassroom.roomStudents, 0, hotStudents, 0, hotClassroom.length);
                }
            }
    }
}
