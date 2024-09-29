import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class ProfileSetupTest extends WebTestBase {
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





    }

    @Test(description = "Verify Continue with email button click on profile page")
    public void VerifyContinueWitheMailButtonClickableOnProfilePage() {
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

    }

    @Test(description = "Verify Continue with google button click on profile page")
    public void VerifyContinueWitheGoogleButtonClickableOnProfilePage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.StudentBtn();
        signUpPage.Continue();
        goalPage.JobOpportunitiesBtn();
        signUpPage.Continue();
        profileSetupPage.ContinuewithgoogleBtn();

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();

    }
}
