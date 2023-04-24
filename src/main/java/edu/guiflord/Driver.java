package edu.guiflord;


public class Driver 
{
    public static void main( String[] args )
    {
       
        //tests the constructor and toString method.
        //this test the default constructor.
        System.out.println("Testing the default constructor.");
        rational r1 = new rational();
        System.out.println("The rational number is "+r1);

        //tests the getters and setters.
        //thest the getters and setters
        System.out.println("Testing the getters and setters.");
        r1.setNumerator(3);
        r1.setDenominator(4);
        System.out.println(r1.getNumerator());
        System.out.println(r1.getDenominator());

        //tests the toString method.
        System.out.println(r1);
        //to test the seocond constructor.
        //we will have to create an new Rational object then we will test it

        System.out.println("Testing the second constructor.");

        rational r2 = new rational(4, 5);
        System.out.println("The rational number is "+ r2);

        //print out the negate method.
        System.out.println("Testing the negate method.");
        r2.negate();
        System.out.println("The negate rational number is "+ r2);

        //print out the invert method. 
        System.out.println("Testing the invert method.");
        r2.invert();
        System.out.println("The invert rational number is "+ r2);

        //Write an instance method called toDouble that converts the rational number to a double (floating-point number) and returns the result.

        System.out.println("Testing the toDouble method.");
        System.out.println("The double of the rational number is "+ r2.toDouble());
    }


}
