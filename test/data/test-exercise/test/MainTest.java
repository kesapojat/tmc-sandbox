import fi.helsinki.cs.tmc.testrunner.Points;
import org.junit.Test;
import static org.junit.Assert.*;

@Points("1.1")
public class MainTest {

    @Test
    public void testStuff() {
        assertEquals(2, Main.f(1, 1));
        assertEquals(7, Main.f(3, 4));
    }  
}
