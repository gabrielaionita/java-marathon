/*problemele in clasa


package Employee;

public class Employee {
  private int id;
   private String name;
   private double salary;

public Employee(int id, String name, int salary) {

}

public void setName(String name) {
    this.name = name;
}

public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object instanceof Employee) {
        Employee other = (Employee) object;

        if(other.name == this.name && other.salary == this.salary){
            return true;
        }
        return false;
    }
}

   public void setSalary(double salary){
       this.salary = salary;
   }

   public String toString() {
 return String.format("Employee[id=%s, name=%s, salary=%s ]", id, name, salary);
   }
}


 */