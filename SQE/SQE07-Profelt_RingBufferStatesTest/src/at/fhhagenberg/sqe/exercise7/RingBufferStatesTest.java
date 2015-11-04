/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise7;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RingBufferStatesTest {

    private enum RingBufferState {
        Empty, Filled, Full
    }

    private RingBufferState getState(RingBuffer buffer) {
        if (buffer.isFull())
            return RingBufferState.Full;
        if (buffer.isEmpty())
            return RingBufferState.Empty;

        return RingBufferState.Filled;
    }
    
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    
    @Test
    public void testCreateBuffer() {
        final int capacity = 2;
        
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        assertNotNull(buffer);
        assertEquals(RingBufferState.Empty, getState(buffer));
    }
    
    @Test
    public void testAddAndRemoveItem() {
        final int capacity = 2;
        Integer A = 1;
        
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        assertNotNull(buffer);
        assertEquals(RingBufferState.Empty, getState(buffer));
        
        buffer.enqueue(A);
        assertEquals(RingBufferState.Filled, getState(buffer));
        
        assertEquals(A, buffer.dequeue());
        assertEquals(RingBufferState.Empty, getState(buffer));
        
    }
    
    @Test
    public void testAddTwoItems() {
        final int capacity = 3;
        Integer A = 1, B = 2;
        
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        assertNotNull(buffer);
        assertEquals(RingBufferState.Empty, getState(buffer));
        
        buffer.enqueue(A);
        assertEquals(RingBufferState.Filled, getState(buffer));
        
        buffer.enqueue(B);
        assertEquals(RingBufferState.Filled, getState(buffer));
    }
    
    @Test
    public void testAddTwoItemsAndRemoveOne() {
        final int capacity = 3;
        Integer A = 1, B = 2;
        
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        assertNotNull(buffer);
        assertEquals(RingBufferState.Empty, getState(buffer));
        
        buffer.enqueue(A);
        assertEquals(RingBufferState.Filled, getState(buffer));
        
        buffer.enqueue(B);
        assertEquals(RingBufferState.Filled, getState(buffer));
        
        assertEquals(A, buffer.dequeue());
        assertEquals(RingBufferState.Filled, getState(buffer));
    }
    
    @Test
    public void testFillWithTwoItemsAndRemoveOne() {
        final int capacity = 2;
        Integer A = 1, B = 2;
        
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        assertNotNull(buffer);
        assertEquals(RingBufferState.Empty, getState(buffer));
        
        buffer.enqueue(A);
        assertEquals(RingBufferState.Filled, getState(buffer));
        
        buffer.enqueue(B);
        assertEquals(RingBufferState.Full, getState(buffer));
        
        assertEquals(A, buffer.dequeue());
        assertEquals(RingBufferState.Filled, getState(buffer));
    }
    
    @Test
    public void testDequeueFromEmptyBuffer() {
        final int capacity = 2;
        
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        assertNotNull(buffer);
        assertEquals(RingBufferState.Empty, getState(buffer));
        
        exception.expect(RuntimeException.class);
        exception.expectMessage("Ring buffer underflow");
        
        buffer.dequeue();
    }
    
    @Test
    public void testEnqueueInFullBuffer() {
        final int capacity = 1;
        Integer A = 1, B = 2;
        
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        assertNotNull(buffer);
        assertEquals(RingBufferState.Empty, getState(buffer));
        
        buffer.enqueue(A);
        assertEquals(RingBufferState.Full, getState(buffer));
        
        exception.expect(RuntimeException.class);
        exception.expectMessage("Ring buffer overflow");
        
        buffer.enqueue(B);
    }

}
