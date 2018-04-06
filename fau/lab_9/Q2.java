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
 * program that implements the Merge Sort method to a integer array
 * Time Complexity:
 * Worst case: O(nlog(n))
/*******************************************************************************
 */
package lab9.q2;

import java.util.Random;

/**
 * Class to implement the MergeSort Method
 * @author Luis Gustavo Grubert Valensuela
 */
class MergeSort
{
     /**
     * Method that merges two subarrays of arr[]
     * First subarray is arr[l..m]
     * Second subarray is arr[m+1..r]
     * @param arr
     * @param l
     * @param m
     * @param r 
     */
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Main method that sorts arr[l..r] using the merge() method
     * @param arr
     * @param l
     * @param r 
     */
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
public class Q2 {

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
 
        long startTime = System.nanoTime();
        MergeSort ob = new MergeSort();
        ob.sort(unsortedArray, 0, unsortedArray.length-1);
        long endTime = System.nanoTime();
        System.out.println("Total Time of execution: " + (endTime - startTime));
 
        System.out.println("\nSorted array");
        printArray(unsortedArray);
    }
    
}
