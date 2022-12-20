package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
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


}
