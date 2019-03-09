package com.xeroxislabz.gregsprojects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create the Scanner for the input process
        Scanner input = new Scanner(System.in);
        // There is not switch statement for a HH:MM:SS format (only whitespace delimiters)
        System.out.print("Insert time in HH MM SS format: ");

        // We need to try these assignments to verify if user inputs characters instead of numbers and
        // catch any exceptions to provide feedback to the user
        try {

            int inputHours = input.nextInt();
            int inputMinutes = input.nextInt();
            int inputSeconds = input.nextInt();

            TimeConverter.convertTime(inputHours, inputMinutes, inputSeconds);

        } catch(InputMismatchException in){
            System.out.println("Time does not match with integers");
        }

    }
} // End Main class
