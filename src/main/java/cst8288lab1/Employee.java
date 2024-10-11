/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 * An Employee object class with parameters of id, name, department,
 * role, working hours and salary. The class contains getters, setters
 * and three abstract methods to be implemented by the subclasses.
 *
 * @author matt_
 */
public abstract class Employee {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private int salary;

    /**
     * Setter for the id parameter
     * @param id, an int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for the id parameter
     * @return this.id, an int
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for the name parameter
     * @param name, a String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the name parameter
     * @return this.name, a String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for the department parameter
     * @param department, a String
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Getter for the department parameter
     * @return this.department, a String
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * Setter for the role parameter
     * @param role, a String
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Getter for the role parameter
     * @return this.role, a String
     */
    public String getRole() {
        return this.role;
    }

    /**
     * Setter for the salary parameter
     * @param salary, an int
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Getter for the salary parameter
     * @return this.salary, an int
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * Setter for the workingHours parameter
     * @param workingHours, an int
     */
    public void setWorkingHours(int workingHours) {
        this.workingHoursPerWeek = workingHours;
    }

    /**
     * Getter for the workingHours parameter
     * @return this.workingHoursPerWeek, an int
     */
    public int getWorkingHours() {
        return this.workingHoursPerWeek;
    }

    /**
     * Overridden toString method for printing an Employee's
     * information.
     * @return a String
     */
    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nJob Title: %s\nDepartment: %s\nWorking Hours per Week: %d\nSalary: $%d\n\n", this.getId(), this.getName(), this.getRole(), this.getDepartment(), this.getWorkingHours(), this.getSalary());
    }

    /**
     * Abstract method that allows the subclass to determine
     * how its employees clock in.
     */
    public abstract void clockIn();

    /**
     * Abstract method that allows the subclass to determine
     * how its employees clock out.
     */
    public abstract void clockOut();

    /**
     * Abstract method that allows the subclass to determine
     * how to track its employees' working hours.
     */
    public abstract void trackWorkHours();
}
