/***
 * Exercitiul nr 3.8
 * Sum, difference, product, average
 * @17iulie2020
 * @author Ionita Gabriela
 */

package edu.tekwill.java;

import java.util.Scanner;

public class AnotherClass {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int myInt = myScanner.nextInt();
        System.out.println("Enter second number:");
        int sCnd = myScanner.nextInt();
        int sum = myInt + sCnd;
        int sub = myInt - sCnd;
        int mult = myInt * sCnd;
        int div = myInt/sCnd;
        int avg = (sum)/2;
        int rem = myInt % sCnd;
        System.out.println("The SUM is:  " + sum);
        System.out.println("The Substraction result is:  " + sub);
        System.out.println("The Multiplication result is:  " + mult);
        System.out.println("The Devision result is:  " + div);
        System.out.println("The Average number is:  " + avg);
        System.out.println("The Remainder is:  " + rem);


    }
}
