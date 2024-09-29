package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtil;

public class CurrentRolePage extends testbase.WebTestBase {
    @FindBy(xpath = "//p[text()='Student']")
    WebElement StudentBtn;

    @FindBy(xpath = "//p[text()='Working Professional']")
    WebElement WorkingProfessionalBtn;

    @FindBy(xpath = "//p[text()='Exploring Opportunities']")
    WebElement ExploringOpportunitiesBtn;


    public CurrentRolePage(){
        PageFactory.initElements(driver,this);
    }

    public void StudentBtn() {
        WebDriverUtil.waitElementUtilClickable(StudentBtn);}
    public void WorkingProfessionalBtn() {
        WebDriverUtil.waitElementUtilClickable(WorkingProfessionalBtn);
    }
        public void ExploringOpportunitiesBtn() {
        WebDriverUtil.waitElementUtilClickable(ExploringOpportunitiesBtn);

    }
}

