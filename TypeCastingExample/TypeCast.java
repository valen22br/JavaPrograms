package typecastingexample;

/**
 *
 * @author valen
 */
import java.util.*;
public class TypeCastingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double floatValue;
        int intValue;
        System.out.println("Enter a floating point value.");
        Scanner in = new Scanner(System.in);
        floatValue = in.nextDouble();
        intValue = (int)floatValue;
        System.out.println("The floating value "+floatValue+" "
                + "type casts to the integer value " +intValue);
                
    }
    
}
