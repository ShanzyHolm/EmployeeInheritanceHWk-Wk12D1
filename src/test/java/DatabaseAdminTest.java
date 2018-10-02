import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
        DatabaseAdmin databaseAdmin;

        @Before
        public void setUp() throws Exception {
            databaseAdmin = new DatabaseAdmin("Joe", "AB123456A", 20000.50);
        }

        @Test
        public void canGetName() {
            assertEquals("Joe", databaseAdmin.getName());
        }

        @Test
        public void canSetName() {
            databaseAdmin.setName("Sue");
            assertEquals("Sue", databaseAdmin.getName());
        }

        @Test
        public void canGetNINumber() {
            assertEquals("AB123456A", databaseAdmin.getNINumber());
        }

        @Test
        public void canSetNINumber() {
            databaseAdmin.setNINumber("ZY987654Z");
            assertEquals("ZY987654Z", databaseAdmin.getNINumber());
        }

        @Test
        public void canGetSalary() {
            assertEquals(20000.50, databaseAdmin.getSalary(), 1);
        }

        @Test
        public void canSetSalary() {
            databaseAdmin.setSalary(21050.50);
            assertEquals(21050.50, databaseAdmin.getSalary(), 1);
        }

        @Test
        public void canRaiseSalary() {
            assertEquals(20001.50, databaseAdmin.raiseSalary(), 0);
        }

        @Test
        public void canPayBonus() {
            assertEquals(200, databaseAdmin.payBonus(), 1);
        }

}


