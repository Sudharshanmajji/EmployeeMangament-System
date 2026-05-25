package model;

public class Employee {

    private int empId;
    private String name;
    private String department;
    private double salary;
    private int age;

    public Employee() {
    }

    public Employee(int empId, String name,
                    String department,
                    double salary, int age) {

        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return empId + " " + name + " " +
                department + " " + salary +
                " " + age;
    }
}