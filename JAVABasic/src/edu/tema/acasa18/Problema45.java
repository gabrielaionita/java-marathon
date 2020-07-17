/*** Tema pentru acasa
 * Problema 4.5:Afiseaza ziua saptamanii conform cifrei introduse
 * utilizand switch
 * @since 18july2020
 * @author Ionita Gabriela
 */


package edu.tema.acasa18;

import java.util.Scanner;

public class Problema45 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7:");
        int dayIndex = scanner.nextInt();

        switch (dayIndex) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Wrong number!");
        }
    }
    }
