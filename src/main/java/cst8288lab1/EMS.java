/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 *
 * @author matt_
 */
public class EMS {
    public static void main(String[] args) {
        EmployeeManager employeeManager = EmployeeManager.getInstance();
        EmployeeFactory empFactory = new EmployeeFactory();

        employeeManager.addEmployee(empFactory.hireEmployee("Part Time"));
        employeeManager.addEmployee(empFactory.hireEmployee("Full Time"));
        
        PartTimeEmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder();
        FullTimeEmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        EmployeeDirector employeeDirector = new EmployeeDirector();

        employeeManager.addEmployee(employeeDirector.hire(partTimeBuilder));
        employeeManager.addEmployee(employeeDirector.hire(fullTimeBuilder));

        employeeManager.retrieveEmployees();
    }
}
