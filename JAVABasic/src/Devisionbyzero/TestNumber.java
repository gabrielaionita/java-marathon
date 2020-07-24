package Devisionbyzero;

public class TestNumber {

    public static void main(String[] args) {
        Numbers number = new Numbers(5);
        double result = 0;

        try {
            result = number.divideBy(0);
        } catch (ArithmeticException  | IllegalArgumentException exception){
            System.out.println("Exception" + exception.getMessage());

        }
//        catch (IllegalArgumentException exception){
 //           System.out.println("Got an IllegalArgumentException " + exception.getMessage());
 //       }



       System.out.println(result);
    }
}
