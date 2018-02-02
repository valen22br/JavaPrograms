package stringcountpluscapitalizedstring;

/**
 *
 * @author valen
 */
import java.util.Scanner;

public class StringCountPlusCapitalizedString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nameStr;
        int characters;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name.");
        nameStr = in.nextLine();
        characters = nameStr.length();
        nameStr = nameStr.toUpperCase();
        System.out.println("Your name has " + characters + " characters.");
        System.out.println("Your Captalized Name: "+ nameStr);
        
    }
    
}
