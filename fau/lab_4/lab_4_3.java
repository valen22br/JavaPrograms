package lab_4_3;

/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:02/15/2018             Due Time: 11:30PM
 * Assignment Number: lab 4
 * Last Changed: 02/15/2018
 *
 * Description:
 * In this assignment a a program that repeatedly asks the user for their score 
 * on a test and calculates the test average.
/*******************************************************************************
 */
import java.util.Scanner;
public class Lab_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sentinel, lastInsertedGrade = 0;
        int loopCount = 1;
        float grade = 0, gradeAvg = 0;
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
            System.out.println("Enter the grade you received on Test "+ loopCount);
            sentinel = keyboard.nextFloat();
            if(sentinel >= 0)
            {
                grade += sentinel;
                gradeAvg = grade/loopCount;
                System.out.println("Your test average in the class is "+ gradeAvg);
                loopCount++;
                if((gradeAvg) < 70)
                {
                    System.out.println("yout test average fell to low. "
                            + "Please retake the class");
                    System.exit(0);
                }
            }
            else
                sentinel = -1;
            
        }while(sentinel != -1);
        System.out.println("Goodbye");
    }
    
}
