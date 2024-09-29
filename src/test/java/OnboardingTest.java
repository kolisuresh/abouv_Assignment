import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.OnboardingPage;
import pages.SignUpPage;
import pages.WelcomePage;
import testbase.WebTestBase;

public class OnboardingTest extends WebTestBase {

    WelcomePage welcomePage;
    WelcomeTest welcomeTest;
    SignUpPage signUpPage;
    SignupTest signupTest;
    OnboardingPage onboardingPage;
    OnboardingTest onboardingTest;


    @BeforeMethod
    public void preRequisite() {

        welcomePage = new WelcomePage();

        welcomeTest = new WelcomeTest();

        signUpPage = new SignUpPage();

        signupTest = new SignupTest();

        onboardingPage = new OnboardingPage();

        onboardingTest = new OnboardingTest();


    }

    @Test(description = "Verify FamilyFriends element click on Onboarding page")
    public void VerifyFamilyFriendsElementClickableOnWelcomePage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.FamilyLinkBtn();
    }

    @Test(description = "Verify SearchEngine element click on Onboarding page")
    public void VerifySearchEngineElementClickableOnOnboardingPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
    }

    @Test(description = "Verify SocialMedia element click on Onboarding page")
    public void VerifySocialMediaElementClickableOnboardingPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SocialMediaBtn();
    }

    @Test(description = "Verify Word of mouth element click on Onboarding page")
    public void VerifyWordOfMouthElmentClickableOnOnboardingPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.WordofMouth();
    }

    @Test(description = "Verify TV Commercial element click on Onboarding page")
    public void VerifyTVCommercialeElementClickableOnOnboardingPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.TVCommercialsBtn();
    }

    @Test(description = "Verify Events and Conference element click on Onboarding page")
    public void VerifyEventsandConferenceElementClickableOnOnboardingPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.EventsConferenceBtn();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();

    }
}


