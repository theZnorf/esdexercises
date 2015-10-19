/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise4;

import java.util.Observable;

/**
 * Minimal Implementation of Observable for providing public access to
 * setChanged
 */
public class MyObservable extends Observable {
    /**
     * public method for marking observable as changed
     */
    public void change() {
        setChanged();
    }
}