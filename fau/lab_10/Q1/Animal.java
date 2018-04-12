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
 *
 * @author valen
 */
public class Animal {
    public String animalName, speak;
    public int lbs;
    /**
     * 
     * @param animalNameParam
     * @param lbsParam 
     */
    public Animal(String animalNameParam, int lbsParam){
        animalName = animalNameParam;
        lbs = lbsParam;
        
    }
    /**
     * Method that returns the weight
     * @return 
     */
    public int getWeifhtPounds()
    {
        return lbs;
    }
    /**
     * Method that sets the weight
     * @param lbsParam 
     */
    public void setWeightPounds(int lbsParam)
    {
            lbs = lbsParam;
    }
    /**
     * Accessor Method to the the name
     * @return 
     */
    public String getName()
    {
        return animalName;
    }
    /**
     * Mutator method to set the speak word
     * @param speakText 
     */
    public void setSpeak(String speakText)
    {
        speak = speakText;
    }
    /**
     * Mutator method to set the animal name
     * @param aninalNameParam 
     */
    public void setName(String aninalNameParam)
    {
        animalName = aninalNameParam;
    }
    /**
     * Accessor method to get the speak word
     * @return 
     */
    public String Speak()
    {
        return speak;
    }
    
}
