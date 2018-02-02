package whatisyourname;

/**
 *
 * @author valen
 */
import java.util.*;
public class WhatIsYourName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }
    
}
