package ArrayList;

import java.util.ArrayList;

public class StringInverter {

    public ArrayList<String> invert(ArrayList<String> listToProcess){
        ArrayList<String> result = new ArrayList<>();


        for (String elementFromList : listToProcess) {
            StringBuilder sb = new StringBuilder(elementFromList);
            result.add(sb.reverse().toString());

        }

        return result;
    }

}

