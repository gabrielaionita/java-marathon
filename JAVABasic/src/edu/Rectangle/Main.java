/**Tema pentru acasa
 * Problema 5.5:
 * Crearea unui obiect dreptunghi
 * si calcularea ariei si perimetrului
 * @since 19july2020
 * @author Ionita Gabriela
 */

package edu.Rectangle;


import edu.Chapter7.Circle;

public class Main {

    public static void main (String[] args) {


        Rectangle myRectangle = new Rectangle();
        myRectangle.lenght = 5;
        myRectangle.width = 3;

        myRectangle.calculateArea();
        myRectangle.calculatePerimeter();


    }
}
