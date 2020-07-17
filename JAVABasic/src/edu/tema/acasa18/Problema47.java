/*** Tema pentru acasa
 * Problema 4.7:Afiseaza text mark conform notei introduse
 * folosind switch
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

import java.util.Scanner;

public class Problema47 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numerical mark between 0 and 10:");
        int markIndex = scanner.nextInt();

        switch (markIndex) {

            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Fail!");
                break;
            case 5:
                System.out.println("Approved.");
                break;
            case 6:
                System.out.println("Good.");
                break;
            case 7: case 8:
                System.out.println("Very Good!");
                break;
            case 9: case 10:
                System.out.println("I'm proud of you!");
                break;

            default:
                System.out.println("Wrong mark!");
        }

    }

}
