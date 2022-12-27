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


<<<<<<< Updated upstream
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
=======






































>>>>>>> Stashed changes

    // TC_008
    @FindBy(css = ".nav.navbar-nav>:nth-child(2)")
    public WebElement productsButton;
    @FindBy(css = ".features_items")
    public WebElement allProductPage;
    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public List<WebElement> allProductsList;
    @FindBy(css = "a>.fa.fa-plus-square")
    public List<WebElement> viewProductList;
    @FindBy(css = ".product-information")
    public WebElement productInformation;
    @FindBy(css = ".product-information")
    public WebElement productInformationScreenshot;
    @FindBy(css = ".product-information>h2")
    public WebElement productName;
    @FindBy(xpath = "(//*[@class='product-information']//p)[1]")
    public WebElement productCategory;
    @FindBy(xpath = "//div//span//span")
    public WebElement productPrice;
    @FindBy(xpath = "(//*[@class='product-information']//p)[2]")
    public WebElement productAvailability;
    @FindBy(xpath = "(//*[@class='product-information']//p)[3]")
    public WebElement productCondition;
    @FindBy(xpath = "(//*[@class='product-information']//p)[4]")
    public WebElement productBrand;

    @FindBy(xpath = "//*[@class='features_items']//*[@class='col-sm-4']/div/div/div/p")
    public List<WebElement> allProduct;  //css ->    .features_items>.col-sm-4>div>div>div>p

    //TC009
    @FindBy(css = "input#search_product")
    public WebElement searchProduct;
    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement searchButton;
    @FindBy(css = ".title.text-center")
    public WebElement searchedProducts;
    @FindBy(xpath = "//*[@class='productinfo text-center']/p")
    public List<WebElement> searchedProductNames;
    @FindBy(xpath = "//*[@class='features_items']")
    public WebElement wantedProduct;



<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
}
