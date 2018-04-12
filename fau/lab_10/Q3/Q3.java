/*
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:04/12/2018             Due Time: 11:30PM
 * Assignment Number: lab 08
 * Last Changed: 03/29/2018
 *
 * Description:
 * Program to show the utilization of output streams on files
 */
package lab10.q3;

/**
 * Main method
 * @author valen
 */
import java.util.Scanner;
import java.io.*;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName;
        String fileExtension = ".txt";
        int valueFromKeyboard=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file name:");
        fileName = keyboard.nextLine();

        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(fileName+fileExtension);
        }
        catch(FileNotFoundException e)
        {
                    System.out.println("Error opening the file " + fileName);
                    System.exit(0);
        }
        System.out.println("Enter integers to add to the file. Enter ' when want to stop.");
        
        while (valueFromKeyboard != -1)
        {
            valueFromKeyboard = keyboard.nextInt();
            if(valueFromKeyboard != -1)
            {
                outputStream.println(valueFromKeyboard);
                System.out.println(valueFromKeyboard + " added to " + fileName);
            }
            else
            {
                System.out.println("Numbers written to test, file closed.");
            }
        }
        outputStream.close();

    }
    
}
