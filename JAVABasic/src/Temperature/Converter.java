package Temperature;

public class Converter {

    double toCelcius(double temperature) {
        return (5* (temperature - 32))/9;
    }

    double toFahrenheit(double temperature){
        return ((9*temperature +(32*5))/5);
    }
}
