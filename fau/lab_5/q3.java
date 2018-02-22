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
 * Program to simulate a ATM Machine.
 * 
 * In this assignment a class BankAccount will be created with the following 
 * 
 * Instance variables:
 * public double amountInput;
 * public Scanner keyboard = new Scanner(System.in);
 * public double accountBalance = 0;
 * 
 * Methods:
 * public deposit()
 * public withdraw()
 * public viewBalance()
 *
/*******************************************************************************
 */
package lab5.q3;
import java.util.Scanner;
class BankAccount{
    
    public double amountInput;
    public Scanner keyboard = new Scanner(System.in);
    public double accountBalance = 0;

    public void deposit(){
    System.out.println("\nHow much would you like to deposit?");
    accountBalance += keyboard.nextFloat();
    System.out.println("The balance in the account is now "
            + "$"+accountBalance+"\n");

    }
    public void withdraw(){
        System.out.println("\nHow much would you like to withdraw?");
        amountInput = keyboard.nextFloat();
        if(amountInput > accountBalance)
        {
            System.out.println("You do not have enough funds to "
                    + "withdraw $"+amountInput+"\n");
        }
        else
        {
            accountBalance -= amountInput;
            System.out.println("\nThe balance in the account is now "
                    + "$"+accountBalance+"\n");
        }
    }
    public void viewBalance(){
        System.out.println("\nThe current account balance is $"
                            + accountBalance + "\n");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int optionSelected = 0;
        float amountInput, amountBalance = 0;
        BankAccount myAccount = new BankAccount();
        
        do
        {
            System.out.println("Welcome th the ATM.");
            System.out.println("Please select an option:");
            System.out.println("1 - Deposit \n"
                    + "2 - Withdrawal \n"
                    + "3 - Check Account Balance \n"
                    + "4 - Logout");
            optionSelected = keyboard.nextInt();
            
            switch (optionSelected)
            {
                case 1:
                    myAccount.deposit();
                    break;
                
                case 2:
                    myAccount.withdraw();
                    break;
                
                case 3:
                    myAccount.viewBalance();
                    break;
                
                default:
                    System.out.println("Thank you! Goodbye");
                    optionSelected = 4;
                    break;
            }  
        }while(optionSelected != 4);
    }
}
