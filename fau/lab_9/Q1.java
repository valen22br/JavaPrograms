/*/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:04/05/2018             Due Time: 11:30PM
 * Assignment Number: lab 09
 * Last Changed: 04/05/2018
 *
 * Description:
 * program that implements the quick sort method to a integer array
 * Time Complexity:
 * Worst case: O(n^2)
/*******************************************************************************
 */
package lab9.q1;

/**
 *
 * @author Luis Gustavo Grubert Valensuela
 */
import java.util.*;
/**
 * Class to implement the quick sort method for sorting a integer array
 * @uthor Luis Gustavo Grubert Valensuela
 */
class QuickSort{
        int partition(int [] arrayA, int low, int hight)
        {
            int pivot = arrayA[hight];
            int i = (low -1); //index of smaller element
            for(int j = low; j < hight; j++)
            {
                //if current element is smaller than or equal to pivot
                if(arrayA[j] <= pivot)
                {
                    i++;
                    //swap arrayA[i] and arrayA[j]
                    int temp = arrayA[i];
                    arrayA[i] = arrayA[j];
                    arrayA[j] = temp;       
                }
            }
            
            //swap arrayA[i+1] and arrayA[hight] (or pivot)
            int temp = arrayA[i+1];
            arrayA[i+1] = arrayA[hight];
            arrayA[hight] = temp;
            
            return i+1;
        }
        /**
         * Method that implements the QuickSort()
         * arrayA[] - Array to be sorted,
         * low - Starting Index,
         * hight - Ending index
         * @param arrayA 
         * @param low
         * @param hight 
         */
        void sort(int [] arrayA, int low, int hight)
        {
            if(low < hight)
            {
                int pi = partition(arrayA,low,hight);
                
                sort(arrayA, low, pi-1);
                sort(arrayA, pi+1, hight);
            }
        }
}

public class Q1 {
    
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
        int lengthArray = 501;
        unsortedArray = new int[lengthArray];
        Random rand = new Random();
        for (int i = 0; i < lengthArray; i++)
        {
            unsortedArray[i] = rand.nextInt(10000) + 1;
        }
        
        
        
        
        System.out.println("Given Array");
        printArray(unsortedArray);
        
        QuickSort quickSortObj = new QuickSort();
        
        long startTime = System.nanoTime();
        
        quickSortObj.sort(unsortedArray, 0, lengthArray-1);
        
        long endTime = System.nanoTime();
        System.out.println("Total Time of execution: " + (endTime - startTime));
        
        System.out.println("Sorted Array");
        printArray(unsortedArray);
        
    }
    
}
