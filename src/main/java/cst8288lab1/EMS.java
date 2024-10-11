/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 * The driver class containing the main() method, this class utilizes
 * the Builder and Factory design patterns implemented in this project
 * to create various employees and add them to the Employee Manager.
 *
 * @author matt_
 */
public class EMS {
    /**
     * This method tests the design patterns by creating different Employees
     * and adding them to the Employee Manager.
     *
     * @param args, an array of Strings
     */
    public static void main(String[] args) {
        // Instantiate the EmployeeManager and the EmployeeFactory
        EmployeeManager employeeManager = EmployeeManager.getInstance();
        EmployeeFactory empFactory = new EmployeeFactory();

        // Use the Factory to add a part-time and a full-time employee
        employeeManager.addEmployee(empFactory.hireEmployee("Part Time"));
        employeeManager.addEmployee(empFactory.hireEmployee("Full Time"));

        // Instantiate a partTimeEmployeeBuilder and a fullTimeEmployeeBuilder
        PartTimeEmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder();
        FullTimeEmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();

        // Instantiate an employeeDirector to utilize the builders
        EmployeeDirector employeeDirector = new EmployeeDirector();

        // Use the EmployeeDirector to create a part-time employee and a full-time
        // employee, then add them to the employeeManager
        employeeManager.addEmployee(employeeDirector.hire(partTimeBuilder));
        employeeManager.addEmployee(employeeDirector.hire(fullTimeBuilder));

        // print all the employees to the console
        employeeManager.retrieveEmployees();
    }
}
