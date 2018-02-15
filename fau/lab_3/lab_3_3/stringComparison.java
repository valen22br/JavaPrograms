/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3_3;

/**
 *
 * @author valen
 */
import java.util.*;
public class Lab_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strPosition;
        String strJobOfferPhrase = "Here is our job offer: ";
        String strDegree;
        String strJava;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your job interview");
        System.out.println("Do you have a college degree? (y/n)");
        strDegree = keyboard.nextLine();
        
       if(strDegree.equals("y"))
       {
            System.out.println("Do you know java? (y/n)");
            strJava = keyboard.nextLine();
            if(strJava.equals("y"))
            {
                strPosition = "senior";
            }
            else
            {
                strPosition = "entry level";
            }
            System.out.println(strJobOfferPhrase);
            System.out.println("We would like to hire you at a "+strPosition+" position");
        }
        else
        {
            System.out.println(strJobOfferPhrase);
            System.out.println("We can not extend you a job offer at this time");
        }
    }   
}
