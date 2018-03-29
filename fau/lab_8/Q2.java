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
package lab8.q2;

class Customer{
    private static int numCustomers = 0;
    private String customerName;
    
    /*Default Constructor*/
    public Customer(String customerNameArg)
    {
        customerName = customerNameArg;
        Customer.numCustomers+=1;   
    }
    /*Method to print the Customer Information*/
    public void CustomerInfo()
    {
        System.out.println(customerName + " has enterde the store, there are "
                + Customer.numCustomers + " people in the store");
        System.out.println("");
        
    }
}

public class Q2 {
    public static void main(String[] args) {
        Customer Corey = new Customer("Corey Park"); Corey.CustomerInfo();
        Customer Peyton = new Customer("Peyton Manning"); Peyton.CustomerInfo();
        Customer Mario = new Customer("Mario Chalmers"); Mario.CustomerInfo();
    }
}
