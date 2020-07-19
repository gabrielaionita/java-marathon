/*** Tema pentru acasa
 * Problema 5.4 Desenul
 * @since 18july2020
 * @author Ionita Gabriela
 */

package edu.tema.acasa18;

public class Problema54 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > 0 && j == 0) {
                    System.out.println();
                }
                System.out.print("- ");
            }
        }
    }
}
