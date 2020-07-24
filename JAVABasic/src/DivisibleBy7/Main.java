package DivisibleBy7;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws InvalidRangeException {
        Divisible countDiv = new Divisible();


        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a minimum value:");
            int minimum = scanner.nextInt();
            System.out.println("Enter a maximum value:");
            int maximum = scanner.nextInt();

            if (maximum > minimum) {

                System.out.println("Numbers in the range divisible by 7: "  + countDiv.getCounter());
            }
            if (maximum <= minimum)
                throw new InvalidRangeException("Maximum number should be greater then minimum");

        } catch (InvalidRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }


        }




