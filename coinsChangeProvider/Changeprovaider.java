/**
 *
 * @author valen
 */

import java.util.*;
public class Changeprovaider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int quarters = 0;
        int penies = 0;
        int nickels = 0;
        int dimes = 0;
        
        float changeValue = 0;
        int integerValue = 0;
        System.out.println("Please provide the change value");
        Scanner in = new Scanner(System.in);
        changeValue = in.nextFloat();
        
       integerValue = (int)((changeValue * 100));
       
       quarters = integerValue/25;
       penies = (integerValue%25)/10;
       nickels = ((integerValue%25)%10)/5;
       dimes = ((integerValue%25)%10)%5;
       
       
       System.out.println(quarters + " quarters, "+ penies + " penies, + "
               + nickels + "  nickels, "+dimes+ " dimes");       
      
        
        
    }
    
}
