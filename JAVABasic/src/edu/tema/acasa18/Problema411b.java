/*** Tema pentru acasa
 * Problema 4.11b: Permite introducerea nr de la tastatura pana
 * la introducere 0
 * folosind for loop
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;
import java.util.Scanner;

public class Problema411b {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int number = 1;

/* versiunea 1
   for (; ; ) {
           System.out.println("Enter number:");
           number = scanner.nextInt();
           if (number == 0){
               break;
           }
        }
*/

        for (; number != 0 ; ) {
            System.out.println("Enter number:");
            number = scanner.nextInt();

        }

    }
}
