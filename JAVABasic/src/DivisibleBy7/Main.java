package DivisibleBy7;

import Hexazecimal.HexazecimalChecker;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws InvalidRangeException {
        Divisible countDiv = new Divisible();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a mimimum value:");
            int mimimum = scanner.nextInt();
            System.out.println("Enter a maximum value:");
            int maximum = scanner.nextInt();

            if (maximum > mimimum) {

                System.out.println("Numbers in the range divisible by 7: "  + countDiv);
            }
            if (maximum <= mimimum)
                throw new InvalidRangeException("Maximum number should be greater then minimum");

        } catch (InvalidRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }


        }




