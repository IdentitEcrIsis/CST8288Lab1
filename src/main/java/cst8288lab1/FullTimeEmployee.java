/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 *
 * @author matt_
 */
public class FullTimeEmployee extends Employee {
    
    public FullTimeEmployee() {
        super();
    }
    
    @Override
    public void clockIn() {
        System.out.println(this.getName() + " has clocked in.");
    }

    @Override
    public void clockOut() {
        System.out.println(this.getName() + " has clocked out.");
    }

    @Override
    public void trackWorkHours() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String toString() {
        return "Employment type: Full-Time\n" + super.toString();
    }
    
}
