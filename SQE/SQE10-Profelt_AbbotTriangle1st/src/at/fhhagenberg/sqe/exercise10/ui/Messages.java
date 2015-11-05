/**
 * @author Franz Profelt
 * @id s1410567019
 */

package at.fhhagenberg.sqe.exercise10.ui;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Generated Class for easy resource handling
 * 
 * @author Franz Profelt
 *
 */
public class Messages {
    private static final String BUNDLE_NAME = "at.fhhagenberg.sqe.exercise10.ui.messages"; //$NON-NLS-1$

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
            .getBundle(BUNDLE_NAME);

    private Messages() {
    }

    public static String getString(String key) {
        try {
            return RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }
}
