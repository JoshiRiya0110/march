import org.example.Practice;
import org.junit.Test;
import static org.junit.Assert.*;
public class PracticeTest {
    @Test
    public void testSum(){
        assertEquals(9, Practice.sum(4,5));
    }

    @Test
    public void testMul(){
        assertEquals(15,Practice.multiply(3,5));
    }

}
