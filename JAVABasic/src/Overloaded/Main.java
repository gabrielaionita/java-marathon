package Overloaded;

public class Main {

    public static void main(String[] args) {
        Rectangle shape = new Rectangle();

        System.out.println("Perimeter is: " + shape.calculatePerimeter(5));
        System.out.println("Perimeter is: " + shape.calculatePerimeter(3,5));

    }
}
