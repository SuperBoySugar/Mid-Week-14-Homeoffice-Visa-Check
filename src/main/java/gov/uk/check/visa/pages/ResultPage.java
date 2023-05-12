package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[text()='You will not need a visa to come to the UK']")
    WebElement result;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='You need a visa to work in health and care']")
    WebElement result1;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement result2;


    public void verifyResult(String expectedMessage) {
        Reporter.log("Select HDD: " + result.toString() + "<br>");
        verifyElements(result, expectedMessage, "Error");
        CustomListeners.test.log(Status.PASS, "Select Processor: " + expectedMessage);
    }

    public void verifyResult1(String expectedMessage) {
        Reporter.log("Verify Result1: " + result1.toString() + "<br>");
        verifyElements(result1, expectedMessage, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Result1: " + expectedMessage);
    }

    public void verifyResult2(String expectedMessage) {
        Reporter.log("Verify Result2: " + result2.toString() + "<br>");
        verifyElements(result2, expectedMessage, "Error");
        CustomListeners.test.log(Status.PASS, "Verify Result2: " + expectedMessage);

    }
}
