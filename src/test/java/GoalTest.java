import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import testbase.WebTestBase;

public class GoalTest extends WebTestBase {
    WelcomePage welcomePage;
    WelcomeTest welcomeTest;
    SignUpPage signUpPage;
    SignupTest signupTest;
    OnboardingPage onboardingPage;
    OnboardingTest onboardingTest;
    CurrentRoleTest currentRoleTest;
    CurrentRolePage currentRolePage;
    GoalPage goalPage;
    GoalTest goalTest;


    @BeforeMethod
    public void preRequisite() {

        welcomePage = new WelcomePage();

        welcomeTest = new WelcomeTest();

        signUpPage = new SignUpPage();

        signupTest = new SignupTest();

        currentRolePage = new CurrentRolePage();

        currentRoleTest = new CurrentRoleTest();

        goalPage = new GoalPage();

        goalTest = new GoalTest();



    }

    @Test(description = "Verify Job Opportunities element select on goal page")
    public void VerifyJobOpportunitiesElementClickableOnGoalPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.StudentBtn();
        signUpPage.Continue();
        goalPage.JobOpportunitiesBtn();
        signUpPage.Continue();

    }

    @Test(description = "Verify Paid Internships element button select on goal page")
    public void VerifyPaidInternshipsElementClickableOnGoalPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.StudentBtn();
        signUpPage.Continue();
        goalPage.PaidInternshipsBtn();
        signUpPage.Continue();

    }

    @Test(description = "Verify freelancing gigs element select on goal page")
    public void VerifyFreelancingGigsElementClickableOnGoalPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.StudentBtn();
        signUpPage.Continue();
        goalPage.FreelancingGigsBtn();
        signUpPage.Continue();

    }

@Test(description = "Verify Externship gigs element select on goal page")
public void VerifyExternshipGigsElementClickableOnGoalPage() {
    SoftAssert softAssert = new SoftAssert();
    welcomePage.Signup();
    signUpPage.MobileNumber(prop.getProperty("text"));
    signUpPage.Continue();
    onboardingPage.SearchEngineBtn();
    currentRolePage.StudentBtn();
    signUpPage.Continue();
    goalPage.ExternshipGigsBtn();
    signUpPage.Continue();

    }

@Test(description = "Verify Self Assessment element select on goal page")
public void VerifySelfAssessmentElementClickableOnGoalPage() {
    SoftAssert softAssert = new SoftAssert();
    welcomePage.Signup();
    signUpPage.MobileNumber(prop.getProperty("text"));
    signUpPage.Continue();
    onboardingPage.SearchEngineBtn();
    currentRolePage.StudentBtn();
    signUpPage.Continue();
    goalPage.SelfAssessmentBtn();
    signUpPage.Continue();

    }

@Test(description = "Verify Volunteer Work element select on goal page")
public void VerifyVolunteerWorkElementClickableOnGoalPage() {
    SoftAssert softAssert = new SoftAssert();
    welcomePage.Signup();
    signUpPage.MobileNumber(prop.getProperty("text"));
    signUpPage.Continue();
    onboardingPage.SearchEngineBtn();
    currentRolePage.StudentBtn();
    signUpPage.Continue();
    goalPage.VolunteerWorkBtn();
    signUpPage.Continue();

    }

@Test(description = "Verify Competitive Exams element select on goal page")
public void VerifyCompetitiveExamsElementClickableOnGoalPage() {
    SoftAssert softAssert = new SoftAssert();
    welcomePage.Signup();
    signUpPage.MobileNumber(prop.getProperty("text"));
    signUpPage.Continue();
    onboardingPage.SearchEngineBtn();
    currentRolePage.StudentBtn();
    signUpPage.Continue();
    goalPage.CompetitiveExamsBtn();
    signUpPage.Continue();

    }

@Test(description = "Verify Higher-Ed Abroad element select on goal page")
public void VerifyHigherEdAbroadElementClickableOnGoalPage() {
    SoftAssert softAssert = new SoftAssert();
    welcomePage.Signup();
    signUpPage.MobileNumber(prop.getProperty("text"));
    signUpPage.Continue();
    onboardingPage.SearchEngineBtn();
    currentRolePage.StudentBtn();
    signUpPage.Continue();
    goalPage.HigherEdAbroadBtn();
    signUpPage.Continue();

    }

@Test(description = "Verify Networking Events element select on goal page")
public void VerifyNetworkingEventsElementClickableOnGoalPage() {
    SoftAssert softAssert = new SoftAssert();
    welcomePage.Signup();
    signUpPage.MobileNumber(prop.getProperty("text"));
    signUpPage.Continue();
    onboardingPage.SearchEngineBtn();
    currentRolePage.StudentBtn();
    signUpPage.Continue();
    goalPage.NetworkingEventsBtn();
    signUpPage.Continue();

    }

    @Test(description = "Verify Peer Benchmark element select on goal page")
    public void VerifyPeerBenchmarkElementClickableOnGoalPage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
        onboardingPage.SearchEngineBtn();
        currentRolePage.StudentBtn();
        signUpPage.Continue();
        goalPage.PeerBenchmarkBtn();
        signUpPage.Continue();

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();

    }
}