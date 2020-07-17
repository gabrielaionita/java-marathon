/*** Tema pentru acas
 * Problema 4.6: Afiseaza rezultatul operatiunii
 * in urma introducerii operatorului si a doua numere
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

import java.util.Scanner;

public class Problema46 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (+, -, * or /):");
        char opIndex = scanner.next().charAt(0);
        System.out.print("Enter number1:");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2:");
        int number2 = scanner.nextInt();

        switch (opIndex) {

            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;

            default:
                System.out.println("Wrong operator!");
        }
    }

}
