/*** Tema in clasa
 * Problema 5.4
 * Calculeaza aria unui cerc
 *
 */


package edu.Chapter7;

public class Circle {

    public double radius;
    void calculateArea(){

        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);

    }
}
