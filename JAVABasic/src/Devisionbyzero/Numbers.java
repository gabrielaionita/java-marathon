package Devisionbyzero;

public class Numbers {

    private int value;

    Numbers(int value) {
        this.value = value;
    }

    double divideBy(int inputValue){

        if(inputValue == 0) {
            throw new IllegalArgumentException("Got 0(zero) as input value!");
        }
        return  value/inputValue;
    }

}
