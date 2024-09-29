package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtil;

public class OnboardingPage extends testbase.WebTestBase {
    @FindBy(xpath = "//p[text()='Family/Friends']")
    WebElement FamilyLinkBtn;

    @FindBy(xpath = "//p[text()='Search Engine']]")
    WebElement SearchEngineBtn;

    @FindBy(xpath = "//p[text()='Social Media']]")
    WebElement SocialMediaBtn;

    @FindBy(xpath = "//p[text()='Word of Mouth']]")
    WebElement WordofMouth;

    @FindBy(xpath = "//p[text()='TV Commercials']]")
    WebElement TVCommercialsBtn;

    @FindBy(xpath = "//p[text()='Events/Conference']]")
    WebElement EventsConferenceBtn;




    public OnboardingPage(){
        PageFactory.initElements(driver,this);
    }

    public void FamilyLinkBtn() {
        WebDriverUtil.waitElementUtilClickable(FamilyLinkBtn);}

    public void SearchEngineBtn() {
        WebDriverUtil.waitElementUtilClickable(SearchEngineBtn);
    }
    public void SocialMediaBtn() {
        WebDriverUtil.waitElementUtilClickable(SocialMediaBtn);
    }

    public void WordofMouth() {
            WebDriverUtil.waitElementUtilClickable(WordofMouth);
        }
    public void TVCommercialsBtn()    {
                WebDriverUtil.waitElementUtilClickable(TVCommercialsBtn);
            }

    public void EventsConferenceBtn() {
        WebDriverUtil.waitElementUtilClickable(EventsConferenceBtn);

    }
}