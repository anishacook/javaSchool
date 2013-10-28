
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.Scanner;

public class Runner
{

    public static void main(String[] args)
    {
        int NUMBER_CLASSROOMS = 5;
        int NUMBER_STUDENTS_PER_ROOM = 5;
        School poly = new School(NUMBER_CLASSROOMS, NUMBER_STUDENTS_PER_ROOM);
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        
        //create vaccinated, NV  students
        System.out.println("Percent of students vaccinated: ");
        double vaccineRate = in.nextDouble();
        double susceptInRoom = ((100.0 - vaccineRate) * NUMBER_STUDENTS_PER_ROOM)/100.0;
        for(int room=0; room < NUMBER_CLASSROOMS; room++)
        {
            for(int student=0; student < (int) susceptInRoom; student++)
            {
               poly.classroom[room].student[student].isVaccinated = false;
            }
        }
        
       //infect one random student
       
       int roomID = random.nextInt(NUMBER_CLASSROOMS);
       int studentID = random.nextInt(NUMBER_STUDENTS_PER_ROOM);
       poly.classroom[roomID].student[studentID].isInfected = true;
       System.out.println(roomID);
       System.out.println(studentID);
       System.out.println(poly.classroom[roomID].student[studentID].isInfected);
       
       
       //interactions (where interaction means contact through transmission -possible eg/ flu sneeze)
       /*HOUR 1:
        * Room 1:
        * Room 2:
       */
       
       //report
       System.out.println("\nINFECTED STUDENTS \n");
       for(int room=0; room < NUMBER_CLASSROOMS; room++)
        {
            System.out.println("Room #" +(room + 1));
            for(int student=0; student < (int) susceptInRoom; student++)
            {
                if(poly.classroom[room].student[student].isInfected == true)
                {
                    System.out.println("    Student #" +(student +1));
                }
                else System.out.print("");
            }
        }
       
       
        in.close();

    }
}
