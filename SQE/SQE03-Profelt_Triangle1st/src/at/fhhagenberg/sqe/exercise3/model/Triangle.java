/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise3.model;

import java.security.InvalidParameterException;

import at.fhhagenberg.sqe.exercise3.ui.Messages;

/**
 * Model class for an single triangle with provided perimeter and area
 * calculation
 * 
 * @author Franz Profelt
 *
 */
public class Triangle {

    // Member
    private double valA = 0;
    private double valB = 0;
    private double valC = 0;
    private double valPerimeter = Double.NaN;
    private double valArea = Double.NaN;

    /**
     * Hidden default constructor
     */
    @SuppressWarnings("unused")//$NON-NLS-1$
    private Triangle() {
    }

    /**
     * Constructor for a triangle
     * 
     * @param a
     *            side a of triangle
     * @param b
     *            side b of triangle
     * @param c
     *            side c of triangle
     * @throws InvalidParameterException
     *             Throws exception if one of the given sides or the defined
     *             triangle is invalid
     */
    public Triangle(double a, double b, double c)
            throws InvalidParameterException {
        // check input parameter
        if (!isParameterValidSide(a))
            throw new InvalidParameterException(
                    Messages.getString("Triangle.invalidNumberA")); //$NON-NLS-1$
        if (!isParameterValidSide(b))
            throw new InvalidParameterException(
                    Messages.getString("Triangle.invalidNumberB")); //$NON-NLS-1$
        if (!isParameterValidSide(c))
            throw new InvalidParameterException(
                    Messages.getString("Triangle.invalidNumberC")); //$NON-NLS-1$

        // check validity of triangle
        if (!isTriangleValid(a, b, c))
            throw new InvalidParameterException(
                    Messages.getString("Triangle.invalidArea")); //$NON-NLS-1$

        // set member
        valA = a;
        valB = b;
        valC = c;
    }

    /**
     * Getter for the calculated perimeter
     * 
     * @return the value of the perimeter, or NaN if the area was not yet
     *         calculated
     */
    public double getPerimeter() {
        return valPerimeter;
    }

    /**
     * Getter for calculated area
     * 
     * @return the value of the area, or NaN if the area was not yet calculated
     */
    public double getArea() {
        return valArea;
    }

    /**
     * Calculates the perimeter and the area with the defined sides
     */
    public void calculate() {
        // calculate perimeter
        valPerimeter = valA + valB + valC;
        double s = valPerimeter / 2;
        // calculate area
        valArea = Math.sqrt(s * (s - valA) * (s - valB) * (s - valC));
    }

    /**
     * internal validity check of a single side
     * 
     * @param side
     *            the given side
     * @return true if side is valid
     */
    static private boolean isParameterValidSide(double side) {
        // check is side is greater than zero
        return side >= 0;
    }

    /**
     * internal validity check of defined triangle
     * 
     * @param a
     *            side a of triangle
     * @param b
     *            side b of triangle
     * @param c
     *            side c of triangle
     * @return true if the triangle is valid
     */
    static private boolean isTriangleValid(double a, double b, double c) {
        // calculate part of heron formular and check if the calculation of
        // the area is possible
        double s = (a + b + c) / 2;
        return s * (s - a) * (s - b) * (s - c) >= 0;
    }

    /**
     * Validity check of given Triangle
     * 
     * @param a
     *            side a of Triangle
     * @param b
     *            side a of Triangle
     * @param c
     *            side a of Triangle
     * @return true if all sides and the defined Triangle is valid
     */
    static public boolean isValid(double a, double b, double c) {
        // check all sides and defined triangle
        return isParameterValidSide(a) && isParameterValidSide(b)
                && isParameterValidSide(c) && isTriangleValid(a, b, c);
    }

}
