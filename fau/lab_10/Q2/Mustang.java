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
 * Mustang class that implements the Car Interface
 * @author valen
 */
public class Mustang implements Car{
    private int gear = 0;
    private int speed = 0;
    boolean applyBrakes;
    
    /**
     * Default Constructor
     */
    public Mustang()
    {
    }
    
    /**
     * Mutator method to change the gear value
     * @param newGear 
     */
    @Override
    public void changeGear(int newGear)
    {
        gear =newGear;
    }
    /**
     * Mutator method to increment the speed value
     * @param increment 
     */
    @Override
    public void speedUp(int increment)
    {
       speed+= increment; 
    }
    /**
     * Mutator method to decrement the speed value
     * @param decrement 
     */
    @Override
    public void applyBrakes(int decrement)
    {
        speed-=decrement;
    }    
    /**
     * Method to print the states of the object of type Mustang
     */
    void printStates(){
        System.out.println("Speed: " + speed);
        System.out.println("gear: " + gear);
    }
}
