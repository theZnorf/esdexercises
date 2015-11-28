package randoop;

import junit.framework.*;

public class RingBufferWrapperTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test1");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var11 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    java.util.Iterator var12 = var11.iterator();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    java.util.Iterator var15 = var1.iterator();
    java.lang.Object var16 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test2");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var17 = var1.iterator();
    boolean var18 = var1.isEmpty();
    java.lang.Object var19 = var1.dequeue();
    java.util.Iterator var20 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test3");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    boolean var12 = var1.isEmpty();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test4");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var7 = var6.size();
    boolean var8 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    int var10 = var6.size();
    boolean var11 = var6.isEmpty();
    java.util.Iterator var12 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test5");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    int var10 = var7.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    var7.enqueue((java.lang.Object)var12);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    java.lang.Object var23 = var17.dequeue();
    boolean var24 = var17.isEmpty();
    int var25 = var17.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var30 = var27.iterator();
    var27.enqueue((java.lang.Object)(byte)1);
    boolean var33 = var27.isEmpty();
    boolean var34 = var27.isEmpty();
    int var35 = var27.size();
    java.lang.Object var36 = var27.dequeue();
    var17.enqueue((java.lang.Object)var27);
    java.lang.Object var38 = var17.dequeue();
    var12.enqueue((java.lang.Object)var17);
    var1.enqueue((java.lang.Object)var17);
    int var41 = var17.size();
    boolean var42 = var17.isEmpty();
    boolean var43 = var17.isEmpty();
    boolean var44 = var17.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 1.0d+ "'", var36.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test6");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var15 = var9.isEmpty();
    boolean var16 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    var9.enqueue((java.lang.Object)var18);
    java.lang.Object var22 = var9.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var24 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var25 = var24.size();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    var9.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '#'+ "'", var22.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test7");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test8");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    java.util.Iterator var15 = var1.iterator();
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    java.lang.Object var19 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '4'+ "'", var19.equals('4'));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test9");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var16 = var7.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var19 = var18.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var21 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    java.util.Iterator var26 = var21.iterator();
    boolean var27 = var21.isEmpty();
    java.util.Iterator var28 = var21.iterator();
    java.util.Iterator var29 = var21.iterator();
    var18.enqueue((java.lang.Object)var21);
    var7.enqueue((java.lang.Object)var21);
    boolean var32 = var7.isEmpty();
    int var33 = var7.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 3);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test10");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    java.util.Iterator var12 = var7.iterator();
    boolean var13 = var7.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var15 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var15.enqueue((java.lang.Object)'#');
    int var18 = var15.size();
    java.util.Iterator var19 = var15.iterator();
    var7.enqueue((java.lang.Object)var15);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var23 = var22.iterator();
    java.util.Iterator var24 = var22.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var26 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    int var31 = var26.size();
    int var32 = var26.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var34 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var35 = var34.size();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var26.enqueue((java.lang.Object)var37);
    int var39 = var26.size();
    var22.enqueue((java.lang.Object)var26);
    var15.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var22);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var44 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var45 = var44.isEmpty();
    boolean var46 = var44.isEmpty();
    boolean var47 = var44.isEmpty();
    int var48 = var44.size();
    boolean var49 = var44.isEmpty();
    boolean var50 = var44.isEmpty();
    boolean var51 = var44.isEmpty();
    java.util.Iterator var52 = var44.iterator();
    int var53 = var44.size();
    boolean var54 = var44.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var56 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var58 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var59 = var58.size();
    int var60 = var58.size();
    java.util.Iterator var61 = var58.iterator();
    boolean var62 = var58.isEmpty();
    var56.enqueue((java.lang.Object)var58);
    var44.enqueue((java.lang.Object)var58);
    boolean var65 = var44.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.enqueue((java.lang.Object)var65);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test11");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    var1.enqueue((java.lang.Object)var11);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    boolean var19 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    int var21 = var1.size();
    java.util.Iterator var22 = var1.iterator();
    java.lang.Object var23 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    var25.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var32 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var32.enqueue((java.lang.Object)'#');
    java.util.Iterator var35 = var32.iterator();
    java.util.Iterator var36 = var32.iterator();
    var32.enqueue((java.lang.Object)false);
    int var39 = var32.size();
    var25.enqueue((java.lang.Object)var39);
    java.util.Iterator var41 = var25.iterator();
    int var42 = var25.size();
    java.lang.Object var43 = var25.dequeue();
    java.lang.Object var44 = var25.dequeue();
    boolean var45 = var25.isEmpty();
    var1.enqueue((java.lang.Object)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 1.0d+ "'", var23.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + '#'+ "'", var43.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + 100.0d+ "'", var44.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test12");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test13");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var9 = var8.iterator();
    boolean var10 = var8.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    java.util.Iterator var17 = var12.iterator();
    boolean var18 = var12.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    var20.enqueue((java.lang.Object)false);
    java.lang.Object var27 = var20.dequeue();
    java.lang.Object var28 = var20.dequeue();
    java.util.Iterator var29 = var20.iterator();
    var12.enqueue((java.lang.Object)var29);
    var8.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test14");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var15 = var9.isEmpty();
    boolean var16 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var21 = var20.size();
    int var22 = var20.size();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    var18.enqueue((java.lang.Object)var20);
    java.lang.Object var26 = var18.dequeue();
    var9.enqueue(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test15");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var17 = var16.iterator();
    java.util.Iterator var18 = var16.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    var16.enqueue((java.lang.Object)var20);
    var9.enqueue((java.lang.Object)var16);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var37 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    int var40 = var37.size();
    int var41 = var37.size();
    java.util.Iterator var42 = var37.iterator();
    int var43 = var37.size();
    var9.enqueue((java.lang.Object)var37);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var46 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var46.enqueue((java.lang.Object)'#');
    java.util.Iterator var49 = var46.iterator();
    java.util.Iterator var50 = var46.iterator();
    java.util.Iterator var51 = var46.iterator();
    boolean var52 = var46.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var54 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var54.enqueue((java.lang.Object)'#');
    int var57 = var54.size();
    java.util.Iterator var58 = var54.iterator();
    var46.enqueue((java.lang.Object)var54);
    java.util.Iterator var60 = var54.iterator();
    var9.enqueue((java.lang.Object)var60);
    java.util.Iterator var62 = var9.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var64 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var64.enqueue((java.lang.Object)'#');
    java.util.Iterator var67 = var64.iterator();
    var64.enqueue((java.lang.Object)100.0d);
    boolean var70 = var64.isEmpty();
    boolean var71 = var64.isEmpty();
    java.util.Iterator var72 = var64.iterator();
    var9.enqueue((java.lang.Object)var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test16");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test17");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var8.enqueue((java.lang.Object)'#');
    boolean var11 = var8.isEmpty();
    boolean var12 = var8.isEmpty();
    int var13 = var8.size();
    java.lang.Object var14 = var8.dequeue();
    java.util.Iterator var15 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test18");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    int var19 = var14.size();
    int var20 = var14.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var23 = var22.size();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var14.enqueue((java.lang.Object)var25);
    int var27 = var14.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var29 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var30 = var29.size();
    var14.enqueue((java.lang.Object)var30);
    var1.enqueue((java.lang.Object)var14);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var34 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var34.enqueue((java.lang.Object)'#');
    java.util.Iterator var37 = var34.iterator();
    java.util.Iterator var38 = var34.iterator();
    java.util.Iterator var39 = var34.iterator();
    boolean var40 = var34.isEmpty();
    java.util.Iterator var41 = var34.iterator();
    java.util.Iterator var42 = var34.iterator();
    var34.enqueue((java.lang.Object)1.0f);
    java.lang.Object var45 = var34.dequeue();
    java.util.Iterator var46 = var34.iterator();
    int var47 = var34.size();
    java.util.Iterator var48 = var34.iterator();
    var14.enqueue((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '#'+ "'", var45.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test19");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var14);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    java.util.Iterator var25 = var22.iterator();
    int var26 = var22.size();
    var22.enqueue((java.lang.Object)(byte)10);
    int var29 = var22.size();
    var14.enqueue((java.lang.Object)var22);
    java.lang.Object var31 = var22.dequeue();
    int var32 = var22.size();
    boolean var33 = var22.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var35.enqueue((java.lang.Object)'#');
    java.util.Iterator var38 = var35.iterator();
    var35.enqueue((java.lang.Object)100.0d);
    java.lang.Object var41 = var35.dequeue();
    java.util.Iterator var42 = var35.iterator();
    var22.enqueue((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (byte)10+ "'", var31.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + '#'+ "'", var41.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test20");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    int var24 = var17.size();
    boolean var25 = var17.isEmpty();
    int var26 = var17.size();
    java.util.Iterator var27 = var17.iterator();
    var6.enqueue((java.lang.Object)var27);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var30 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var36 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    var36.enqueue((java.lang.Object)false);
    int var43 = var36.size();
    var30.enqueue((java.lang.Object)var36);
    java.util.Iterator var45 = var36.iterator();
    var6.enqueue((java.lang.Object)var36);
    java.lang.Object var47 = var36.dequeue();
    boolean var48 = var36.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + '#'+ "'", var47.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test21");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var9 = var8.isEmpty();
    java.util.Iterator var10 = var8.iterator();
    int var11 = var8.size();
    int var12 = var8.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    java.util.Iterator var20 = var14.iterator();
    java.util.Iterator var21 = var14.iterator();
    var8.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var14);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    var25.enqueue((java.lang.Object)false);
    int var32 = var25.size();
    boolean var33 = var25.isEmpty();
    java.lang.Object var34 = var25.dequeue();
    java.lang.Object var35 = var25.dequeue();
    java.util.Iterator var36 = var25.iterator();
    var25.enqueue((java.lang.Object)'4');
    java.util.Iterator var39 = var25.iterator();
    boolean var40 = var25.isEmpty();
    java.util.Iterator var41 = var25.iterator();
    var1.enqueue((java.lang.Object)var25);
    int var43 = var1.size();
    java.lang.Object var44 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '#'+ "'", var34.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + 1.0d+ "'", var44.equals(1.0d));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test22");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    java.util.Iterator var2 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var4 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var5 = var4.iterator();
    boolean var6 = var4.isEmpty();
    int var7 = var4.size();
    boolean var8 = var4.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var10 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var11 = var10.size();
    int var12 = var10.size();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    var4.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var4);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    boolean var22 = var18.isEmpty();
    var18.enqueue((java.lang.Object)'#');
    java.lang.Object var25 = var18.dequeue();
    int var26 = var18.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var26);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test23");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var10 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    var10.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    int var24 = var17.size();
    var10.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var10.iterator();
    int var27 = var10.size();
    var1.enqueue((java.lang.Object)var10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var30 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    int var33 = var30.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var36 = var35.size();
    boolean var37 = var35.isEmpty();
    var30.enqueue((java.lang.Object)var35);
    java.lang.Object var39 = var30.dequeue();
    int var40 = var30.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var42 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var43 = var42.isEmpty();
    boolean var44 = var42.isEmpty();
    boolean var45 = var42.isEmpty();
    int var46 = var42.size();
    boolean var47 = var42.isEmpty();
    boolean var48 = var42.isEmpty();
    java.util.Iterator var49 = var42.iterator();
    var30.enqueue((java.lang.Object)var49);
    java.lang.Object var51 = var30.dequeue();
    var30.enqueue((java.lang.Object)10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var55 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var55.enqueue((java.lang.Object)'#');
    java.util.Iterator var58 = var55.iterator();
    java.util.Iterator var59 = var55.iterator();
    boolean var60 = var55.isEmpty();
    int var61 = var55.size();
    int var62 = var55.size();
    int var63 = var55.size();
    boolean var64 = var55.isEmpty();
    boolean var65 = var55.isEmpty();
    java.lang.Object var66 = var55.dequeue();
    var30.enqueue((java.lang.Object)var55);
    var55.enqueue((java.lang.Object)3);
    var10.enqueue((java.lang.Object)3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + '#'+ "'", var66.equals('#'));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test24");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var21 = var18.iterator();
    var18.enqueue((java.lang.Object)(byte)1);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    var18.enqueue((java.lang.Object)var28);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var31 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    boolean var34 = var31.isEmpty();
    int var35 = var31.size();
    boolean var36 = var31.isEmpty();
    var18.enqueue((java.lang.Object)var36);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var39 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var39.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var42 = var39.iterator();
    var39.enqueue((java.lang.Object)(byte)1);
    boolean var45 = var39.isEmpty();
    java.util.Iterator var46 = var39.iterator();
    var18.enqueue((java.lang.Object)var39);
    int var48 = var18.size();
    var1.enqueue((java.lang.Object)var18);
    java.lang.Object var50 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + '#'+ "'", var50.equals('#'));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test25");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var21 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var21.enqueue((java.lang.Object)1.0d);
    boolean var24 = var21.isEmpty();
    int var25 = var21.size();
    var1.enqueue((java.lang.Object)var21);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var28.enqueue((java.lang.Object)'#');
    java.util.Iterator var31 = var28.iterator();
    var28.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var35.enqueue((java.lang.Object)'#');
    java.util.Iterator var38 = var35.iterator();
    java.util.Iterator var39 = var35.iterator();
    var35.enqueue((java.lang.Object)false);
    int var42 = var35.size();
    var28.enqueue((java.lang.Object)var42);
    java.util.Iterator var44 = var28.iterator();
    int var45 = var28.size();
    int var46 = var28.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var48 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var49 = var48.isEmpty();
    boolean var50 = var48.isEmpty();
    java.util.Iterator var51 = var48.iterator();
    boolean var52 = var48.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var54 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var54.enqueue((java.lang.Object)'#');
    java.util.Iterator var57 = var54.iterator();
    java.util.Iterator var58 = var54.iterator();
    var54.enqueue((java.lang.Object)false);
    int var61 = var54.size();
    var48.enqueue((java.lang.Object)var54);
    java.util.Iterator var63 = var54.iterator();
    java.lang.Object var64 = var54.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var66 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var66.enqueue((java.lang.Object)'#');
    java.util.Iterator var69 = var66.iterator();
    var66.enqueue((java.lang.Object)100.0d);
    java.lang.Object var72 = var66.dequeue();
    java.util.Iterator var73 = var66.iterator();
    var54.enqueue((java.lang.Object)var73);
    int var75 = var54.size();
    var28.enqueue((java.lang.Object)var75);
    var21.enqueue((java.lang.Object)var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + '#'+ "'", var64.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + '#'+ "'", var72.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 2);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test26");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    int var15 = var1.size();
    int var16 = var1.size();
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test27");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var21 = var18.iterator();
    var18.enqueue((java.lang.Object)(byte)1);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    var18.enqueue((java.lang.Object)var28);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var31 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    boolean var34 = var31.isEmpty();
    int var35 = var31.size();
    boolean var36 = var31.isEmpty();
    var18.enqueue((java.lang.Object)var36);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var39 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var39.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var42 = var39.iterator();
    var39.enqueue((java.lang.Object)(byte)1);
    boolean var45 = var39.isEmpty();
    java.util.Iterator var46 = var39.iterator();
    var18.enqueue((java.lang.Object)var39);
    int var48 = var18.size();
    var1.enqueue((java.lang.Object)var18);
    java.util.Iterator var50 = var18.iterator();
    boolean var51 = var18.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test28");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var13 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    var13.enqueue((java.lang.Object)100.0d);
    java.lang.Object var19 = var13.dequeue();
    java.util.Iterator var20 = var13.iterator();
    java.util.Iterator var21 = var13.iterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var23 = var13.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    boolean var26 = var25.isEmpty();
    java.util.Iterator var27 = var25.iterator();
    int var28 = var25.size();
    int var29 = var25.size();
    int var30 = var25.size();
    var13.enqueue((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 100.0d+ "'", var23.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test29");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    boolean var13 = var1.isEmpty();
    java.lang.Object var14 = var1.dequeue();
    java.lang.Object var15 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    java.util.Iterator var18 = var17.iterator();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    int var21 = var17.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var23.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var26 = var23.iterator();
    int var27 = var23.size();
    int var28 = var23.size();
    java.util.Iterator var29 = var23.iterator();
    var17.enqueue((java.lang.Object)var29);
    var1.enqueue((java.lang.Object)var29);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var33 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var33.enqueue((java.lang.Object)'#');
    java.util.Iterator var36 = var33.iterator();
    java.util.Iterator var37 = var33.iterator();
    var33.enqueue((java.lang.Object)false);
    int var40 = var33.size();
    boolean var41 = var33.isEmpty();
    java.lang.Object var42 = var33.dequeue();
    java.lang.Object var43 = var33.dequeue();
    java.util.Iterator var44 = var33.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var46 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    java.util.Iterator var49 = var46.iterator();
    boolean var50 = var46.isEmpty();
    int var51 = var46.size();
    int var52 = var46.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var54 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var55 = var54.size();
    boolean var56 = var54.isEmpty();
    boolean var57 = var54.isEmpty();
    var46.enqueue((java.lang.Object)var57);
    int var59 = var46.size();
    var33.enqueue((java.lang.Object)var59);
    java.util.Iterator var61 = var33.iterator();
    var1.enqueue((java.lang.Object)var61);
    java.lang.Object var63 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 100.0d+ "'", var15.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + '#'+ "'", var42.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + false+ "'", var43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test30");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var15 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var29 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    java.util.Iterator var32 = var29.iterator();
    boolean var33 = var29.isEmpty();
    var29.enqueue((java.lang.Object)'#');
    boolean var36 = var29.isEmpty();
    var15.enqueue((java.lang.Object)var29);
    int var38 = var15.size();
    boolean var39 = var15.isEmpty();
    int var40 = var15.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var42 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var42.enqueue((java.lang.Object)'#');
    java.util.Iterator var45 = var42.iterator();
    java.util.Iterator var46 = var42.iterator();
    java.util.Iterator var47 = var42.iterator();
    boolean var48 = var42.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var50 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var50.enqueue((java.lang.Object)'#');
    int var53 = var50.size();
    java.util.Iterator var54 = var50.iterator();
    var42.enqueue((java.lang.Object)var50);
    java.util.Iterator var56 = var50.iterator();
    java.lang.Object var57 = var50.dequeue();
    var15.enqueue((java.lang.Object)var50);
    java.util.Iterator var59 = var50.iterator();
    boolean var60 = var50.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + '#'+ "'", var57.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test31");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    int var5 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var7.enqueue((java.lang.Object)true);
    java.util.Iterator var13 = var7.iterator();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    int var16 = var7.size();
    java.lang.Object var17 = var7.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test32");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var4 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    java.lang.Object var17 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    boolean var22 = var19.isEmpty();
    boolean var23 = var19.isEmpty();
    java.util.Iterator var24 = var19.iterator();
    java.lang.Object var25 = var19.dequeue();
    boolean var26 = var19.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var29 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    java.util.Iterator var33 = var29.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var35.enqueue((java.lang.Object)'#');
    java.util.Iterator var38 = var35.iterator();
    java.util.Iterator var39 = var35.iterator();
    var35.enqueue((java.lang.Object)false);
    java.lang.Object var42 = var35.dequeue();
    java.lang.Object var43 = var35.dequeue();
    java.util.Iterator var44 = var35.iterator();
    var29.enqueue((java.lang.Object)var35);
    int var46 = var35.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var48 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var48.enqueue((java.lang.Object)'#');
    java.util.Iterator var51 = var48.iterator();
    java.util.Iterator var52 = var48.iterator();
    java.util.Iterator var53 = var48.iterator();
    boolean var54 = var48.isEmpty();
    java.util.Iterator var55 = var48.iterator();
    java.lang.Object var56 = var48.dequeue();
    java.util.Iterator var57 = var48.iterator();
    java.util.Iterator var58 = var48.iterator();
    int var59 = var48.size();
    var35.enqueue((java.lang.Object)var48);
    var19.enqueue((java.lang.Object)var48);
    int var62 = var48.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + '#'+ "'", var42.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + false+ "'", var43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + '#'+ "'", var56.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test33");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    java.lang.Object var15 = var9.dequeue();
    java.util.Iterator var16 = var9.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    boolean var26 = var18.isEmpty();
    java.lang.Object var27 = var18.dequeue();
    java.lang.Object var28 = var18.dequeue();
    java.util.Iterator var29 = var18.iterator();
    var18.enqueue((java.lang.Object)'4');
    java.util.Iterator var32 = var18.iterator();
    var9.enqueue((java.lang.Object)var18);
    boolean var34 = var9.isEmpty();
    java.lang.Object var35 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var37 = var9.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var38 = var9.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '#'+ "'", var6.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test34");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    boolean var20 = var16.isEmpty();
    var16.enqueue((java.lang.Object)'#');
    boolean var23 = var16.isEmpty();
    int var24 = var16.size();
    var9.enqueue((java.lang.Object)var24);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    java.util.Iterator var32 = var27.iterator();
    java.lang.Object var33 = var27.dequeue();
    boolean var34 = var27.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var36 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    java.util.Iterator var39 = var36.iterator();
    boolean var40 = var36.isEmpty();
    int var41 = var36.size();
    int var42 = var36.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var44 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var45 = var44.size();
    boolean var46 = var44.isEmpty();
    boolean var47 = var44.isEmpty();
    var36.enqueue((java.lang.Object)var47);
    int var49 = var36.size();
    int var50 = var36.size();
    var27.enqueue((java.lang.Object)var36);
    var9.enqueue((java.lang.Object)var36);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var54 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var55 = var54.size();
    boolean var56 = var54.isEmpty();
    java.util.Iterator var57 = var54.iterator();
    var9.enqueue((java.lang.Object)var57);
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var60 = var1.iterator();
    boolean var61 = var1.isEmpty();
    java.util.Iterator var62 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + '#'+ "'", var33.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test35");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    java.lang.Object var15 = var9.dequeue();
    java.util.Iterator var16 = var9.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    boolean var26 = var18.isEmpty();
    java.lang.Object var27 = var18.dequeue();
    java.lang.Object var28 = var18.dequeue();
    java.util.Iterator var29 = var18.iterator();
    var18.enqueue((java.lang.Object)'4');
    java.util.Iterator var32 = var18.iterator();
    var9.enqueue((java.lang.Object)var18);
    boolean var34 = var9.isEmpty();
    java.lang.Object var35 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var38 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var39 = var38.iterator();
    var1.enqueue((java.lang.Object)var38);
    java.util.Iterator var41 = var38.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var43 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var43.enqueue((java.lang.Object)'#');
    java.util.Iterator var46 = var43.iterator();
    java.util.Iterator var47 = var43.iterator();
    var43.enqueue((java.lang.Object)false);
    int var50 = var43.size();
    boolean var51 = var43.isEmpty();
    java.lang.Object var52 = var43.dequeue();
    int var53 = var43.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var55 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var55.enqueue((java.lang.Object)'#');
    java.util.Iterator var58 = var55.iterator();
    java.util.Iterator var59 = var55.iterator();
    var55.enqueue((java.lang.Object)false);
    java.lang.Object var62 = var55.dequeue();
    java.lang.Object var63 = var55.dequeue();
    int var64 = var55.size();
    var55.enqueue((java.lang.Object)100L);
    var43.enqueue((java.lang.Object)var55);
    var38.enqueue((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '#'+ "'", var6.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + '#'+ "'", var52.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + '#'+ "'", var62.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + false+ "'", var63.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test36");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var16.enqueue((java.lang.Object)'#');
    boolean var19 = var16.isEmpty();
    boolean var20 = var16.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var22.enqueue((java.lang.Object)'#');
    int var25 = var22.size();
    var16.enqueue((java.lang.Object)var22);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var28.enqueue((java.lang.Object)'#');
    java.util.Iterator var31 = var28.iterator();
    java.util.Iterator var32 = var28.iterator();
    boolean var33 = var28.isEmpty();
    java.lang.Object var34 = var28.dequeue();
    java.util.Iterator var35 = var28.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var37 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    var37.enqueue((java.lang.Object)false);
    int var44 = var37.size();
    boolean var45 = var37.isEmpty();
    java.lang.Object var46 = var37.dequeue();
    java.lang.Object var47 = var37.dequeue();
    java.util.Iterator var48 = var37.iterator();
    var37.enqueue((java.lang.Object)'4');
    java.util.Iterator var51 = var37.iterator();
    var28.enqueue((java.lang.Object)var37);
    boolean var53 = var28.isEmpty();
    java.lang.Object var54 = var28.dequeue();
    var16.enqueue((java.lang.Object)var28);
    int var56 = var16.size();
    var1.enqueue((java.lang.Object)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '#'+ "'", var34.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + '#'+ "'", var46.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + false+ "'", var47.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 3);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test37");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var10 = var7.iterator();
    var7.enqueue((java.lang.Object)(byte)1);
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    boolean var16 = var7.isEmpty();
    java.lang.Object var17 = var7.dequeue();
    java.util.Iterator var18 = var7.iterator();
    java.util.Iterator var19 = var7.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 1.0d+ "'", var17.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test38");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.util.Iterator var14 = var6.iterator();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var1.dequeue();
    int var17 = var1.size();
    int var18 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var21 = var20.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    java.util.Iterator var28 = var23.iterator();
    boolean var29 = var23.isEmpty();
    java.util.Iterator var30 = var23.iterator();
    java.util.Iterator var31 = var23.iterator();
    var20.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var23);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    int var38 = var35.size();
    int var39 = var35.size();
    boolean var40 = var35.isEmpty();
    var23.enqueue((java.lang.Object)var35);
    int var42 = var35.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test39");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test40");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    var1.enqueue((java.lang.Object)100);
    boolean var11 = var1.isEmpty();
    java.lang.Object var12 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test41");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.util.Iterator var14 = var6.iterator();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var1.dequeue();
    int var17 = var1.size();
    int var18 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var21 = var20.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    java.util.Iterator var28 = var23.iterator();
    boolean var29 = var23.isEmpty();
    java.util.Iterator var30 = var23.iterator();
    java.util.Iterator var31 = var23.iterator();
    var20.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var23);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    int var38 = var35.size();
    int var39 = var35.size();
    boolean var40 = var35.isEmpty();
    var23.enqueue((java.lang.Object)var35);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var43 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var43.enqueue((java.lang.Object)'#');
    java.util.Iterator var46 = var43.iterator();
    java.util.Iterator var47 = var43.iterator();
    java.util.Iterator var48 = var43.iterator();
    java.lang.Object var49 = var43.dequeue();
    java.util.Iterator var50 = var43.iterator();
    int var51 = var43.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var53 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var53.enqueue((java.lang.Object)'#');
    java.util.Iterator var56 = var53.iterator();
    java.util.Iterator var57 = var53.iterator();
    var53.enqueue((java.lang.Object)false);
    int var60 = var53.size();
    boolean var61 = var53.isEmpty();
    java.lang.Object var62 = var53.dequeue();
    java.lang.Object var63 = var53.dequeue();
    java.util.Iterator var64 = var53.iterator();
    var53.enqueue((java.lang.Object)'4');
    java.util.Iterator var67 = var53.iterator();
    boolean var68 = var53.isEmpty();
    java.util.Iterator var69 = var53.iterator();
    var43.enqueue((java.lang.Object)var53);
    var35.enqueue((java.lang.Object)var43);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var73 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var73.enqueue((java.lang.Object)'#');
    java.util.Iterator var76 = var73.iterator();
    java.util.Iterator var77 = var73.iterator();
    var73.enqueue((java.lang.Object)false);
    int var80 = var73.size();
    boolean var81 = var73.isEmpty();
    java.lang.Object var82 = var73.dequeue();
    java.lang.Object var83 = var73.dequeue();
    java.util.Iterator var84 = var73.iterator();
    var73.enqueue((java.lang.Object)'4');
    java.util.Iterator var87 = var73.iterator();
    boolean var88 = var73.isEmpty();
    java.util.Iterator var89 = var73.iterator();
    java.util.Iterator var90 = var73.iterator();
    var35.enqueue((java.lang.Object)var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '#'+ "'", var49.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + '#'+ "'", var62.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + false+ "'", var63.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + '#'+ "'", var82.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + false+ "'", var83.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test42");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    int var5 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var7.enqueue((java.lang.Object)true);
    java.util.Iterator var13 = var7.iterator();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    int var16 = var7.size();
    java.util.Iterator var17 = var7.iterator();
    boolean var18 = var7.isEmpty();
    java.lang.Object var19 = var7.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test43");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var4 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    java.lang.Object var17 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    boolean var22 = var19.isEmpty();
    boolean var23 = var19.isEmpty();
    java.util.Iterator var24 = var19.iterator();
    java.lang.Object var25 = var19.dequeue();
    boolean var26 = var19.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    boolean var28 = var1.isEmpty();
    int var29 = var1.size();
    int var30 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test44");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var10 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    java.util.Iterator var14 = var10.iterator();
    java.lang.Object var15 = var10.dequeue();
    java.util.Iterator var16 = var10.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    boolean var23 = var18.isEmpty();
    java.lang.Object var24 = var18.dequeue();
    java.util.Iterator var25 = var18.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    var27.enqueue((java.lang.Object)false);
    int var34 = var27.size();
    boolean var35 = var27.isEmpty();
    java.lang.Object var36 = var27.dequeue();
    java.lang.Object var37 = var27.dequeue();
    java.util.Iterator var38 = var27.iterator();
    var27.enqueue((java.lang.Object)'4');
    java.util.Iterator var41 = var27.iterator();
    var18.enqueue((java.lang.Object)var27);
    boolean var43 = var18.isEmpty();
    java.lang.Object var44 = var18.dequeue();
    var10.enqueue((java.lang.Object)var18);
    var1.enqueue((java.lang.Object)var18);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var48 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var48.enqueue((java.lang.Object)'#');
    java.util.Iterator var51 = var48.iterator();
    java.util.Iterator var52 = var48.iterator();
    java.util.Iterator var53 = var48.iterator();
    boolean var54 = var48.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var56 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var56.enqueue((java.lang.Object)'#');
    java.util.Iterator var59 = var56.iterator();
    java.util.Iterator var60 = var56.iterator();
    var56.enqueue((java.lang.Object)false);
    java.lang.Object var63 = var56.dequeue();
    java.lang.Object var64 = var56.dequeue();
    java.util.Iterator var65 = var56.iterator();
    var48.enqueue((java.lang.Object)var65);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var68 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var68.enqueue((java.lang.Object)1.0d);
    boolean var71 = var68.isEmpty();
    int var72 = var68.size();
    var48.enqueue((java.lang.Object)var68);
    var18.enqueue((java.lang.Object)var68);
    java.lang.Object var75 = var68.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + false+ "'", var37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + '#'+ "'", var63.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + false+ "'", var64.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + 1.0d+ "'", var75.equals(1.0d));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test45");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    java.lang.Object var17 = var9.dequeue();
    java.util.Iterator var18 = var9.iterator();
    var1.enqueue((java.lang.Object)var18);
    int var20 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    int var25 = var22.size();
    int var26 = var22.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var28.enqueue((java.lang.Object)'#');
    int var31 = var28.size();
    var28.enqueue((java.lang.Object)true);
    java.util.Iterator var34 = var28.iterator();
    java.util.Iterator var35 = var28.iterator();
    var22.enqueue((java.lang.Object)var28);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var38 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    var38.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var44 = var38.iterator();
    java.util.Iterator var45 = var38.iterator();
    java.util.Iterator var46 = var38.iterator();
    var28.enqueue((java.lang.Object)var46);
    var1.enqueue((java.lang.Object)var28);
    java.util.Iterator var49 = var28.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test46");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    boolean var10 = var6.isEmpty();
    int var11 = var6.size();
    int var12 = var6.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var15 = var14.size();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    var6.enqueue((java.lang.Object)var17);
    java.lang.Object var19 = var6.dequeue();
    var1.enqueue(var19);
    java.lang.Object var21 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + true+ "'", var19.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + true+ "'", var21.equals(true));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test47");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var13 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    java.util.Iterator var18 = var13.iterator();
    boolean var19 = var13.isEmpty();
    java.util.Iterator var20 = var13.iterator();
    java.util.Iterator var21 = var13.iterator();
    var13.enqueue((java.lang.Object)1.0f);
    var1.enqueue((java.lang.Object)var13);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var26 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var26.enqueue((java.lang.Object)'#');
    int var29 = var26.size();
    java.util.Iterator var30 = var26.iterator();
    java.lang.Object var31 = var26.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var33 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var34 = var33.size();
    java.util.Iterator var35 = var33.iterator();
    var26.enqueue((java.lang.Object)var35);
    boolean var37 = var26.isEmpty();
    boolean var38 = var26.isEmpty();
    var13.enqueue((java.lang.Object)var26);
    boolean var40 = var13.isEmpty();
    int var41 = var13.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + '#'+ "'", var31.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 3);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test48");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var16.enqueue((java.lang.Object)1.0d);
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    boolean var21 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var16);
    java.util.Iterator var23 = var16.iterator();
    boolean var24 = var16.isEmpty();
    java.util.Iterator var25 = var16.iterator();
    java.util.Iterator var26 = var16.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test49");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test50");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    var1.enqueue((java.lang.Object)1);
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.lang.Object var9 = var1.dequeue();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1+ "'", var9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test51");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    boolean var13 = var1.isEmpty();
    java.lang.Object var14 = var1.dequeue();
    java.lang.Object var15 = var1.dequeue();
    java.util.Iterator var16 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 100.0d+ "'", var15.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test52");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var15 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var28 = var15.iterator();
    int var29 = var15.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test53");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var17 = var16.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    var19.enqueue((java.lang.Object)false);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    java.lang.Object var28 = var19.dequeue();
    java.lang.Object var29 = var19.dequeue();
    java.util.Iterator var30 = var19.iterator();
    var19.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var34 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var34.enqueue((java.lang.Object)'#');
    int var37 = var34.size();
    var34.enqueue((java.lang.Object)true);
    java.util.Iterator var40 = var34.iterator();
    java.util.Iterator var41 = var34.iterator();
    var19.enqueue((java.lang.Object)var41);
    var16.enqueue((java.lang.Object)var19);
    java.util.Iterator var44 = var19.iterator();
    java.lang.Object var45 = var19.dequeue();
    java.util.Iterator var46 = var19.iterator();
    var1.enqueue((java.lang.Object)var19);
    java.lang.Object var48 = var19.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var49 = var19.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '4'+ "'", var45.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test54");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var15 = var9.isEmpty();
    boolean var16 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    var9.enqueue((java.lang.Object)var18);
    java.lang.Object var22 = var9.dequeue();
    java.util.Iterator var23 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '#'+ "'", var22.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test55");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.lang.Object var16 = var1.dequeue();
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test56");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    java.lang.Object var14 = var7.dequeue();
    java.lang.Object var15 = var7.dequeue();
    java.util.Iterator var16 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    boolean var18 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    java.util.Iterator var30 = var27.iterator();
    boolean var31 = var27.isEmpty();
    var27.enqueue((java.lang.Object)'#');
    boolean var34 = var27.isEmpty();
    int var35 = var27.size();
    var20.enqueue((java.lang.Object)var35);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var38 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    java.util.Iterator var42 = var38.iterator();
    java.util.Iterator var43 = var38.iterator();
    java.lang.Object var44 = var38.dequeue();
    boolean var45 = var38.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var47 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var48 = var47.isEmpty();
    boolean var49 = var47.isEmpty();
    java.util.Iterator var50 = var47.iterator();
    boolean var51 = var47.isEmpty();
    int var52 = var47.size();
    int var53 = var47.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var55 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var56 = var55.size();
    boolean var57 = var55.isEmpty();
    boolean var58 = var55.isEmpty();
    var47.enqueue((java.lang.Object)var58);
    int var60 = var47.size();
    int var61 = var47.size();
    var38.enqueue((java.lang.Object)var47);
    var20.enqueue((java.lang.Object)var47);
    java.lang.Object var64 = var20.dequeue();
    java.util.Iterator var65 = var20.iterator();
    var1.enqueue((java.lang.Object)var20);
    int var67 = var1.size();
    int var68 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + '#'+ "'", var44.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + '#'+ "'", var64.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test57");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var15 = var14.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    int var24 = var17.size();
    boolean var25 = var17.isEmpty();
    java.lang.Object var26 = var17.dequeue();
    java.lang.Object var27 = var17.dequeue();
    java.util.Iterator var28 = var17.iterator();
    var17.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var32 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var32.enqueue((java.lang.Object)'#');
    int var35 = var32.size();
    var32.enqueue((java.lang.Object)true);
    java.util.Iterator var38 = var32.iterator();
    java.util.Iterator var39 = var32.iterator();
    var17.enqueue((java.lang.Object)var39);
    var14.enqueue((java.lang.Object)var17);
    java.util.Iterator var42 = var17.iterator();
    java.util.Iterator var43 = var17.iterator();
    var1.enqueue((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + '#'+ "'", var26.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + false+ "'", var27.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test58");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var4 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var14 = var1.dequeue();
    int var15 = var1.size();
    int var16 = var1.size();
    int var17 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    boolean var22 = var19.isEmpty();
    boolean var23 = var19.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test59");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var4 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    java.lang.Object var17 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    boolean var22 = var19.isEmpty();
    boolean var23 = var19.isEmpty();
    java.util.Iterator var24 = var19.iterator();
    java.lang.Object var25 = var19.dequeue();
    boolean var26 = var19.isEmpty();
    var1.enqueue((java.lang.Object)var19);
    int var28 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test60");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test61");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    java.lang.Object var15 = var9.dequeue();
    java.util.Iterator var16 = var9.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    boolean var26 = var18.isEmpty();
    java.lang.Object var27 = var18.dequeue();
    java.lang.Object var28 = var18.dequeue();
    java.util.Iterator var29 = var18.iterator();
    var18.enqueue((java.lang.Object)'4');
    java.util.Iterator var32 = var18.iterator();
    var9.enqueue((java.lang.Object)var18);
    boolean var34 = var9.isEmpty();
    java.lang.Object var35 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var37 = var9.size();
    boolean var38 = var9.isEmpty();
    int var39 = var9.size();
    int var40 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '#'+ "'", var6.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test62");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    int var20 = var17.size();
    var17.enqueue((java.lang.Object)true);
    java.util.Iterator var23 = var17.iterator();
    var1.enqueue((java.lang.Object)var23);
    java.lang.Object var25 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + true+ "'", var25.equals(true));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test63");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    var1.enqueue((java.lang.Object)true);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test64");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    java.lang.Object var15 = var9.dequeue();
    java.util.Iterator var16 = var9.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    boolean var26 = var18.isEmpty();
    java.lang.Object var27 = var18.dequeue();
    java.lang.Object var28 = var18.dequeue();
    java.util.Iterator var29 = var18.iterator();
    var18.enqueue((java.lang.Object)'4');
    java.util.Iterator var32 = var18.iterator();
    var9.enqueue((java.lang.Object)var18);
    boolean var34 = var9.isEmpty();
    java.lang.Object var35 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var37 = var9.size();
    java.util.Iterator var38 = var9.iterator();
    boolean var39 = var9.isEmpty();
    java.util.Iterator var40 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + '#'+ "'", var6.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test65");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    boolean var10 = var9.isEmpty();
    java.util.Iterator var11 = var9.iterator();
    boolean var12 = var9.isEmpty();
    int var13 = var9.size();
    var1.enqueue((java.lang.Object)var13);
    boolean var15 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test66");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var15 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var28 = var1.iterator();
    boolean var29 = var1.isEmpty();
    boolean var30 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test67");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var12.enqueue((java.lang.Object)'#');
    boolean var15 = var12.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    var12.enqueue((java.lang.Object)var17);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var26 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var26.enqueue((java.lang.Object)'#');
    java.util.Iterator var29 = var26.iterator();
    java.util.Iterator var30 = var26.iterator();
    var26.enqueue((java.lang.Object)false);
    int var33 = var26.size();
    boolean var34 = var26.isEmpty();
    java.lang.Object var35 = var26.dequeue();
    java.lang.Object var36 = var26.dequeue();
    var12.enqueue(var36);
    java.util.Iterator var38 = var12.iterator();
    java.util.Iterator var39 = var12.iterator();
    var1.enqueue((java.lang.Object)var39);
    java.util.Iterator var41 = var1.iterator();
    java.util.Iterator var42 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + '#'+ "'", var35.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + false+ "'", var36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test68");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var16.enqueue((java.lang.Object)1.0d);
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    boolean var21 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var16);
    java.lang.Object var23 = var16.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 1.0d+ "'", var23.equals(1.0d));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test69");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var6.enqueue((java.lang.Object)var22);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var25.enqueue((java.lang.Object)1.0d);
    boolean var28 = var25.isEmpty();
    int var29 = var25.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var31 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    java.util.Iterator var36 = var31.iterator();
    boolean var37 = var31.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var39 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var39.enqueue((java.lang.Object)'#');
    int var42 = var39.size();
    java.util.Iterator var43 = var39.iterator();
    var31.enqueue((java.lang.Object)var39);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var46 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var47 = var46.iterator();
    java.util.Iterator var48 = var46.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var50 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var51 = var50.isEmpty();
    boolean var52 = var50.isEmpty();
    java.util.Iterator var53 = var50.iterator();
    boolean var54 = var50.isEmpty();
    int var55 = var50.size();
    int var56 = var50.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var58 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var59 = var58.size();
    boolean var60 = var58.isEmpty();
    boolean var61 = var58.isEmpty();
    var50.enqueue((java.lang.Object)var61);
    int var63 = var50.size();
    var46.enqueue((java.lang.Object)var50);
    var39.enqueue((java.lang.Object)var46);
    var25.enqueue((java.lang.Object)var39);
    boolean var67 = var39.isEmpty();
    int var68 = var39.size();
    var6.enqueue((java.lang.Object)var39);
    java.lang.Object var70 = var6.dequeue();
    boolean var71 = var6.isEmpty();
    boolean var72 = var6.isEmpty();
    java.lang.Object var73 = var6.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + '#'+ "'", var70.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + false+ "'", var73.equals(false));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test70");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test71");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)(byte)10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    java.lang.Object var14 = var9.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var17 = var16.size();
    java.util.Iterator var18 = var16.iterator();
    var9.enqueue((java.lang.Object)var18);
    boolean var20 = var9.isEmpty();
    boolean var21 = var9.isEmpty();
    java.util.Iterator var22 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    java.util.Iterator var30 = var25.iterator();
    java.lang.Object var31 = var25.dequeue();
    boolean var32 = var25.isEmpty();
    int var33 = var25.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var35.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var38 = var35.iterator();
    var35.enqueue((java.lang.Object)(byte)1);
    boolean var41 = var35.isEmpty();
    boolean var42 = var35.isEmpty();
    int var43 = var35.size();
    java.lang.Object var44 = var35.dequeue();
    var25.enqueue((java.lang.Object)var35);
    java.util.Iterator var46 = var25.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var48 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var49 = var48.isEmpty();
    boolean var50 = var48.isEmpty();
    java.util.Iterator var51 = var48.iterator();
    boolean var52 = var48.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var54 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var54.enqueue((java.lang.Object)'#');
    java.util.Iterator var57 = var54.iterator();
    java.util.Iterator var58 = var54.iterator();
    var54.enqueue((java.lang.Object)false);
    int var61 = var54.size();
    var48.enqueue((java.lang.Object)var54);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var64 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var64.enqueue((java.lang.Object)'#');
    java.util.Iterator var67 = var64.iterator();
    java.util.Iterator var68 = var64.iterator();
    boolean var69 = var64.isEmpty();
    java.lang.Object var70 = var64.dequeue();
    java.util.Iterator var71 = var64.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var73 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var74 = var73.isEmpty();
    boolean var75 = var73.isEmpty();
    java.util.Iterator var76 = var73.iterator();
    boolean var77 = var73.isEmpty();
    var64.enqueue((java.lang.Object)var77);
    var48.enqueue((java.lang.Object)var64);
    boolean var80 = var48.isEmpty();
    java.util.Iterator var81 = var48.iterator();
    var25.enqueue((java.lang.Object)var48);
    var1.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + '#'+ "'", var31.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + 1.0d+ "'", var44.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + '#'+ "'", var70.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test72");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var11 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var11.enqueue((java.lang.Object)'#');
    java.util.Iterator var14 = var11.iterator();
    var11.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    var11.enqueue((java.lang.Object)var25);
    java.util.Iterator var27 = var11.iterator();
    java.util.Iterator var28 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var30 = var11.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var32 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    int var33 = var32.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var35.enqueue((java.lang.Object)'#');
    boolean var38 = var35.isEmpty();
    int var39 = var35.size();
    var32.enqueue((java.lang.Object)var39);
    int var41 = var32.size();
    var11.enqueue((java.lang.Object)var32);
    java.util.Iterator var43 = var11.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test73");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var21 = var14.dequeue();
    java.lang.Object var22 = var14.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var24 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var24.enqueue((java.lang.Object)'#');
    boolean var27 = var24.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var29 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var29.enqueue((java.lang.Object)'#');
    java.util.Iterator var32 = var29.iterator();
    java.util.Iterator var33 = var29.iterator();
    boolean var34 = var29.isEmpty();
    boolean var35 = var29.isEmpty();
    var24.enqueue((java.lang.Object)var29);
    boolean var37 = var29.isEmpty();
    boolean var38 = var29.isEmpty();
    java.util.Iterator var39 = var29.iterator();
    var14.enqueue((java.lang.Object)var29);
    int var41 = var29.size();
    boolean var42 = var29.isEmpty();
    int var43 = var29.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + true+ "'", var22.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test74");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test75");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.lang.Object var14 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var17 = var16.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var20 = var19.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    java.util.Iterator var27 = var22.iterator();
    boolean var28 = var22.isEmpty();
    java.util.Iterator var29 = var22.iterator();
    java.util.Iterator var30 = var22.iterator();
    var19.enqueue((java.lang.Object)var22);
    java.lang.Object var32 = var22.dequeue();
    int var33 = var22.size();
    var16.enqueue((java.lang.Object)var22);
    var1.enqueue((java.lang.Object)var22);
    java.util.Iterator var36 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var38 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    java.util.Iterator var42 = var38.iterator();
    java.util.Iterator var43 = var38.iterator();
    boolean var44 = var38.isEmpty();
    java.util.Iterator var45 = var38.iterator();
    java.lang.Object var46 = var38.dequeue();
    boolean var47 = var38.isEmpty();
    java.util.Iterator var48 = var38.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var50 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var50.enqueue((java.lang.Object)'#');
    java.util.Iterator var53 = var50.iterator();
    java.util.Iterator var54 = var50.iterator();
    java.util.Iterator var55 = var50.iterator();
    boolean var56 = var50.isEmpty();
    java.util.Iterator var57 = var50.iterator();
    java.util.Iterator var58 = var50.iterator();
    var50.enqueue((java.lang.Object)1.0f);
    var38.enqueue((java.lang.Object)var50);
    var1.enqueue((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + '#'+ "'", var32.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + '#'+ "'", var46.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test76");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var15 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var28 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var30 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    boolean var34 = var30.isEmpty();
    boolean var35 = var30.isEmpty();
    var1.enqueue((java.lang.Object)var30);
    java.util.Iterator var37 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var39 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    java.util.Iterator var40 = var39.iterator();
    int var41 = var39.size();
    boolean var42 = var39.isEmpty();
    int var43 = var39.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var45 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var45.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var48 = var45.iterator();
    int var49 = var45.size();
    int var50 = var45.size();
    java.util.Iterator var51 = var45.iterator();
    var39.enqueue((java.lang.Object)var51);
    var1.enqueue((java.lang.Object)var51);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var55 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var55.enqueue((java.lang.Object)'#');
    java.util.Iterator var58 = var55.iterator();
    java.util.Iterator var59 = var55.iterator();
    java.util.Iterator var60 = var55.iterator();
    boolean var61 = var55.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var63 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var63.enqueue((java.lang.Object)'#');
    int var66 = var63.size();
    java.util.Iterator var67 = var63.iterator();
    var55.enqueue((java.lang.Object)var63);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var70 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var71 = var70.iterator();
    java.util.Iterator var72 = var70.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var74 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var75 = var74.isEmpty();
    boolean var76 = var74.isEmpty();
    java.util.Iterator var77 = var74.iterator();
    boolean var78 = var74.isEmpty();
    int var79 = var74.size();
    int var80 = var74.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var82 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var83 = var82.size();
    boolean var84 = var82.isEmpty();
    boolean var85 = var82.isEmpty();
    var74.enqueue((java.lang.Object)var85);
    int var87 = var74.size();
    var70.enqueue((java.lang.Object)var74);
    var63.enqueue((java.lang.Object)var70);
    java.lang.Object var90 = var63.dequeue();
    int var91 = var63.size();
    java.util.Iterator var92 = var63.iterator();
    java.util.Iterator var93 = var63.iterator();
    var1.enqueue((java.lang.Object)var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + '#'+ "'", var90.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test77");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var13 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    var13.enqueue((java.lang.Object)false);
    java.lang.Object var20 = var13.dequeue();
    java.lang.Object var21 = var13.dequeue();
    int var22 = var13.size();
    var13.enqueue((java.lang.Object)100L);
    var1.enqueue((java.lang.Object)var13);
    int var26 = var13.size();
    java.util.Iterator var27 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + '#'+ "'", var20.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test78");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var13 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var13.enqueue((java.lang.Object)'#');
    boolean var16 = var13.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    boolean var23 = var18.isEmpty();
    boolean var24 = var18.isEmpty();
    var13.enqueue((java.lang.Object)var18);
    boolean var26 = var18.isEmpty();
    int var27 = var18.size();
    boolean var28 = var18.isEmpty();
    var1.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test79");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)'#');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var15 = var14.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    boolean var23 = var17.isEmpty();
    java.util.Iterator var24 = var17.iterator();
    java.util.Iterator var25 = var17.iterator();
    var14.enqueue((java.lang.Object)var17);
    int var27 = var17.size();
    boolean var28 = var17.isEmpty();
    boolean var29 = var17.isEmpty();
    var1.enqueue((java.lang.Object)var17);
    int var31 = var17.size();
    int var32 = var17.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test80");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    int var10 = var9.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var12.enqueue((java.lang.Object)'#');
    boolean var15 = var12.isEmpty();
    int var16 = var12.size();
    var9.enqueue((java.lang.Object)var16);
    int var18 = var9.size();
    java.lang.Object var19 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 1+ "'", var19.equals(1));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test81");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var21 = var20.size();
    var1.enqueue((java.lang.Object)var20);
    boolean var23 = var1.isEmpty();
    int var24 = var1.size();
    int var25 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 4);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test82");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test83");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var16.enqueue((java.lang.Object)1.0d);
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    boolean var21 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var16);
    java.lang.Object var23 = var1.dequeue();
    java.util.Iterator var24 = var1.iterator();
    java.util.Iterator var25 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test84");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test85");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    int var17 = var1.size();
    boolean var18 = var1.isEmpty();
    boolean var19 = var1.isEmpty();
    java.util.Iterator var20 = var1.iterator();
    java.lang.Object var21 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var23.enqueue((java.lang.Object)'#');
    boolean var26 = var23.isEmpty();
    boolean var27 = var23.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var29 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var29.enqueue((java.lang.Object)'#');
    int var32 = var29.size();
    var23.enqueue((java.lang.Object)var29);
    int var34 = var29.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var36 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    var36.enqueue((java.lang.Object)false);
    int var43 = var36.size();
    boolean var44 = var36.isEmpty();
    java.lang.Object var45 = var36.dequeue();
    java.lang.Object var46 = var36.dequeue();
    boolean var47 = var36.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var49 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var49.enqueue((java.lang.Object)'#');
    int var52 = var49.size();
    var49.enqueue((java.lang.Object)true);
    var36.enqueue((java.lang.Object)var49);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var57 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var58 = var57.isEmpty();
    boolean var59 = var57.isEmpty();
    java.util.Iterator var60 = var57.iterator();
    int var61 = var57.size();
    var57.enqueue((java.lang.Object)(byte)10);
    int var64 = var57.size();
    var49.enqueue((java.lang.Object)var57);
    java.util.Iterator var66 = var57.iterator();
    var29.enqueue((java.lang.Object)var66);
    int var68 = var29.size();
    var1.enqueue((java.lang.Object)var68);
    java.util.Iterator var70 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '#'+ "'", var45.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + false+ "'", var46.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test86");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var11 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    int var15 = var11.size();
    int var16 = var11.size();
    var1.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test87");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    int var12 = var7.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    var14.enqueue((java.lang.Object)false);
    int var21 = var14.size();
    boolean var22 = var14.isEmpty();
    java.lang.Object var23 = var14.dequeue();
    java.lang.Object var24 = var14.dequeue();
    boolean var25 = var14.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)'#');
    int var30 = var27.size();
    var27.enqueue((java.lang.Object)true);
    var14.enqueue((java.lang.Object)var27);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    java.util.Iterator var38 = var35.iterator();
    int var39 = var35.size();
    var35.enqueue((java.lang.Object)(byte)10);
    int var42 = var35.size();
    var27.enqueue((java.lang.Object)var35);
    java.util.Iterator var44 = var35.iterator();
    var7.enqueue((java.lang.Object)var44);
    java.util.Iterator var46 = var7.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test88");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    var1.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var17 = var16.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    var19.enqueue((java.lang.Object)false);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    java.lang.Object var28 = var19.dequeue();
    java.lang.Object var29 = var19.dequeue();
    java.util.Iterator var30 = var19.iterator();
    var19.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var34 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var34.enqueue((java.lang.Object)'#');
    int var37 = var34.size();
    var34.enqueue((java.lang.Object)true);
    java.util.Iterator var40 = var34.iterator();
    java.util.Iterator var41 = var34.iterator();
    var19.enqueue((java.lang.Object)var41);
    var16.enqueue((java.lang.Object)var19);
    java.util.Iterator var44 = var19.iterator();
    java.lang.Object var45 = var19.dequeue();
    java.util.Iterator var46 = var19.iterator();
    var1.enqueue((java.lang.Object)var19);
    boolean var48 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var50 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var52 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var53 = var52.isEmpty();
    java.util.Iterator var54 = var52.iterator();
    var50.enqueue((java.lang.Object)var54);
    java.util.Iterator var56 = var50.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var58 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var59 = var58.isEmpty();
    boolean var60 = var58.isEmpty();
    java.util.Iterator var61 = var58.iterator();
    boolean var62 = var58.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var64 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var64.enqueue((java.lang.Object)'#');
    java.util.Iterator var67 = var64.iterator();
    java.util.Iterator var68 = var64.iterator();
    var64.enqueue((java.lang.Object)false);
    int var71 = var64.size();
    var58.enqueue((java.lang.Object)var64);
    java.util.Iterator var73 = var64.iterator();
    java.lang.Object var74 = var64.dequeue();
    java.util.Iterator var75 = var64.iterator();
    var50.enqueue((java.lang.Object)var64);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var78 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var79 = var78.isEmpty();
    boolean var80 = var78.isEmpty();
    java.util.Iterator var81 = var78.iterator();
    boolean var82 = var78.isEmpty();
    var78.enqueue((java.lang.Object)'#');
    boolean var85 = var78.isEmpty();
    var64.enqueue((java.lang.Object)var78);
    boolean var87 = var64.isEmpty();
    boolean var88 = var64.isEmpty();
    var1.enqueue((java.lang.Object)var64);
    java.util.Iterator var90 = var64.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '4'+ "'", var45.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + '#'+ "'", var74.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test89");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var10 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    java.util.Iterator var14 = var10.iterator();
    java.lang.Object var15 = var10.dequeue();
    java.util.Iterator var16 = var10.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    boolean var23 = var18.isEmpty();
    java.lang.Object var24 = var18.dequeue();
    java.util.Iterator var25 = var18.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    var27.enqueue((java.lang.Object)false);
    int var34 = var27.size();
    boolean var35 = var27.isEmpty();
    java.lang.Object var36 = var27.dequeue();
    java.lang.Object var37 = var27.dequeue();
    java.util.Iterator var38 = var27.iterator();
    var27.enqueue((java.lang.Object)'4');
    java.util.Iterator var41 = var27.iterator();
    var18.enqueue((java.lang.Object)var27);
    boolean var43 = var18.isEmpty();
    java.lang.Object var44 = var18.dequeue();
    var10.enqueue((java.lang.Object)var18);
    var1.enqueue((java.lang.Object)var18);
    java.util.Iterator var47 = var18.iterator();
    boolean var48 = var18.isEmpty();
    int var49 = var18.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + false+ "'", var37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test90");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var13 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    var13.enqueue((java.lang.Object)false);
    java.util.Iterator var20 = var13.iterator();
    java.lang.Object var21 = var13.dequeue();
    java.lang.Object var22 = var13.dequeue();
    var1.enqueue((java.lang.Object)var13);
    int var24 = var1.size();
    boolean var25 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test91");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test92");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    boolean var17 = var12.isEmpty();
    java.lang.Object var18 = var12.dequeue();
    java.util.Iterator var19 = var12.iterator();
    var12.enqueue((java.lang.Object)1);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var23.enqueue((java.lang.Object)'#');
    boolean var26 = var23.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var28.enqueue((java.lang.Object)'#');
    java.util.Iterator var31 = var28.iterator();
    java.util.Iterator var32 = var28.iterator();
    boolean var33 = var28.isEmpty();
    boolean var34 = var28.isEmpty();
    var23.enqueue((java.lang.Object)var28);
    var12.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var12);
    int var38 = var12.size();
    boolean var39 = var12.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var41 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var41.enqueue((java.lang.Object)'#');
    boolean var44 = var41.isEmpty();
    boolean var45 = var41.isEmpty();
    int var46 = var41.size();
    java.lang.Object var47 = var41.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var49 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var50 = var49.size();
    boolean var51 = var49.isEmpty();
    boolean var52 = var49.isEmpty();
    java.util.Iterator var53 = var49.iterator();
    var41.enqueue((java.lang.Object)var49);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var56 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var56.enqueue((java.lang.Object)1.0d);
    boolean var59 = var56.isEmpty();
    int var60 = var56.size();
    boolean var61 = var56.isEmpty();
    var41.enqueue((java.lang.Object)var56);
    java.lang.Object var63 = var41.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var65 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var65.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var68 = var65.iterator();
    var41.enqueue((java.lang.Object)var68);
    var12.enqueue((java.lang.Object)var41);
    boolean var71 = var12.isEmpty();
    boolean var72 = var12.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 1.0d+ "'", var10.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '#'+ "'", var18.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + '#'+ "'", var47.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test93");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    boolean var16 = var6.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    boolean var21 = var18.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    boolean var28 = var23.isEmpty();
    boolean var29 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var23);
    java.lang.Object var31 = var18.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var33 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var34 = var33.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var36 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var37 = var36.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var39 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var39.enqueue((java.lang.Object)'#');
    java.util.Iterator var42 = var39.iterator();
    java.util.Iterator var43 = var39.iterator();
    java.util.Iterator var44 = var39.iterator();
    boolean var45 = var39.isEmpty();
    java.util.Iterator var46 = var39.iterator();
    java.util.Iterator var47 = var39.iterator();
    var36.enqueue((java.lang.Object)var39);
    java.lang.Object var49 = var39.dequeue();
    int var50 = var39.size();
    var33.enqueue((java.lang.Object)var39);
    var18.enqueue((java.lang.Object)var39);
    java.util.Iterator var53 = var18.iterator();
    var6.enqueue((java.lang.Object)var53);
    boolean var55 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + '#'+ "'", var31.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '#'+ "'", var49.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test94");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var4 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    java.util.Iterator var11 = var4.iterator();
    java.util.Iterator var12 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var14 = var4.size();
    boolean var15 = var4.isEmpty();
    java.util.Iterator var16 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test95");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var10 = var1.dequeue();
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test96");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var3.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var6 = var3.iterator();
    var3.enqueue((java.lang.Object)(byte)1);
    boolean var9 = var3.isEmpty();
    boolean var10 = var3.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    var3.enqueue((java.lang.Object)var12);
    java.util.Iterator var16 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    java.util.Iterator var24 = var19.iterator();
    boolean var25 = var19.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)'#');
    int var30 = var27.size();
    java.util.Iterator var31 = var27.iterator();
    var19.enqueue((java.lang.Object)var27);
    int var33 = var19.size();
    int var34 = var19.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var36 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    int var39 = var36.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var41 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var42 = var41.size();
    boolean var43 = var41.isEmpty();
    var36.enqueue((java.lang.Object)var41);
    var19.enqueue((java.lang.Object)var36);
    boolean var46 = var36.isEmpty();
    java.util.Iterator var47 = var36.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var49 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var49.enqueue((java.lang.Object)'#');
    java.util.Iterator var52 = var49.iterator();
    java.util.Iterator var53 = var49.iterator();
    boolean var54 = var49.isEmpty();
    java.lang.Object var55 = var49.dequeue();
    java.util.Iterator var56 = var49.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var58 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var58.enqueue((java.lang.Object)'#');
    java.util.Iterator var61 = var58.iterator();
    java.util.Iterator var62 = var58.iterator();
    var58.enqueue((java.lang.Object)false);
    int var65 = var58.size();
    boolean var66 = var58.isEmpty();
    java.lang.Object var67 = var58.dequeue();
    java.lang.Object var68 = var58.dequeue();
    java.util.Iterator var69 = var58.iterator();
    var58.enqueue((java.lang.Object)'4');
    java.util.Iterator var72 = var58.iterator();
    var49.enqueue((java.lang.Object)var58);
    boolean var74 = var49.isEmpty();
    java.lang.Object var75 = var49.dequeue();
    var36.enqueue((java.lang.Object)var49);
    java.util.Iterator var77 = var49.iterator();
    var1.enqueue((java.lang.Object)var77);
    boolean var79 = var1.isEmpty();
    int var80 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + '#'+ "'", var55.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + '#'+ "'", var67.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + false+ "'", var68.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 2);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test97");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test98");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    boolean var12 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var14);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    java.util.Iterator var25 = var22.iterator();
    int var26 = var22.size();
    var22.enqueue((java.lang.Object)(byte)10);
    int var29 = var22.size();
    var14.enqueue((java.lang.Object)var22);
    java.util.Iterator var31 = var22.iterator();
    boolean var32 = var22.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var34 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var34.enqueue((java.lang.Object)1.0d);
    boolean var37 = var34.isEmpty();
    int var38 = var34.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var40 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var41 = var40.isEmpty();
    boolean var42 = var40.isEmpty();
    boolean var43 = var40.isEmpty();
    int var44 = var40.size();
    java.util.Iterator var45 = var40.iterator();
    var34.enqueue((java.lang.Object)var40);
    var22.enqueue((java.lang.Object)var34);
    boolean var48 = var34.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var50 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var50.enqueue((java.lang.Object)'#');
    java.util.Iterator var53 = var50.iterator();
    java.util.Iterator var54 = var50.iterator();
    java.util.Iterator var55 = var50.iterator();
    boolean var56 = var50.isEmpty();
    java.util.Iterator var57 = var50.iterator();
    java.util.Iterator var58 = var50.iterator();
    boolean var59 = var50.isEmpty();
    int var60 = var50.size();
    var34.enqueue((java.lang.Object)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test99");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    var20.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var20.iterator();
    java.util.Iterator var27 = var20.iterator();
    var1.enqueue((java.lang.Object)var27);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var30 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    var1.enqueue((java.lang.Object)var34);
    java.util.Iterator var36 = var1.iterator();
    boolean var37 = var1.isEmpty();
    java.lang.Object var38 = var1.dequeue();
    java.lang.Object var39 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var41 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var42 = var41.isEmpty();
    boolean var43 = var41.isEmpty();
    java.util.Iterator var44 = var41.iterator();
    boolean var45 = var41.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var47 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var47.enqueue((java.lang.Object)'#');
    java.util.Iterator var50 = var47.iterator();
    java.util.Iterator var51 = var47.iterator();
    var47.enqueue((java.lang.Object)false);
    int var54 = var47.size();
    var41.enqueue((java.lang.Object)var47);
    java.util.Iterator var56 = var47.iterator();
    java.lang.Object var57 = var47.dequeue();
    java.util.Iterator var58 = var47.iterator();
    var1.enqueue((java.lang.Object)var58);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var61 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var61.enqueue((java.lang.Object)'#');
    java.util.Iterator var64 = var61.iterator();
    java.util.Iterator var65 = var61.iterator();
    java.util.Iterator var66 = var61.iterator();
    boolean var67 = var61.isEmpty();
    java.util.Iterator var68 = var61.iterator();
    java.util.Iterator var69 = var61.iterator();
    var61.enqueue((java.lang.Object)1.0f);
    java.lang.Object var72 = var61.dequeue();
    java.util.Iterator var73 = var61.iterator();
    java.util.Iterator var74 = var61.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var76 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var77 = var76.size();
    int var78 = var76.size();
    java.util.Iterator var79 = var76.iterator();
    boolean var80 = var76.isEmpty();
    java.util.Iterator var81 = var76.iterator();
    var61.enqueue((java.lang.Object)var76);
    var1.enqueue((java.lang.Object)var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + '#'+ "'", var38.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + false+ "'", var39.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + '#'+ "'", var57.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + '#'+ "'", var72.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test100");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    var1.enqueue((java.lang.Object)(short)0);
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0d+ "'", var7.equals(1.0d));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test101");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    var9.enqueue((java.lang.Object)false);
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var23 = var22.isEmpty();
    java.util.Iterator var24 = var22.iterator();
    var20.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var20.iterator();
    java.util.Iterator var27 = var20.iterator();
    var1.enqueue((java.lang.Object)var27);
    boolean var29 = var1.isEmpty();
    java.util.Iterator var30 = var1.iterator();
    int var31 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 4);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test102");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var10 = var7.iterator();
    var7.enqueue((java.lang.Object)(byte)1);
    boolean var13 = var7.isEmpty();
    java.util.Iterator var14 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    boolean var16 = var7.isEmpty();
    java.lang.Object var17 = var7.dequeue();
    java.lang.Object var18 = var7.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    int var25 = var20.size();
    int var26 = var20.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var29 = var28.size();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    int var33 = var20.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var35 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var35.enqueue((java.lang.Object)'#');
    boolean var38 = var35.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var40 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var40.enqueue((java.lang.Object)'#');
    java.util.Iterator var43 = var40.iterator();
    java.util.Iterator var44 = var40.iterator();
    boolean var45 = var40.isEmpty();
    boolean var46 = var40.isEmpty();
    var35.enqueue((java.lang.Object)var40);
    var20.enqueue((java.lang.Object)var35);
    var7.enqueue((java.lang.Object)var35);
    java.util.Iterator var50 = var35.iterator();
    int var51 = var35.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 1.0d+ "'", var17.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (byte)1+ "'", var18.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test103");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var16 = var7.iterator();
    java.lang.Object var17 = var7.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    var19.enqueue((java.lang.Object)100.0d);
    java.lang.Object var25 = var19.dequeue();
    java.util.Iterator var26 = var19.iterator();
    var7.enqueue((java.lang.Object)var26);
    boolean var28 = var7.isEmpty();
    java.lang.Object var29 = var7.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test104");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var10 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    java.util.Iterator var14 = var10.iterator();
    java.lang.Object var15 = var10.dequeue();
    java.util.Iterator var16 = var10.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    boolean var23 = var18.isEmpty();
    java.lang.Object var24 = var18.dequeue();
    java.util.Iterator var25 = var18.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    var27.enqueue((java.lang.Object)false);
    int var34 = var27.size();
    boolean var35 = var27.isEmpty();
    java.lang.Object var36 = var27.dequeue();
    java.lang.Object var37 = var27.dequeue();
    java.util.Iterator var38 = var27.iterator();
    var27.enqueue((java.lang.Object)'4');
    java.util.Iterator var41 = var27.iterator();
    var18.enqueue((java.lang.Object)var27);
    boolean var43 = var18.isEmpty();
    java.lang.Object var44 = var18.dequeue();
    var10.enqueue((java.lang.Object)var18);
    var1.enqueue((java.lang.Object)var18);
    boolean var47 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var49 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var49.enqueue((java.lang.Object)'#');
    java.util.Iterator var52 = var49.iterator();
    java.util.Iterator var53 = var49.iterator();
    var49.enqueue((java.lang.Object)false);
    int var56 = var49.size();
    boolean var57 = var49.isEmpty();
    java.lang.Object var58 = var49.dequeue();
    java.lang.Object var59 = var49.dequeue();
    java.util.Iterator var60 = var49.iterator();
    var49.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var64 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var64.enqueue((java.lang.Object)'#');
    int var67 = var64.size();
    var64.enqueue((java.lang.Object)true);
    java.util.Iterator var70 = var64.iterator();
    java.util.Iterator var71 = var64.iterator();
    var49.enqueue((java.lang.Object)var71);
    java.util.Iterator var73 = var49.iterator();
    var1.enqueue((java.lang.Object)var49);
    java.util.Iterator var75 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + false+ "'", var37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + '#'+ "'", var58.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + false+ "'", var59.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test105");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.lang.Object var11 = var1.dequeue();
    java.util.Iterator var12 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    int var19 = var14.size();
    int var20 = var14.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var22 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var23 = var22.size();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var14.enqueue((java.lang.Object)var25);
    int var27 = var14.size();
    var1.enqueue((java.lang.Object)var27);
    java.lang.Object var29 = var1.dequeue();
    boolean var30 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 1+ "'", var29.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test106");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    var6.enqueue((java.lang.Object)false);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    var14.enqueue((java.lang.Object)false);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    var6.enqueue((java.lang.Object)var14);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var28 = var27.isEmpty();
    java.util.Iterator var29 = var27.iterator();
    var25.enqueue((java.lang.Object)var29);
    java.util.Iterator var31 = var25.iterator();
    java.util.Iterator var32 = var25.iterator();
    var6.enqueue((java.lang.Object)var32);
    boolean var34 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var34);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var37 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var37.enqueue((java.lang.Object)'#');
    boolean var40 = var37.isEmpty();
    boolean var41 = var37.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var43 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var43.enqueue((java.lang.Object)'#');
    int var46 = var43.size();
    var37.enqueue((java.lang.Object)var43);
    int var48 = var43.size();
    var1.enqueue((java.lang.Object)var43);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var51 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var51.enqueue((java.lang.Object)'#');
    java.util.Iterator var54 = var51.iterator();
    java.util.Iterator var55 = var51.iterator();
    boolean var56 = var51.isEmpty();
    java.lang.Object var57 = var51.dequeue();
    java.util.Iterator var58 = var51.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var60 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var60.enqueue((java.lang.Object)'#');
    java.util.Iterator var63 = var60.iterator();
    java.util.Iterator var64 = var60.iterator();
    java.util.Iterator var65 = var60.iterator();
    boolean var66 = var60.isEmpty();
    java.util.Iterator var67 = var60.iterator();
    java.lang.Object var68 = var60.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var70 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var71 = var70.isEmpty();
    boolean var72 = var70.isEmpty();
    java.util.Iterator var73 = var70.iterator();
    int var74 = var70.size();
    var70.enqueue((java.lang.Object)(byte)10);
    boolean var77 = var70.isEmpty();
    var60.enqueue((java.lang.Object)var77);
    java.util.Iterator var79 = var60.iterator();
    var51.enqueue((java.lang.Object)var60);
    boolean var81 = var60.isEmpty();
    java.util.Iterator var82 = var60.iterator();
    var1.enqueue((java.lang.Object)var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + '#'+ "'", var57.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + '#'+ "'", var68.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test107");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var9 = var8.isEmpty();
    java.util.Iterator var10 = var8.iterator();
    int var11 = var8.size();
    int var12 = var8.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    java.util.Iterator var20 = var14.iterator();
    java.util.Iterator var21 = var14.iterator();
    var8.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var14);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    var25.enqueue((java.lang.Object)false);
    int var32 = var25.size();
    boolean var33 = var25.isEmpty();
    java.lang.Object var34 = var25.dequeue();
    java.lang.Object var35 = var25.dequeue();
    java.util.Iterator var36 = var25.iterator();
    var25.enqueue((java.lang.Object)'4');
    java.util.Iterator var39 = var25.iterator();
    boolean var40 = var25.isEmpty();
    java.util.Iterator var41 = var25.iterator();
    var1.enqueue((java.lang.Object)var25);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var44 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var45 = var44.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var47 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var47.enqueue((java.lang.Object)'#');
    java.util.Iterator var50 = var47.iterator();
    java.util.Iterator var51 = var47.iterator();
    var47.enqueue((java.lang.Object)false);
    int var54 = var47.size();
    boolean var55 = var47.isEmpty();
    java.lang.Object var56 = var47.dequeue();
    java.lang.Object var57 = var47.dequeue();
    java.util.Iterator var58 = var47.iterator();
    var47.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var62 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var62.enqueue((java.lang.Object)'#');
    int var65 = var62.size();
    var62.enqueue((java.lang.Object)true);
    java.util.Iterator var68 = var62.iterator();
    java.util.Iterator var69 = var62.iterator();
    var47.enqueue((java.lang.Object)var69);
    var44.enqueue((java.lang.Object)var47);
    java.util.Iterator var72 = var47.iterator();
    java.util.Iterator var73 = var47.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var75 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var76 = var75.isEmpty();
    boolean var77 = var75.isEmpty();
    boolean var78 = var75.isEmpty();
    int var79 = var75.size();
    boolean var80 = var75.isEmpty();
    boolean var81 = var75.isEmpty();
    boolean var82 = var75.isEmpty();
    java.util.Iterator var83 = var75.iterator();
    int var84 = var75.size();
    var47.enqueue((java.lang.Object)var84);
    java.util.Iterator var86 = var47.iterator();
    java.util.Iterator var87 = var47.iterator();
    int var88 = var47.size();
    var25.enqueue((java.lang.Object)var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '#'+ "'", var34.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + '#'+ "'", var56.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + false+ "'", var57.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 3);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test108");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)1.0d);
    var9.enqueue((java.lang.Object)(short)0);
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test109");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    boolean var12 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    java.util.Iterator var19 = var14.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var21 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    var21.enqueue((java.lang.Object)false);
    java.lang.Object var28 = var21.dequeue();
    boolean var29 = var21.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var31 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var33 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var34 = var33.isEmpty();
    java.util.Iterator var35 = var33.iterator();
    var31.enqueue((java.lang.Object)var35);
    var21.enqueue((java.lang.Object)var31);
    var14.enqueue((java.lang.Object)var21);
    boolean var39 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test110");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test111");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var12.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var15 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var19 = var18.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var21 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    var21.enqueue((java.lang.Object)false);
    java.lang.Object var28 = var21.dequeue();
    java.lang.Object var29 = var21.dequeue();
    java.util.Iterator var30 = var21.iterator();
    var18.enqueue((java.lang.Object)var21);
    boolean var32 = var21.isEmpty();
    java.util.Iterator var33 = var21.iterator();
    var1.enqueue((java.lang.Object)var33);
    java.lang.Object var35 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test112");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var10 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    var10.enqueue((java.lang.Object)false);
    int var17 = var10.size();
    boolean var18 = var10.isEmpty();
    java.lang.Object var19 = var10.dequeue();
    java.lang.Object var20 = var10.dequeue();
    java.util.Iterator var21 = var10.iterator();
    var10.enqueue((java.lang.Object)'4');
    java.util.Iterator var24 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    boolean var26 = var10.isEmpty();
    int var27 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + false+ "'", var20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test113");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var4 = var3.isEmpty();
    java.util.Iterator var5 = var3.iterator();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var7 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var15 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    int var22 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.util.Iterator var24 = var15.iterator();
    java.lang.Object var25 = var15.dequeue();
    java.util.Iterator var26 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var29 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    java.util.Iterator var32 = var29.iterator();
    boolean var33 = var29.isEmpty();
    var29.enqueue((java.lang.Object)'#');
    boolean var36 = var29.isEmpty();
    var15.enqueue((java.lang.Object)var29);
    int var38 = var15.size();
    boolean var39 = var15.isEmpty();
    int var40 = var15.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var42 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var42.enqueue((java.lang.Object)'#');
    java.util.Iterator var45 = var42.iterator();
    java.util.Iterator var46 = var42.iterator();
    java.util.Iterator var47 = var42.iterator();
    boolean var48 = var42.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var50 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var50.enqueue((java.lang.Object)'#');
    int var53 = var50.size();
    java.util.Iterator var54 = var50.iterator();
    var42.enqueue((java.lang.Object)var50);
    int var56 = var42.size();
    int var57 = var42.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var59 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var60 = var59.isEmpty();
    boolean var61 = var59.isEmpty();
    int var62 = var59.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var64 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var65 = var64.size();
    boolean var66 = var64.isEmpty();
    var59.enqueue((java.lang.Object)var64);
    var42.enqueue((java.lang.Object)var59);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var70 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var70.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var73 = var70.iterator();
    boolean var74 = var70.isEmpty();
    java.util.Iterator var75 = var70.iterator();
    var42.enqueue((java.lang.Object)var70);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var78 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var79 = var78.isEmpty();
    boolean var80 = var78.isEmpty();
    boolean var81 = var78.isEmpty();
    int var82 = var78.size();
    boolean var83 = var78.isEmpty();
    boolean var84 = var78.isEmpty();
    boolean var85 = var78.isEmpty();
    java.util.Iterator var86 = var78.iterator();
    int var87 = var78.size();
    boolean var88 = var78.isEmpty();
    var70.enqueue((java.lang.Object)var78);
    var15.enqueue((java.lang.Object)var70);
    java.util.Iterator var91 = var70.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test114");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test115");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var13 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    boolean var14 = var13.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var17 = var16.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    java.util.Iterator var24 = var19.iterator();
    boolean var25 = var19.isEmpty();
    java.util.Iterator var26 = var19.iterator();
    java.util.Iterator var27 = var19.iterator();
    var16.enqueue((java.lang.Object)var19);
    int var29 = var16.size();
    boolean var30 = var16.isEmpty();
    java.lang.Object var31 = var16.dequeue();
    var13.enqueue((java.lang.Object)var16);
    var1.enqueue((java.lang.Object)var16);
    boolean var34 = var16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test116");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    var14.enqueue((java.lang.Object)false);
    java.lang.Object var21 = var14.dequeue();
    java.lang.Object var22 = var14.dequeue();
    int var23 = var14.size();
    var1.enqueue((java.lang.Object)var23);
    java.lang.Object var25 = var1.dequeue();
    int var26 = var1.size();
    int var27 = var1.size();
    java.util.Iterator var28 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 1.0f+ "'", var25.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test117");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    int var17 = var1.size();
    boolean var18 = var1.isEmpty();
    boolean var19 = var1.isEmpty();
    java.util.Iterator var20 = var1.iterator();
    boolean var21 = var1.isEmpty();
    java.lang.Object var22 = var1.dequeue();
    java.lang.Object var23 = var1.dequeue();
    boolean var24 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '#'+ "'", var22.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test118");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var15 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    java.util.Iterator var20 = var15.iterator();
    boolean var21 = var15.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    var23.enqueue((java.lang.Object)false);
    java.lang.Object var30 = var23.dequeue();
    java.lang.Object var31 = var23.dequeue();
    java.util.Iterator var32 = var23.iterator();
    var15.enqueue((java.lang.Object)var32);
    int var34 = var15.size();
    java.lang.Object var35 = var15.dequeue();
    java.util.Iterator var36 = var15.iterator();
    int var37 = var15.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var39 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var40 = var39.iterator();
    java.util.Iterator var41 = var39.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var43 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    java.util.Iterator var46 = var43.iterator();
    boolean var47 = var43.isEmpty();
    int var48 = var43.size();
    int var49 = var43.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var51 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var52 = var51.size();
    boolean var53 = var51.isEmpty();
    boolean var54 = var51.isEmpty();
    var43.enqueue((java.lang.Object)var54);
    int var56 = var43.size();
    var39.enqueue((java.lang.Object)var43);
    java.lang.Object var58 = var43.dequeue();
    boolean var59 = var43.isEmpty();
    var15.enqueue((java.lang.Object)var59);
    var1.enqueue((java.lang.Object)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + '#'+ "'", var30.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + '#'+ "'", var35.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + true+ "'", var58.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test119");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var4 = var3.size();
    int var5 = var3.size();
    java.util.Iterator var6 = var3.iterator();
    boolean var7 = var3.isEmpty();
    var1.enqueue((java.lang.Object)var3);
    java.util.Iterator var9 = var3.iterator();
    java.util.Iterator var10 = var3.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test120");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test121");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var3 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var3.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var6 = var3.iterator();
    var3.enqueue((java.lang.Object)(byte)1);
    boolean var9 = var3.isEmpty();
    boolean var10 = var3.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    var3.enqueue((java.lang.Object)var12);
    java.util.Iterator var16 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var21 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var22 = var21.isEmpty();
    java.util.Iterator var23 = var21.iterator();
    var19.enqueue((java.lang.Object)var23);
    java.util.Iterator var25 = var19.iterator();
    java.lang.Object var26 = var19.dequeue();
    java.util.Iterator var27 = var19.iterator();
    var1.enqueue((java.lang.Object)var19);
    java.util.Iterator var29 = var19.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test122");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    boolean var17 = var12.isEmpty();
    java.lang.Object var18 = var12.dequeue();
    java.util.Iterator var19 = var12.iterator();
    var12.enqueue((java.lang.Object)1);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var23.enqueue((java.lang.Object)'#');
    boolean var26 = var23.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var28.enqueue((java.lang.Object)'#');
    java.util.Iterator var31 = var28.iterator();
    java.util.Iterator var32 = var28.iterator();
    boolean var33 = var28.isEmpty();
    boolean var34 = var28.isEmpty();
    var23.enqueue((java.lang.Object)var28);
    var12.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var12);
    java.lang.Object var38 = var12.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var40 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(2);
    boolean var41 = var40.isEmpty();
    java.util.Iterator var42 = var40.iterator();
    boolean var43 = var40.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var45 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    java.util.Iterator var48 = var45.iterator();
    boolean var49 = var45.isEmpty();
    int var50 = var45.size();
    int var51 = var45.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var53 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var54 = var53.size();
    boolean var55 = var53.isEmpty();
    boolean var56 = var53.isEmpty();
    var45.enqueue((java.lang.Object)var56);
    java.lang.Object var58 = var45.dequeue();
    var40.enqueue(var58);
    var40.enqueue((java.lang.Object)(short)10);
    java.util.Iterator var62 = var40.iterator();
    var12.enqueue((java.lang.Object)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 1.0d+ "'", var10.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + '#'+ "'", var18.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + 1+ "'", var38.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + true+ "'", var58.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test123");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test124");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var14 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var17 = var16.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    var19.enqueue((java.lang.Object)false);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    java.lang.Object var28 = var19.dequeue();
    java.lang.Object var29 = var19.dequeue();
    java.util.Iterator var30 = var19.iterator();
    var19.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var34 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var34.enqueue((java.lang.Object)'#');
    int var37 = var34.size();
    var34.enqueue((java.lang.Object)true);
    java.util.Iterator var40 = var34.iterator();
    java.util.Iterator var41 = var34.iterator();
    var19.enqueue((java.lang.Object)var41);
    var16.enqueue((java.lang.Object)var19);
    java.util.Iterator var44 = var19.iterator();
    java.lang.Object var45 = var19.dequeue();
    java.util.Iterator var46 = var19.iterator();
    var1.enqueue((java.lang.Object)var46);
    boolean var48 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '4'+ "'", var45.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test125");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test126");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var14 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var17 = var16.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    var19.enqueue((java.lang.Object)false);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    java.lang.Object var28 = var19.dequeue();
    java.lang.Object var29 = var19.dequeue();
    java.util.Iterator var30 = var19.iterator();
    var19.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var34 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var34.enqueue((java.lang.Object)'#');
    int var37 = var34.size();
    var34.enqueue((java.lang.Object)true);
    java.util.Iterator var40 = var34.iterator();
    java.util.Iterator var41 = var34.iterator();
    var19.enqueue((java.lang.Object)var41);
    var16.enqueue((java.lang.Object)var19);
    java.util.Iterator var44 = var19.iterator();
    java.lang.Object var45 = var19.dequeue();
    java.util.Iterator var46 = var19.iterator();
    var1.enqueue((java.lang.Object)var46);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var49 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    boolean var52 = var49.isEmpty();
    int var53 = var49.size();
    boolean var54 = var49.isEmpty();
    int var55 = var49.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var57 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var57.enqueue((java.lang.Object)'#');
    java.util.Iterator var60 = var57.iterator();
    java.util.Iterator var61 = var57.iterator();
    java.util.Iterator var62 = var57.iterator();
    boolean var63 = var57.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var65 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var65.enqueue((java.lang.Object)'#');
    java.util.Iterator var68 = var65.iterator();
    java.util.Iterator var69 = var65.iterator();
    var65.enqueue((java.lang.Object)false);
    java.lang.Object var72 = var65.dequeue();
    java.lang.Object var73 = var65.dequeue();
    java.util.Iterator var74 = var65.iterator();
    var57.enqueue((java.lang.Object)var74);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var77 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var77.enqueue((java.lang.Object)1.0d);
    boolean var80 = var77.isEmpty();
    int var81 = var77.size();
    var57.enqueue((java.lang.Object)var77);
    var49.enqueue((java.lang.Object)var57);
    java.util.Iterator var84 = var49.iterator();
    int var85 = var49.size();
    var1.enqueue((java.lang.Object)var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '4'+ "'", var45.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + '#'+ "'", var72.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + false+ "'", var73.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 1);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test127");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    var1.enqueue((java.lang.Object)(short)(-1));
    java.lang.Object var13 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var15 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    var15.enqueue((java.lang.Object)100.0d);
    java.lang.Object var21 = var15.dequeue();
    int var22 = var15.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var24 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    boolean var29 = var24.isEmpty();
    java.lang.Object var30 = var24.dequeue();
    java.util.Iterator var31 = var24.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var33 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var33.enqueue((java.lang.Object)'#');
    java.util.Iterator var36 = var33.iterator();
    java.util.Iterator var37 = var33.iterator();
    java.util.Iterator var38 = var33.iterator();
    boolean var39 = var33.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var41 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var41.enqueue((java.lang.Object)'#');
    int var44 = var41.size();
    java.util.Iterator var45 = var41.iterator();
    var33.enqueue((java.lang.Object)var41);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var48 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var49 = var48.iterator();
    java.util.Iterator var50 = var48.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var52 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    java.util.Iterator var55 = var52.iterator();
    boolean var56 = var52.isEmpty();
    int var57 = var52.size();
    int var58 = var52.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var60 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var61 = var60.size();
    boolean var62 = var60.isEmpty();
    boolean var63 = var60.isEmpty();
    var52.enqueue((java.lang.Object)var63);
    int var65 = var52.size();
    var48.enqueue((java.lang.Object)var52);
    var41.enqueue((java.lang.Object)var48);
    var24.enqueue((java.lang.Object)var48);
    java.util.Iterator var69 = var48.iterator();
    var15.enqueue((java.lang.Object)var48);
    var1.enqueue((java.lang.Object)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + false+ "'", var10.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + (short)(-1)+ "'", var13.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + '#'+ "'", var30.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test128");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    int var19 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var21 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    java.util.Iterator var24 = var21.iterator();
    boolean var25 = var21.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    var27.enqueue((java.lang.Object)false);
    int var34 = var27.size();
    var21.enqueue((java.lang.Object)var27);
    java.util.Iterator var36 = var27.iterator();
    java.lang.Object var37 = var27.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var39 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var39.enqueue((java.lang.Object)'#');
    java.util.Iterator var42 = var39.iterator();
    var39.enqueue((java.lang.Object)100.0d);
    java.lang.Object var45 = var39.dequeue();
    java.util.Iterator var46 = var39.iterator();
    var27.enqueue((java.lang.Object)var46);
    int var48 = var27.size();
    var1.enqueue((java.lang.Object)var48);
    java.util.Iterator var50 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + '#'+ "'", var37.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '#'+ "'", var45.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test129");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var10 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    var10.enqueue((java.lang.Object)false);
    int var17 = var10.size();
    boolean var18 = var10.isEmpty();
    java.lang.Object var19 = var10.dequeue();
    java.lang.Object var20 = var10.dequeue();
    java.util.Iterator var21 = var10.iterator();
    var10.enqueue((java.lang.Object)'4');
    java.util.Iterator var24 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    boolean var26 = var10.isEmpty();
    boolean var27 = var10.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var29 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var29.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var32 = var29.iterator();
    java.lang.Object var33 = var29.dequeue();
    java.util.Iterator var34 = var29.iterator();
    var10.enqueue((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + false+ "'", var20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 1.0d+ "'", var33.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test130");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    java.lang.Object var14 = var7.dequeue();
    java.lang.Object var15 = var7.dequeue();
    java.util.Iterator var16 = var7.iterator();
    var1.enqueue((java.lang.Object)var7);
    int var18 = var7.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.lang.Object var28 = var20.dequeue();
    java.util.Iterator var29 = var20.iterator();
    java.util.Iterator var30 = var20.iterator();
    int var31 = var20.size();
    var7.enqueue((java.lang.Object)var20);
    int var33 = var20.size();
    boolean var34 = var20.isEmpty();
    boolean var35 = var20.isEmpty();
    boolean var36 = var20.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + '#'+ "'", var28.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test131");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test132");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)(byte)1);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var9 = var8.isEmpty();
    java.util.Iterator var10 = var8.iterator();
    int var11 = var8.size();
    int var12 = var8.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var14 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    var14.enqueue((java.lang.Object)true);
    java.util.Iterator var20 = var14.iterator();
    java.util.Iterator var21 = var14.iterator();
    var8.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var14);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var25 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    var25.enqueue((java.lang.Object)false);
    int var32 = var25.size();
    boolean var33 = var25.isEmpty();
    java.lang.Object var34 = var25.dequeue();
    java.lang.Object var35 = var25.dequeue();
    java.util.Iterator var36 = var25.iterator();
    var25.enqueue((java.lang.Object)'4');
    java.util.Iterator var39 = var25.iterator();
    boolean var40 = var25.isEmpty();
    java.util.Iterator var41 = var25.iterator();
    var1.enqueue((java.lang.Object)var25);
    boolean var43 = var25.isEmpty();
    boolean var44 = var25.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '#'+ "'", var34.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test133");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    java.lang.Object var17 = var1.dequeue();
    boolean var18 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var21 = var20.iterator();
    java.util.Iterator var22 = var20.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var24 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    int var29 = var24.size();
    int var30 = var24.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var32 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var33 = var32.size();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    var24.enqueue((java.lang.Object)var35);
    int var37 = var24.size();
    var20.enqueue((java.lang.Object)var24);
    java.lang.Object var39 = var24.dequeue();
    var1.enqueue(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + true+ "'", var39.equals(true));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test134");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    int var16 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    int var21 = var18.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var23 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var24 = var23.size();
    boolean var25 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var18);
    boolean var28 = var18.isEmpty();
    java.util.Iterator var29 = var18.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var31 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    boolean var36 = var31.isEmpty();
    java.lang.Object var37 = var31.dequeue();
    java.util.Iterator var38 = var31.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var40 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var40.enqueue((java.lang.Object)'#');
    java.util.Iterator var43 = var40.iterator();
    java.util.Iterator var44 = var40.iterator();
    var40.enqueue((java.lang.Object)false);
    int var47 = var40.size();
    boolean var48 = var40.isEmpty();
    java.lang.Object var49 = var40.dequeue();
    java.lang.Object var50 = var40.dequeue();
    java.util.Iterator var51 = var40.iterator();
    var40.enqueue((java.lang.Object)'4');
    java.util.Iterator var54 = var40.iterator();
    var31.enqueue((java.lang.Object)var40);
    boolean var56 = var31.isEmpty();
    java.lang.Object var57 = var31.dequeue();
    var18.enqueue((java.lang.Object)var31);
    int var59 = var31.size();
    boolean var60 = var31.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + '#'+ "'", var37.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + '#'+ "'", var49.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + false+ "'", var50.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test135");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    int var10 = var7.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var13 = var12.size();
    boolean var14 = var12.isEmpty();
    var7.enqueue((java.lang.Object)var12);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    java.lang.Object var23 = var17.dequeue();
    boolean var24 = var17.isEmpty();
    int var25 = var17.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var27.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var30 = var27.iterator();
    var27.enqueue((java.lang.Object)(byte)1);
    boolean var33 = var27.isEmpty();
    boolean var34 = var27.isEmpty();
    int var35 = var27.size();
    java.lang.Object var36 = var27.dequeue();
    var17.enqueue((java.lang.Object)var27);
    java.lang.Object var38 = var17.dequeue();
    var12.enqueue((java.lang.Object)var17);
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var41 = var17.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var42 = var17.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 1.0d+ "'", var36.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test136");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.lang.Object var9 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var11 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var12 = var11.iterator();
    boolean var13 = var11.isEmpty();
    int var14 = var11.size();
    boolean var15 = var11.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var11.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test137");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.lang.Object var9 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var11 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var12 = var11.iterator();
    boolean var13 = var11.isEmpty();
    int var14 = var11.size();
    boolean var15 = var11.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    boolean var24 = var18.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var26 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var26.enqueue((java.lang.Object)'#');
    int var29 = var26.size();
    java.util.Iterator var30 = var26.iterator();
    var18.enqueue((java.lang.Object)var26);
    var11.enqueue((java.lang.Object)var18);
    int var33 = var18.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + '#'+ "'", var9.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test138");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var5 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    java.util.Iterator var8 = var5.iterator();
    boolean var9 = var5.isEmpty();
    int var10 = var5.size();
    int var11 = var5.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var13 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var5.enqueue((java.lang.Object)var16);
    int var18 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var20 = var5.iterator();
    java.util.Iterator var21 = var5.iterator();
    java.lang.Object var22 = var5.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + true+ "'", var22.equals(true));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test139");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var10 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var12 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var13 = var12.isEmpty();
    java.util.Iterator var14 = var12.iterator();
    var10.enqueue((java.lang.Object)var14);
    java.util.Iterator var16 = var10.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var18 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    boolean var22 = var18.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var24 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    var24.enqueue((java.lang.Object)false);
    int var31 = var24.size();
    var18.enqueue((java.lang.Object)var24);
    java.util.Iterator var33 = var24.iterator();
    java.lang.Object var34 = var24.dequeue();
    java.util.Iterator var35 = var24.iterator();
    var10.enqueue((java.lang.Object)var24);
    java.util.Iterator var37 = var10.iterator();
    var1.enqueue((java.lang.Object)var37);
    int var39 = var1.size();
    java.lang.Object var40 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + '#'+ "'", var34.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + false+ "'", var40.equals(false));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test140");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var11 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    java.util.Iterator var12 = var11.iterator();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    java.lang.Object var15 = var1.dequeue();
    int var16 = var1.size();
    java.lang.Object var17 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test141");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var6 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var14 = var6.isEmpty();
    int var15 = var6.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    int var24 = var17.size();
    boolean var25 = var17.isEmpty();
    int var26 = var17.size();
    java.util.Iterator var27 = var17.iterator();
    var6.enqueue((java.lang.Object)var27);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var30 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var36 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    var36.enqueue((java.lang.Object)false);
    int var43 = var36.size();
    var30.enqueue((java.lang.Object)var36);
    java.util.Iterator var45 = var36.iterator();
    var6.enqueue((java.lang.Object)var36);
    java.lang.Object var47 = var6.dequeue();
    java.util.Iterator var48 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + '#'+ "'", var47.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test142");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var12 = var1.dequeue();
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var17 = var16.size();
    int var18 = var16.size();
    java.util.Iterator var19 = var16.iterator();
    boolean var20 = var16.isEmpty();
    java.util.Iterator var21 = var16.iterator();
    var1.enqueue((java.lang.Object)var16);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var24 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    java.util.Iterator var29 = var24.iterator();
    boolean var30 = var24.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var32 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var32.enqueue((java.lang.Object)'#');
    int var35 = var32.size();
    java.util.Iterator var36 = var32.iterator();
    var24.enqueue((java.lang.Object)var32);
    int var38 = var24.size();
    java.util.Iterator var39 = var24.iterator();
    java.util.Iterator var40 = var24.iterator();
    java.util.Iterator var41 = var24.iterator();
    var1.enqueue((java.lang.Object)var24);
    boolean var43 = var1.isEmpty();
    java.util.Iterator var44 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test143");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var4 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    int var11 = var4.size();
    boolean var12 = var4.isEmpty();
    java.lang.Object var13 = var4.dequeue();
    java.lang.Object var14 = var4.dequeue();
    java.util.Iterator var15 = var4.iterator();
    var4.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    int var22 = var19.size();
    var19.enqueue((java.lang.Object)true);
    java.util.Iterator var25 = var19.iterator();
    java.util.Iterator var26 = var19.iterator();
    var4.enqueue((java.lang.Object)var26);
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var29 = var4.iterator();
    java.util.Iterator var30 = var4.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var32 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    boolean var37 = var32.isEmpty();
    boolean var38 = var32.isEmpty();
    boolean var39 = var32.isEmpty();
    java.util.Iterator var40 = var32.iterator();
    int var41 = var32.size();
    var4.enqueue((java.lang.Object)var41);
    java.util.Iterator var43 = var4.iterator();
    java.util.Iterator var44 = var4.iterator();
    int var45 = var4.size();
    int var46 = var4.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '#'+ "'", var13.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 3);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test144");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test145");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var10 = var9.size();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    int var15 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var17 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var18 = var17.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var20 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    java.util.Iterator var25 = var20.iterator();
    boolean var26 = var20.isEmpty();
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    var17.enqueue((java.lang.Object)var20);
    var1.enqueue((java.lang.Object)var20);
    java.util.Iterator var31 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var33 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    int var36 = var33.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var38 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    int var39 = var38.size();
    boolean var40 = var38.isEmpty();
    var33.enqueue((java.lang.Object)var38);
    java.util.Iterator var42 = var33.iterator();
    var1.enqueue((java.lang.Object)var33);
    java.lang.Object var44 = var33.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test146");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var17 = var1.iterator();
    boolean var18 = var1.isEmpty();
    int var19 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 3);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test147");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var7 = var1.iterator();
    java.lang.Object var8 = var1.dequeue();
    java.lang.Object var9 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 100.0d+ "'", var9.equals(100.0d));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test148");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var7 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    int var14 = var7.size();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var16 = var7.iterator();
    java.lang.Object var17 = var7.dequeue();
    java.util.Iterator var18 = var7.iterator();
    boolean var19 = var7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test149");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test150");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    java.util.Iterator var17 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var21 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var22 = var21.size();
    int var23 = var21.size();
    java.util.Iterator var24 = var21.iterator();
    boolean var25 = var21.isEmpty();
    var19.enqueue((java.lang.Object)var21);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var28.enqueue((java.lang.Object)'#');
    int var31 = var28.size();
    java.util.Iterator var32 = var28.iterator();
    java.lang.Object var33 = var28.dequeue();
    java.util.Iterator var34 = var28.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var36 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    boolean var41 = var36.isEmpty();
    java.lang.Object var42 = var36.dequeue();
    java.util.Iterator var43 = var36.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var45 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var45.enqueue((java.lang.Object)'#');
    java.util.Iterator var48 = var45.iterator();
    java.util.Iterator var49 = var45.iterator();
    var45.enqueue((java.lang.Object)false);
    int var52 = var45.size();
    boolean var53 = var45.isEmpty();
    java.lang.Object var54 = var45.dequeue();
    java.lang.Object var55 = var45.dequeue();
    java.util.Iterator var56 = var45.iterator();
    var45.enqueue((java.lang.Object)'4');
    java.util.Iterator var59 = var45.iterator();
    var36.enqueue((java.lang.Object)var45);
    boolean var61 = var36.isEmpty();
    java.lang.Object var62 = var36.dequeue();
    var28.enqueue((java.lang.Object)var36);
    var19.enqueue((java.lang.Object)var36);
    java.util.Iterator var65 = var36.iterator();
    var1.enqueue((java.lang.Object)var65);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var68 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var69 = var68.isEmpty();
    boolean var70 = var68.isEmpty();
    java.util.Iterator var71 = var68.iterator();
    boolean var72 = var68.isEmpty();
    java.util.Iterator var73 = var68.iterator();
    var1.enqueue((java.lang.Object)var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + '#'+ "'", var33.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + '#'+ "'", var42.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + '#'+ "'", var54.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + false+ "'", var55.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test151");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    boolean var17 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var9);
    boolean var19 = var9.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var21 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    var21.enqueue((java.lang.Object)false);
    int var28 = var21.size();
    boolean var29 = var21.isEmpty();
    java.lang.Object var30 = var21.dequeue();
    java.lang.Object var31 = var21.dequeue();
    java.util.Iterator var32 = var21.iterator();
    var21.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var36 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var36.enqueue((java.lang.Object)'#');
    int var39 = var36.size();
    var36.enqueue((java.lang.Object)true);
    java.util.Iterator var42 = var36.iterator();
    java.util.Iterator var43 = var36.iterator();
    var21.enqueue((java.lang.Object)var43);
    java.util.Iterator var45 = var21.iterator();
    java.lang.Object var46 = var21.dequeue();
    java.util.Iterator var47 = var21.iterator();
    var9.enqueue((java.lang.Object)var21);
    boolean var49 = var21.isEmpty();
    java.util.Iterator var50 = var21.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + '#'+ "'", var15.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + '#'+ "'", var30.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + '4'+ "'", var46.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test152");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var9 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var9.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var9);
    boolean var13 = var9.isEmpty();
    boolean var14 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test153");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var4 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    int var11 = var4.size();
    boolean var12 = var4.isEmpty();
    java.lang.Object var13 = var4.dequeue();
    java.lang.Object var14 = var4.dequeue();
    java.util.Iterator var15 = var4.iterator();
    var4.enqueue((java.lang.Object)'4');
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    int var22 = var19.size();
    var19.enqueue((java.lang.Object)true);
    java.util.Iterator var25 = var19.iterator();
    java.util.Iterator var26 = var19.iterator();
    var4.enqueue((java.lang.Object)var26);
    var1.enqueue((java.lang.Object)var4);
    int var29 = var1.size();
    java.lang.Object var30 = var1.dequeue();
    java.util.Iterator var31 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var32 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '#'+ "'", var13.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test154");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)'#');
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    int var9 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var11 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var11.enqueue((java.lang.Object)'#');
    int var14 = var11.size();
    java.util.Iterator var15 = var11.iterator();
    java.lang.Object var16 = var11.dequeue();
    java.util.Iterator var17 = var11.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var19 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    boolean var24 = var19.isEmpty();
    java.lang.Object var25 = var19.dequeue();
    java.util.Iterator var26 = var19.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var28 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var28.enqueue((java.lang.Object)'#');
    java.util.Iterator var31 = var28.iterator();
    java.util.Iterator var32 = var28.iterator();
    var28.enqueue((java.lang.Object)false);
    int var35 = var28.size();
    boolean var36 = var28.isEmpty();
    java.lang.Object var37 = var28.dequeue();
    java.lang.Object var38 = var28.dequeue();
    java.util.Iterator var39 = var28.iterator();
    var28.enqueue((java.lang.Object)'4');
    java.util.Iterator var42 = var28.iterator();
    var19.enqueue((java.lang.Object)var28);
    boolean var44 = var19.isEmpty();
    java.lang.Object var45 = var19.dequeue();
    var11.enqueue((java.lang.Object)var19);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var48 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(1);
    java.util.Iterator var49 = var48.iterator();
    var11.enqueue((java.lang.Object)var48);
    java.util.Iterator var51 = var48.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var53 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(100);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var55 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(0);
    int var56 = var55.size();
    int var57 = var55.size();
    java.util.Iterator var58 = var55.iterator();
    boolean var59 = var55.isEmpty();
    var53.enqueue((java.lang.Object)var55);
    java.util.Iterator var61 = var55.iterator();
    var48.enqueue((java.lang.Object)var61);
    java.lang.Object var63 = var48.dequeue();
    var1.enqueue((java.lang.Object)var48);
    int var65 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + '#'+ "'", var7.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + '#'+ "'", var25.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + '#'+ "'", var37.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + false+ "'", var38.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest2.test155");


    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var1 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var8 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    var8.enqueue((java.lang.Object)false);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var16 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    var16.enqueue((java.lang.Object)false);
    java.lang.Object var23 = var16.dequeue();
    int var24 = var16.size();
    var8.enqueue((java.lang.Object)var16);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var27 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var29 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var30 = var29.isEmpty();
    java.util.Iterator var31 = var29.iterator();
    var27.enqueue((java.lang.Object)var31);
    java.util.Iterator var33 = var27.iterator();
    java.util.Iterator var34 = var27.iterator();
    var8.enqueue((java.lang.Object)var34);
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var37 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    java.util.Iterator var40 = var37.iterator();
    boolean var41 = var37.isEmpty();
    var8.enqueue((java.lang.Object)var41);
    java.util.Iterator var43 = var8.iterator();
    boolean var44 = var8.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferWrapper var46 = new at.fhhagenberg.sqe.exercise13.RingBufferWrapper(10);
    var46.enqueue((java.lang.Object)'#');
    boolean var49 = var46.isEmpty();
    java.util.Iterator var50 = var46.iterator();
    var8.enqueue((java.lang.Object)var46);
    var1.enqueue((java.lang.Object)var8);
    java.lang.Object var53 = var1.dequeue();
    int var54 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + 1.0d+ "'", var53.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);

  }

}
