/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3_4;

/**
 *
 * @author valen
 */
import java.util.*;
public class Lab_3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precedenceInt;
        String firstStr, secondStr, precedenceStr;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first string");
        firstStr = keyboard.nextLine();
        System.out.println("Enter the second string");
        secondStr = keyboard.nextLine();
        
        precedenceInt = firstStr.compareTo(secondStr);
        if(precedenceInt < 0)
        {
            System.out.println(firstStr + " precedes " + secondStr);
        }
        else if(precedenceInt == 0)
        {
            System.out.println(firstStr + " is equal to " + secondStr);
        }
        else
        {
            System.out.println(secondStr + " precedes " + firstStr);
        }
        
    }
}
