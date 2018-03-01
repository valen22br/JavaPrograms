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
 * Program  that creates a patient object. 
 * 
 * Instance variables:
 * private String name;
 * private double weight;
 * private int age;
 * 
 * Methods:
 * public String getName() - returns the patient's name
 * public double getWeight() - returns the patient's weight
 * public int getAge() - return the patient's age
 * public boolean patientEquals(Patient otherPatient) - Returns a true bool if
 *          the two patients are identical. False otherwise
 *
/*******************************************************************************
 */


class Patient{
    private String name;
    private double weight;
    private int age;
    
    /*
     * Acessor Method to get the name value.
     * Takes no arguments
     * Return a string with the name value
     */
    public String getName(){
        return name;
    }
    /*
     * Acessor Method to get the weight.
     * Takes no arguments
     * Return a double with the weight value
     */
    public double getWeight(){
        return weight;
    }
    /*
     * Acessor Method to get the weight.
     * Takes no arguments
     * Return an int with the weight value
     */
    public int getAge(){
        return age;
    }
    /*
     * Nutator Method to set the name.
     * Takes a string as newName argument
     */
    public void setName(String newName){
        this.name = newName;
    }
    /*
     * Nutator Method to set the weight.
     * Takes a double as newWeight argument
     */
    public void setWeight(double newWeight){
        this.weight = newWeight;
    }
    /*
     * Nutator Method to set the age.
     * Takes an int as newAge argument
     */
    public void setAge(int newAge){
        this.age = newAge;
    }
            
    /*
     * Method to compare two objects from the Patient type
     * Takes Patient object as argument
     * Prints to the screen is the patiente objects (The calling object and
     *      the argument) are equal.
     * Returns true of false based on the comparison
     */
    public boolean patientEquals(Patient otherPatient){
        
        Boolean isEqual = false;
        
        isEqual = (this.getName().equals( otherPatient.getName()) && 
                this.getAge() == otherPatient.getAge()
                && this.getWeight() == otherPatient.getWeight());
        
        if(isEqual)
        {
            System.out.println(this.getName() + " is the same as " 
                    + otherPatient.getName());
        }
        else
        {
            System.out.println(this.getName() + " is different from " 
                    + otherPatient.getName());
        }
        
        return isEqual;
    }
    
    /*
     * Method to print the Patient object instance variables names
     * Takes an int patientNumber to show on the print statement
     * Prints to the screen the state of the object Pacient
     */
    public void printPatientInfo(int patientNumber){
        System.out.println("Patient "+patientNumber+ " "+ this.getName()+ " is "
                + this.getWeight() + " and is " + this.getAge() + " years old");
    }
}

/**
 *
 * @author valen
 */
public class Q1 {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();
        
        patient1.setName("Ryan Tannehill");
        patient1.setAge(26);
        patient1.setWeight(220);
        
        patient2.setName("Ryan Tannehill");
        patient2.setAge(26);
        patient2.setWeight(220);
        
        patient3.setName("Gustavo");
        patient3.setAge(41);
        patient3.setWeight(220);
        
        patient1.printPatientInfo(1);
        patient2.printPatientInfo(2);
        patient3.printPatientInfo(3);
        
        patient1.patientEquals(patient2);
        patient2.patientEquals(patient3);
    }
}
