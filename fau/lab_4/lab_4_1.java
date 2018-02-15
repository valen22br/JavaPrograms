
package lab_4_1;

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
 * In this assignment a program that asks the user for the number grade they 
 * received on two tests. Average the test grade..
/*******************************************************************************
 */
import java.util.Scanner;
public class Lab_4_1 {

    enum LetterGrade {A,B,C,D,F}
    
    public static void main(String[] args) {
            
        LetterGrade studentGrade;
        float test1Grade, test2Grade;
        float gradeAvg;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the grades you have received on the "
                + "first test");
        test1Grade = keyboard.nextFloat();
        System.out.println("Please enter the grades you have received on the "
                + "second test");
        test2Grade = keyboard.nextFloat();
        gradeAvg = (test1Grade + test2Grade)/2;
        
        if(gradeAvg < 60)
            studentGrade = LetterGrade.F;
        else if (gradeAvg <= 69)
            studentGrade = LetterGrade.D;
        else if (gradeAvg <= 79)
            studentGrade = LetterGrade.C;
        else if(gradeAvg <= 89 )
            studentGrade = LetterGrade.B;
        else
            studentGrade = LetterGrade.A;
        
        switch (studentGrade)
        {
            case A: 
                System.out.println("Great Job! You received an "+studentGrade);
                break;
            case B: 
                System.out.println("Good work! You received an "+studentGrade);
                break;
            case C: 
                System.out.println("You passed. You received an C/D");
                break;
            case D: 
                System.out.println("You passed. You received an C/D");
                break;
            default:
                System.out.println("You have to retake the class. You received an "+studentGrade);
                break;
        }
    }
}
