package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowBtn;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement cookies;

    public void clickOnStartNowBtn() {
        Reporter.log("Click On Start Now Btn: " + startNowBtn.toString() + "<br>");
        clickOnElement(startNowBtn);
        CustomListeners.test.log(Status.PASS, "Click On Start Now Btn ");
    }

    public void acceptCookies() {
        clickOnElement(cookies);
    }
}
