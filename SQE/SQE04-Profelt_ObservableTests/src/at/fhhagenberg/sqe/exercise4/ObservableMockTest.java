/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise4;

import static org.easymock.EasyMock.mock;
import static org.easymock.EasyMock.replay;

import java.util.Observer;

import org.junit.Before;
import org.junit.Test;

public class ObservableMockTest {

    // Dummy object
    MyObservable observable;

    // Mock
    Observer mock;

    @Before
    public void setUp() throws Exception {
        // create dummy object
        observable = new MyObservable();
        // create mock
        mock = mock(Observer.class);
        // register mock
        observable.addObserver(mock);
    }

    @Test
    public void testNotifyObservers() {
        final int data = 42;
        // record expected notification
        mock.update(observable, data);
        // activate mock
        replay(mock);

        // mark observable as changed
        observable.change();
        // notify observer
        observable.notifyObservers(data);
    }

}
