package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class TypesOfJobPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//label[text()='Health and care professional']")
    WebElement typesOfJob;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueBtn1;


    public void selectWorkForHealthAndCare(String typesOfJob1) {
        Reporter.log("Select Work for Health and Care: " + typesOfJob.toString() + "<br>");
        doClickOnElement(typesOfJob, typesOfJob1);
        CustomListeners.test.log(Status.PASS, "Select Work for Health and Care: " + typesOfJob1);
    }

    public void clickOnContinueBtn1() {
        Reporter.log("Click On Continue Button: " + continueBtn1.toString() + "<br>");
        clickOnElement(continueBtn1);
        CustomListeners.test.log(Status.PASS, " Click On Continue Button");
    }

}
