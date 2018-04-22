/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date04/24/2018             Due Time: 11:30PM
 * Assignment Number: Assignment 7
 * Last Changed: 04/21/2018
 *
 * Description:
 * recursive method that will compute the number of odd digits in a number.
/*******************************************************************************
**/
package assignment7.q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author valen
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    private static int count = 0;
    
    public static void countOddDigits(int number)
    {
        int remainder = number % 10;
        int quotient = (number - remainder) / 10;
        
        if(!(remainder % 2 == 0))
        {
            count++;
        }
        
        number = quotient;
        if(number < 10)
        {
            if(!(number % 2 == 0))
            {
                count++;
            }
        }
        else
        {
            countOddDigits(number);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digit a positive int number: ");
        int n = in.nextInt();
        countOddDigits(n);
        System.out.println("The number of odd digits is " + count);
        in.close();
    }
    
}
