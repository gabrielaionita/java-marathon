package Hexazecimal;

public class HexazecimalChecker {
    /***
     * Parce the given String to a number
     * @param elementToParse a hexazecimal value as String
     * @return the number that has been converted.
     * @throws InvalidHexException when the number could't not be parse
     */



    Integer parseHex(String elementToParse) throws InvalidHexException {
        //elementToParse = A3897F;


        try {
            return Integer.parseInt(elementToParse, 16);
        } catch (NumberFormatException ex) {
            System.out.println("Got an exception" + ex.getMessage());
            throw new InvalidHexException(elementToParse + "is not");
        }


    }
}
