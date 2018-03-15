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
 * program to read in positive integers until a negative value is entered, 
 * then it processes the values except for the last negative value and displays
 * the largest value, smallest value, and the average of the entire values.
 * 
 * Instance variables:
 * 
 * private ArrayList arrayValues
 * 
 * Methods
 * public addValues(int value)
 * public averageListValues()
 * public getlist()
 * public largestValue()
 * public smallestValue()
 * public sumListValues()
/*******************************************************************************
 */
package lab7.q1;
import java.util.*;

class ListPositiveIntegers{
    private ArrayList arrayValues = new ArrayList();
    
    public ArrayList getList(){
        /*Default Constructor*/
        return arrayValues;
    }
    
    public void addValues(int value){
        /*Constructor that takes one int argument*/
        arrayValues.add(value);
    }
    
    public int getSize(){
        /*Method to get the size of the arrayList*/
        return arrayValues.size();
    }
    
    public int largestValue(){
        /*Method to return the largest element of the arrayList*/
        int tempInt;
        if(arrayValues.size() > 0)
        {
            tempInt = (int) arrayValues.get(0);
            for(int i = 1; i < arrayValues.size(); i++)
            {
                if((int)arrayValues.get(i) > tempInt)
                {
                    tempInt = (int)arrayValues.get(i);
                }
            }
        }
        else
        {
            tempInt = 0;
        }
        return tempInt;
    }
    
    public int smallestValue(){
        /*Method to return the smallest element of the arrayList*/
        int tempInt;
        if(arrayValues.size() > 0)
        {
            tempInt = (int) arrayValues.get(0);
            for(int i = 1; i < arrayValues.size(); i++)
            {
                if((int)arrayValues.get(i) < tempInt)
                {
                    tempInt = (int)arrayValues.get(i);
                }
            }
        }
        else
        {
            tempInt = 0;
        }
        return tempInt;
    }
    
    public int sumListValues(){
        /*Method to return the sum of elements in the arrayList*/
        int sumListValues = 0;
        for(int i = 0; i < arrayValues.size(); i++)
        {
            sumListValues += (int)arrayValues.get(i);
        }
        return sumListValues;
    }
    
    public double averageListValues(){
        /*Method to return the average value of the  elements in the arrayList*/
        double avgValue;
        if(arrayValues.size() > 0)
        {
            avgValue = (double)sumListValues()/arrayValues.size();
        }
        else
        {
            avgValue = 0;
        }
        
        return avgValue;
    }
}

public class Q1 {
    public static void main(String[] args) {
        ListPositiveIntegers listValues = new ListPositiveIntegers();
        System.out.println("Initial listValue size: " + listValues.getList().size());
        Scanner keyboard = new Scanner(System.in);
        int integerValue = 0;
        do
        {
            System.out.println("Please enter a positive integer, or -1 to quit");
            integerValue = keyboard.nextInt();
            if(integerValue > -1)
            {
                listValues.addValues(integerValue);
            }
            
        }while (integerValue > -1);
        
        System.out.println(listValues.getList());
        System.out.println("For the " +listValues.getSize()+ " numbers you entered");
        System.out.println("the largest value = " + listValues.largestValue());
        System.out.println("the smallest value = " + listValues.smallestValue());
        System.out.println("and the average is = " + listValues.averageListValues());
    }
}
