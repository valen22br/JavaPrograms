/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment4;

import java.util.*;
public class Average {

    public double returnAverage(int...numbers) {
        int total = 0;
        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
            return (double)total/numbers.length;
    }
   
    public int returnRange(int firstElement, int secondElement) {
        if(firstElement < secondElement)
        {
            return -1;
        }
        else
        {
            return firstElement - secondElement;
        }
        
    }
        
    public double returnRange2(int...numbers) {
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
        
        /*
        System.out.println(myAvg.returnRange(5, 1));
        System.out.println(myAvg.returnRange(6, 5));
        System.out.println(myAvg.returnRange(4, 5));
        */
        System.out.println("++");
        
        System.out.println(myAvg.returnRange2(7,15));
        System.out.println(myAvg.returnRange2());
        System.out.println(myAvg.returnRange2(21,15));
        System.out.println(myAvg.returnRange2(27,1));
    }
    
}
