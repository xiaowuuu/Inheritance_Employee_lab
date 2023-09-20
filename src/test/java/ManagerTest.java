import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;
    @Before
    public void before(){
        manager = new Manager("name", "L123455777", 1200, "nurse");
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10.0);
        assertEquals(1210.0, manager.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(1212, manager.payBonus(), 0.0 );
    }

}
