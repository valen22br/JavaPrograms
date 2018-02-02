package oddoreven;

/**
 *
 * @author valen
 */

import java.util.*;

public class OddorEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numberInt;
        System.out.println("Enter an int");
        Scanner in = new Scanner(System.in);
        numberInt = in.nextInt();
        
        if(numberInt % 2 == 0)
        {
            System.out.print("Number "+ numberInt+ " is even");     
        }
        else
        {
            System.out.print("Number "+ numberInt+ " is odd");     
        }
        
    }
    
}
