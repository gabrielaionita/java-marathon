/*** Tema pentru acasa
 * Problema:Calculeaza suma valorilor unui array
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

public class Problema531 {

    public static void main(String[] args) {

        int intArray[] = {0, 1, 2};
        int sum = 0;

        for( int num : intArray) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is: "+sum);


    }
}
