package cincunferencecalc;

/**
 *
 * @author valen
 */
import java.util.*;
public class CincunferenceCalc {

    /**
     * @param args the command line arguments
     */
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        // TODO code application logic here
        
        //final double PI = 3.14159;
        double radius;
        double area = 0;
        System.out.println("Enter the radius of the circle in inches");
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();
        area = PI * java.lang.Math.pow(radius, 2);
        
        System.out.println("A circle of radius "+radius+ " inches has an area of "
        + ""+ area + " square inches");
        
    }
    
}
