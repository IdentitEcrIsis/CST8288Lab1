/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cst8288lab1;

/**
 * Interface to be used by Employee Builder classes when
 * creating Employee objects.
 *
 * @author matt_
 */
public interface EmployeeBuilder {
    /**
     * Methods for setting Employee parameters that return the
     * EmployeeBuilder object in order to be chainable with
     * each other.
     */
    EmployeeBuilder setId(int id);
    EmployeeBuilder setName(String name);
    EmployeeBuilder setDepartment(String department);
    EmployeeBuilder setRole(String role);
    EmployeeBuilder setWorkingHours(int workingHours);
    EmployeeBuilder setSalary(int salary);

    /**
     * Build method returns the Employee object with all its
     * parameters set from the methods above.
     */
    Employee build();
}
