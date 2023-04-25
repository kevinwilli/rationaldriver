package edu.guiflord;

import java.util.Random;

public class rational {
  //declare two variables to hold the numerator and denominator
    private int numerator;
    private int denominator;

    //constructor
    //this is the second constructor that takes in two arguments.
    public rational(int num, int den)
    {
        numerator = num;
        denominator = den;
    }

    //Add a constructor that takes no arguments and sets the numerator to 0 and denominator to 1.
    public rational()
    {
        Random rand = new Random();
        numerator = rand.nextInt(-100,100) ;
        denominator = rand.nextInt(-100,100);
    }

    //getters
    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    //setters
    public void setNumerator(int num)
    {
        numerator = num;
    }

    public void setDenominator(int den)
    {
        denominator = den;
    }

    //Add a toString method that displays a Rational object in a reasonable format.
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    //Write a method called negate that reverses the sign of the rational number.
    //because it's a void method we don't need to return anything.

    //the void method is used to change the value of the numerator.
    public void negate()
    {
        numerator = -numerator;
    }
    //create a method called invert that swaps the numerator and denominator.
    public void invert()
    {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

//Write a method called toDouble that converts the rational number to a double (floating-point number).
    public double toDouble()
    {
        return (double)numerator/denominator;
    }

    //Write a method called add that takes a Rational number as an argument, adds it to the rational number represented by the current object, and returns a new Rational object
    public rational add(rational r)
    {
        int num = numerator * r.denominator + r.numerator * denominator;
        int den = denominator * r.denominator;
        return new rational(num, den);
    }

    

}
