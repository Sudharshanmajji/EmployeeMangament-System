package main;

import dao.EmployeeDAO;
import model.Employee;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDAO dao = new EmployeeDAO();

        while(true) {

            System.out.println("\n===== Employee Management System =====");

            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    Employee emp =
                            new Employee(id, name,
                                    dept, salary, age);

                    dao.addEmployee(emp);

                    break;

                case 2:

                    List<Employee> employees =
                            dao.getAllEmployees();

                    System.out.println("\n--- Employee List ---");

                    for(Employee e : employees) {

                        System.out.println(e);
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();

                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();

                    dao.updateEmployeeSalary(
                            empId,
                            newSalary
                    );

                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");

                    int deleteId = sc.nextInt();

                    dao.deleteEmployee(deleteId);

                    break;

                case 5:

                    System.out.println("Exiting Application...");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}