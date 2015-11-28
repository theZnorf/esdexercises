package randoop;

import junit.framework.*;

public class RingBufferMutantTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test1");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test2");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var14 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var19 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    java.util.Iterator var22 = var19.iterator();
    boolean var23 = var19.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var25 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    var25.enqueue((java.lang.Object)false);
    int var32 = var25.size();
    var19.enqueue((java.lang.Object)var25);
    var14.enqueue((java.lang.Object)var25);
    boolean var35 = var14.isEmpty();
    java.util.Iterator var36 = var14.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var38 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    java.util.Iterator var42 = var38.iterator();
    var38.enqueue((java.lang.Object)false);
    java.lang.Object var45 = var38.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var47 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var48 = var47.isEmpty();
    boolean var49 = var47.isEmpty();
    java.util.Iterator var50 = var47.iterator();
    boolean var51 = var47.isEmpty();
    var47.enqueue((java.lang.Object)'#');
    boolean var54 = var47.isEmpty();
    int var55 = var47.size();
    java.util.Iterator var56 = var47.iterator();
    var38.enqueue((java.lang.Object)var47);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var59 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var60 = var59.isEmpty();
    boolean var61 = var59.isEmpty();
    java.util.Iterator var62 = var59.iterator();
    boolean var63 = var59.isEmpty();
    int var64 = var59.size();
    int var65 = var59.size();
    java.util.Iterator var66 = var59.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var68 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var68.enqueue((java.lang.Object)'#');
    java.util.Iterator var71 = var68.iterator();
    java.util.Iterator var72 = var68.iterator();
    var68.enqueue((java.lang.Object)false);
    java.lang.Object var75 = var68.dequeue();
    var59.enqueue((java.lang.Object)var68);
    java.util.Iterator var77 = var59.iterator();
    var38.enqueue((java.lang.Object)var77);
    var14.enqueue((java.lang.Object)var38);
    java.lang.Object var80 = var14.dequeue();
    java.util.Iterator var81 = var14.iterator();
    var1.enqueue((java.lang.Object)var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '#'+ "'", var45.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + '#'+ "'", var75.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + '#'+ "'", var80.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test3");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(100);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var3 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var3.enqueue((java.lang.Object)'#');
    java.util.Iterator var6 = var3.iterator();
    java.util.Iterator var7 = var3.iterator();
    var3.enqueue((java.lang.Object)false);
    int var10 = var3.size();
    boolean var11 = var3.isEmpty();
    int var12 = var3.size();
    java.lang.Object var13 = new java.lang.Object();
    var3.enqueue(var13);
    var1.enqueue((java.lang.Object)var3);
    int var16 = var1.size();
    java.util.Iterator var17 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test4");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    var10.enqueue((java.lang.Object)false);
    int var17 = var10.size();
    boolean var18 = var10.isEmpty();
    java.util.Iterator var19 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var21 = var10.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + '#'+ "'", var21.equals('#'));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test5");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var6 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    var6.enqueue((java.lang.Object)' ');
    int var11 = var6.size();
    java.util.Iterator var12 = var6.iterator();
    boolean var13 = var6.isEmpty();
    java.util.Iterator var14 = var6.iterator();
    java.util.Iterator var15 = var6.iterator();
    java.lang.Object var16 = var6.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var18 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    var18.enqueue((java.lang.Object)false);
    int var25 = var18.size();
    boolean var26 = var18.isEmpty();
    boolean var27 = var18.isEmpty();
    boolean var28 = var18.isEmpty();
    int var29 = var18.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var31 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(100);
    int var32 = var31.size();
    java.util.Iterator var33 = var31.iterator();
    var18.enqueue((java.lang.Object)var31);
    boolean var35 = var18.isEmpty();
    java.lang.Object var36 = var18.dequeue();
    java.util.Iterator var37 = var18.iterator();
    java.util.Iterator var38 = var18.iterator();
    var6.enqueue((java.lang.Object)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var18);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + '#'+ "'", var16.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + '#'+ "'", var36.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test6");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(100);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test7");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    var12.enqueue((java.lang.Object)100.0d);
    boolean var18 = var12.isEmpty();
    java.lang.Object var19 = var12.dequeue();
    var1.enqueue(var19);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var22 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    var1.enqueue((java.lang.Object)var22);
    java.lang.Object var27 = var22.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var29 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var29.enqueue((java.lang.Object)'#');
    var29.enqueue((java.lang.Object)' ');
    int var34 = var29.size();
    java.util.Iterator var35 = var29.iterator();
    boolean var36 = var29.isEmpty();
    java.util.Iterator var37 = var29.iterator();
    java.util.Iterator var38 = var29.iterator();
    boolean var39 = var29.isEmpty();
    int var40 = var29.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var42 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var42.enqueue((java.lang.Object)'#');
    java.util.Iterator var45 = var42.iterator();
    java.util.Iterator var46 = var42.iterator();
    java.util.Iterator var47 = var42.iterator();
    java.lang.Object var48 = var42.dequeue();
    java.util.Iterator var49 = var42.iterator();
    var29.enqueue((java.lang.Object)var49);
    var22.enqueue((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertTrue("'" + var48 + "' != '" + '#'+ "'", var48.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test8");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var7 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    var7.enqueue((java.lang.Object)true);
    java.util.Iterator var13 = var7.iterator();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var15 = var1.iterator();
    int var16 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var18 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    int var21 = var18.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var23 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    var18.enqueue((java.lang.Object)var25);
    boolean var27 = var18.isEmpty();
    var1.enqueue((java.lang.Object)var27);
    java.lang.Object var29 = var1.dequeue();
    java.util.Iterator var30 = var1.iterator();
    java.util.Iterator var31 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test9");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var6 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    boolean var10 = var6.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    var12.enqueue((java.lang.Object)false);
    int var19 = var12.size();
    var6.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)var12);
    java.util.Iterator var22 = var12.iterator();
    java.util.Iterator var23 = var12.iterator();
    java.util.Iterator var24 = var12.iterator();
    java.util.Iterator var25 = var12.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test10");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test11");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var6 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    boolean var10 = var6.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    var12.enqueue((java.lang.Object)false);
    int var19 = var12.size();
    var6.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)var12);
    java.util.Iterator var22 = var1.iterator();
    java.util.Iterator var23 = var1.iterator();
    int var24 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var26 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    java.util.Iterator var27 = var26.iterator();
    boolean var28 = var26.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var30 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    var30.enqueue((java.lang.Object)false);
    java.lang.Object var37 = var30.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var39 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    java.util.Iterator var42 = var39.iterator();
    boolean var43 = var39.isEmpty();
    var39.enqueue((java.lang.Object)'#');
    boolean var46 = var39.isEmpty();
    int var47 = var39.size();
    java.util.Iterator var48 = var39.iterator();
    var30.enqueue((java.lang.Object)var39);
    int var50 = var39.size();
    java.lang.Object var51 = var39.dequeue();
    java.util.Iterator var52 = var39.iterator();
    var26.enqueue((java.lang.Object)var52);
    var1.enqueue((java.lang.Object)var52);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var56 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(2);
    java.util.Iterator var57 = var56.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var59 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var60 = var59.isEmpty();
    boolean var61 = var59.isEmpty();
    java.util.Iterator var62 = var59.iterator();
    boolean var63 = var59.isEmpty();
    int var64 = var59.size();
    java.util.Iterator var65 = var59.iterator();
    int var66 = var59.size();
    boolean var67 = var59.isEmpty();
    int var68 = var59.size();
    var56.enqueue((java.lang.Object)var59);
    java.util.Iterator var70 = var56.iterator();
    java.util.Iterator var71 = var56.iterator();
    var1.enqueue((java.lang.Object)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + '#'+ "'", var37.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + '#'+ "'", var51.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test12");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(4);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var6 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(100);
    int var7 = var6.size();
    int var8 = var6.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    java.util.Iterator var15 = var10.iterator();
    var6.enqueue((java.lang.Object)var15);
    java.util.Iterator var17 = var6.iterator();
    java.util.Iterator var18 = var6.iterator();
    var1.enqueue((java.lang.Object)var18);
    int var20 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test13");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var6 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    var12.enqueue((java.lang.Object)false);
    int var19 = var12.size();
    boolean var20 = var12.isEmpty();
    boolean var21 = var12.isEmpty();
    boolean var22 = var12.isEmpty();
    java.lang.Object var23 = var12.dequeue();
    java.util.Iterator var24 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var27 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var27.enqueue((java.lang.Object)'#');
    int var30 = var27.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var32 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    java.util.Iterator var35 = var32.iterator();
    boolean var36 = var32.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var38 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    java.util.Iterator var42 = var38.iterator();
    var38.enqueue((java.lang.Object)false);
    int var45 = var38.size();
    var32.enqueue((java.lang.Object)var38);
    var27.enqueue((java.lang.Object)var38);
    java.util.Iterator var48 = var27.iterator();
    java.util.Iterator var49 = var27.iterator();
    var1.enqueue((java.lang.Object)var27);
    java.util.Iterator var51 = var27.iterator();
    boolean var52 = var27.isEmpty();
    java.lang.Object var53 = var27.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + '#'+ "'", var53.equals('#'));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test14");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var7 = var1.iterator();
    java.lang.Object var8 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test15");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    int var12 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var14 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    java.util.Iterator var19 = var14.iterator();
    boolean var20 = var14.isEmpty();
    java.util.Iterator var21 = var14.iterator();
    java.lang.Object var22 = var14.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var24 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    int var28 = var24.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var30 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    var24.enqueue((java.lang.Object)var30);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var33 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(100);
    int var34 = var33.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var36 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    var36.enqueue((java.lang.Object)false);
    java.lang.Object var43 = var36.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var45 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    java.util.Iterator var48 = var45.iterator();
    boolean var49 = var45.isEmpty();
    var45.enqueue((java.lang.Object)'#');
    boolean var52 = var45.isEmpty();
    int var53 = var45.size();
    java.util.Iterator var54 = var45.iterator();
    var36.enqueue((java.lang.Object)var45);
    int var56 = var45.size();
    int var57 = var45.size();
    var33.enqueue((java.lang.Object)var57);
    java.lang.Object var59 = var33.dequeue();
    var30.enqueue(var59);
    java.util.Iterator var61 = var30.iterator();
    var14.enqueue((java.lang.Object)var30);
    java.util.Iterator var63 = var30.iterator();
    var1.enqueue((java.lang.Object)var30);
    java.lang.Object var65 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '#'+ "'", var22.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + '#'+ "'", var43.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + 1+ "'", var59.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + '#'+ "'", var65.equals('#'));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test16");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(2);
    java.util.Iterator var2 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var4 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var4.enqueue((java.lang.Object)'#');
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var4.enqueue((java.lang.Object)false);
    int var11 = var4.size();
    boolean var12 = var4.isEmpty();
    boolean var13 = var4.isEmpty();
    var1.enqueue((java.lang.Object)var4);
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test17");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.lang.Object var12 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var14 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    var14.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var21 = var14.iterator();
    var1.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + '#'+ "'", var12.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test18");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test19");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var6 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    boolean var10 = var6.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    var12.enqueue((java.lang.Object)false);
    int var19 = var12.size();
    var6.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)var12);
    java.util.Iterator var22 = var12.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var24 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    var24.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var31 = var24.iterator();
    boolean var32 = var24.isEmpty();
    java.lang.Object var33 = var24.dequeue();
    var12.enqueue(var33);
    java.util.Iterator var35 = var12.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 1.0d+ "'", var33.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test20");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test21");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    int var7 = var1.size();
    int var8 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    boolean var13 = var10.isEmpty();
    java.lang.Object var14 = var10.dequeue();
    java.util.Iterator var15 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    int var17 = var1.size();
    java.util.Iterator var18 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + '#'+ "'", var14.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test22");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    java.util.Iterator var15 = var10.iterator();
    int var16 = var10.size();
    var1.enqueue((java.lang.Object)var16);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var19 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var19.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var22 = var19.iterator();
    var1.enqueue((java.lang.Object)var22);
    boolean var24 = var1.isEmpty();
    int var25 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var27 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    java.util.Iterator var30 = var27.iterator();
    boolean var31 = var27.isEmpty();
    int var32 = var27.size();
    java.util.Iterator var33 = var27.iterator();
    int var34 = var27.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var36 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    var36.enqueue((java.lang.Object)false);
    java.lang.Object var43 = var36.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var45 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    java.util.Iterator var48 = var45.iterator();
    boolean var49 = var45.isEmpty();
    var45.enqueue((java.lang.Object)'#');
    boolean var52 = var45.isEmpty();
    int var53 = var45.size();
    java.util.Iterator var54 = var45.iterator();
    var36.enqueue((java.lang.Object)var45);
    int var56 = var45.size();
    int var57 = var45.size();
    var27.enqueue((java.lang.Object)var45);
    boolean var59 = var27.isEmpty();
    int var60 = var27.size();
    var1.enqueue((java.lang.Object)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + '#'+ "'", var43.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test23");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    int var15 = var12.size();
    var12.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)true);
    int var19 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 3);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test24");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var13 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    java.util.Iterator var18 = var13.iterator();
    var1.enqueue((java.lang.Object)var13);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var21 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(0);
    int var22 = var21.size();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    boolean var25 = var21.isEmpty();
    var13.enqueue((java.lang.Object)var21);
    int var27 = var13.size();
    java.util.Iterator var28 = var13.iterator();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test25");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    var1.enqueue((java.lang.Object)10.0f);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var11 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    boolean var15 = var11.isEmpty();
    int var16 = var11.size();
    int var17 = var11.size();
    java.util.Iterator var18 = var11.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var20 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    var20.enqueue((java.lang.Object)false);
    java.lang.Object var27 = var20.dequeue();
    var11.enqueue((java.lang.Object)var20);
    java.util.Iterator var29 = var11.iterator();
    boolean var30 = var11.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var32 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    int var35 = var32.size();
    java.util.Iterator var36 = var32.iterator();
    var11.enqueue((java.lang.Object)var32);
    java.util.Iterator var38 = var11.iterator();
    var1.enqueue((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + '#'+ "'", var27.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test26");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    var1.enqueue((java.lang.Object)100.0d);
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    java.lang.Object var11 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + '#'+ "'", var11.equals('#'));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test27");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    int var7 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var9 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(0);
    java.util.Iterator var10 = var9.iterator();
    boolean var11 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    int var15 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test28");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    var1.enqueue((java.lang.Object)true);
    java.util.Iterator var7 = var1.iterator();
    java.lang.Object var8 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var10);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var17 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    java.util.Iterator var20 = var17.iterator();
    boolean var21 = var17.isEmpty();
    var17.enqueue((java.lang.Object)'#');
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var25 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    java.util.Iterator var28 = var25.iterator();
    boolean var29 = var25.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var31 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    var31.enqueue((java.lang.Object)false);
    int var38 = var31.size();
    var25.enqueue((java.lang.Object)var31);
    int var40 = var25.size();
    var17.enqueue((java.lang.Object)var40);
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var43 = var17.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var45 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var45.enqueue((java.lang.Object)'#');
    java.util.Iterator var48 = var45.iterator();
    java.util.Iterator var49 = var45.iterator();
    var45.enqueue((java.lang.Object)false);
    int var52 = var45.size();
    boolean var53 = var45.isEmpty();
    boolean var54 = var45.isEmpty();
    boolean var55 = var45.isEmpty();
    int var56 = var45.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var58 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(100);
    int var59 = var58.size();
    java.util.Iterator var60 = var58.iterator();
    var45.enqueue((java.lang.Object)var58);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var63 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var64 = var63.isEmpty();
    boolean var65 = var63.isEmpty();
    boolean var66 = var63.isEmpty();
    int var67 = var63.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var69 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    var63.enqueue((java.lang.Object)var69);
    java.lang.Object var71 = var63.dequeue();
    var45.enqueue(var71);
    int var73 = var45.size();
    var17.enqueue((java.lang.Object)var45);
    int var75 = var45.size();
    java.util.Iterator var76 = var45.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
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
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test29");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var6 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    var12.enqueue((java.lang.Object)false);
    int var19 = var12.size();
    boolean var20 = var12.isEmpty();
    boolean var21 = var12.isEmpty();
    boolean var22 = var12.isEmpty();
    java.lang.Object var23 = var12.dequeue();
    java.util.Iterator var24 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var27 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(0);
    int var28 = var27.size();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    boolean var31 = var27.isEmpty();
    var12.enqueue((java.lang.Object)var27);
    java.util.Iterator var33 = var12.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + '#'+ "'", var23.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test30");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    int var7 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var9 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(0);
    java.util.Iterator var10 = var9.iterator();
    boolean var11 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    java.lang.Object var13 = var1.dequeue();
    java.util.Iterator var14 = var1.iterator();
    java.util.Iterator var15 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + '#'+ "'", var13.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test31");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    var1.enqueue((java.lang.Object)true);
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + '#'+ "'", var10.equals('#'));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test32");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var9 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    java.util.Iterator var13 = var9.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var15 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var15.enqueue((java.lang.Object)'#');
    int var18 = var15.size();
    var15.enqueue((java.lang.Object)true);
    java.util.Iterator var21 = var15.iterator();
    var9.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var9.iterator();
    boolean var24 = var9.isEmpty();
    java.util.Iterator var25 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var27 = var9.iterator();
    boolean var28 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test33");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)1.0d);
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test34");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)1.0d);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var13 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var13.enqueue((java.lang.Object)1.0d);
    int var16 = var13.size();
    boolean var17 = var13.isEmpty();
    boolean var18 = var13.isEmpty();
    var1.enqueue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test35");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.lang.Object var8 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    java.util.Iterator var11 = var10.iterator();
    java.util.Iterator var12 = var10.iterator();
    java.util.Iterator var13 = var10.iterator();
    int var14 = var10.size();
    int var15 = var10.size();
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var17 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test36");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var13 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    boolean var17 = var13.isEmpty();
    int var18 = var13.size();
    java.util.Iterator var19 = var13.iterator();
    int var20 = var13.size();
    boolean var21 = var13.isEmpty();
    int var22 = var13.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var24 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var24.enqueue((java.lang.Object)'#');
    int var27 = var24.size();
    int var28 = var24.size();
    java.util.Iterator var29 = var24.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var31 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    java.util.Iterator var34 = var31.iterator();
    boolean var35 = var31.isEmpty();
    var31.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var38 = var31.iterator();
    var24.enqueue((java.lang.Object)var38);
    var13.enqueue((java.lang.Object)var24);
    boolean var41 = var13.isEmpty();
    int var42 = var13.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var44 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var44.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var47 = var44.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var49 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    java.util.Iterator var52 = var49.iterator();
    var44.enqueue((java.lang.Object)var49);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var55 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var55.enqueue((java.lang.Object)'#');
    java.util.Iterator var58 = var55.iterator();
    java.util.Iterator var59 = var55.iterator();
    var55.enqueue((java.lang.Object)false);
    int var62 = var55.size();
    boolean var63 = var55.isEmpty();
    boolean var64 = var55.isEmpty();
    boolean var65 = var55.isEmpty();
    java.lang.Object var66 = var55.dequeue();
    java.util.Iterator var67 = var55.iterator();
    var44.enqueue((java.lang.Object)var55);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var70 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(0);
    int var71 = var70.size();
    boolean var72 = var70.isEmpty();
    boolean var73 = var70.isEmpty();
    boolean var74 = var70.isEmpty();
    var55.enqueue((java.lang.Object)var70);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var77 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var77.enqueue((java.lang.Object)'#');
    java.util.Iterator var80 = var77.iterator();
    var77.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var83 = var77.iterator();
    var55.enqueue((java.lang.Object)var83);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var86 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var86.enqueue((java.lang.Object)'#');
    java.util.Iterator var89 = var86.iterator();
    java.util.Iterator var90 = var86.iterator();
    java.lang.Object var91 = var86.dequeue();
    var55.enqueue(var91);
    var13.enqueue(var91);
    java.util.Iterator var94 = var13.iterator();
    var1.enqueue((java.lang.Object)var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + '#'+ "'", var66.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + '#'+ "'", var91.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test37");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    java.util.Iterator var15 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    int var17 = var10.size();
    boolean var18 = var10.isEmpty();
    java.util.Iterator var19 = var10.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var21 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    java.util.Iterator var26 = var21.iterator();
    boolean var27 = var21.isEmpty();
    java.util.Iterator var28 = var21.iterator();
    boolean var29 = var21.isEmpty();
    var10.enqueue((java.lang.Object)var21);
    boolean var31 = var10.isEmpty();
    java.util.Iterator var32 = var10.iterator();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test38");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var6 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    boolean var10 = var6.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    var12.enqueue((java.lang.Object)false);
    int var19 = var12.size();
    var6.enqueue((java.lang.Object)var12);
    var1.enqueue((java.lang.Object)var12);
    java.util.Iterator var22 = var12.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var24 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    var24.enqueue((java.lang.Object)'#');
    boolean var31 = var24.isEmpty();
    int var32 = var24.size();
    java.util.Iterator var33 = var24.iterator();
    boolean var34 = var24.isEmpty();
    var12.enqueue((java.lang.Object)var34);
    boolean var36 = var12.isEmpty();
    int var37 = var12.size();
    java.util.Iterator var38 = var12.iterator();
    int var39 = var12.size();
    boolean var40 = var12.isEmpty();
    boolean var41 = var12.isEmpty();
    int var42 = var12.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
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
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 3);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test39");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var15 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    java.lang.Object var22 = var15.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var24 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    var24.enqueue((java.lang.Object)'#');
    boolean var31 = var24.isEmpty();
    int var32 = var24.size();
    java.util.Iterator var33 = var24.iterator();
    var15.enqueue((java.lang.Object)var24);
    java.util.Iterator var35 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var37 = var15.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var39 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    java.util.Iterator var42 = var39.iterator();
    boolean var43 = var39.isEmpty();
    java.util.Iterator var44 = var39.iterator();
    int var45 = var39.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var47 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var47.enqueue((java.lang.Object)'#');
    int var50 = var47.size();
    int var51 = var47.size();
    java.util.Iterator var52 = var47.iterator();
    java.util.Iterator var53 = var47.iterator();
    var39.enqueue((java.lang.Object)var53);
    java.util.Iterator var55 = var39.iterator();
    java.util.Iterator var56 = var39.iterator();
    var15.enqueue((java.lang.Object)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '#'+ "'", var22.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test40");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var14 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(100);
    int var15 = var14.size();
    java.util.Iterator var16 = var14.iterator();
    var1.enqueue((java.lang.Object)var14);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var19 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var25 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    var19.enqueue((java.lang.Object)var25);
    java.lang.Object var27 = var19.dequeue();
    var1.enqueue(var27);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var30 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    java.util.Iterator var31 = var30.iterator();
    boolean var32 = var30.isEmpty();
    var1.enqueue((java.lang.Object)var30);
    java.util.Iterator var34 = var30.iterator();
    boolean var35 = var30.isEmpty();
    int var36 = var30.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test41");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test42");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    int var7 = var1.size();
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test43");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var13 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var13.enqueue((java.lang.Object)'#');
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    java.util.Iterator var18 = var13.iterator();
    java.lang.Object var19 = var13.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var21 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    java.util.Iterator var24 = var21.iterator();
    boolean var25 = var21.isEmpty();
    int var26 = var21.size();
    int var27 = var21.size();
    java.util.Iterator var28 = var21.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var30 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    var30.enqueue((java.lang.Object)false);
    java.lang.Object var37 = var30.dequeue();
    var21.enqueue((java.lang.Object)var30);
    java.util.Iterator var39 = var21.iterator();
    boolean var40 = var21.isEmpty();
    var13.enqueue((java.lang.Object)var21);
    var1.enqueue((java.lang.Object)var13);
    boolean var43 = var1.isEmpty();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + '#'+ "'", var19.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + '#'+ "'", var37.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test44");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)1.0d);
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    boolean var12 = var1.isEmpty();
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test45");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    java.lang.Object var8 = var1.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    var10.enqueue((java.lang.Object)'#');
    boolean var17 = var10.isEmpty();
    int var18 = var10.size();
    java.util.Iterator var19 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    var10.enqueue((java.lang.Object)100);
    boolean var23 = var10.isEmpty();
    java.lang.Object var24 = var10.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + '#'+ "'", var8.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + '#'+ "'", var24.equals('#'));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test46");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var12 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    boolean var15 = var12.isEmpty();
    int var16 = var12.size();
    var1.enqueue((java.lang.Object)var12);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var19 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var19.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var22 = var19.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var24 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    var19.enqueue((java.lang.Object)var24);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var30 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    var30.enqueue((java.lang.Object)false);
    int var37 = var30.size();
    boolean var38 = var30.isEmpty();
    boolean var39 = var30.isEmpty();
    boolean var40 = var30.isEmpty();
    java.lang.Object var41 = var30.dequeue();
    java.util.Iterator var42 = var30.iterator();
    var19.enqueue((java.lang.Object)var30);
    boolean var44 = var19.isEmpty();
    boolean var45 = var19.isEmpty();
    boolean var46 = var19.isEmpty();
    var12.enqueue((java.lang.Object)var19);
    boolean var48 = var12.isEmpty();
    java.util.Iterator var49 = var12.iterator();
    java.lang.Object var50 = var12.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + '#'+ "'", var41.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + '#'+ "'", var50.equals('#'));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test47");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var15 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    java.lang.Object var22 = var15.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var24 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    var24.enqueue((java.lang.Object)'#');
    boolean var31 = var24.isEmpty();
    int var32 = var24.size();
    java.util.Iterator var33 = var24.iterator();
    var15.enqueue((java.lang.Object)var24);
    java.util.Iterator var35 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var38 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var38.enqueue((java.lang.Object)1.0d);
    java.util.Iterator var41 = var38.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var43 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(1);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    java.util.Iterator var46 = var43.iterator();
    var38.enqueue((java.lang.Object)var43);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var49 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var49.enqueue((java.lang.Object)'#');
    java.util.Iterator var52 = var49.iterator();
    java.util.Iterator var53 = var49.iterator();
    var49.enqueue((java.lang.Object)false);
    int var56 = var49.size();
    boolean var57 = var49.isEmpty();
    boolean var58 = var49.isEmpty();
    boolean var59 = var49.isEmpty();
    java.lang.Object var60 = var49.dequeue();
    java.util.Iterator var61 = var49.iterator();
    var38.enqueue((java.lang.Object)var49);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var64 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var64.enqueue((java.lang.Object)'#');
    int var67 = var64.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var69 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var70 = var69.isEmpty();
    boolean var71 = var69.isEmpty();
    java.util.Iterator var72 = var69.iterator();
    boolean var73 = var69.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var75 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var75.enqueue((java.lang.Object)'#');
    java.util.Iterator var78 = var75.iterator();
    java.util.Iterator var79 = var75.iterator();
    var75.enqueue((java.lang.Object)false);
    int var82 = var75.size();
    var69.enqueue((java.lang.Object)var75);
    var64.enqueue((java.lang.Object)var75);
    java.util.Iterator var85 = var64.iterator();
    java.util.Iterator var86 = var64.iterator();
    var38.enqueue((java.lang.Object)var64);
    java.util.Iterator var88 = var64.iterator();
    boolean var89 = var64.isEmpty();
    java.util.Iterator var90 = var64.iterator();
    var1.enqueue((java.lang.Object)var64);
    java.util.Iterator var92 = var64.iterator();
    int var93 = var64.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '#'+ "'", var22.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + '#'+ "'", var60.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 2);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test48");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test49");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var10 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    var10.enqueue((java.lang.Object)false);
    java.lang.Object var17 = var10.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var19 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    java.util.Iterator var22 = var19.iterator();
    boolean var23 = var19.isEmpty();
    var19.enqueue((java.lang.Object)'#');
    boolean var26 = var19.isEmpty();
    int var27 = var19.size();
    java.util.Iterator var28 = var19.iterator();
    var10.enqueue((java.lang.Object)var19);
    int var30 = var19.size();
    int var31 = var19.size();
    var1.enqueue((java.lang.Object)var19);
    boolean var33 = var1.isEmpty();
    int var34 = var1.size();
    java.lang.Object var35 = var1.dequeue();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + '#'+ "'", var17.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test50");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var15 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    var15.enqueue((java.lang.Object)false);
    java.lang.Object var22 = var15.dequeue();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var24 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    var24.enqueue((java.lang.Object)'#');
    boolean var31 = var24.isEmpty();
    int var32 = var24.size();
    java.util.Iterator var33 = var24.iterator();
    var15.enqueue((java.lang.Object)var24);
    java.util.Iterator var35 = var15.iterator();
    var1.enqueue((java.lang.Object)var15);
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var38 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    java.util.Iterator var42 = var38.iterator();
    var1.enqueue((java.lang.Object)var38);
    boolean var44 = var38.isEmpty();
    java.lang.Object var45 = var38.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + '#'+ "'", var22.equals('#'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + '#'+ "'", var45.equals('#'));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test51");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    var1.enqueue((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest2.test52");


    at.fhhagenberg.sqe.exercise13.RingBufferMutant var1 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    java.util.Iterator var14 = var1.iterator();
    int var15 = var1.size();
    boolean var16 = var1.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var18 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    int var21 = var18.size();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var23 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    java.util.Iterator var26 = var23.iterator();
    boolean var27 = var23.isEmpty();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var29 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    var29.enqueue((java.lang.Object)'#');
    java.util.Iterator var32 = var29.iterator();
    java.util.Iterator var33 = var29.iterator();
    var29.enqueue((java.lang.Object)false);
    int var36 = var29.size();
    var23.enqueue((java.lang.Object)var29);
    var18.enqueue((java.lang.Object)var29);
    java.util.Iterator var39 = var29.iterator();
    at.fhhagenberg.sqe.exercise13.RingBufferMutant var41 = new at.fhhagenberg.sqe.exercise13.RingBufferMutant(10);
    boolean var42 = var41.isEmpty();
    boolean var43 = var41.isEmpty();
    java.util.Iterator var44 = var41.iterator();
    boolean var45 = var41.isEmpty();
    var41.enqueue((java.lang.Object)'#');
    boolean var48 = var41.isEmpty();
    int var49 = var41.size();
    java.util.Iterator var50 = var41.iterator();
    boolean var51 = var41.isEmpty();
    var29.enqueue((java.lang.Object)var51);
    boolean var53 = var29.isEmpty();
    int var54 = var29.size();
    java.util.Iterator var55 = var29.iterator();
    int var56 = var29.size();
    boolean var57 = var29.isEmpty();
    java.util.Iterator var58 = var29.iterator();
    var1.enqueue((java.lang.Object)var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

}
