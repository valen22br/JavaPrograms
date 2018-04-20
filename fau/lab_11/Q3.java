/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_q3;

/**
 *
 * @author valen
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> S = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);
        int listSize, value;
        System.out.println("Hou long is the list");
        listSize = keyboard.nextInt();
        for(int i = 1; i <= listSize; i++)
        {
            System.out.println("Enter the " + i + "th elemento in the list");
            value = keyboard.nextInt();
            S.add(value);
        }
        System.out.print("Before Sorting:[");
        for(int i = 0; i < S.size(); i++)
        {
            System.out.print(S.get(i));
            if(i >= 0 && i < S.size()-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
        Collections.sort(S);
        System.out.print("After Sorting:[");
        for(int i = 0; i < S.size(); i++)
        {
            System.out.print(S.get(i));
            if(i >= 0 && i < S.size()-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
        
    }
    
}
