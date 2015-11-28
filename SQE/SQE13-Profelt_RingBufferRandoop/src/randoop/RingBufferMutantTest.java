package randoop;
import junit.framework.*;
import junit.textui.*;

public class RingBufferMutantTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RingBufferMutantTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RingBufferMutantTest0.class));
    result.addTest(new TestSuite(RingBufferMutantTest1.class));
    result.addTest(new TestSuite(RingBufferMutantTest2.class));
    result.addTest(new TestSuite(randoopFailures.RingBufferMutantTest_failure_1.class));
    result.addTest(new TestSuite(randoopFailures.RingBufferMutantTest_failure_2.class));
    result.addTest(new TestSuite(randoopFailures.RingBufferMutantTest_failure_3.class));
    return result;
  }

}
