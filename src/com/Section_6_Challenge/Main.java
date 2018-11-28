package com.Section_6_Challenge;


public class Main
{

    public static void main(String[] args)
    {

/*
        Car porsche = new Car();
        Car holden = new Car();

        // This shows that the class' default state is Null before we've run the setModel method.
        System.out.println("The model is " + porsche.getModel());

        // Test this cases:
        // porsche.setModel("Carrera");
        porsche.setModel("Holden");
        // porsche.setModel("911");
        System.out.println("The model is a " + porsche.getModel() + ".");
*/

        System.out.println("\n ******** Challenge 1 output below ************\n");

        Bank customer_1 = new Bank();

        //        customer_1.setAccountNumber(123);
        //        customer_1.setBalance(1000);
        //        customer_1.setCustomerName("Mary Jane");
        //        customer_1.setEmail("maryjane@gmail.com");
        //        customer_1.setPhoneNumber("206-123-4567");


        //        System.out.println(customer_1.getAccountNumber());
        //        System.out.println(customer_1.getBalance());
        //        System.out.println(customer_1.getPhoneNumber());
        //        System.out.println(customer_1.getEmail());
        //        System.out.println(customer_1.getCustomerName());

        Bank bobsBank = new Bank();
        bobsBank.setBalance(0);
        bobsBank.makeDeposit(1000);
        bobsBank.makeWithdrawal(50);
        bobsBank.makeWithdrawal(949);

        System.out.println(" \n ******** using constructor #2 ************ \n");
        // using the overloaded constructor will do the same as the above
        Bank marysBank = new Bank(12345,100,"Mary Smith","mary@gmail.com","206-123-4567");

        marysBank.makeDeposit(1000);
        System.out.println(marysBank.getCustomerName());
        System.out.println(marysBank.getAccountNumber());
        marysBank.makeWithdrawal(50);
        marysBank.getBalance();

        System.out.println("\n ******* using constructor #1 with no " + " \n parameters will now set default values  ************ \n ");

        Bank toddsBank = new Bank();
        System.out.println(toddsBank.getAccountNumber());
        System.out.println(toddsBank.getCustomerName());
        System.out.println(toddsBank.getEmail());
        System.out.println(toddsBank.getBalance());

        System.out.println("\n ******* using constructor #3 ************ \n ");

        Bank annesBank = new Bank("Anne","ann@gmail.com","206-799-8888");
        System.out.println(annesBank.getAccountNumber() + "\n" + annesBank.getCustomerName() + "\n" + annesBank.getPhoneNumber());


        System.out.println("\n ******* Challenge Test ************ \n ");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());


        VipCustomer person2 = new VipCustomer("Obama","obama@gmail.com");
        System.out.println(person2.getName() + "  " + person2.getEmailAddress());


        VipCustomer person3 = new VipCustomer("Hillary",1000000,"hills@gmail.com");
        System.out.println(person3.getName() + "  " + person3.getCreditLimit() + "  " + person3.getEmailAddress());

    }
}
