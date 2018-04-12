/*
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:04/12/2018             Due Time: 11:30PM
 * Assignment Number: lab 08
 * Last Changed: 03/29/2018
 *
 * Description:
 * Program to show inheritanse throught out classes
 */
package lab10.q1;

/**
 * class Cat that extends Animal class
 * @author valen
 */
public class Cat extends Animal{
    public Cat(String animalName, int lbs)
    {
        super(animalName, lbs);
        super.setSpeak("Meow");
    }
}
