package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    TypesOfJobPage typesOfJobPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage = new DurationOfStayPage();
        typesOfJobPage = new TypesOfJobPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();

    }

    @Test
    public void anAustralianComingToUKForTourism() throws InterruptedException {
        startPage.acceptCookies();
        //Click on start button
        startPage.clickOnStartNowBtn();
        // Select a Nationality 'Australia'
        Thread.sleep(2000);
        selectNationalityPage.selectNationality("Australia");
        // Click on Continue button
        selectNationalityPage.clickOnContinueBtn();
        // Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        // Click on Continue button
        reasonForTravelPage.clickOnContinueBtn1();
        // verify result 'You will not need a visa to come to the UK'
        resultPage.verifyResult("You will not need a visa to come to the UK");
    }

    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.acceptCookies();
        // Click on start button
        startPage.clickOnStartNowBtn();
        // Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");
        // Click on Continue button
        selectNationalityPage.clickOnContinueBtn();
        // Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisitUk("Work, academic visit or business");
        // Click on Continue button
        reasonForTravelPage.clickOnContinueBtn1();
        // Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        // Click on Continue button
        durationOfStayPage.clickOnContinueBtn1();
        // Select have planning to work for 'Health and care professional'
        typesOfJobPage.selectWorkForHealthAndCare("Health and care professional");
        // Click on Continue button
        typesOfJobPage.clickOnContinueBtn1();
        // verify result 'You need a visa to work in health and care'
        resultPage.verifyResult1("You need a visa to work in health and care");
    }

    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() throws InterruptedException {
        startPage.acceptCookies();
        // Click on start button
        startPage.clickOnStartNowBtn();
        // Select a Nationality 'Colombia'
        selectNationalityPage.selectNationality("Congo");
        // Click on Continue button
        reasonForTravelPage.clickOnContinueBtn1();
        // Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReason1ForVisitUk("Join partner or family for a long stay");
        // Click on Continue button
        reasonForTravelPage.clickOnContinueBtn1();
        // Select state My partner of family member have uk immigration status 'yes'
        familyImmigrationStatusPage.selectFamilyImmigrationStatus("Yes");
        // Click on Continue button
        familyImmigrationStatusPage.clickOnContinueBtn1();
        // verify result 'You’ll need a visa to join your family or partner in the UK'
        resultPage.verifyResult2("You’ll need a visa to join your family or partner in the UK");

    }
}
