/**
 * @author Franz Profelt
 * @id s1410567019
 * @exercise 11
 */

package at.fhhagenberg.sqe.exercise11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import at.fhhagenberg.sqe.exercise11.page.FhOoeResearchIndex;
import at.fhhagenberg.sqe.exercise11.page.FhOoeResearchResults;
import at.fhhagenberg.sqe.exercise11.page.FhOoeResearchResultsDetail;

public class WidocPageObjectSearchTest {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testWidocSearch() throws Exception {

        FhOoeResearchIndex fhIndex = FhOoeResearchIndex.navigateTo(driver);
        FhOoeResearchResults fhResults = fhIndex.searchFor("testing");
        assertEquals(41, fhResults.getNrOfPublications());
        FhOoeResearchResultsDetail fhDetail = fhResults
                .showPublicationByShowedTitel(
                        "A testing procedure for htSNP approximation algorithms");
        assertEquals(
                "Widok | A testing procedure for htSNP approximation algorithms",
                fhDetail.getTitel());
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
