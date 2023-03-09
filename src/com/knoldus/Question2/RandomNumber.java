package com.knoldus.Question2;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String args[]) {
        Scanner UserInput = new Scanner(System.in);
        Random randomNumber = new Random();

        //Generating Random Number using object of Random Class
        int random = randomNumber.nextInt(100);
        System.out.println("Enter a number: ");
        int localVariable = 0;
        while (localVariable != random) {
            try {
                localVariable = Integer.parseInt(UserInput.next());
                if (localVariable < random) {
                    System.out.println("Too Low");

                } else if (localVariable > random) {
                    System.out.println("Too High");

                } else {
                    System.out.println("You guessed it!");
                }
            }

            //Exception when user enters Invalid Input like String
            catch (NumberFormatException exception)
            {
                System.out.println("Invalid Input, Please enter a valid number");
            }
        }
    }
}
