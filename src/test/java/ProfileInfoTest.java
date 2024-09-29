import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class ProfileInfoTest extends WebTestBase {
    WelcomePage welcomePage;
    WelcomeTest welcomeTest;
    SignUpPage signUpPage;
    SignupTest signupTest;
    OnboardingPage onboardingPage;
    OnboardingTest onboardingTest;
    CurrentRoleTest rolltest;
    CurrentRolePage currentRolePage;
    GoalPage goalPage;
    GoalTest goalTest;
    ProfileSetupPage profileSetupPage;
    ProfileSetupTest profileSetupTest;
    EmailAuthPage emailAuthPage;
    EmailAuthTest emailAuthTest;
    ProfileInfoPage profileInfoPage;
    ProfileInfoTest profileInfoTest;


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

        profileInfoPage = new ProfileInfoPage();
        profileInfoTest = new ProfileInfoTest();





    }

    @Test(description = "Verify profileInfo page")
    public void VerifyprofileInfoPage() {
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
        profileInfoPage.InfoPage();

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();

    }
}
