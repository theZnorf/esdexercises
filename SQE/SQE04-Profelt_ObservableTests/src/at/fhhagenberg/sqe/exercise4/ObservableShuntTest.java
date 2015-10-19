/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Observable;
import java.util.Observer;

import org.junit.Before;
import org.junit.Test;

public class ObservableShuntTest implements Observer {

    // Dummy objects
    MyObservable observable;

    // Member
    Observable receivedObservable;
    Object receivedArgument;
    int receivedNotifications;

    @Before
    public void setUp() throws Exception {
        // create dummy object
        observable = new MyObservable();
        // register observer
        observable.addObserver(this);
        // init member
        receivedObservable = null;
        receivedArgument = null;
        receivedNotifications = 0;
    }

    @Test
    public void testNotifyObservers() {
        final Integer data = 42;

        // check initial observer
        assertNull(receivedObservable);
        assertNull(receivedArgument);
        assertEquals(0, receivedNotifications);

        // mark observable as changed
        observable.change();
        // notify observer
        observable.notifyObservers(data);

        // check observer
        assertEquals(observable, receivedObservable);
        assertEquals(data, receivedArgument);
        assertEquals(1, receivedNotifications);
    }

    @Override
    public void update(Observable o, Object arg) {
        // save arguments
        receivedObservable = o;
        receivedArgument = arg;
        // increase counter
        receivedNotifications++;
    }

}
