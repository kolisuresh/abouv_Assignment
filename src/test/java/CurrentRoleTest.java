import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.OnboardingPage;
import pages.CurrentRolePage;
import pages.SignUpPage;
import pages.WelcomePage;
import testbase.WebTestBase;

public class CurrentRoleTest extends WebTestBase {
    WelcomePage welcomePage;
    WelcomeTest welcomeTest;
    SignUpPage signUpPage;
    SignupTest signupTest;

    OnboardingPage onboardingPage;
    OnboardingTest onboardingTest;
    CurrentRoleTest currentRoleTest;
    CurrentRolePage currentRolePage;


    @BeforeMethod
    public void preRequisite() {

        welcomePage = new WelcomePage();

        welcomeTest = new WelcomeTest();

        signUpPage = new SignUpPage();

        signupTest = new SignupTest();

        currentRolePage = new CurrentRolePage();

        currentRoleTest = new CurrentRoleTest();



    }

    @Test(description = "Verify student element click on current role page")
    public void VerifyStudentElementClickableOnCurrentRolePage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.StudentBtn();
        signUpPage.Continue();
    }

    @Test(description = "Verify working professional element click on current role page")
    public void VerifyWorkingProfessionalElementClickableOnCurrentRolePage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.WorkingProfessionalBtn();
        signUpPage.Continue();
    }

    @Test(description = "Verify exploring opportunities element click on current role page")
    public void VerifyExploringOpportunitiesElementClickableOnCurrentRolePage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.ExploringOpportunitiesBtn();
        signUpPage.Continue();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();

    }
}


