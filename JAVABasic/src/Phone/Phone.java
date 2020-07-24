package Phone;

public class Phone {

    static boolean soft = false;
    String model;

    void printPhone(String model){
        System.out.println(model);
        boolean soft = true;
        System.out.println(soft);

        this.model = "abcd";
        Phone.soft = false;
        this.soft = false;
    }
}
