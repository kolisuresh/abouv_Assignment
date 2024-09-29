
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.WelcomePage;

public class WelcomeTest extends testbase.WebTestBase {
    WelcomePage welcomePage;
    WelcomeTest welcomeTest;


    @BeforeMethod
    public void preRequisite() {
        initialization();
        welcomePage = new WelcomePage();

        welcomeTest = new WelcomeTest();

    }

    @Test(description = "Verify signup button click on welcome page")
    public void VerifySignupButtonClickableOnWelcomePage() {
        SoftAssert SoftAssert = new SoftAssert();
        welcomePage.Signup();
    }

//    @Test(description = "Verify existing user login button click on welcome page")
//    public void VerifyExistinguserLoginButtonClickable(){
//        SoftAssert softAssert = new SoftAssert();
//        welcomePage.Loginexisting();
//    }


    @AfterMethod
    public void tearDown() throws InterruptedException {

        driver.close();

    }
}


