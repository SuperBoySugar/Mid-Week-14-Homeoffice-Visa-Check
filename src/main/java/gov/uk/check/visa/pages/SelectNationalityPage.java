package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {

    @CacheLookup
    @FindBy(id = "response")
    WebElement nationality;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtn;

    public void selectNationality(String nationality1) {
        Reporter.log("Select Nationality: " + nationality.toString() + "<br>");
        selectByVisibleTextFromDropDown(nationality, nationality1);
        CustomListeners.test.log(Status.PASS, "Select Nationality: " + nationality1);
    }

    public void clickOnContinueBtn() {
        Reporter.log("Click On Button: " + continueBtn.toString() + "<br>");
        clickOnElement(continueBtn);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button: ");

    }

}
