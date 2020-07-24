package Problema103;

public class Rectangle {

    int lenght;
    int width;
    double area;

    Rectangle() {
       lenght = 0;
        width = 0;
    }

    Rectangle(int newLenght, int newWidth){
        lenght = newLenght;
        width = newWidth;
    }

    Rectangle(int upLenght){
        lenght = upLenght;

    }

    void calculateArea() {

         area = lenght * width;
    }

    void printArea(){
        System.out.println("The area is:" + area);
    }

}
