package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//label[text()='Tourism or visiting family and friends']")
    WebElement reason;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueBtn1;

    @CacheLookup
    @FindBy(xpath = "//label[text()='Work, academic visit or business']")
    WebElement workReason;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Join partner or family for a long stay']")
    WebElement workReason1;

    public void selectReasonForVisit(String reason1){
     //   Reporter.log("Select reason: "+ reason.toString()+"<br>");
        doClickOnElement(reason,reason1);
    //    CustomListeners.test.log(Status.PASS,"Select Reason: " + reason1);
    }

    public void clickOnContinueBtn1(){
        Reporter.log("Click On Continue: "+ continueBtn1.toString()+"<br>");
        clickOnElement(continueBtn1);
        CustomListeners.test.log(Status.PASS,"Click On Continue " );
    }

    public void selectReasonForVisitUk(String workReason1){
        Reporter.log("Select HDD: "+ workReason.toString()+"<br>");
        doClickOnElement(workReason,workReason1);
        CustomListeners.test.log(Status.PASS,"Select Reason For UK: " + workReason1);
    }

    public void selectReason1ForVisitUk(String workReason2){
        Reporter.log("Select HDD: "+ workReason1.toString()+"<br>");
        doClickOnElement(workReason1,workReason2);
        CustomListeners.test.log(Status.PASS,"Select Reason1: " + workReason2);
    }



}
