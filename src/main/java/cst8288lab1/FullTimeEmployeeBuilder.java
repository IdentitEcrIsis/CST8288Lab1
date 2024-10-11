/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 *
 * @author matt_
 */
public class FullTimeEmployeeBuilder implements EmployeeBuilder {

    private final FullTimeEmployee employee;
    
    public FullTimeEmployeeBuilder() {
        this.employee = new FullTimeEmployee();
    }
    
    @Override
    public EmployeeBuilder setId(int id) {
        this.employee.setId(id);
        return this;
    }
    
    @Override
    public EmployeeBuilder setName(String name) {
        this.employee.setName(name);
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        this.employee.setDepartment(department);
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        this.employee.setRole(role);
        return this;
    }

    @Override
    public EmployeeBuilder setWorkingHours(int workingHours) {
        this.employee.setWorkingHours(workingHours);
        return this;
    }

    @Override
    public EmployeeBuilder setSalary(int salary) {
        this.employee.setSalary(salary);
        return this;
    }

    @Override
    public Employee build() {
        return employee;
    }
    
    
}
