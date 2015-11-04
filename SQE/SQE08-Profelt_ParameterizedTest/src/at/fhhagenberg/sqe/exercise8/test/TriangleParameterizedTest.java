package at.fhhagenberg.sqe.exercise8.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import at.fhhagenberg.sqe.exercise8.model.Triangle;

@RunWith(Parameterized.class)
public class TriangleParameterizedTest {

    private double a;
    private double b;
    private double c;
    private boolean expectedIsValid;

    public TriangleParameterizedTest(double a, double b, double c,
            boolean expectedIsValid) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expectedIsValid = expectedIsValid;
    }

    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(
                new Object[][] {
                    { 1, 1, 0.5, true }, 
                    { 1, 0.25, 0.5, false },
                    { 1, 1, 0.5, true },
                    { 0.25, 1, 0.5, false },
                    { 0.5, 1, 1, true },
                    { 0.5, 0.25, 1, false } });
    }

    @Test
    public void testTriangleIsValid() {
        assertEquals(expectedIsValid, Triangle.isValid(a, b, c));
    }

}
