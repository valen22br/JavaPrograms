/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:03/01/2018             Due Time: 11:30PM
 * Assignment Number: lab 06
 * Last Changed: 03/01/2018
 *
 * Description:
 * Program that creates to car objects, and compares which one is the fasted
 * by comparing the ratio horsepower/weight
 * 
 * Instance variables:
 * private String name;
 * private double horsePower;
 * private double weight;
 * 
 * Methods:
 * public void readInput() - Read the car informations from the user to 
 *   populate the instance variables
 * public String whoFaster(Car otherCar) - returns the fastest car
 *
/*******************************************************************************
 */

import java.util.Scanner;
class Car{
    private String name;
    private double horsePower;
    private double weight;
    
    /*
     * Acessor Method to get the name value.
     * Takes no arguments
     * Return a string with the name value
     */
    public String getName(){
        return this.name;
    }
    /*
     * Acessor Method to get the horsepower value.
     * Takes no arguments
     * Return a double with the horsepower value
     */
    public double getHorsePower(){
        return this.horsePower;
    }
    /*
     * Acessor Method to get the weight value.
     * Takes no arguments
     * Return a double with the weight value
     */
    public double getWeight()
    {
        return this.weight;
    }
    /*
     * Method to read inputs from the user.
     * Takes no arguments
     * Ask for the following informations:
     * name of the car
     * weight of the car
     * horsepower of the car
     */
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the car's name");
        this.name = keyboard.nextLine();
        
        System.out.println("What is the car's horsepower");
        this.horsePower = keyboard.nextDouble();
        
        System.out.println("What is the car's weight");
        this.weight = keyboard.nextInt();
    }
    /*
     * Method to compare to car objectes.
     * Takes the the second car object as argument. The firs is the own 
     * object that is calling the function
     * Returns a string after comparing the ratio horsepower/weight, with the
     * name of the fastest car.
     */
    public String whoFaster(Car otherCar){
        String response = "";
        if(this.getHorsePower() / this.getWeight() > otherCar.getHorsePower() / 
                otherCar.getWeight())
        {
            response = this.getName() + " is the fastest car"; 
        }
        else if(this.getHorsePower() / this.getWeight() < otherCar.getHorsePower() / 
                otherCar.getWeight())
        {
            response = otherCar.getName() + " is the fastest car"; 
        }
        else
        {
            response = this.getName() + " and " + otherCar.getName() + " have the"
                    + " same power" ;
        }
        //System.out.println(response);
        return response;
    }
}


/**
 *
 * @author valen
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        car1.readInput();
        car2.readInput();
        
        String fasterCar = car1.whoFaster(car2);
        
        System.out.println(fasterCar);
        
    }
    
}
