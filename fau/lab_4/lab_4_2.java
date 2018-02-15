package lab_4_2;

import java.util.Scanner;

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
 * In this assignment a program that asks the user how many tests they took in
 * a class. Then have the user enter the numerical grade they received on each
 * test and take the average.
/*******************************************************************************
 */
public class Lab_4_2 {
   enum LetterGrade {A,B,C,D,F}
    public static void main(String[] args) {
            
        LetterGrade studentGrade;
        float testGrade=0;
        float gradeAvg;
        int numberExams;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many tests did you take this semester?");
        numberExams = keyboard.nextInt();
        for(int i = 1; i <= numberExams; i++)
        {
            System.out.println("Enter the grade you received on test "+ i);
            testGrade += keyboard.nextFloat();
            
        }
        gradeAvg = testGrade/numberExams;
               
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
