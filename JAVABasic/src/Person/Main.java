package Person;


public class Main {

    public static void main(String[] args) {

        Student st = new Student("Mike", "NY", "IT", 2000, 35.34);
        Staff sf = new Staff("Julia", "LA", "MIT", 12.34);

        System.out.println(st.toString());
        System.out.println(sf.toString());

        Person per = new Person("John", "CA");
        System.out.println(per.toString());

    }

}
