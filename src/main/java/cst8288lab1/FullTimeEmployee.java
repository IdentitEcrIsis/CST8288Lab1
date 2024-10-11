/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 * A subclass of Employee, this class implements the abstract methods
 * in the case of the Employee working full-time.
 *
 * @author matt_
 */
public class FullTimeEmployee extends Employee {

    /**
     * no-arg constructor
     */
    public FullTimeEmployee() {
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
        System.out.println(this.getName() + " is overworked. They deserve a nice vacation.");
    }

    /**
     * Overridden toString method for formatting how the employee's information
     * is written to the console.
     * @return a String
     */
    @Override
    public String toString() {
        return "Employment type: Full-Time\n" + super.toString();
    }
    
}
