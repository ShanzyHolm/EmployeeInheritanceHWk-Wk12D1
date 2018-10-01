import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Joe", "AB123456A", 20000,"Payroll");
    }

    @Test
    public void canGetName() {
        assertEquals("Joe", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("Sue");
        assertEquals("Sue", manager.getName());
    }
}
