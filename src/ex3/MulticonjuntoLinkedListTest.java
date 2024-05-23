package ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MulticonjuntoLinkedListTest {
    @Test
    public void testAdd() {
        MulticonjuntoLinkedList<String> multiconjunto = new MulticonjuntoLinkedList<>();
        multiconjunto.add("a");
        multiconjunto.add("b");
        multiconjunto.add("a");
        assertEquals("[a, b, a]", multiconjunto.getElements().toString());
    }

    @Test
    public void testEquals() {
        MulticonjuntoLinkedList<String> multiconjunto1 = new MulticonjuntoLinkedList<>();
        multiconjunto1.add("a");
        multiconjunto1.add("b");
        
        MulticonjuntoLinkedList<String> multiconjunto2 = new MulticonjuntoLinkedList<>();
        multiconjunto2.add("a");
        multiconjunto2.add("b");
        
        assertTrue(multiconjunto1.equals(multiconjunto2));
        
        multiconjunto2.add("c");
        assertFalse(multiconjunto1.equals(multiconjunto2));
    }

    @Test
    public void testAddAll() {
        MulticonjuntoLinkedList<String> multiconjunto1 = new MulticonjuntoLinkedList<>();
        multiconjunto1.add("a");
        multiconjunto1.add("b");
        
        MulticonjuntoLinkedList<String> multiconjunto2 = new MulticonjuntoLinkedList<>();
        multiconjunto2.add("c");
        multiconjunto2.add("d");
        
        multiconjunto1.addAll(multiconjunto2);
        assertEquals("[a, b, c, d]", multiconjunto1.getElements().toString());
    }
}
