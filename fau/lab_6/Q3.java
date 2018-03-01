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
 * Program to test equality between two objects of the same type.
 * 
 * Instance variables:
 * private String description;
 * private int maxPossibleRate;
 * private int rating;
 * 
 * Methods:
 * public void initialize() - initializes the RatingScore object
 * public String getDescription() - returns the object's description
 * public int getMaxPossibleRates() - return maxPossibleRating from RatingScore
 *          object
 * public void getRaitng() - get the RatingScore object Raiting.
 *
/*******************************************************************************
 */
import java.util.Scanner;
class RatingScore{      
    private String description;
    private int maxPossibleRate;
    private int rating;
    /*
     * Method to initialize the RatingScore objects.
     * Takes the following arguments:
     * String description
     * int rate
     */
    public void initialize(String description, int rate)
    {
        this.description = description;
        this.maxPossibleRate = rate;
    }
        
    /*
     * Acessor Method to get the RatingScore object description.
     * Takes no arguments
     * Return a string with the description value
     */
    public String getDescription()
    {
        return this.description;
    }
    
    /*
     * Acessor Method to get the RatingScore object maxPossibleRates.
     * Takes no arguments
     * Return a int with the maxPossibleRate value
     */
    public int getMaxPossibleRates()
    {
        return this.maxPossibleRate;
    }

    /*
     * Method to get the RatingScore object Raiting.
     * Takes no arguments
     * Input:
     *  Ask the user for a rating score for the RatingScore Object
     * Return:
     *  prints the rating score informed by the user for the RatingScore Object
     */
    public void getRaitng()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your rating for " + this.getDescription());
        System.out.println("Please enter an integer from 0 to " + this.getMaxPossibleRates());
        this.rating = keyboard.nextInt();
        if(this.rating > this.maxPossibleRate || this.rating < 0)
        {
            System.out.println("You entered a invalid rating number. The max"
                    + "allowed is "+ this.maxPossibleRate);
        }
        else
        {
            System.out.println("The rating is "+ this.rating + "/" + this.maxPossibleRate + " for " + this.getDescription());
        }
        
    }
}

/**
 *
 * @author valen
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RatingScore movieRating = new RatingScore();
        movieRating.initialize("Joe' excellent movie", 5);
        
        RatingScore restaurantRating = new RatingScore();
        restaurantRating.initialize("Food quality", 10);
        
        movieRating.getRaitng();
        restaurantRating.getRaitng();
    }
    
}
