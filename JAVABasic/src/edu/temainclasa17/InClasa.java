/***Probleme in clasa Colectii de valori/ tablou unidimensional
 * denumirea problemei: Array 5.1
 * @since 17july2020
 * @author profesor
 *
 */

package edu.temainclasa17;

public class InClasa {

    public static void main(String[] args) {

        int myArray[] = new int[3];

        //   myArray[0] = 34;
        //   myArray[1] = 45;
        //     myArray[2] = 23;

        for (int arrayPosition = 0; arrayPosition < 3; arrayPosition++) {
            myArray[arrayPosition] = 5 * arrayPosition;

        }

        for (int arrayPosition = 0; arrayPosition < myArray.length; arrayPosition++) {

            System.out.println(myArray[arrayPosition]);
        }
    }
}
