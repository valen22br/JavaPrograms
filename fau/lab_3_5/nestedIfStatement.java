/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3_5;

import java.util.Scanner;

/**
 *
 * @author valen
 */
public class Lab_3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int birthYear;
        int age;
        System.out.println("Enter the year you were born");
        birthYear = keyboard.nextInt();
        age = 2018-birthYear;
        System.out.println("You are " + age);
        if(age < 18)
        {
            System.out.println("Yo are not an Adult");
        }
        else if(age < 30)
        {
            System.out.println("Yo are still young");
        }
        else if(age < 50)
        {
            System.out.println("Yo are mid-age");
        }
        else
        {
            System.out.println("Yo are a respected senior");
        }
    }
    
}
