package at.fhhagenberg.sqe.exercise13;

import java.util.Iterator;

public class RingBufferWrapper<Item> implements Iterable<Item> {
    RingBuffer<Item> buffer;


    public RingBufferWrapper(int capacity) {
        buffer = new RingBuffer<>(capacity);
        
        assert buffer != null;
        assert buffer.isEmpty();
    }
    
    public void enqueue(Item item) {
        int sizeBefore = buffer.size();
        
        buffer.enqueue(item);
        
        assert buffer.size() == (sizeBefore +1);
    }

    public Item dequeue() {
        int sizeBefore = buffer.size();
        
        Item result = buffer.dequeue();
        
        assert buffer.size() == (sizeBefore - 1);
        return result;
    }

    public boolean isEmpty() {
        return buffer.isEmpty();
    }

    public int size() {
        return buffer.size();
    }

    public Iterator<Item> iterator() {
        return buffer.iterator();
    }

}
