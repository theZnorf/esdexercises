/**
 * @author Franz Profelt
 * @id s1410567019
 * @exercise 11
 */

package at.fhhagenberg.sqe.exercise11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import at.fhhagenberg.sqe.exercise11.page.FhOoeResearchIndex;
import at.fhhagenberg.sqe.exercise11.page.FhOoeResearchResults;

@RunWith(Parameterized.class)
public class WidocParameterizedSearchTest {

    private String searchTerm;
    private int expectedNumberOfPublications;

    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public WidocParameterizedSearchTest(String searchTerm,
            int expectedNumberOfPublications) {
        this.searchTerm = searchTerm;
        this.expectedNumberOfPublications = expectedNumberOfPublications;
    }

    @Parameterized.Parameters
    public static Collection testCases() {
        return Arrays.asList(new Object[][] {
            { "embedded", 26 },
            { "software", 56 },
            { "testing", 41 },
            { "bluetooth", 2 }
        });
    }

    @Test
    public void testPublicationsNumber() {
        FhOoeResearchIndex fhIndex = FhOoeResearchIndex.navigateTo(driver);
        FhOoeResearchResults fhResults = fhIndex.searchFor(searchTerm);

        assertEquals(expectedNumberOfPublications,
                fhResults.getNrOfPublications());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
