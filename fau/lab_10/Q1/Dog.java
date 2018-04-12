/*
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:04/12/2018             Due Time: 11:30PM
 * Assignment Number: lab 08
 * Last Changed: 03/29/2018
 *
 * Description:
 * Program to show inheritanse throught out classess
 */
package lab10.q1;

/**
 * class Dog that extends Animal class
 * @author valen
 */
public class Dog extends Animal{
    /**
     * Default Constructor. 
     * @param animalName
     * @param lbs 
     */
    public Dog(String animalName, int lbs)
    {
        super(animalName,lbs);
        super.setSpeak("Bark");
    }
}
