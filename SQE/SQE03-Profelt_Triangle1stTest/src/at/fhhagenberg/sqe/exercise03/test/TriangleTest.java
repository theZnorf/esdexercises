/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise03.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import at.fhhagenberg.sqe.exercise3.model.Triangle;

/**
 * @author franz
 *
 */
public class TriangleTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    private static final double delta = 1e-3;

    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#Triangle(double, double, double)}
     * .
     */
    @Test
    public void testTriangleCreationOfMultipleValid() {
        assertNotNull(new Triangle(1, 1, 1));
        assertNotNull(new Triangle(1, 1, 2));
        assertNotNull(new Triangle(1, 2, 2));
    }

    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#Triangle(double, double, double)}
     * .
     */
    @Test
    public void testTriangleCreationOfInvalidSideA() {
        // set expected exception
        exception.expect(InvalidParameterException.class);
        exception.expectMessage("Invalid Number for side a");

        new Triangle(-1, 1, 1);
    }

    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#Triangle(double, double, double)}
     * .
     */
    @Test
    public void testTriangleCreationOfInvalidSideB() {
        // set expected exception
        exception.expect(InvalidParameterException.class);
        exception.expectMessage("Invalid Number for side b");

        new Triangle(1, -1, 1);
    }

    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#Triangle(double, double, double)}
     * .
     */
    @Test
    public void testTriangleCreationOfInvalidSideC() {
        // set expected exception
        exception.expect(InvalidParameterException.class);
        exception.expectMessage("Invalid Number for side c");

        new Triangle(1, 1, -1);
    }

    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#Triangle(double, double, double)}
     * .
     */
    @Test
    public void testTriangleCreationOfInvalidTriangle() {
        // set expected exception
        exception.expect(InvalidParameterException.class);
        exception
                .expectMessage("Invalid Area, provided sides cannot define a triangle");

        new Triangle(2.1, 1, 1);
    }

    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#isValid(double, double, double)}
     * .
     */
    @Test
    public void testIsValidValidTriangles() {
        assertTrue(Triangle.isValid(1, 1, 1));
        assertTrue(Triangle.isValid(1, 3, 2));
        assertTrue(Triangle.isValid(1, 1.3, 1));
    }

    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#isValid(double, double, double)}
     * .
     */
    @Test
    public void testIsValidInvalidTriangles() {
        assertFalse(Triangle.isValid(1, 1, 2.1));
        assertFalse(Triangle.isValid(-1, 1, 1));
        assertFalse(Triangle.isValid(1, -1, 1));
        assertFalse(Triangle.isValid(1, 1, -1));
    }


    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#calculate()}.
     */
    @Test
    public void testCalculateAndGetAreaAndPerimeter() {
        // create triangle
        Triangle t = new Triangle(3, 4, 5);
        
        // call calculate
        t.calculate();
        
        // check results
        assertEquals(12, t.getPerimeter(), delta);
        assertEquals(6, t.getArea(), delta);
    }
    
    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#getPerimeter()}.
     */
    @Test
    public void testGetPerimeter() {
        // create triangle
        Triangle t = new Triangle(3, 4, 5);
        
        // check perimeter of uncalculated triangle
        assertEquals(Double.NaN, t.getPerimeter(), delta);
    }

    /**
     * Test method for
     * {@link at.fhhagenberg.sqe.exercise3.model.Triangle#getArea()}.
     */
    @Test
    public void testGetArea() {
        // create triangle
        Triangle t = new Triangle(3, 4, 5);
        
        // check perimeter of uncalculated triangle
        assertEquals(Double.NaN, t.getPerimeter(), delta);
    }

}
