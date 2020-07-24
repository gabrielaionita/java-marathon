package Chapter12;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemovePlurals {

    public ArrayList<String> removePlurals(ArrayList<String> listToProcess){

        ListIterator<String> it =listToProcess.listIterator();

        while(it.hasNext()){
            String listElement = it.next();
            if(listElement.endsWith("s")|| listElement.endsWith("S")) {
              it.remove();
            }

        }
        return listToProcess;

    }
}
