package Temperature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temperature = sc.nextDouble();

        System.out.println("Enter conversion type C or F");
        Scanner sc1 = new Scanner(System.in);
        char conversionType = sc1.nextLine().charAt(0);


        Converter conv = new Converter();
        double result = 0;

        switch (conversionType){

            case 'C': {
                 result = conv.toCelcius(temperature);

                break;
            }

            case 'F': {

                 result = conv.toFahrenheit(temperature);

                break;
            }
        }

        System.out.println(result);
    }
}
