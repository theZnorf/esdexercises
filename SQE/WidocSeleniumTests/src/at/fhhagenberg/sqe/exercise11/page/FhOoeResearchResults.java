/**
 * @author Franz Profelt
 * @id s1410567019
 * @exercise 11
 */

package at.fhhagenberg.sqe.exercise11.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhOoeResearchResults {

    @FindBy(xpath = "//ul[@id='subMenu']/li[1]/a")
    WebElement personsButton;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[2]/a")
    WebElement researchFieldsButton;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[3]/a")
    WebElement researchGroupsButton;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[4]/a")
    WebElement publicationsButton;

    @FindBy(xpath = "//ul[@id='subMenu']/li[5]/a")
    WebElement projectsButton;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[6]/a")
    WebElement patentsButton;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[1]/a/span")
    WebElement nrOfPersons;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[2]/a/span")
    WebElement nrOfResearchFields;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[3]/a/span")
    WebElement nrOfResearchGroups;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[4]/a/span")
    WebElement nrOfPublications;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[5]/a/span")
    WebElement nrOfProjects;
    
    @FindBy(xpath = "//ul[@id='subMenu']/li[6]/a/span")
    WebElement nrOfPatents;

    private WebDriver driver;

    public FhOoeResearchResults(WebDriver driver) {
        this.driver = driver;
    }
    
    public FhOoeResearchResultsDetail showPersonByShowedTitel(String titel) {
        personsButton.click();

        // execute click on link
        driver.findElement(By.linkText(titel)).click();;
        
        return PageFactory.initElements(driver,
                FhOoeResearchResultsDetail.class);
    }    
    
    public FhOoeResearchResultsDetail showResearchFieldByShowedTitel(String titel) {
        researchFieldsButton.click();

        // execute click on link
        driver.findElement(By.linkText(titel)).click();;
        
        return PageFactory.initElements(driver,
                FhOoeResearchResultsDetail.class);
    }
    
    public FhOoeResearchResultsDetail showResearchGroupByShowedTitel(String titel) {
        researchGroupsButton.click();

        // execute click on link
        driver.findElement(By.linkText(titel)).click();;
        
        return PageFactory.initElements(driver,
                FhOoeResearchResultsDetail.class);
    }
    
    public FhOoeResearchResultsDetail showPublicationByShowedTitel(String titel) {
        publicationsButton.click();

        // execute click on link
        driver.findElement(By.linkText(titel)).click();;
        
        return PageFactory.initElements(driver,
                FhOoeResearchResultsDetail.class);
    }
    
    public FhOoeResearchResultsDetail showProjectByShowedTitel(String titel) {
        projectsButton.click();

        // execute click on link
        driver.findElement(By.linkText(titel)).click();;
        
        return PageFactory.initElements(driver,
                FhOoeResearchResultsDetail.class);
    }
    
    public FhOoeResearchResultsDetail showPatentByShowedTitel(String titel) {
        patentsButton.click();

        // execute click on link
        driver.findElement(By.linkText(titel)).click();;
        
        return PageFactory.initElements(driver,
                FhOoeResearchResultsDetail.class);
    }

    public int getNrOfPersons() {
        return getNumber(nrOfPersons.getText());
    }

    public int getNrOfResearchFields() {
        return getNumber(nrOfResearchFields.getText());
    }

    public int getNrOfResearchGroups() {
        return getNumber(nrOfResearchGroups.getText());
    }

    public int getNrOfPublications() {
        return getNumber(nrOfPublications.getText());
    }

    public int getNrOfProjects() {
        return getNumber(nrOfProjects.getText());
    }

    public int getNrOfPatents() {
        return getNumber(nrOfPatents.getText());
    }
    
    private int getNumber(String numberInBrackets) {
        String trimmed = numberInBrackets.trim();
        String number = trimmed.substring(1, trimmed.length() - 1);
        return Integer.parseInt(number);
    }
    
}
