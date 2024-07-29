import java.util.Scanner;

class Employee_Detail {
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;

    void displayDetails() {
        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
    }
    public Employee_Detail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        Employee_ID = scanner.nextInt();

        System.out.println("Enter Name: ");
        Name = scanner.next();

        System.out.println("Enter Designation: ");
        Designation = scanner.next();

        System.out.println("Enter Salary: ");
        Salary = scanner.nextDouble();

    }
}

public class Employee {
    public static void main(String[] args) {
        Employee_Detail employee = new Employee_Detail();
        System.out.println("Employee Details: ");
        employee.displayDetails();
    }
}