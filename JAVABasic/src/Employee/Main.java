

//package Employee;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        List<Employee> l1 = new ArrayList<>();
//        l1.add(new Employee("John"));
//        l1.add(new Employee("Mike"));
//
//        Employee foundEmp = findEmployeeByName("John", l1);
//        System.out.println(foundEmp.toString());
//
//
//    }
//}
//        ArrayList<Employee> employeeList = new ArrayList<>();
//
//
//        employeeList.add(new Employee(111, "Mike", 1000));
//        employeeList.add(new Employee(222, "Julia", 2000));
//        employeeList.add(new Employee(333, "Mike", 1000));
//
//        Employee empWithId111 = findByID(111, employeeList);
//        Employee empWithId333 = findByID(333, employeeList);
//
//        System.out.println(empWithId111);
//        System.out.println(empWithId333);
//
//
//
//    }
//
//    static Employee findByID(int empID, ArrayList<Employee> listToSearch){
//       for (Employee foundEmp : listToSearch) {
//           if (emp.getID() == empID) {
//               return emp;
//           }
//       }
//        return null;
//    }
//
//}
