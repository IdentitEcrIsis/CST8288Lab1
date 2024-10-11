package JUnitTests;

import cst8288lab1.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class EmployeeDirectorTest {

    @Test
    public void testEmployeeDirector() {
        EmployeeDirector director = new EmployeeDirector();
        PartTimeEmployeeBuilder ptBuilder = new PartTimeEmployeeBuilder();
        FullTimeEmployeeBuilder ftBuilder = new FullTimeEmployeeBuilder();

        assertInstanceOf(PartTimeEmployee.class, director.hire(ptBuilder));
        assertInstanceOf(FullTimeEmployee.class, director.hire(ftBuilder));
    }
}
