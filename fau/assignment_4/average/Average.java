/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:03/15/2018             Due Time: 11:30PM
 * Assignment Number: Assignment 4
 * Last Changed: 03/15/2018
 *
 * Description:
 * class called Average that can be used to calculate average of several 
 * integers. It should contain the following methods:
/*******************************************************************************
 */
package assigment4;

import java.util.*;
public class Average {
    /*Class Average that calculates the average of several integers*/
    public double returnAverage(int...numbers) {
        /*Method to return the average value of n numbers*/
        int total = 0;
        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
            return (double)total/numbers.length;
    }
   
    
    public double returnRange(int...numbers) {
        /*Method to return the average of two integers that represent a range
        method that accepts two integer parameters that represent a range. 
        Issue an error message and return zero if the second parameter is less 
        than the first one. Otherwise, the method should return the average of
        the integers in that range (inclusive).
         */
        int holder = 0;

        int highest;
        int lowest;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > holder) {
                holder = numbers[i];
            }
        }
        highest = holder;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < holder) {
                holder = numbers[i];
            }
        }
        lowest = holder;
        
        if(numbers.length > 1)
        {    
            if(numbers[0] < numbers[1])
            {   
                System.out.println("Error: the first parameter must be greater "
                        + "than the second one");
                return -1;
            }
        }
             
        //return highest-lowest;
        return returnAverage((int)highest,(int)lowest);
    }

    public static void main(String[] args) {
        Average myAvg = new Average();
        System.out.println(myAvg.returnAverage(2,4));
        System.out.println(myAvg.returnAverage(2,4,5));

        System.out.println("---------------------------------------------------");
        
        System.out.println(myAvg.returnRange(7,15));
        System.out.println(myAvg.returnRange());
        System.out.println(myAvg.returnRange(21,15));
        System.out.println(myAvg.returnRange(27,1));
    }
    
}
