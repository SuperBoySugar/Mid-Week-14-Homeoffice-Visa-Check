package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement familyImmigrationStatus;


    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueBtn1;

    public void selectFamilyImmigrationStatus(String familyImmigrationStatus1) {
        Reporter.log("Select Family Immigration Status: " + familyImmigrationStatus.toString() + "<br>");
        doClickOnElement(familyImmigrationStatus, familyImmigrationStatus1);
        CustomListeners.test.log(Status.PASS, "Select Family Immigration Status: ");
    }

    public void clickOnContinueBtn1() {
        Reporter.log("Click On ContinueBtn: " + continueBtn1.toString() + "<br>");
        clickOnElement(continueBtn1);
        CustomListeners.test.log(Status.PASS, "Select Processor: ");
    }
}
