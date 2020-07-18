/*** Tema pentru acasa
 * Problema 4.11: Calculeaza suma nr de la 1 la 100
 * folosind while si do-while
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

import java.util.Scanner;

public class Problema411 {

    public static void main(String[] args){

        int x = 1;
        int sum = 0;

        while(x <= 100) {
            sum += x;
            x++;
        }
        System.out.println("The sum is: " + sum);

        x = 1;
        sum = 0;
        do {
            sum += x;
            x++;
        }
        while(x <= 100) ;
        System.out.println("The sum is: " + sum);

    }
}
