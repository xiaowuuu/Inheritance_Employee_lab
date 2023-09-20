import org.junit.Before;
import org.junit.Test;
import tech.staff.DatabaseAdmin;
import tech.staff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
    Developer developer;
    @Before
    public void before(){
        developer = new Developer("Richard Hendricks", "L5657435346", 4400.00);
    }
    @Test
    public void hasNiNumber(){
        assertEquals("L5657435346", developer.getNiNumber());
    }
    @Test
    public void hasName(){
        assertEquals("Richard Hendricks", developer.getName());
    }
    @Test
    public void hasSalary(){
        assertEquals(4400.00, developer.getSalary());
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(300);
        assertEquals(4700.00, developer.getSalary());
    }
    @Test
    public void canGetBonus(){
        assertEquals(44.0, developer.payBonus());
    }
}
