package at.fhhagenberg.sqe.exercise2;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EmptyRingBufferTest {

    static final int capacity = 10;
    
    // Member
    RingBuffer<Integer> buffer;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void setUp() throws Exception {
        // create buffer
        buffer = new RingBuffer<>(capacity);
    }

    @Test
    public void testIsEmpty() {
        // check is empty
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testSize() {
        // check size
        assertEquals(0, buffer.size());
    }

    @Test
    public void testDequeue() {
        // set expected exception
        exception.expect(RuntimeException.class);
        exception.expectMessage("Ring buffer underflow");
        buffer.dequeue();
    }

    @Test
    public void testIterator() {
        Iterator<Integer> iter = buffer.iterator();
        assertNotNull(iter);
        
        // check has next
        assertFalse(iter.hasNext());
        
        // set expected exception
        exception.expect(NoSuchElementException.class);
        // call next
        iter.next();
    }

}
