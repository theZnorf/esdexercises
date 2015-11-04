/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RingBufferIteratorStatesTest {

    private static final int capacity = 3;

    private enum RingBufferIteratorState {
        BeforeElement, AtLastElement
    }

    private RingBufferIteratorState getState(Iterator iter) {
        return (iter.hasNext()) ? RingBufferIteratorState.BeforeElement
                : RingBufferIteratorState.AtLastElement;
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void testCreateAtLast() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.AtLastElement, getState(iter));
    }

    @Test
    public void testCreateBeforeElement() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        buffer.enqueue(1);

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.BeforeElement, getState(iter));
    }

    @Test
    public void testProceedToLastElement() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        Integer A = 1;
        buffer.enqueue(A);

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.BeforeElement, getState(iter));

        assertEquals(A, iter.next());
        assertEquals(RingBufferIteratorState.AtLastElement, getState(iter));
    }

    @Test
    public void testProceedToNextAndToLastElement() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        Integer A = 1, B = 2;
        buffer.enqueue(A);
        buffer.enqueue(B);

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.BeforeElement, getState(iter));

        assertEquals(A, iter.next());
        assertEquals(RingBufferIteratorState.BeforeElement, getState(iter));

        assertEquals(B, iter.next());
        assertEquals(RingBufferIteratorState.AtLastElement, getState(iter));
    }

    @Test
    public void testEnqueueItem() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        Integer A = 1;

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.AtLastElement, getState(iter));

        buffer.enqueue(A);

        assertEquals(RingBufferIteratorState.BeforeElement, getState(iter));
    }

    @Test
    public void testDequeueItem() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        Integer A = 1;
        buffer.enqueue(A);

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.BeforeElement, getState(iter));

        buffer.dequeue();

        assertEquals(RingBufferIteratorState.AtLastElement, getState(iter));
    }

    @Test
    public void testRemoveBeforeElement() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);
        Integer A = 1;
        buffer.enqueue(A);

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.BeforeElement, getState(iter));

        exception.expect(UnsupportedOperationException.class);

        iter.remove();
    }

    @Test
    public void testRemoveAtLastElement() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.AtLastElement, getState(iter));

        exception.expect(UnsupportedOperationException.class);

        iter.remove();
    }

    @Test
    public void testProceedOverBuffer() {
        RingBuffer<Integer> buffer = new RingBuffer<>(capacity);

        Iterator<Integer> iter = buffer.iterator();

        assertNotNull(iter);
        assertEquals(RingBufferIteratorState.AtLastElement, getState(iter));

        exception.expect(NoSuchElementException.class);

        iter.next();
    }

}
