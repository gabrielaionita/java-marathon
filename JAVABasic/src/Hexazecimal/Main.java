/**Problema in clasa
 *
 */

package Hexazecimal;

public class Main {
    public static void main(String[] args) {

        HexazecimalChecker checker = new HexazecimalChecker();

        try {
            System.out.println(checker.parseHex("675JUABC"));
        } catch (InvalidHexException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
}
