import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Joe", "AB123456A", 20000.50,"Payroll", 5000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe", director.getName());
    }

    @Test
    public void canSetName() {
        director.setName("Sue");
        assertEquals("Sue", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB123456A", director.getNINumber());
    }

    @Test
    public void canSetNINumber() {
        director.setNINumber("ZY987654Z");
        assertEquals("ZY987654Z", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000.50, director.getSalary(), 1);
    }

    @Test
    public void canSetSalary() {
        director.setSalary(21050.50);
        assertEquals(21050.50, director.getSalary(), 1);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(20001.50, director.raiseSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, director.payBonus(), 1);
    }

    @Test
    public void getDeptName() {
        assertEquals("Payroll", director.getDeptName());
    }

    @Test
    public void setDeptName() {
        director.setDeptName("Marketing");
        assertEquals("Marketing", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(5000.00, director.getBudget(), 1);
    }

    @Test
    public void canSetBudget() {
        director.setBudget(7500.00);
        assertEquals(7500.00, director.getBudget(), 1);
    }
}
