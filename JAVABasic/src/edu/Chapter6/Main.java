/***Tema in clasa
 * Problema 5.2 din Capitolul 6
 *
 */



package edu.Chapter6;

public class Main {

    public static void main (String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.age = 1; //obiect
        dog2.age = 2;

        int varOne = 10; //variabila primitiva
        int varTwo = 11;

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(varOne);
        System.out.println(varTwo);

        System.out.println("==============");

        varOne = varTwo;
        dog1 = dog2; //in memorie avem doar un obiect dog2

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(varOne);
        System.out.println(varTwo);

        System.out.println("==============");

        varTwo = 12;
        dog1.age = 3; //aceasta variabila s-a resfarns spre ambele referinte

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(varOne);
        System.out.println(varTwo);

        System.out.println("==============");



    }
}

