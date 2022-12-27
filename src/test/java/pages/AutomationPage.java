package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationPage {

    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Tc001
    @FindBy(css = ".fa.fa-home")
    public WebElement home;

    @FindBy(css = ".fa.fa-lock")
    public WebElement signUp;

    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement userSignup;

    @FindBy(xpath = "//*[@name = 'name']")
    public WebElement userName;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signUp2;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enter;

    @FindBy(css = "#id_gender1")
    public WebElement mr;

    @FindBy(css = "#days")
    public WebElement day;

    @FindBy(css = "#months")
    public WebElement month;

    @FindBy(css = "#years")
    public WebElement year;

    @FindBy(css = "#newsletter")
    public WebElement newslatter;

    @FindBy(css = "#optin")
    public WebElement partners;

    @FindBy(css = "#first_name")
    public WebElement firstname;

    @FindBy(css = "#country")
    public WebElement country;

    @FindBy(css = "#state")
    public WebElement state;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccount;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreate;

    @FindBy(css = ".btn.btn-primary")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement logged;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement delete;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement accountDelete;

    //TC002
    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginToYourAccountText;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailBoxLogin;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordBoxLogin;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[.='Account Deleted!']//b")
    public WebElement accountDeletedText;
    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement yourEmailOrPasswordIsIncorrect;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginLink;
    @FindBy(name = "name")
    public WebElement nameBoxSignup;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBoxSignup;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;
    @FindBy(css = ".radio-inline")
    public List<WebElement> genderList;
    @FindBy(css = "#password")
    public WebElement passwordBoxNewSignup;
    @FindBy(css = "#days")
    public WebElement dayDDM;
    @FindBy(css = "#months")
    public WebElement monthDDM;
    @FindBy(css = "#years")
    public WebElement yearDDM;
    @FindBy(id = "newsletter")
    public WebElement newsletter;
    @FindBy(css = "button[data-qa='create-account']")
    public WebElement createAccountButton;


    //TC04
    @FindBy(css = ".fa.fa-user")
    public WebElement loggedInAsUsername;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;

    //TC05

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement emailAlreadyExistText;


    //06
    @FindBy(css = ".fa.fa-envelope")
    public WebElement contactUs;

    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchTitle;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBoxContact;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBoxContact;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectBoxContact;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageBoxContact;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy(css = ".btn.btn-primary.pull-left.submit_form")
    public WebElement submitContact;

    @FindBy(css = ".status.alert.alert-success")
    public WebElement successMessage;

    @FindBy(css = ".btn.btn-success")
    public WebElement homeButtonContact;

    @FindBy(css = ".fa.fa-list")
    public WebElement testCasesButton;


    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement testCasesTitle;










































    //TC10-11
    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscriptionTitle;

    @FindBy(xpath = "//*[@id='susbscribe_email']")
    public WebElement subscriptionEmailBox;

    @FindBy(xpath = "//*[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscriptionOkButton;

    @FindBy(xpath = "//*[@class='alert-success alert']")
    public WebElement successMessageAlert;

    @FindBy(xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement cartButton;

}
