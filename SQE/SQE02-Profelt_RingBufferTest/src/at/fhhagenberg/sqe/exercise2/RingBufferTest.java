/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise2;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RingBufferTest {

    static final int capacity = 10;
    static final Integer[] testData = {0, 1, 2};
    
    // Member
    RingBuffer<Integer> buffer;
    
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    
    @Before
    public void setUp() throws Exception {
        // create buffer
        buffer = new RingBuffer<>(capacity);
        
        // add testdata
        for (Integer i : testData)
            buffer.enqueue(i);
    }

    @Test
    public void testAddingThreeRandomElements() {
        // generate test elements
        Random r = new Random();
        Integer[] elements = {r.nextInt(), r.nextInt(), r.nextInt()};
        
        // add elements to buffer
        for (int i = 0; i < elements.length; i++) {
            // check size
            assertEquals(testData.length + i, buffer.size());
            
            // enqueue item
            buffer.enqueue(elements[i]);
        }
        
        // check size
        assertEquals(testData.length + elements.length, buffer.size());
    }

    @Test
    public void testRemovingAllTestData() {
                
        // remove all elements from buffer
        for (int i = 0; i < testData.length; i++) {
            // check size
            assertEquals(testData.length -i, buffer.size());
            
            // dequeue element
            assertEquals(testData[i], buffer.dequeue());    
        }
        
        // check size and empty method
        assertEquals(0, buffer.size());
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testExeedingCapacity() {
        // fill buffer
        for (int i = 0; i < capacity - testData.length; i++) {
            // check size
            assertEquals(testData.length + i, buffer.size());
            
            // enqueue element
            buffer.enqueue(i);
        }
        
        // check size
        assertEquals(capacity, buffer.size());

        // set expected exception
        exception.expect(RuntimeException.class);
        exception.expectMessage("Ring buffer overflow");
        
        // add another element
        buffer.enqueue(0);
    }
    
    @Test
    public void testIteratingOverTestDataAndExeedingIterator() {
        Iterator<Integer> iter = buffer.iterator();
        
        // check iterator
        assertNotNull(iter);
        
        // iterate over all items
        for (int i = 0; i < testData.length; i++) {
            
            // check has next
            assertTrue(iter.hasNext());
            
            // check value
            assertEquals(testData[i], iter.next());
        }
        
        // check has next
        assertFalse(iter.hasNext());
        
        // set expected exception
        exception.expect(NoSuchElementException.class);
        // call next
        iter.next();
    }
}
