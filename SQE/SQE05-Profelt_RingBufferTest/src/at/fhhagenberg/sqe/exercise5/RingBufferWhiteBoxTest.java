package at.fhhagenberg.sqe.exercise5;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RingBufferWhiteBoxTest {

    static final int capacity = 10;
    
    // Member
    RingBuffer<Integer> buffer;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void SetUp() {
        buffer = new RingBuffer<Integer>(capacity);
    }
    
    @Test
    public void testRingBufferIteratorRemoveException() {
        Iterator<Integer> iter = buffer.iterator();
        
        // set exception
        exception.expect(UnsupportedOperationException.class);
        
        iter.remove();
    }

}
