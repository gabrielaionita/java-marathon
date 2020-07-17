/***Probleme in clasa
 * @since 17july2020
 * @author
 *
 */


package edu.tekwill.java;

import java.util.Scanner;

public class ProbinClasa {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

 //       for(int index = 0; index <=number; index++){
 //           System.out.println(index);
 //       }

  //In ordine descrescatoare:
        for(int index = number;  index >0; index--){
            System.out.println(index);
        }
    }
}
