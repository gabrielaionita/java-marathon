/*** Tema pentru acasa
 * Problema 4.7:Afiseaza text mark conform notei introduse
 * folosind if
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

import java.util.Scanner;

public class Problema47if {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numerical mark between 0 and 10:");
        int markIndex = scanner.nextInt();

        if (markIndex >= 0 && markIndex < 11) {

            if (markIndex <= 4)
                System.out.println("Fail!");
            if (markIndex == 5)
                System.out.println("Approved.");
            if (markIndex == 6)
                System.out.println("Good!");
            if (markIndex == 7 || markIndex == 8)
                System.out.println("Very Good!");
            if (markIndex == 9 || markIndex == 10)
                System.out.println("I'm proud of you!");
        }
        else System.out.println("Wrong mark");

    }

}
