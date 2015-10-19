/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ObservableStubTest {

    // Dummy Objects
    DummyObserver observer;
    MyObservable observable;
    
    @Before
    public void setUp() throws Exception {
        // create dummy objects
        observer = new DummyObserver();
        observable = new MyObservable();
        
        // register observer
        observable.addObserver(observer);
    }

    @Test
    public void testNotifyObservers() {
        final Integer data = 42;
        
        // check initial observer
        assertNull(observer.getObservable());
        assertNull(observer.getArgument());
        assertEquals(0, observer.getCounter());
        
        // mark observable as changed
        observable.change();
        // notify observer
        observable.notifyObservers(data);
        
        // check observer
        assertEquals(observable, observer.getObservable());
        assertEquals(data, observer.getArgument());
        assertEquals(1, observer.getCounter());
    }
    
}
