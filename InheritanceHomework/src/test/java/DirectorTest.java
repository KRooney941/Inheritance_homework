import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director ("Sarah", 656565, 25000, "Sales", 10000);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(100.00);
        assertEquals(25100, director.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(500, director.getBonus(), 0.0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(10000, director.getBudget(), 0.0);
    }

}
