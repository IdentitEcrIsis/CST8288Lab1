/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 * EmployeeDirector class is in charge of creating different types
 * of employees based on the type of Builder that is passed.
 *
 * @author matt_
 */
public class EmployeeDirector {

    /**
     * This method builds an Employee based on the Builder parameter
     * which it is passed.
     *
     * @return an Employee
     */
    public Employee hire(EmployeeBuilder builder) {
        return builder
                .setId(69)
                .setName("Dolly the Sheep")
                .setRole("QA Test Subject")
                .setDepartment("Product Testing")
                .setWorkingHours(15)
                .setSalary(25000).build();
    }
}
