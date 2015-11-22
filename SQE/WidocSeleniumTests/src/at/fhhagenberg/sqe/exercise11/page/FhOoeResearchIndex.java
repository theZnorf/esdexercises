/**
 * @author Franz Profelt
 * @id s1410567019
 * @exercise 11
 */

package at.fhhagenberg.sqe.exercise11.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhOoeResearchIndex {

    @FindBy(id = "searchedFor")
    WebElement searchBox;

    @FindBy(name = "search")
    WebElement searchButton;

    private WebDriver driver;

    public FhOoeResearchIndex(WebDriver driver) {
        this.driver = driver;
    }

    static public FhOoeResearchIndex navigateTo(WebDriver driver) {
        driver.get("http://research.fh-ooe.at/de/index");
        return PageFactory.initElements(driver, FhOoeResearchIndex.class);
    }

    public FhOoeResearchResults searchFor(String searchTerm) {
        searchBox.clear();
        searchBox.sendKeys(searchTerm);
        searchButton.click();

        return PageFactory.initElements(driver, FhOoeResearchResults.class);
    }
}
