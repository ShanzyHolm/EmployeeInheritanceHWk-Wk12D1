import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Joe", "AB123456A", 20000.50);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void canSetName() {
        developer.setName("Sue");
        assertEquals("Sue", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB123456A", developer.getNINumber());
    }

    @Test
    public void canSetNINumber() {
        developer.setNINumber("ZY987654Z");
        assertEquals("ZY987654Z", developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000.50, developer.getSalary(), 1);
    }

    @Test
    public void canSetSalary() {
        developer.setSalary(21050.50);
        assertEquals(21050.50, developer.getSalary(), 1);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(20001.50, developer.raiseSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, developer.payBonus(), 1);
    }
}
