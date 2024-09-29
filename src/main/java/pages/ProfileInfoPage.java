package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtil;
import util.WebElementUtil;

public class ProfileInfoPage extends testbase.WebTestBase {

    @FindBy(xpath = " //input[@placeholder='Enter First Name']")
    WebElement FirstnameTextbox;


    @FindBy(xpath = " //input[@placeholder='Enter Last Name']")
    WebElement LastnameTextbox;

    @FindBy(xpath = " //input[@placeholder=' Enter PIN code']")
    WebElement PincodeBtnTextbox;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ContinueBtn;

    public ProfileInfoPage(){
        PageFactory.initElements(driver,this);
    }

    public void InfoPage() {
        WebElementUtil.sendKeysOnElement(FirstnameTextbox,"firstname");
        WebElementUtil.sendKeysOnElement(LastnameTextbox,"lastname");
        WebElementUtil.sendKeysOnElement(PincodeBtnTextbox,"pincode");
        WebDriverUtil.waitElementUtilClickable(ContinueBtn);

    }
}
