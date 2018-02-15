/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_1;

import java.util.*;

/**
 *
 * @author valen
 */
public class Lab3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int myInteger;
     
        String numPolarity;
        String numParity;
        int absValue;
        System.out.println("Enter with an Integer");
        myInteger = keyboard.nextInt();
        //getting absolute value
        absValue = java.lang.Math.abs(myInteger);
        //Set number polarity
        if(myInteger < 0)
        {
            numPolarity = "negative";
        }else if(myInteger > 0)
        {
            numPolarity = "positive";
        }
        else
        {
            numPolarity = "zero";
        }
        //set number parity
        if(myInteger % 2 == 0)
        {
            numParity = "even";
        }else
        {
            numParity = "odd";
        }
        
        System.out.println(myInteger + " is a "+numPolarity+", it's absolute "
                + "value is "+absValue+", and "+myInteger+" is an "+ numParity + " number");
        
        
    }
    
}
