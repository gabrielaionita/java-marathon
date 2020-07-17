/***
 * Exercitiul nr 3.6
 * Convert Celsius in to Fahrenheit
 * @17iulie2020
 * @author Ionita Gabriela
 */
package edu.tekwill.java;

import java.util.Scanner;

public class ExerciseClass {

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        int myInt = myScanner.nextInt();
        int tempF = (9*myInt +(32*5))/5;
        System.out.println("The Temperature in Fahrenheit is:  " + tempF);
    }



}

