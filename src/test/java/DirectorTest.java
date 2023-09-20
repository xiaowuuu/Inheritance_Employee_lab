import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;
    @Before
    public void before(){
        director = new Director("Erlich Backman", "L546765342", 1600, "Business",300);
    }
    @Test
    public void hasName(){
        assertEquals("Erlich Backman", director.getName());
    }
    @Test
    public void hasNiNumber(){
        assertEquals("L546765342", director.getNiNumber());
    }
    @Test
    public void hasDepartmentName(){
        assertEquals("Business", director.getDeptName());
    }
    @Test
    public void hasBudget(){
        assertEquals(300, director.getBudget(), 0.0);
    }


}
