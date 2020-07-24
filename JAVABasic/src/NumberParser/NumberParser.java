package NumberParser;

public class NumberParser {

    public static void main(String[] args) {
        String validIntValue = "10";
        String invalidBooleanValue = "truea";

        int convertedValidInt = Integer.parseInt(validIntValue);
        boolean convertedInvalidBoolean = Boolean.parseBoolean(invalidBooleanValue);

        System.out.println(convertedValidInt);
        System.out.println(convertedInvalidBoolean);
    }
}
