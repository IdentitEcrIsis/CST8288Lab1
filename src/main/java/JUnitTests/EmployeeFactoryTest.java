package JUnitTests;

import cst8288lab1.Employee;
import cst8288lab1.EmployeeFactory;
import cst8288lab1.FullTimeEmployee;
import cst8288lab1.PartTimeEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class EmployeeFactoryTest {

    @Test
    public void testEmployeeFactory() {
        EmployeeFactory factory = new EmployeeFactory();

        assertInstanceOf(PartTimeEmployee.class, factory.hireEmployee("Part Time"));
        assertInstanceOf(FullTimeEmployee.class, factory.hireEmployee("Full Time"));

    }
}
