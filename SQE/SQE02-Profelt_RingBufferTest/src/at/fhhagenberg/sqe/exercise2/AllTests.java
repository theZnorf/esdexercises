package at.fhhagenberg.sqe.exercise2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmptyRingBufferTest.class, RingBufferTest.class })
public class AllTests {

}
