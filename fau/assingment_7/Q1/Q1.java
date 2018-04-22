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
 * program that reads every line in a text file, removes the first word from
 * each line, and then writes the resulting lines to a new text file.
/*******************************************************************************
**/
package assignment7;

/**
 *
 * @author valen
 */
import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "test";
        String fileExtension = ".txt";
        String newFileName = "test2";
        String line = null;
        String fileContent = "";
        try
        {
           FileReader fileReader = new FileReader(fileName+fileExtension);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           
           while((line = bufferedReader.readLine()) != null)
           {
               String[] delimiter = line.split(" ");
               System.out.println(line);
               for(int i = 1; i < delimiter.length; i++)
               {
                   fileContent += delimiter[i]+ " ";
               }
               fileContent += "\n";
           }
           
           System.out.println(fileContent);
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
        
        try
        {
            FileWriter fileWriter = new FileWriter(newFileName+fileExtension);
            BufferedWriter buffereWriter = new BufferedWriter(fileWriter);
            
            buffereWriter.write(fileContent);
            
            // Always colse files.
            buffereWriter.close();
            
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + fileExtension + "'");
        }
        
    }
    
}
