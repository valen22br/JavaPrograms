/*
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:04/12/2018             Due Time: 11:30PM
 * Assignment Number: lab 08
 * Last Changed: 03/29/2018
 *
 * Description:
 * Program to show the creation of an interface
 */

package lab10.q2;

/**
 *
 * @author valen
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mustang mustang = new Mustang();
        mustang.changeGear(2);
        mustang.speedUp(50);
        mustang.applyBrakes(10);        
        System.out.println("Mustang present state: ");
        mustang.printStates();
    }
    
}
