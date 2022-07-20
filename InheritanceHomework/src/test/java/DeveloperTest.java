import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sally", 2222, 19000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(100.00);
        assertEquals(19100, developer.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(190, developer.getBonus(), 0.0);
    }
}
