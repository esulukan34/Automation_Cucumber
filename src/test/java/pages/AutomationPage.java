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



}
