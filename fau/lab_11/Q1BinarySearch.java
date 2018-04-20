/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author valen
 */
public class Q1BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
 
            // If the element is present at the 
            // middle itself
            if (arr[mid] == x)
               return mid;
 
            // If element is smaller than mid, then 
            // it can only be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, x);
        }
 
        // We reach here when element is not present
        //  in array
        return -1;
    }
    
    void auxiliaryPrintArrayFunction(int[] myArray)
    {
        for (int i = 0; i< myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Q1BinarySearch ob = new Q1BinarySearch();
        int arr[] = {2,3,4,10,40};
        System.out.print("Given the array: ");
        ob.auxiliaryPrintArrayFunction(arr);
        System.out.println();
        int n = arr.length;
        int x = 10;
        System.out.println("Seaching for: "+ x);
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + 
                                                 result);
    }
    
}
