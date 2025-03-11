import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("*****************************");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(111, "Swathi", 65000.00);
        Employee emp2 = new Employee(222, "Deepthi", 72000.00);
        Employee emp3 = new Employee(333, "Nandu", 60000.00);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        for (Employee emp : empList) {
            emp.displayDetails();
        }
    }
}


