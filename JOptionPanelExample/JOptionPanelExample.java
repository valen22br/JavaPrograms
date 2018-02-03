package joptionpaneexample;

/**
 *
 * @author valen
 */
import javax.swing.JOptionPane;
public class JOptionPaneExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String appS = JOptionPane.showInputDialog("Enter the number of apples");
        int appC = Integer.parseInt(appS);
        
        String oraS = JOptionPane.showInputDialog("Enter the number of oranges");
        int oraC = Integer.parseInt(oraS);
        
        int total = appC + oraC;
        JOptionPane.showMessageDialog(null, "The total number of fruits "
                + "equal to " + total);
    }
    
}
