/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise1;

import java.security.InvalidParameterException;
import java.util.Observable;

/**
 * Calculator class which holds the different data and calculates the result,
 * extends Observable for notifying the finished calculation
 * 
 * @author Franz Profelt
 *
 */
public class TriangleCalculator extends Observable {

    private double valA = 0;
    private double valB = 0;
    private double valC = 0;
    private double valPerimeter = 0;
    private double valArea = 0;

    /**
     * Getter for the calculated perimeter
     * 
     * @return the value of the perimeter
     */
    public double getPerimeter() {
        return valPerimeter;
    }

    /**
     * Getter for calculated area
     * 
     * @return the value of the area
     */
    public double getArea() {
        return valArea;
    }

    /**
     * Setter for the value of the side a
     * 
     * @param strA
     *            string with the value of side a
     * @throws InvalidParameterException
     *             exception is thrown when the given value is invalid
     */
    public void setValA(String strA) throws InvalidParameterException {
        try {
            valA = Double.parseDouble(strA);
            // check number
            if (valA < 0)
                throw new InvalidParameterException(
                        Messages.getString("TriangleCalculator.invalidNumberA")); //$NON-NLS-1$
        } catch (NumberFormatException e) {
            throw new InvalidParameterException(
                    Messages.getString("TriangleCalculator.invalidNumberA")); //$NON-NLS-1$
        }
    }

    /**
     * Setter for the value of side b
     * 
     * @param strB
     *            string with the value of side b
     * @throws InvalidParameterException
     *             exception is thrown when the given value is invalid
     */
    public void setValB(String strB) throws InvalidParameterException {
        try {
            valB = Double.parseDouble(strB);
            // check number
            if (valB < 0)
                throw new InvalidParameterException(
                        Messages.getString("TriangleCalculator.invalidNumberB")); //$NON-NLS-1$
        } catch (NumberFormatException e) {
            throw new InvalidParameterException(
                    Messages.getString("TriangleCalculator.invalidNumberB")); //$NON-NLS-1$
        }
    }

    /**
     * Setter for the value of side c
     * 
     * @param strC
     *            string with the value of side c
     * @throws InvalidParameterException
     *             exception is thrown when the given value is invalid
     */
    public void setValC(String strC) throws InvalidParameterException {
        try {
            valC = Double.parseDouble(strC);
            // check number
            if (valC < 0)
                throw new InvalidParameterException(
                        Messages.getString("TriangleCalculator.invalidNumberC")); //$NON-NLS-1$
        } catch (NumberFormatException e) {
            throw new InvalidParameterException(
                    Messages.getString("TriangleCalculator.invalidNumberC")); //$NON-NLS-1$
        }
    }

    /**
     * Calculates the perimeter and the area with the defined sides
     * @throws InvalidParameterException
     *             exception is thrown when the calculated values are invalid
     */
    public void calculate() throws InvalidParameterException {
        // calculate perimeter
        valPerimeter = valA + valB + valC;
        double s = valPerimeter / 2;
        // calculate area
        double d = s * (s - valA) * (s - valB) * (s - valC);
        valArea = Math.sqrt(d);

        // check validity of results
        if (Double.isNaN(valPerimeter))
            throw new InvalidParameterException(
                    Messages.getString("TriangleCalculator.invalidPerimeter")); //$NON-NLS-1$
        if (Double.isNaN(valArea))
            throw new InvalidParameterException(
                    Messages.getString("TriangleCalculator.invalidArea")); //$NON-NLS-1$

        // notify observer
        setChanged();
        notifyObservers();
    }

}
