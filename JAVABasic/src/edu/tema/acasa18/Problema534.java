/*** Tema pentru acasa
 * Problema5.3.4:
 * Afiseaza index-ul unui element din array
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

import java.util.Scanner;

public class Problema534 {

    public static void main(String[] args){

        int [] numbers = {1, 4, 5, 10, -5};
        int searchedValue = 10;

        for(int index = 0; index < numbers.length; index++) {
            if (numbers[index] == searchedValue) {
                //pozitia
                System.out.println("Found searched value at " + index + " position");
                break;
            }
        }





    }
}
