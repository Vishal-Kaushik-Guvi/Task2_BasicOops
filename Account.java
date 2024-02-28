package Task2_BasicOops;

import java.util.Scanner;

public class Account {
    static int balance;

    // No argument constructor as per asked in question.
    public Account(){

    }
    // Constructor with two Arguments asked in question.
    public Account(int deposit, int withdraw){
         
    }
    // Method to Deposit Money
    public int depositMoney(int deposit){
       balance = balance + deposit;
       return balance;
    }
    // Method to Withdraw Money
    public int withdrawMoney(int withdraw){
       balance = balance - withdraw;
       return balance;
    }
    public static void main(String[] args) {
        int deposit;
        int withdraw;
        // Object of class Account.
        Account ac = new Account();
        // Scanner class to take input in console.
        Scanner sc = new Scanner(System.in);
        // Taking balance as input
        System.out.println("Enter the Balance you want to have in your account ");
        System.out.print("Rs.");
        balance = sc.nextInt();
        // Taking deposit as input
        System.out.println("Enter the Money you want to deposit from your account ");
        System.out.print("Rs.");
        deposit =sc.nextInt();
        ac.depositMoney(deposit);
        // Taking withdraw as input
        System.out.println("Enter the Money you want to withdraw from your account ");
        System.out.print("Rs.");
        withdraw = sc.nextInt();
        ac.withdrawMoney(withdraw);
        // Showing final Balance after depositing and withdrawing money.
        System.out.println("Balance left after Depositing" +" " +"Rs."+ +deposit +" "+ "and Withdrawing " +"Rs." +withdraw+ " "+ "is : "+"Rs." +balance);
        sc.close();
    }
}
