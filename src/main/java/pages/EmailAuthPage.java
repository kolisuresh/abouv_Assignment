package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtil;
import util.WebElementUtil;

public class EmailAuthPage extends testbase.WebTestBase {

    @FindBy(xpath = " //input[@placeholder='Enter email address']")
    WebElement emailaddressTextbox;


    @FindBy(xpath = " //button[text()='Continue']]")
    WebElement continueBtn;

    public EmailAuthPage(){
        PageFactory.initElements(driver,this);
    }

    public void emailaddressTextbox() {

        WebElementUtil.sendKeysOnElement(emailaddressTextbox,"Email");}
    public void emailcontinueBtn() {
        WebDriverUtil.waitElementUtilClickable(continueBtn);

        }
    }
