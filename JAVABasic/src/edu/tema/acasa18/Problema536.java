/*** Tema pentru acasa
 * Problema 5.3.6
 * Afisare cate nr sunt pare si cate impare intr-un array anumit
 * @since 19july2020
 * @author Ionita Gabriela
 *
 */

package edu.tema.acasa18;


public class Problema536 {

    public static void main(String[] args) {

        int[] sourceArray = {1, 4, 5, 10, 6, 8, 4, 7, 15};
        int oddCount = 0;
        int evenCount = 0;


        for( int num : sourceArray)
        {
            if (num % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Even numbers: " + evenCount);
    }
}
