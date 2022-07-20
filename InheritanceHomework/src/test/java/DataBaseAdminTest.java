import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {
        DatabaseAdmin databaseAdmin;

        @Before
        public void before(){
            databaseAdmin = new DatabaseAdmin("John", 7777, 18000);
        }

        @Test
        public void canRaiseSalary(){
            databaseAdmin.raiseSalary(100.00);
            assertEquals(18100, databaseAdmin.getSalary());
        }

        @Test
        public void canGetBonus(){
            assertEquals(180, databaseAdmin.getBonus(), 0.0);
        }
    }
