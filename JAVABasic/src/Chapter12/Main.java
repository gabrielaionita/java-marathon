package Chapter12;
import java.util.ArrayList;
import ArrayList.StringInverter;

public class Main {

    public static void main(String[] args) {
        RemovePlurals pluralsRemoval = new RemovePlurals();

        ArrayList<String> initialList = new ArrayList<>();
        initialList.add("Cartoons");
        initialList.add("Book");
        initialList.add("CarS");
        initialList.add("Bank");

        System.out.println(initialList);
        ArrayList<String> result = pluralsRemoval.removePlurals(initialList);
        System.out.println(initialList);

        StringInverter si = new StringInverter();
        ArrayList<String> listToProcess = new ArrayList<>();
        initialList.add("Cartoons");
        initialList.add("Book");
        initialList.add("CarS");
        initialList.add("Bank");
        System.out.println(result);

    }
}
