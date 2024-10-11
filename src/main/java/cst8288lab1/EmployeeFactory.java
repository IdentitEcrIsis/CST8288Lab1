/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288lab1;

/**
 * The EmployeeFactory class takes in a String which the
 * class uses to determine what type of Employee to create.
 *
 * @author matt_
 */
public class EmployeeFactory {
    EmployeeBuilder builder;

    /**
     * This method takes in a String which it uses to determine
     * whether to build a part-time or full-time employee. Once
     * determined, it instantiates a builder of the specified type
     * and then creates an employee of that type.
     *
     * @param type, a String
     * @return an Employee
     */
    public Employee hireEmployee(String type) {
        switch (type) {
            case "Part Time" -> {
                builder = new PartTimeEmployeeBuilder();
                builder.setId(4).setName("John Doe").setDepartment("Reception").setRole("Clerk").setWorkingHours(25).setSalary(45000);
            }
            case "Full Time" -> {
                builder = new FullTimeEmployeeBuilder();
                builder.setId(5).setName("Jane Smith").setDepartment("Engineering").setRole("Engineer").setWorkingHours(40).setSalary(85000);
            }
            // Throw an exception if the passed parameter is not either 'part time' or 'full time'
            default -> throw new IllegalArgumentException("Please choose either 'Part Time' or 'Full Time'");
        }

        // use the builder to create an employee, then return it
        return builder.build();
    }
    
}
