/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:02/22/2018             Due Time: 11:30PM
 * Assignment Number: lab 05
 * Last Changed: 02/22/2018
 *
 * Description:
 * Program to calculate the BMI of a person.
 * In this assignment a class Person will be created with the following 
 * 
 * Instance variables:
 * 
 * public String name;
 * public double kilograms;
 * public double heightMeters;
 * public double BMI;
 * 
 * Methods
 * public void Greeting()
 * public void calculateBMI
/*******************************************************************************
 */
package lab5.q1;

/**
 *
 * @author valen
 */
class Person
{
    public String name;
    public double kilograms;
    public double heightMeters;
    public double BMI;
    
    
    public void Greeting(){
        System.out.println("Hello my name is "+ name);
    }
    public void calculateBMI(){
        BMI = kilograms / (heightMeters * heightMeters);
        System.out.println(name + "'s BMI is " + BMI);
        if(BMI < 18.5)
        {
            System.out.println(name + "'s risk catyegory is Underweight.");
        }
        else if(BMI < 25)
        {
            System.out.println(name + "'s risk catyegory is Normal weight.");
        }
        else if(BMI < 30)
        {
            System.out.println(name + "'s risk catyegory is Overweight.");
        }
        else
        {
            System.out.println(name + "'s risk catyegory is Obese.");
        }    
    }
}

public class Q1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        
        person1.name = "Gustavo";
        person1.heightMeters = 1.83;
        person1.kilograms = 105;
        person1.Greeting();
        person1.calculateBMI();
        
        person2.name = "Jefferson";
        person2.heightMeters = 1.65;
        person2.kilograms = 50;
        person2.Greeting();
        person2.calculateBMI();
        
        person3.name = "Eduard";
        person3.heightMeters = 1.83;
        person3.kilograms = 80;
        person3.Greeting();
        person3.calculateBMI();   
    }
}
