/*** Tema pentru acasa
 * Problema 5.3.7
 * Verificare daca doua array-uri sunt identice
 * @since 19july2020
 * @author Ionita Gabriela
 *
 */
package edu.tema.acasa18;

import java.util.Arrays;


public class Problema537 {

    public static void main(String[] args) {

        int[] firstArray = {1, 4, 5, 10, 7, 8, 4};
        int[] secondArray = {1, 4, 5, 11, 6, 8, 4};

        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        System.out.println("Are the arrays equal ?: " + Arrays.equals(firstArray,secondArray));


    }
}