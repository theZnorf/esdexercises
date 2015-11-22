/**
 * @author Franz Profelt
 * @id s1410567019
 * @exercise 11
 */

package at.fhhagenberg.sqe.exercise11.page;

import org.openqa.selenium.WebDriver;

public class FhOoeResearchResultsDetail {

    private WebDriver driver;

    public FhOoeResearchResultsDetail(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getTitel() {
        return driver.getTitle();
    }

}
