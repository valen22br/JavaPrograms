/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:02/22/2018             Due Time: 11:30PM
 * Assignment Number: 02
 * Last Changed: 02/22/2018
 *
 * Description:
 * In this assignment a a program that takes a letter grade from the User and
 * return its value in a range between 4.0 and 0.0
/*******************************************************************************
 */
package homework_5;

import java.util.Scanner;

/**
 *
 * @author valen
 */
public class Homework_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letterStr;
        String letterSignal = "";
        String errorMsg = "";
        double letterToInt = 0.0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the letter grade (A, B, C, D, E, F)");
        letterStr = keyboard.nextLine();
        if(!letterStr.equals("F"))
        {
            System.out.println("Please enter the + or - signal to complenent the letter. Enter no value for adding just the letter");
            letterSignal = keyboard.nextLine();
        }
        letterStr += letterSignal;
        System.out.println("*"+letterStr+"*");
        switch(letterStr)
        {
            case "A+":
                letterToInt = 4.25;
                break;
            case "A":
                letterToInt = 4.0;
                break;
            case "A-":
                letterToInt = 3.75;
                break;
            case "B+":
                letterToInt = 3.25;
                break;
            case "B":
                letterToInt = 3.0;
                break;
            case "B-":
                letterToInt = 2.75;
                break;
            case "C+":
                letterToInt = 2.25;
                break;
            case "C":
                letterToInt = 2.0;
                break;
            case "C-":
                letterToInt = 1.75;
                break;
            case "D+":
                letterToInt = 1.25;
                break;
            case "D":
                letterToInt = 1.0;
                break;
            case "D-":
                letterToInt = 0.75;
                break;
            case "F":
                letterToInt = 0.0;
                break;
            default:
                letterToInt = 0.0;
                errorMsg = "An error has occurred";
                break;
        }
        if(errorMsg == "")
            System.out.println("Your grade correspond to the number: "+letterToInt);
        else
            System.out.println(errorMsg + " "+ letterToInt);
    }
}
   
