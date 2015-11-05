/**
 * @author Franz Profelt
 * @id s1410567019
 */
package at.fhhagenberg.sqe.exercise9;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.*;

import abbot.finder.ComponentNotFoundException;
import abbot.finder.MultipleComponentsFoundException;
import abbot.finder.matchers.ClassMatcher;
import abbot.tester.JButtonTester;
import junit.extensions.abbot.ComponentTestFixture;

public class JCalcTest extends ComponentTestFixture {

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

    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonPlus;
    JButton buttonResult;
    JTextField fieldResult;
    
    @Before
    public void setUp() throws ComponentNotFoundException, MultipleComponentsFoundException {
        
        JCalc.main(null);
        
        buttonOne = (JButton) getFinder().find(new MyButtonMatcher("1"));
        buttonTwo = (JButton) getFinder().find(new MyButtonMatcher("2"));
        buttonPlus = (JButton) getFinder().find(new MyButtonMatcher("+"));
        buttonResult = (JButton) getFinder().find(new MyButtonMatcher("="));
        fieldResult = (JTextField) getFinder().find(new ClassMatcher(JTextField.class));
    }
    
    
    @Test
    public void testAdd() {
        final String result = "3";
        
        JButtonTester bt = new JButtonTester();

        bt.actionClick(buttonOne);
        bt.actionClick(buttonPlus);
        bt.actionClick(buttonTwo);;
        bt.actionClick(buttonResult);
        
        assertEquals(result, fieldResult.getText());
    }

}
