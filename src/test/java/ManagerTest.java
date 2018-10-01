import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Joe", "AB123456A", 20000.50,"Payroll");
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

    @Test
    public void canGetSalary() {
        assertEquals(20000.50, manager.getSalary(), 1);
    }

    @Test
    public void canSetSalary() {
        manager.setSalary(21050.50);
        assertEquals(21050.50, manager.getSalary(), 1);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(20001.50, manager.raiseSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, manager.payBonus(), 1);
    }

    @Test
    public void getDeptName() {
        assertEquals("Payroll", manager.getDeptName());
    }

    @Test
    public void setDeptName() {
        manager.setDeptName("Marketing");
        assertEquals("Marketing", manager.getDeptName());
    }
}
