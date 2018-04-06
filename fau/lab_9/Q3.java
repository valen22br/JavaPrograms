/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:04/05/2018             Due Time: 11:30PM
 * Assignment Number: lab 09
 * Last Changed: 04/05/2018
 *
 * Description:
 * program that implements Methods to get the max and min value of a array
 * of integers
/*******************************************************************************
 */
package lab9.q3;

import java.util.Random;

/**
 * Class responsable to get the max and min values of a int array.
 * @author Luis Gustavo Grubert Valensuela
 */
class MaximumMinArrayValue
{
    /**
     * Method to get the max value of a int array
     * @param arr
     * @return 
     */
    public int getMaxElementOfArray(int [] arr)
    {
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if (maxValue < arr[i])
            {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    /**
     * Method to get the min value of a int array
     * @param arr
     * @return 
     */
    public int getMinElementOfArray(int [] arr)
    {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(minValue > arr[i])
            {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
public class Q3 {

    /** 
     * Auxiliary function to print a int array.\
     * @param arrayA 
     */
    public static void printArray(int [] arrayA)
    {    
        for (int i = 0; i < arrayA.length; i++)
        {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        /*
        Creation of an array with length of lengthArray with random numbers
        from the class Random.
        */
        int [] unsortedArray;
        int lengthArray = 25;
        unsortedArray = new int[lengthArray];
        Random rand = new Random();
        for (int i = 0; i < lengthArray; i++)
        {
            unsortedArray[i] = rand.nextInt(100000) + 1;
        }
        
        MaximumMinArrayValue myObj = new MaximumMinArrayValue();
        
        System.out.println("Given integer array");
        printArray(unsortedArray);
        System.out.println("Largest Number in array is"
                + " "+ myObj.getMaxElementOfArray(unsortedArray));
        System.out.println("Largest Number in array is"
                + " "+ myObj.getMinElementOfArray(unsortedArray));
    }
}
