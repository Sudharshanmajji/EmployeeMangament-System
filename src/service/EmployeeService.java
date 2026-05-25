package service;

public class EmployeeService
{
    //Responsibilities
    //
    //Service layer can:
    //
    //validate data
    //apply business rules
    //call DAO methods
    //handle exceptions
 /*Execution in Main*/
//    Step 1 → MainApp
//
//    Instead of:
//
//    EmployeeDAO dao = new EmployeeDAO();
//
//dao.addEmployee(emp);
//
//    we write:
//
//    EmployeeService service =
//            new EmployeeService();
//
//service.addEmployee(emp);
}
