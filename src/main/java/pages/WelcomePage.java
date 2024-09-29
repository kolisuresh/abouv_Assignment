package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtil;
import util.WebElementUtil;

public class WelcomePage extends testbase.WebTestBase {
    @FindBy(xpath = "//a[text()='Sign up']")
    WebElement SignupBtn;

    @FindBy(xpath = "//button[text()='Existing user? Login']")
    WebElement LoginExistingUser;

    public WelcomePage(){
        PageFactory.initElements(driver, this);
    }

    public void Signup() {
        WebDriverUtil.waitElementUtilClickable(SignupBtn); }
        }
//public void Loginexisting() {
//    WebDriverUtil.waitElementUtilClickable(LoginExistingUser); }
//        }






