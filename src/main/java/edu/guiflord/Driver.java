package edu.guiflord;


public class Driver 
{
    public static void main( String[] args )
    {
       
        //tests the constructor and toString method.
        //this test the default constructor.
        System.out.println("Testing the default constructor.");
        rational r1 = new rational();
        System.out.println("The rational number is "+ r1 +"\n");

        //tests the getters and setters.
        //thest the getters and setters
        System.out.println("Testing the getters and setters."+ "\n");
        rational r2 = new rational();
        //print out the values of r2
        System.out.println("The rational number is "+ r2);

        //r1.setNumerator(3);
        //r1.setDenominator(4);
        System.out.println("The numerator is:"+ r2.getNumerator());
        System.out.println("The denominator is:"+ r2.getDenominator()+"\n");

        //tests the toString method.
        //System.out.println(r2);
        //to test the seocond constructor.
        //we will have to create an new Rational object then we will test it

        System.out.println("Testing the second constructor.");

        rational r3 = new rational();
        System.out.println("The rational number is "+ r3);

        //print out the negate method.
        System.out.println("Testing the negate method.");
        r3.negate();
        System.out.println("The negate rational number of is "+ r3);

        //print out the invert method. 
        System.out.println("Testing the invert method.");
        r3.invert();
        System.out.println("The invert rational number is "+ r3 +"\n");

        //Write an instance method called toDouble that converts the rational number to a double (floating-point number) and returns the result.

        System.out.println("Testing the toDouble method."+ "\n");
        System.out.println("The double of the rational number is "+ r3.toDouble()+"\n");
        
      // use the constructor to create a new rational number
        rational r4 = new rational(1, 2);
        //use the method add to this class to add r3 to r2
        System.out.println("Here goes a new random generated rational number. "+ r4+"\n");
        r3.add(r4);
        //print out the inputs
        System.out.println("The inputs "+ r3 +" and "+ r4);
        //print out the result
        System.out.println("The sum of the rationals numbers, "+ r3 +" and "+ r4 +" is "+ r3.add(r4));

        //Add code that prints out a warning if the constructor with parameter attempts to generate a Rational number with a 0 denominator.

        if (r3.add(r4).getDenominator() == 0)
        {
            System.out.println("Warning: The denominator is 0."+ "\n");
        }
        else
        {
            System.out.println("The denominator is not 0."+ "\n");
        }


    
    
    }


}
