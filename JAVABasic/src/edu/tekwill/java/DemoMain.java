/***Tema pentru acasa:
 * Exercitiul de comparare
 * Compara 3 numere
 * @17iulie2020
 * @author Ionita Gabriela
 */

package edu.tekwill.java;

import java.util.Scanner;

public class DemoMain {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(("enter first number:"));
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number:");
        int thirdNumber = scanner.nextInt();

        int biggestNumber;


        biggestNumber = firstNumber > secondNumber
                ? (firstNumber > thirdNumber ? firstNumber : thirdNumber)
                : (secondNumber > thirdNumber ? secondNumber: thirdNumber);

        System.out.println("The biggest number is: " + biggestNumber);

    }

}