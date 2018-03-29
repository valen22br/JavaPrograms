/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:03/29/2018             Due Time: 11:30PM
 * Assignment Number: lab 08
 * Last Changed: 03/29/2018
 *
 * Description:
 * program that implements a construction for the class Customer. It also 
 * implements a static variable
/*******************************************************************************
 */
package lab8.q3;
import java.util.Scanner;

class Student
{
    private String studentName;
    private String studentZNumber;
    private static int studentCount = 0;
    
    /*Constructor that receives 3 arguments*/
    public Student(String studentFullName, String znumberStr)
    {
        Student.studentCount +=1;
        studentName = studentFullName;
        studentZNumber = znumberStr;
    }
    /*Constructior that does not receive arguments. It asks for the user for
    inputs
    */
    public Student()
    {
        Student.studentCount +=1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the studetns name: ");
        studentName = keyboard.nextLine();
        
        System.out.println("Enter the studetns Z number: ");
        studentZNumber = keyboard.nextLine();
        
    }
    
    /*Static method to return the number of students*/
    public static void NumStudents(){
        System.out.println("There are " + Student.studentCount + " students");
    }
    
    /*Method to print the student profile information*/
    public void StudentProfile()
    {
        System.out.println("Name: " + this.studentName);
        System.out.println("ZNumber: " + studentZNumber);
        System.out.println("");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student Chris = new Student("Chris Chambers" , "Z3453234"); Chris.StudentProfile();
        Student Tom = new Student(); Tom.StudentProfile();
        Student.NumStudents();
    }
}
