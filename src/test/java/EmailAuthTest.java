import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class EmailAuthTest  extends WebTestBase {
    WelcomePage welcomePage;
    WelcomeTest welcomeTest;
    SignUpPage signUpPage;
    SignupTest signupTest;
    OnboardingPage onboardingPage;
    OnboardingTest onboardingTest;
    CurrentRoleTest rolltest;
    CurrentRolePage currentRolePage;
    GoalPage goalPage;
    ProfileSetupPage profileSetupPage;
    ProfileSetupTest profileSetupTest;
    EmailAuthPage emailAuthPage;
    EmailAuthTest emailAuthTest;


    @BeforeMethod
    public void preRequisite() {

        welcomePage = new WelcomePage();

        welcomeTest = new WelcomeTest();

        signUpPage = new SignUpPage();

        signupTest = new SignupTest();

        currentRolePage = new CurrentRolePage();

        rolltest = new CurrentRoleTest();

        goalPage = new GoalPage();

        profileSetupPage = new ProfileSetupPage();

        profileSetupTest = new ProfileSetupTest();

        emailAuthPage = new EmailAuthPage();

        emailAuthTest = new EmailAuthTest();





    }

    @Test(description = "Verify email textbox on emailAuth page")
    public void VerifyEmailTextboxClickableOneMailAuthPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.StudentBtn();
        signUpPage.Continue();
        goalPage.JobOpportunitiesBtn();
        signUpPage.Continue();
        profileSetupPage.ContinuewithemailBtn();
        emailAuthPage.emailaddressTextbox();
        emailAuthPage.emailcontinueBtn();

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();

    }
}
