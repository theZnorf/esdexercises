/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise4;

import java.util.Observable;
import java.util.Observer;

/**
 * Dummy Observer class, implements Observer and saves the observable and the
 * argument in fields
 */
public class DummyObserver implements Observer {

    // Member
    private Observable observable;
    private Object argument;
    private int counter = 0;

    /**
     * Getter for observable of latest update
     * 
     * @return Observable object
     */
    public Observable getObservable() {
        return observable;
    }

    /**
     * Getter for argument of latest update
     * 
     * @return argument update
     */
    public Object getArgument() {
        return argument;
    }

    /**
     * Getter for internal notification counter
     * 
     * @return current number of received notifications
     */
    public int getCounter() {
        return counter;
    }

    /**
     * Implemented update method of Observer
     */
    @Override
    public void update(Observable o, Object arg) {
        // save observable and argument
        observable = o;
        argument = arg;

        // increase internal notification counter
        counter++;
    }
}