package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtil;

public class ProfileSetupPage extends testbase.WebTestBase {

    @FindBy(xpath = " //button[text()='Continue with email']")
    WebElement ContinuewithemailBtn;

    @FindBy(xpath = " //button[text()='Continue with google']")
    WebElement ContinuewithgoogleBtn;

    public ProfileSetupPage(){
        PageFactory.initElements(driver,this);
    }

    public void ContinuewithemailBtn() {
        WebDriverUtil.waitElementUtilClickable(ContinuewithemailBtn);}
    public void ContinuewithgoogleBtn(){
        WebDriverUtil.waitElementUtilClickable(ContinuewithgoogleBtn);

    }
}
