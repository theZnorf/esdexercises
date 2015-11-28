package randoopFailures;

import junit.framework.*;

public class RingBufferMutantTest_failure_3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest_failure_3.test1");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();

  }

}
