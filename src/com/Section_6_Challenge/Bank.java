package com.Section_6_Challenge;

/**
 * Challenge 1
 * Create a new class for a bank account
 * Create fields for the account number, balance, customer name, email and phone number.
 * Create getters and setters for each field
 * Create two additional methods
 * 1. To allow the customer to deposit funds (this should increment the balance field).
 * 2. To allow the customer to withdraw funds. This should deduct from the balance field,
 * but not allow the withdrawal to complete if their are insufficient funds.
 * You will want to create various code in the Main class (the one created by IntelliJ) to
 * confirm your code is working.
 * Add some System.out.println's in the two methods above as well.
 */

public class Bank
{

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    // constructor #1 (at least one constructor is created by default even if hidden.
    //    public Bank() {
    //        System.out.println("Empty constructor called. " +
    //                "This is just to prove that every time the 'new' + class is executed it also runs the constructor.");
    //    }

    // constructor #1 with added ability to set default value using "this".
    public Bank()
    {
        // Using "this" in this case is special in that if no params are set via constructor #2
        // then default values will be set.
        this(99999,2.50,"Default Name","Default Eamil","Default Phone");
        System.out.println("Constructor #1 was called and default values were set.");
    }

    // constructor #2:  The main constructor because we are setting all of the fields here. This is good practice
    // to have one constructor define all of the fields and the other constructors can be defaults or just a few params.
    public Bank(int accountNumber,double balance,String customerName,String email,String phoneNumber)
    {
        System.out.println("Bank constructor #2 was called.");

        // You can set the field directly like in the first line
        // OR, you can set the account number by calling the setter method. Either
        // way works, but the field way is better.
        //this.accountNumber = accountNumber;
        setAccountNumber(accountNumber);

        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // constructor #3:
    public Bank(String customerName,String email,String phoneNumber)
    {
        this(99999,100.55,customerName,email,phoneNumber);
    }


    // Method to allow the customer to deposit funds (this should increment the balance field).

    public void makeDeposit(double depositAmount)
    {
        // this will add to the balance.
        this.balance += depositAmount;
        System.out.println("Your deposit amount was $" + depositAmount + "\nYour new balance is: " + this.balance);
    }

    // Method to withdraw funds.
    // This should deduct from the balance field, but not allow the withdrawal to complete if there are insufficient funds.

    public void makeWithdrawal(double withdrawalAmount)
    {
        if (this.balance - withdrawalAmount < 0)
        {
            System.out.println("Only " + this.balance + " available. Insufficient funds.");
        } else
        {
            this.balance -= withdrawalAmount;
            System.out.println("Your withdrawal amount was $" + withdrawalAmount + "\nYour new balance now is: " + this.balance);
        }
    }

    // Getters and Setters
    public String getCustomerName()
    {
        return this.customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }


}
