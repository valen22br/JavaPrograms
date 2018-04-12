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
 * Main Class
 * @author Luis Gustavo Grubert Valensuela
 */
public class Q1 {
    public static void main(String[] args) {
        Animal [] pet = new Animal[2];
        pet[0] = new Dog("Buddy", 41);
        pet[1] = new Cat("Whiskers",4);
        
        for(Animal i : pet)
        {
            System.out.println("The pet name is " + i.getName() + 
                    " and it weights "+ i.getWeifhtPounds() + " pounds and says "
                    + i.Speak());
        } 
    }
}
