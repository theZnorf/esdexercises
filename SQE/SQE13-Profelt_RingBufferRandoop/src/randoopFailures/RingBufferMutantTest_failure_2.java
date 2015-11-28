package randoopFailures;

import junit.framework.*;

public class RingBufferMutantTest_failure_2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest_failure_2.test1");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();

  }

}
