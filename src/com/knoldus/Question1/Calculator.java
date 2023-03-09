package com.knoldus.Question1;

import java.util.Scanner;

//Defining custom exception class for divide by zero Exception
class DivideByZeroException extends Exception
{
    DivideByZeroException(String error)
    {
        super(error);
    }
}

public class Calculator {

    public static int add(int FirstNumber,int SecondNumber){
        int sum=FirstNumber+SecondNumber;
        return sum;
    }

    public static int subtract(int FirstNumber, int SecondNumber){
        int difference=FirstNumber-SecondNumber;
        return difference;
    }

    public static int multiply(int FirstNumber, int SecondNumber){
        int product=FirstNumber*SecondNumber;
        return product;
    }

    public static int divide(int FirstNumber, int SecondNumber){
        int quotient=0;
        try{
            if(SecondNumber==0)
            {
                //throwing custom Divide by Zero Exception
                throw new DivideByZeroException("Division by zero is not allowed");
            }
            else
            {
                quotient=FirstNumber/SecondNumber;

            }
        }
        catch (DivideByZeroException error)
        {
            System.out.println(error);
        }
        return quotient;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int firstNumber=0,secondNumber=0;
        try {
            System.out.println("Enter First Number ");
            firstNumber = Integer.parseInt(input.next());
            System.out.println("Enter Second Number ");
            secondNumber = Integer.parseInt(input.next());
            System.out.println("Sum is "+add(firstNumber,secondNumber));
            System.out.println("Difference is "+subtract(firstNumber,secondNumber));
            System.out.println("Product is "+multiply(firstNumber,secondNumber));
            int quotient=divide(firstNumber,secondNumber);
            if(quotient==0){
                System.out.println("");
            }else
            System.out.println("Quotient is "+divide(firstNumber,secondNumber));

        }
        //Catching exception if the Input is not in Correct Number Format
        catch(NumberFormatException exception)
        {
            System.out.println("Enter a number!");
        }



    }
}
