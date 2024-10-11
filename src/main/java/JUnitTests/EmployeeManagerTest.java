package JUnitTests;

import cst8288lab1.EmployeeManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class EmployeeManagerTest {

    @Test
    public void testEmployeeManager() {
        EmployeeManager manager1 = EmployeeManager.getInstance();
        EmployeeManager manager2 = EmployeeManager.getInstance();

        assertSame(manager1, manager2);
    }
}
