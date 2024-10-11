/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

import java.util.ArrayList;

/**
 * The EmployeeManager class gathers all created employees in a list.
 * It contains functionality to add, remove and display employees from
 * the list.
 *
 * @author matt_
 */
public class EmployeeManager {
    private static EmployeeManager employeeManager;
    private final ArrayList<Employee> employeeList;

    /**
     * Instantiate the ArrayList when the constructor is called.
     */
    private EmployeeManager() {
        employeeList = new ArrayList<>();
    }

    /**
     * Utilize singleton design pattern to ensure that there is
     * only ever one instance of this class. If the singular instance
     * has not been instantiated yet, instantiate it. Otherwise, return
     * the instance.
     *
     * @return the employeeManager instance
     */
    public static EmployeeManager getInstance() {
        if (employeeManager == null)
            employeeManager = new EmployeeManager();
        
        return employeeManager;
    }

    /**
     * Add an Employee to the ArrayList
     *
     * @param employee, an Employee
     */
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    /**
     * Remove an Employee from the ArrayList
     *
     * @param employee, an Employee
     */
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    /**
     * Print each employee in the ArrayList to the console
     */
    public void retrieveEmployees() {
        for (Employee emp : employeeList) {
            System.out.println(emp.toString());
        }       
    }
    
}
