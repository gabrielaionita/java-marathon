/*** Tema pentru acasa
 * Problema 4.9:Afiseaza numerele mai mici decat cel introdus si divizibile cu 2
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

import java.util.Scanner;

public class Problema49 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        for(int index = number - 2; index >0; index--){
            if (index % 2 == 0)
            System.out.println(index);
        }

    }

}

