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
 * program to read a one-line sentence and outputs one of the following
 * responses:"Even" if the line ends in a "?" and has an even number of
 * characters."Odd" if the line ends in a "?" and has an odd number of]
 * characters."Wow" if the line ends with "!""Null" in all other cases.
 * 
 * Instance variables:
 * 
 * private String myStringLine;
 * 
 * Methods
 * public MyStringLine()
 * public MyStringLine(String myString)
 * public getStrLength()
 * public getStrValue()
 * public processLineString()
/*******************************************************************************
 */
package lab7.q2;

/**
 *
 * @author valen
 */
import java.util.*;
class MyStringLine{
    private String myStringLine;

    public MyStringLine(){
        /*Default Constructor*/
        myStringLine = "";
    }
    
    public MyStringLine(String myString){
        /*Constructor that gets one String argument*/
        myStringLine = myString;
    }
    
    public String getStrValue(){
        /*Method to return the myStringLine value*/
        return myStringLine;
    }
    
    public int getStrLength(){
        /*Method to return the myStringLine length*/
        return myStringLine.length();
    }
    
    
    public String processLineString(){
        /*Method to process the myStringline string and return the a String*/
        String resultStr = "";
        if(this.getStrLength() > 0)
        {
            if(myStringLine.charAt(this.getStrLength()-1)== '?')
            {
                if(this.getStrLength()%2 == 0)
                {
                    resultStr = "Even";
                }
                else
                {
                    resultStr = "Odd";
                }
            }
            else if(myStringLine.charAt(this.getStrLength()-1) == '!')
            {
                resultStr = "Wow";
            }
            else
            {
                resultStr = "Null";
            }
            
        }
        else{
            resultStr = "";
        }
        
        return resultStr;
    }    
}

public class Q2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String lineContent;
        System.out.println("Please enter a one line question statement");
        MyStringLine stringLine = new MyStringLine(keyboard.nextLine());
        //System.out.println(stringLine.getStrValue());
        //System.out.println(stringLine.getStrLength());
        System.out.println(stringLine.processLineString());
    }
}
