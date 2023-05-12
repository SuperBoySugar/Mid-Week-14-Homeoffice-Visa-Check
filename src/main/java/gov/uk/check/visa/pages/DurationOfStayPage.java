package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class DurationOfStayPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> selectStay;


    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueBtn1;


    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "6 months or less":
                selectStay.get(0).click();
                break;
            case "longer than 6 months":
                selectStay.get(1).click();
                break;
        }
        CustomListeners.test.log(Status.PASS, "Select length of Stay: " + moreOrLess);
    }

    public void clickOnContinueBtn1() {
        Reporter.log("Click On ContinueBtn: " + continueBtn1.toString() + "<br>");
        clickOnElement(continueBtn1);
        CustomListeners.test.log(Status.PASS, "Click on Continue button ");
    }
}
