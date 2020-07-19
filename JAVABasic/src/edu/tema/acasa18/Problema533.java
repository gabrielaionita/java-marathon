/*** Tema pentru acasa
 * Problema5.3.3:
 * Verifica daca array-ul contine o valoare specifica
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

public class Problema533 {

    public static void main(String[] args){


        int intArray[] = {0, 1, 2};
        int checkValue = 2;
        boolean hasValue = false;


        for( int num : intArray) {
            if (num == checkValue) {
                hasValue = true;
                System.out.println("The array contains this value");
                break;
            }

        }
        System.out.println("The array does not contain this value");

    }
}
