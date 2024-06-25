package anudip.java;

// Define a class called Employee to represent an employee
public class Employee {
    // Private fields to store employee details
    private int empId;
    private String name;
    private String department;
    private int salary;

    // Constructor to initialize an Employee object
    public Employee(int empId, String name, String department, int salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Override the toString() method to provide a string representation of an Employee object
    @Override
    public String toString() {
        return "ID: " + empId + ", Employer Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

// Define a class called ArrayEmp to demonstrate an array of Employee objects
class ArrayEmp {
    public static void main(String[] args) {
        // Declare an array of Employee objects with a size of 4
        Employee[] employees = new Employee[4];

        // Initialize the array elements with Employee objects
        employees[0] = new Employee(1, "Saikrishna", "Engineering", 75000);
        employees[1] = new Employee(2, "Teju", "Marketing", 65000);
        employees[2] = new Employee(3, "Vinay", "Sales", 70000);
        employees[3] = new Employee(4, "Shiva", "HR", 90000);

        // Iterate over the array using a for-each loop and print each Employee object
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}