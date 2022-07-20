import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Kieran", 1234, 20000, "Sales");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(100.00);
        assertEquals(20100, manager.getSalary());
    }

    @Test
    public void cantRaiseByMinus(){
        manager.raiseSalary(-100);
        assertEquals(20000, manager.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(200, manager.getBonus(), 0.0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Jimmy");
        assertEquals("Jimmy", manager.getName());
    }

    @Test
    public void nameCantBeNull(){
        manager.setName("");
        assertEquals("invalid name", manager.getName());
    }


}
