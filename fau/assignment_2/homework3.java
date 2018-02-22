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
 * In this assignment a a program that calculates the serviceValue of cashing
 * a check will be created. The value of the service is dependent on the value
 * of the check.
/*******************************************************************************
 */
package homework_3;

/**
 *
 * @author valen
 */
import java.util.Scanner;
public class Homework_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double checkValue;
        double serviceValue;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the value of the check that you want to cash?");
        checkValue = keyboard.nextFloat();
        if(checkValue <= 10)
        {
            serviceValue = 1;
        }
        else if(checkValue <= 100)
        {
            serviceValue = checkValue * 0.1;
        }
        else if(checkValue <= 1000)
        {
            serviceValue = (5 + checkValue * 0.05);
        }
        else
        {
            serviceValue = (40 + checkValue * 0.01);
        }
        System.out.println("The service value is "+ serviceValue);
    }
    
}
