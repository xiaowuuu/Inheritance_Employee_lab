import org.junit.Before;
import org.junit.Test;
import tech.staff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jian Yang", "L565758", 1000.00);
    }
    @Test
    public void hasNiNumber(){
        assertEquals("L565758", databaseAdmin.getNiNumber());
    }
    @Test
    public void hasName(){
        assertEquals("Jian Yang", databaseAdmin.getName());
    }
    @Test
    public void hasSalary(){
        assertEquals(1000.00, databaseAdmin.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(100);
        assertEquals(1100.00, databaseAdmin.getSalary());
    }
    @Test
    public void canGetBonus(){
        assertEquals(10.0, databaseAdmin.payBonus());
    }
}
