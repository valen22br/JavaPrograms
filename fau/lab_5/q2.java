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
 * Program to display a student information.
 * 
 * In this assignment a class Student will be created with the following 
 * 
 * instance variables:
 * public String name;
 * public String ZNumber;
 * public String major;
 * public Double gpa;
 * public int birthYear;
 * public int credits;
 * 
 * Methods:
 * public void initialize(args)
 * public void studentAge()
 * public void studentProfile()
 * public void studentYear()
 *
/*******************************************************************************
 */
package lab5.q2;

import java.util.Calendar;



class Student{
    public String name;
    public String ZNumber;
    public String major;
    public Double gpa;
    public int birthYear;
    public int credits;
    
    public void initialize(String studentName, String studentZNumber, String studentMajor, double studentGPA, int studentBirthYear, int studentCredits){
        name = studentName;
        ZNumber = studentZNumber;
        major = studentMajor;
        gpa = studentGPA;
        birthYear = studentBirthYear;
        credits = studentCredits;
    }
    
    public void studentAge()
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year - birthYear;
        System.out.println(name +" is "+age+"\n");
    }
    
    public void studentProfile(){
        System.out.println("Name - "+name);
        System.out.println("Z Number - "+ZNumber);
        System.out.println("Major - "+major);
        System.out.println("GPA - "+gpa+ "\n");
    }
    
    public void studentYear(){
        if(credits < 30)
        {
            System.out.println(name + " is a freshmen");
        }
        else if(credits < 60)
        {
            System.out.println(name + " is a sophomore");            
        }
        else if(credits < 90)
        {
            System.out.println(name + " is a junior");
        }
        else
        {
            System.out.println(name + " is a senior");
        }
        System.out.println("");
    } 
}

public class Q2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        
        student1.initialize("Gustavo", "z23351882", "Computer Engineer", 3.96, 1976, 200);
        student2.initialize("Rachel", "z1546431", "Computer Science", 3.05, 1999, 60);
        
        student1.studentAge();
        student1.studentProfile();
        student1.studentYear();
        
        student2.studentAge();
        student2.studentProfile();
        student2.studentYear();
        
    }
}
