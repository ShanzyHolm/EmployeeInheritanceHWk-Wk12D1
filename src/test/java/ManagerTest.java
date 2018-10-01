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

    @Test
    public void canGetNINumber() {
        assertEquals("AB123456A", manager.getNINumber());
    }

    @Test
    public void canSetNINumber() {
        manager.setNINumber("ZY987654Z");
        assertEquals("ZY987654Z", manager.getNINumber());
    }
}
