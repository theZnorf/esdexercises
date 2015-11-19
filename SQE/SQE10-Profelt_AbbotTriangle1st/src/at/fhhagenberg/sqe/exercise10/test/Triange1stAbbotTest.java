/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise10.test;

import static org.junit.Assert.*;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.*;

import abbot.finder.ComponentNotFoundException;
import abbot.finder.MultiMatcher;
import abbot.finder.MultipleComponentsFoundException;
import abbot.finder.matchers.ClassMatcher;
import abbot.tester.ButtonTester;
import at.fhhagenberg.sqe.exercise10.ui.Messages;
import at.fhhagenberg.sqe.exercise10.ui.Triangle1st;
import junit.extensions.abbot.ComponentTestFixture;

public class Triange1stAbbotTest extends ComponentTestFixture {

    private class MyButtonMatcher extends ClassMatcher {

        private String label;

        public MyButtonMatcher(Class cls) {
            super(cls);
        }

        public MyButtonMatcher(String label) {
            super(JButton.class);
            this.label = label;
        }

        public boolean matches(Component c) {
            return super.matches(c) && ((JButton) c).getText().equals(label);
        }
    }

    private class MyTextFieldMatcher extends ClassMatcher {

        private String name;

        public MyTextFieldMatcher(Class cls) {
            super(cls);
        }

        public MyTextFieldMatcher(String name) {
            super(JTextField.class);
            this.name = name;
        }

        public boolean matches(Component c) {
            return super.matches(c) && ((JTextField) c).getName().equals(name);
        }
    }

    JButton buttonCalc;
    JTextField fieldSideA;
    JTextField fieldSideB;
    JTextField fieldSideC;
    JTextField fieldPerimeter;
    JTextField fieldArea;

    @Before
    public void setUp() throws ComponentNotFoundException,
            MultipleComponentsFoundException {
        Triangle1st.main(null);

        buttonCalc = (JButton) getFinder().find(
                new MyButtonMatcher(Messages.getString("Triangle1st.calc")));
        fieldSideA = (JTextField) getFinder()
                .find(new MyTextFieldMatcher("SideA"));
        fieldSideB = (JTextField) getFinder()
                .find(new MyTextFieldMatcher("SideB"));
        fieldSideC = (JTextField) getFinder()
                .find(new MyTextFieldMatcher("SideC"));
        fieldPerimeter = (JTextField) getFinder()
                .find(new MyTextFieldMatcher("Perimeter"));
        fieldArea = (JTextField) getFinder()
                .find(new MyTextFieldMatcher("Area"));
    }

    @Test
    public void testValid() {
        ButtonTester bt = new ButtonTester();

        fieldSideA.setText("3");
        fieldSideB.setText("4");
        fieldSideC.setText("5");
        
        bt.actionClick(buttonCalc);

        assertEquals("12", fieldPerimeter.getText());
        assertEquals("6", fieldArea.getText());
    }

}
