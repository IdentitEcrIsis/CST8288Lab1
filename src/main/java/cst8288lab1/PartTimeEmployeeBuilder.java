/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 * The PartTimeEmployeeBuilder class uses setters to set the Employee's
 * information and stores it within itself. It then uses the build() method
 * to return the completed Employee.
 * @author matt_
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {

    private final PartTimeEmployee employee;

    /**
     * Instantiate a new PartTimeEmployee when the constructor is called
     */
    public PartTimeEmployeeBuilder() {
        this.employee = new PartTimeEmployee();
    }

    /**
     * Set the employee's id and return the instance of the builder
     * @param id, an int
     * @return the builder
     */
    @Override
    public EmployeeBuilder setId(int id) {
        this.employee.setId(id);
        return this;
    }

    /**
     * Set the employee's name and return the instance of the builder
     * @param name, a String
     * @return the builder
     */
    @Override
    public EmployeeBuilder setName(String name) {
        this.employee.setName(name);
        return this;
    }

    /**
     * Set the employee's department and return the instance of the builder
     * @param department, a String
     * @return the builder
     */
    @Override
    public EmployeeBuilder setDepartment(String department) {
        this.employee.setDepartment(department);
        return this;
    }

    /**
     * Set the employee's role and return the instance of the builder
     * @param role, a String
     * @return the builder
     */
    @Override
    public EmployeeBuilder setRole(String role) {
        this.employee.setRole(role);
        return this;
    }

    /**
     * set the employee's working hours and return the instance of the builder
     * @param workingHours, an int
     * @return the builder
     */
    @Override
    public EmployeeBuilder setWorkingHours(int workingHours) {
        this.employee.setWorkingHours(workingHours);
        return this;
    }

    /**
     * set the employee's salary and return the instance of the builder
     * @param salary, an int
     * @return the builder
     */
    @Override
    public EmployeeBuilder setSalary(int salary) {
        this.employee.setSalary(salary);
        return this;
    }

    /**
     * Finalize the employee that has been built and return it.
     * @return the employee
     */
    @Override
    public Employee build() {
        return employee;
    }
    
}
