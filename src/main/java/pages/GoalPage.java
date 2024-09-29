package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.WebDriverUtil;

public class GoalPage  extends testbase.WebTestBase {
    @FindBy(xpath = "//p[text()='Job Opportunities']")
    WebElement JobOpportunitiesBtn;

    @FindBy(xpath = "//p[text()='Paid Internships']")
    WebElement PaidInternshipsBtn;

    @FindBy(xpath = "//p[text()='Freelancing Gigs']")
    WebElement FreelancingGigsBtn;

    @FindBy(xpath = "//p[text()='Externship Gigs']")
    WebElement ExternshipGigsBtn;

    @FindBy(xpath = "//p[text()='Self Assessment ']")
    WebElement SelfAssessmentBtn;

    @FindBy(xpath = "//p[text()='Volunteer Work']")
    WebElement VolunteerWorkBtn;

    @FindBy(xpath = "//p[text()='Competitive Exams']")
    WebElement CompetitiveExamsBtn;

    @FindBy(xpath = "//p[text()='Higher-Ed Abroad']")
    WebElement HigherEdAbroadBtn;

    @FindBy(xpath = "//p[text()='Networking Events']")
    WebElement NetworkingEventsBtn;

    @FindBy(xpath = "//p[text()='Peer Benchmark']")
    WebElement PeerBenchmarkBtn;


    public GoalPage(){
        PageFactory.initElements(driver,this);
    }

    public void JobOpportunitiesBtn() {
        WebDriverUtil.waitElementUtilClickable(JobOpportunitiesBtn);}
    public void PaidInternshipsBtn() {
        WebDriverUtil.waitElementUtilClickable(PaidInternshipsBtn);
    }
    public void FreelancingGigsBtn() {
        WebDriverUtil.waitElementUtilClickable(FreelancingGigsBtn);
    }
    public void ExternshipGigsBtn() {
        WebDriverUtil.waitElementUtilClickable(ExternshipGigsBtn);}
    public void SelfAssessmentBtn() {
        WebDriverUtil.waitElementUtilClickable(SelfAssessmentBtn);}
    public void VolunteerWorkBtn() {
        WebDriverUtil.waitElementUtilClickable(VolunteerWorkBtn);}
    public void CompetitiveExamsBtn() {
        WebDriverUtil.waitElementUtilClickable(CompetitiveExamsBtn);}
    public void HigherEdAbroadBtn() {
        WebDriverUtil.waitElementUtilClickable(HigherEdAbroadBtn);
    }
    public void NetworkingEventsBtn() {
        WebDriverUtil.waitElementUtilClickable(NetworkingEventsBtn);}
    public void PeerBenchmarkBtn() {
        WebDriverUtil.waitElementUtilClickable(PeerBenchmarkBtn);}

    }
