/*** Tema pentru acasa
 * Problema5.3.2:
 *Afiseaza nr mediu al unui array
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

public class Problema532 {

    public static void main(String[] args){


        int intArray[] = {0, 1, 2};
        int sum = 0;
        int avg = 0;
        int arrayLenght = intArray.length;

        for( int num : intArray) {
            sum = sum+num;
            avg = sum/arrayLenght;
        }
        System.out.println("The average value of array elements is: "+avg);
    }
}
