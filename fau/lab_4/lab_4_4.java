package lab_4_4;

/**
 * /****************************************************************************
 * Name: Luis Gustavo Grubert Valensuela Z#:23351882 lvalensuela2015@fau.edu
 * Course: JavaProgramming
 * Professor: Dr. Mehrdad Nojoumian
 * Due Date:02/15/2018             Due Time: 11:30PM
 * Assignment Number: lab 4
 * Last Changed: 02/15/2018
 *
 * Description:
 * In this assignment a ATM program will be created
 * Possible actions: Deposit, withdrawal, check balance and logout.
/*******************************************************************************
 */
import java.util.Scanner;
public class Lab_4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int optionSelected = 0;
        float amountInput, amountBalance = 0;
        
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
                    System.out.println("\nHow much would you like to deposit?");
                    amountBalance += keyboard.nextFloat();
                    System.out.println("The balance in the account is now "
                            + "$"+amountBalance+"\n");
                    
                    break;
                
                case 2:
                    System.out.println("\nHow much would you like to withdraw?");
                    amountInput = keyboard.nextFloat();
                    if(amountInput > amountBalance)
                    {
                        System.out.println("You do not have enough funds to "
                                + "withdraw $"+amountInput+"\n");
                    }
                    else
                    {
                        amountBalance -= amountInput;
                        System.out.println("\nThe balance in the account is now "
                                + "$"+amountBalance+"\n");
                    }
                    break;
                
                case 3:
                    System.out.println("\nThe current account balance is $"
                            + amountBalance + "\n");
                    break;
                
                default:
                    System.out.println("Thank you! Goodbye");
                    optionSelected = 4;
                    break;
            }
            
            
            
        }while(optionSelected != 4);
    }
    
}
