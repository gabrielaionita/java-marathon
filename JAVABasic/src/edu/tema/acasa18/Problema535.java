/**
 * Problema 5.3.5
 * Copiere elementele ale unui array in alt array
 *
 * @author profesor
 * @since 18july2020
 */


package edu.tema.acasa18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Problema535 {

    public static void main(String[] args) {

        int[] sourceArray = {1, 4, 5, 10, -5, 8, 4};
        int[] targetArray = new int[sourceArray.length];

        System.out.println("First array: " + Arrays.toString(sourceArray));
        System.out.println("Second array: " + Arrays.toString(targetArray));


        for (int index = 0; index < sourceArray.length; index++) {
            targetArray[index] = sourceArray[index];
        }

        System.out.println("First array: " + Arrays.toString(sourceArray));
        System.out.println("Second array: " + Arrays.toString(targetArray));
    }


}
