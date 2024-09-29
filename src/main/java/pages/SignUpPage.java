package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtil;
import util.WebElementUtil;

public class SignUpPage extends testbase.WebTestBase {
    @FindBy(xpath = "//a[text()='Sign up']")
    WebElement MobileNumberTextbox;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ContinueBtn;


    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }

    public void MobileNumber(String num){

        WebElementUtil.sendKeysOnElement(MobileNumberTextbox,"Num");
    }
public void Continue(){

        WebDriverUtil.waitElementUtilClickable(ContinueBtn);

}
    }


