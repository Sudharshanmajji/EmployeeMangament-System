package dao;

import model.Employee;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // add employee
    public void addEmployee(Employee emp) {

        String query =
                "insert into employee values(?,?,?,?,?)";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, emp.getEmpId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());
            ps.setInt(5, emp.getAge());

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println(
                        "Employee added successfully");
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // view all employees
    public List<Employee> getAllEmployees() {

        List<Employee> employees =
                new ArrayList<>();

        String query =
                "select * from employee";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(query);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()) {

                Employee emp = new Employee();

                emp.setEmpId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setDepartment(
                        rs.getString("department"));
                emp.setSalary(
                        rs.getDouble("salary"));
                emp.setAge(rs.getInt("age"));

                employees.add(emp);
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

        return employees;
    }

    // update employee salary
    public void updateEmployeeSalary(
            int empId,
            double newSalary) {

        String query =
                "update employee set salary=? where id=?";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setDouble(1, newSalary);
            ps.setInt(2, empId);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println(
                        "Salary updated successfully");
            } else {
                System.out.println(
                        "Employee not found");
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    // delete employee
    public void deleteEmployee(int empId) {

        String query =
                "delete from employee where id=?";

        try {

            Connection con =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, empId);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println(
                        "Employee deleted successfully");
            } else {
                System.out.println(
                        "Employee not found");
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
