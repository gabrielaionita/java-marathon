package Overloaded;

public class Rectangle {

    int calculatePerimeter(int width, int height){

        return 2*width + 2*height;
    }

    int calculatePerimeter(int sideLenght){

        return 4*sideLenght;
    }

    double calculateArea(int width, int height) {
        return width * height;
    }

    int calculateArea(int sidelenght) {

        return sidelenght * sidelenght;
    }
}
