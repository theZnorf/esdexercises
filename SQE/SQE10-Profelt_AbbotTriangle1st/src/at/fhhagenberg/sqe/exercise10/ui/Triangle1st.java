/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise10.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.InvalidParameterException;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import at.fhhagenberg.sqe.exercise10.model.Triangle;

/**
 * Main class for Triangle1st application extends JFrame
 * 
 * @author Franz Profelt
 *
 */
public class Triangle1st extends JFrame implements ActionListener {

    /**
     * Generated serialization ID
     */
    private static final long serialVersionUID = 5048382048872597852L;

    // default dimension for all value fields
    private static final Dimension valueDim = new Dimension(100, 30);

    private JTextField valueATxt;
    private JTextField valueBTxt;
    private JTextField valueCTxt;
    private JTextField perimeterTxt;
    private JTextField areaTxt;

    /**
     * Constructor for Triangle1st initializes member and graphical components
     */
    public Triangle1st() {
        initFrame();
    }

    /**
     * Initializes the main frame of the application
     */
    private void initFrame() {
        setTitle(Messages.getString("Triangle1st.title")); //$NON-NLS-1$
        // setBounds(100, 100, 800, 600);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(initContent());

        setVisible(true);
        pack();
    }

    /**
     * Initializes the content panel
     * 
     * @return the new content panel
     */
    private Container initContent() {
        Container content = getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));

        // add sub panels
        content.add(initHeader());
        content.add(initResultPane());

        return content;
    }

    /**
     * Creates and initializes the header panel
     * 
     * @return the new header panel
     */
    private Component initHeader() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // create text fields
        valueATxt = new JTextField();
        valueBTxt = new JTextField();
        valueCTxt = new JTextField();

        // set dimensions to text fields
        valueATxt.setPreferredSize(valueDim);
        valueBTxt.setPreferredSize(valueDim);
        valueCTxt.setPreferredSize(valueDim);

        valueATxt.setName("SideA");
        valueBTxt.setName("SideB");
        valueCTxt.setName("SideC");
        
        // add components to panel
        panel.add(new JLabel(Messages.getString("Triangle1st.sideA"))); //$NON-NLS-1$
        panel.add(valueATxt);
        panel.add(new JLabel(Messages.getString("Triangle1st.sideB"))); //$NON-NLS-1$
        panel.add(valueBTxt);
        panel.add(new JLabel(Messages.getString("Triangle1st.sideC"))); //$NON-NLS-1$
        panel.add(valueCTxt);

        // create button
        JButton calcButton = new JButton(Messages.getString("Triangle1st.calc")); //$NON-NLS-1$
        // add action listener
        calcButton.addActionListener(this);
        panel.add(calcButton);

        return panel;
    }

    /**
     * Creates and initializes the result panel
     * 
     * @return the new result panel
     */
    private Component initResultPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        perimeterTxt = new JTextField();
        perimeterTxt.setEditable(false);
        perimeterTxt.setPreferredSize(valueDim);
        perimeterTxt.setName("Perimeter");

        JPanel perimeterPanel = new JPanel();
        perimeterPanel.setLayout(new FlowLayout());
        perimeterPanel.add(new JLabel(Messages
                .getString("Triangle1st.perimeter"))); //$NON-NLS-1$
        perimeterPanel.add(perimeterTxt);

        areaTxt = new JTextField();
        areaTxt.setEditable(false);
        areaTxt.setPreferredSize(valueDim);
        areaTxt.setName("Area");

        JPanel areaPanel = new JPanel();
        areaPanel.setLayout(new FlowLayout());
        areaPanel.add(new JLabel(Messages.getString("Triangle1st.area"))); //$NON-NLS-1$
        areaPanel.add(areaTxt);

        panel.add(perimeterPanel);
        panel.add(areaPanel);

        return panel;
    }

    /**
     * main function creates an instance of Triangle1st
     * 
     * @param args
     *            commmand line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new Triangle1st();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                            null,
                            Messages.getString("Triangle1st.unexcpectedException") + e.toString(), //$NON-NLS-1$
                            Messages.getString("Triangle1st.exception"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$
                }
            }
        });
    }

    /**
     * Method of ActionListener starts asynchronus calculation
     * 
     * @param arg0
     *            ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent arg0) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                performCalculation();
            }
        });
    }

    /**
     * This method sets the entered sides and starts calculation
     */
    protected void performCalculation() {
        double a, b, c;

        // parse values
        // parse side a
        try {
            a = Double.parseDouble(valueATxt.getText());
        } catch (NumberFormatException e) {
            // show error dialog with message
            JOptionPane
                    .showMessageDialog(
                            this,
                            Messages.getString("Triangle.invalidNumberA"), //$NON-NLS-1$
                            Messages.getString("Triangle1st.invalidValue"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$

            // reset results to invalid value text
            perimeterTxt
                    .setText(Messages.getString("Triangle1st.invalidValue")); //$NON-NLS-1$
            areaTxt.setText(Messages.getString("Triangle1st.invalidValue")); //$NON-NLS-1$

            return;
        }

        // parse side b
        try {
            b = Double.parseDouble(valueBTxt.getText());
        } catch (NumberFormatException e) {
            // show error dialog with message
            JOptionPane
                    .showMessageDialog(
                            this,
                            Messages.getString("Triangle.invalidNumberB"), //$NON-NLS-1$
                            Messages.getString("Triangle1st.invalidValue"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$

            // reset results to invalid value text
            perimeterTxt
                    .setText(Messages.getString("Triangle1st.invalidValue")); //$NON-NLS-1$
            areaTxt.setText(Messages.getString("Triangle1st.invalidValue")); //$NON-NLS-1$

            return;
        }

        // parse side c
        try {
            c = Double.parseDouble(valueCTxt.getText());
        } catch (NumberFormatException e) {
            // show error dialog with message
            JOptionPane
                    .showMessageDialog(
                            this,
                            Messages.getString("Triangle.invalidNumberC"), //$NON-NLS-1$
                            Messages.getString("Triangle1st.invalidValue"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$

            // reset results to invalid value text
            perimeterTxt
                    .setText(Messages.getString("Triangle1st.invalidValue")); //$NON-NLS-1$
            areaTxt.setText(Messages.getString("Triangle1st.invalidValue")); //$NON-NLS-1$

            return;
        }

        try {
            // create triangle
            Triangle triangle = new Triangle(a, b, c);

            // start calculation
            triangle.calculate();

            DecimalFormat format = new DecimalFormat("#######.####"); //$NON-NLS-1$

            // set calculated values
            perimeterTxt.setText(format.format(triangle.getPerimeter()));
            areaTxt.setText(format.format(triangle.getArea()));
        } catch (InvalidParameterException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    Messages.getString("Triangle1st.invalidValue"),
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // show error dialog with exception
            JOptionPane
                    .showMessageDialog(
                            this,
                            Messages.getString("Triangle1st.unexcpectedExceptionCalculation"), //$NON-NLS-1$
                            Messages.getString("Triangle1st.exception"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$
        }
    }
}
