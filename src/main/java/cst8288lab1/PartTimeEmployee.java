/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 * A subclass of Employee, this class implements the abstract methods
 * in the case of the Employee working part-time.
 *
 * @author matt_
 */
public class PartTimeEmployee extends Employee {

    /**
     * no-arg constructor
     */
    public PartTimeEmployee() {
        super();
    }

    /**
     * Overridden clock-in method
     */
    @Override
    public void clockIn() {
        System.out.println(this.getName() + " has clocked in.");
    }

    /**
     * Overridden clock-out method
     */
    @Override
    public void clockOut() {
        System.out.println(this.getName() + " has clocked out.");
    }

    /**
     * Overridden trackWorkHours method
     */
    @Override
    public void trackWorkHours() {
        System.out.println(this.getName() + " wants more working hours.");
    }

    /**
     * Overridden toString method for formatting how the employee's information
     * is written to the console.
     * @return a String
     */
    @Override
    public String toString() {
        return "Employment type: Part-Time\n" + super.toString();
    }
    
    
    
}
