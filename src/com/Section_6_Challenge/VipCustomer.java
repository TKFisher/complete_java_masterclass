package com.Section_6_Challenge;

/**
 * **********   Challenge 1
 * Create a new class VipCustomer
 * It should have 3 fields: name, credit limit, and email address
 * Create 3 constructors:
 * The 1st empty constructor should call the constructor with 3 params with default values.
 * The 2nd should pass on the 2 values it receives and add a default value for the 3rd.
 * The 3rd should save all fields.
 * Create getters only for this using the code generator of IntelliJ as setters won't be needed.
 * Test it.
 */

public class VipCustomer
{

    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer()
    {
        this("Jane Doe",100,"default@gmail.com");

    }

    public VipCustomer(String name,String emailAddress)
    {
        this(name,1000,emailAddress);
    }

    public VipCustomer(String name,double creditLimit,String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }
}
