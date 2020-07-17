/***Probleme in clasa while,do-while statement 4.10
 * @since 17july2020
 * @author
 *
 */

package edu.tekwill.java;

import java.util.Scanner;

public class ClasaWhile {
    public static void main(String[] args) {


        int counter = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number = scanner.nextInt();
        counter++; //incrementam variabila
        sum += number; //adaugam numarul la suma

        while(number != 0) { //pana cand nu se introduce 0 de la tastatura
            System.out.println("enter next number:");
            number = scanner.nextInt();
            counter++;
            sum += number;
        }

        System.out.println("You have entered " + counter + " numbers");
        System.out.println("Sum is " + sum);
    }
}
