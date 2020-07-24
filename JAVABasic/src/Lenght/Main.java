package Lenght;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> initialList = new ArrayList<>();
        initialList.add("this");
        initialList.add("is");
        initialList.add("lots");
        initialList.add("of");
        initialList.add("for");
        initialList.add("every");
        initialList.add("Java");
        initialList.add("programmer");

        ArrayList<Integer> initialList2 = new ArrayList<>();
        initialList2.add(1);
        initialList2.add(2);
        initialList2.add(3);
        initialList2.add(4);
        initialList2.add(5);




        System.out.println(initialList);
        System.out.println("======================");
        ArrayList<String> result = markLenght4(initialList);
        System.out.println(result);

    }

 //   static ArrayList<String> intersect(ArrayList<String> listOne, ArrayList<String>) {
 //
 //       ArrayList<String> result = new ArrayList<>();

 //       for (String)
 //   }


//    static ArrayList<String> addStars(ArrayList<String> listToProces) {
//        ArrayList<String> result = new ArrayList<>();

 //       for (String element )
//    }




    static ArrayList<String> markLenght4(ArrayList<String> listToProcess) {
        ArrayList<String> result = new ArrayList<>();

        for (String elementFromList : listToProcess){
            if (elementFromList.length() == 4){
                elementFromList = "****" + elementFromList;
            }

            result.add(elementFromList);
        }

        return result;
    }
}
