package edu.tekwill.java;

import java.util.Scanner;

public class DemoMain {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(("enter first number:"));
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        int biggestNumber;

        if (firstNumber > secondNumber) {
            //System.out.println("First number is bigger");
            biggestNumber = firstNumber;.
        }

        else {
            System.out.println("Second number is bigger");
        }

        boolean isFirstNumberBiggerThanSeconfOne = false;
        isFirstNumberBiggerThanSeconfOne = firstNumber > secondNumber ? true : false;

        System.out.println("Is first number bigger than the second one?" +isFirstNumberBiggerThanSeconfOne);

    }

}