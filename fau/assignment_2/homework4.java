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
package homework_4;

/**
 *
 * @author valen
 */
import java.util.Scanner;
public class Homework_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letterStr;
        String errorMsg = "";
        double letterToInt = 0.0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the letter grade (A, B, C, D, E, F)");
        letterStr = keyboard.nextLine();
        switch(letterStr)
        {
            case "A":
                letterToInt = 4.0;
                break;
            case "B":
                letterToInt = 3.0;
                break;
            case "C":
                letterToInt = 2.0;
                break;
            case "D":
                letterToInt = 1.0;
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
