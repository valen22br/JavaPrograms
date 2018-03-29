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
 * program that implements a construction for the class Student
/*******************************************************************************
 */
package lab8.q1;

class Student{
    private String fullName;
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentClassification;
    private double gpa;
    private int creditsComplete;
    
    /*Default Consttructor*/
    public Student(String fullName, double gpaValue, int creditsCompleted){
        String [] name = fullName.split(" ");
        firstName = name[0];
        lastName = name[1];
        gpa = gpaValue;
        creditsComplete = creditsCompleted;
        
    }
    /*Method to display the student profile*/
    public void displayStudentProfile(){
        System.out.println("First Name: " +  this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("GPA: " + this.gpa);
        if(this.creditsComplete < 30)
        {
            this.studentClassification = "Freshmen";
        }
        else if (this.creditsComplete < 60)
        {
            this.studentClassification = "Sophomore";
        }
        else if(this.creditsComplete < 90)
        {
            this.studentClassification = "Junior";
        }
        else
        {
            this.studentClassification = "Senior";
        }
        System.out.println("Year: " + this.studentClassification);
        System.out.println("");
    }  
        
        
}


public class Q1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student Valen = new Student("Gustavo Valensuela", 3.97, 120);
        Student Corey = new Student("Corey Park", 4.0, 90); 
        Student Don = new Student("Don Draper", 3.6, 60);
        Valen.displayStudentProfile();
        Corey.displayStudentProfile();
        Don.displayStudentProfile();
    }
    
}
