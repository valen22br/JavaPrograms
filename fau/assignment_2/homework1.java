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
 * In this assignment a a program will return the second string of the string 
 * inserted by the user. If only one string is informed, this first will be 
 * returned. Here the space character is used to determine the numbers of
 * strings
/*******************************************************************************
 */
package homework_1;

/**
 *
 * @author valen
 */
import java.util.Scanner;
public class Homework_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myStr;
        String newStr;
        int indexPosition;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter with some strings separated by space");
        myStr = keyboard.nextLine();
        indexPosition = myStr.indexOf(" ");
        newStr = myStr.substring(indexPosition+1);
        indexPosition = newStr.indexOf(" ");
        if(indexPosition != -1)
        {    
            newStr = newStr.substring(0,indexPosition);
        }
        System.out.println(newStr);
    }
}
