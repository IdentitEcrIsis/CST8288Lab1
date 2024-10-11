/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

import java.util.ArrayList;

/**
 *
 * @author matt_
 */
public class EmployeeManager {
    private static EmployeeManager employeeManager;
    private final ArrayList<Employee> employeeList;
    
    private EmployeeManager() {
        employeeList = new ArrayList<>();
    }
    
    public static EmployeeManager getInstance() {
        if (employeeManager == null)
            employeeManager = new EmployeeManager();
        
        return employeeManager;
    }
    
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
    
    public void retrieveEmployees() {
        for (Employee emp : employeeList) {
            System.out.println(emp.toString());
        }       
    }
    
}
