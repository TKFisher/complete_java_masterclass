package  com.Section_4_PrimitiveDataType;


public class CharAndBoolean {


    public static void main(String[] args){

        char myCharVar_1 = 'd';
        //unicode example of a char
        char myCharVar_2 = '\u00A9';
        System.out.println(myCharVar_2);

        boolean myBooleanVar_1 = false;
        boolean myBoleanVar_2 = true;

        //Challenge:

        char myCharVar_3 = '\u00AE';
        System.out.println(myCharVar_3);


        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien.");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got a high score.");


        int secondScore = 81;
        if ((topScore > secondScore) && (topScore < 100) )
            System.out.println("Greater than second top score and less than 100.");

        if ((topScore > 90) || (secondScore <= 100))
            System.out.println("One of these tests is true.");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true.");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("isCar should be 'false', but you've re-assigned it to 'true'.");

        //Ternary example
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("'wasCar' is true.");

        //Challenge:
        double myFirstVar = 20d;
        double mySecondVar = 80;

        double myFirstTotal = (myFirstVar + mySecondVar) * 25;
        System.out.println("My first total is: " + myFirstTotal);

        double myRemainder = myFirstTotal % 40;
        // 2500 / 40 = 62.5;   62 * 40 = 2480;    2500 - 2480 = 20
        System.out.println(myRemainder);
        if (myRemainder <= 20)
        System.out.println("Total was over the limit.");




    }
}
