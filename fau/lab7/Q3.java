/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:03/15/2018             Due Time: 11:30PM
 * Assignment Number: lab 07
 * Last Changed: 03/15/2018
 *
 * Description:
 * program that asks the user for how many elements are in an array.
 * The program then creates an array of size that the user entered. 
 * Then the program prompts the user to fill the array with their 
 * input (double). After the array has been filled the program outputs
 * the average value of elements in the array.
 * 
 * Instance variables:
 * 
 * private double[] myArray;
 * 
 * Methods
 * public MyArray(int nElements)
 * public avgArrayValues()
 * public sumArrayValues()
/*******************************************************************************
 */
package lab7.q3;
import java.util.*;

class MyArray{
    private double[] myArray;

    public MyArray(int nElements) {
      /*Default Constructor that takes an int argument, create a array of 
        the size of the int argument, and displays on the screen the average
        values of the elements inserted into the array*/
      Scanner keyboard = new Scanner(System.in);
      myArray = new double[nElements];
      int arrayValue;
      System.out.println("ArraySize= " + myArray.length);
      for(int i = 0; i < nElements; i++)
      {
          System.out.println("Enter element "+ (i+1) + " in the array");
          //arrayValue = keyboard.nextInt();
          myArray[i] = keyboard.nextInt();
      }
      System.out.println("The avg value of elements in the array is = " + this.avgArrayValues());
    }
   
    public double sumArrayValues(){
        /*Method to return the sum of the elements into the array*/
        double sumValue = 0;
        for(int i = 0; i < myArray.length; i++)
        {
            sumValue += myArray[i];
        }
        return sumValue;
    }
    
    public double avgArrayValues(){
        /*Method do return the average value of the elements in the array*/
        double avgValue = 0;
        if(myArray.length > 0)
        {
            avgValue = this.sumArrayValues()/myArray.length;
        }
        return avgValue;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nElements = 0;
        System.out.println("Enter how many elements are in the array");
        nElements = keyboard.nextInt();
        MyArray myArray = new MyArray(nElements);
    }
}
