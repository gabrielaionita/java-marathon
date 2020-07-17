/***
 * Exercitiul nr 3.7
 * Convert Minutes to nr of years and days
 * @17iulie2020
 * @author Ionita Gabriela
 */

package edu.tekwill.java;

import java.util.Scanner;

public class ClassEx {

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        int myInt = myScanner.nextInt();
        int numYrs = (myInt/525600);
        int numDs = (myInt/1440);
        System.out.println("The Number of Years is:  " + numYrs);
        System.out.println("The Number of Days is:  " + numDs);
    }

}
