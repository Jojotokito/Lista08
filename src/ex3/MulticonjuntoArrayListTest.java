package ex3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MulticonjuntoArrayListTest {
    @Test
    public void testAdd() {
        MulticonjuntoArrayList<String> multiconjunto = new MulticonjuntoArrayList<>();
        multiconjunto.add("a");
        multiconjunto.add("b");
        multiconjunto.add("a");
        assertEquals("[a, b, a]", multiconjunto.getElements().toString());
    }

    @Test
    public void testEquals() {
        MulticonjuntoArrayList<Integer> multiconjunto1 = new MulticonjuntoArrayList<>();
        multiconjunto1.add(1);
        multiconjunto1.add(2);
        
        MulticonjuntoArrayList<Integer> multiconjunto2 = new MulticonjuntoArrayList<>();
        multiconjunto2.add(1);
        multiconjunto2.add(2);
        
        assertTrue(multiconjunto1.equals(multiconjunto2));
        
        multiconjunto2.add(3);
        assertFalse(multiconjunto1.equals(multiconjunto2));
    }

    @Test
    public void testAddAll() {
        MulticonjuntoArrayList<String> multiconjunto1 = new MulticonjuntoArrayList<>();
        multiconjunto1.add("a");
        multiconjunto1.add("b");
        
        MulticonjuntoArrayList<String> multiconjunto2 = new MulticonjuntoArrayList<>();
        multiconjunto2.add("c");
        multiconjunto2.add("d");
        
        multiconjunto1.addAll(multiconjunto2);
        assertEquals("[a, b, c, d]", multiconjunto1.getElements().toString());
    }
}
