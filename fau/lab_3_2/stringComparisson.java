/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3_2;

import java.util.*;

/**
 *
 * @author valen
 */
public class Lab_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String isFast;
        String isBig;
        String stringMessage;
        System.out.println("Are you fast? (y/n)");
        isFast = keyboard.nextLine();
        
        System.out.println("Are you big? (y/n)");
        isBig = keyboard.nextLine();
        
        if(isBig.equals("y") || isFast.equals("n"))
        {
            stringMessage = "You are cut from the team";
        }
        else{
            stringMessage = "You are on the team!";
        }
        System.out.println(stringMessage);
        // TODO code application logic here
    }
    
}
