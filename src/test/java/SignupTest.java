import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SignUpPage;
import pages.WelcomePage;
import testbase.WebTestBase;

public class SignupTest extends WebTestBase {
    WelcomePage welcomePage;
    WelcomeTest welcomeTest;
    SignUpPage signUpPage;
    SignupTest signupTest;


    @BeforeMethod
    public void preRequisite() {

        welcomePage = new WelcomePage();

        welcomeTest = new WelcomeTest();

        signUpPage = new SignUpPage();

        signupTest = new SignupTest();


    }

    @Test(description = "Verify user enter mobile number on signup page")
    public void VerifySignupButtonClickableOnWelcomePage() {
        SoftAssert softAssert = new SoftAssert();
        welcomePage.Signup();
        signUpPage.MobileNumber(prop.getProperty("text"));
        signUpPage.Continue();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.close();

    }
}


