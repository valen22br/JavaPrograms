/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date04/24/2018             Due Time: 11:30PM
 * Assignment Number: Assignment 7
 * Last Changed: 04/21/2018
 *
 * Description:
 * program that will read a text file that contains an unknown number of movie
 * review scores. Read the scores as Double values and put them in an instance
 * of ArrayList. Compute the average score.
/*******************************************************************************
**/
package assingment7_q3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author valen
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    
    public static double calculateAverage(ArrayList <Double> arrayDoubleValues)
    {
        double average;
        average = arrayDoubleValues.stream().mapToDouble(val -> val).average().getAsDouble();
        return average;
    }
    
    
    public static void main(String[] args) {
        
        String fileName = "movieReviewScores";
        String fileExtension = ".txt";
        String line = null;
        String fileContent = "";
        ArrayList<Double> arrayAvg = new ArrayList<Double>();
        double valueDouble = 0;
        DecimalFormat dec = new DecimalFormat("#0.00");
        
        try
        {
           FileReader fileReader = new FileReader(fileName+fileExtension);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           
           while((line = bufferedReader.readLine()) != null)
           {
               arrayAvg.add(Double.parseDouble(line));
           }
           
           System.out.println("The average score of the films is: "+ dec.format(calculateAverage(arrayAvg)));
           
           
           // Always close files.
           bufferedReader.close(); 
           
           
        } 
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + fileExtension +  "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + fileExtension +  "'");                  
        }
    }
    
}
