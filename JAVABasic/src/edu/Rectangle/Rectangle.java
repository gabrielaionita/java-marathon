/**Tema pentru acasa
 * Problema 5.5:
 * Crearea unui obiect dreptunghi
 * si calcularea ariei si perimetrului
 * @since 19july2020
 * @author Ionita Gabriela
 */

package edu.Rectangle;

public class Rectangle {

    int lenght;
    int width;

    void calculateArea(){

        double area = lenght*width ;
        System.out.println("Rectangle area: " + area);

    }

    void calculatePerimeter(){

        double perimeter = 2*lenght + 2*width;
        System.out.println("Rectangle perimeter: " + perimeter);

    }
}
