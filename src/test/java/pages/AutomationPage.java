package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
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

    @FindBy(css = "a>.fa.fa-user")
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

    @FindBy(css = "#first_name")
    public WebElement firstnameBoxNewSignup;


    //TC12

    @FindBy(css = ".material-icons.card_travel")
    public WebElement products;

    @FindBy(xpath = "(//a[text()='Add to cart'])[1]")
    public WebElement addToChart;

    @FindBy(css = ".btn.btn-success.close-modal.btn-block")
    public WebElement continueShopping;

    @FindBy(xpath = "(//a[text()='Add to cart'])[3]")
    public WebElement addToChart2;

    @FindBy(xpath = "(//a[@href=\"/view_cart\"])[2]")
    public WebElement viewCart;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> productsList;


    @FindBy(xpath = "//tbody/tr[1]/td[3]/p")
    public WebElement firstProductPrice;


    @FindBy(xpath = "//tbody/tr[2]/td[3]/p")
    public WebElement secondProductPrice;


    @FindBy(xpath = "//tbody/tr[1]/td[4]/button")
    public WebElement firstProductQuantity;


    @FindBy(xpath = "//tbody/tr[2]/td[4]/button")
    public WebElement secondProductQuantity;


    @FindBy(xpath = "//tr[1]/td[5]/p")
    public WebElement firstProductTotal;

    @FindBy(xpath = "//tr[2]/td[5]/p")
    public WebElement secondProductTotal;


    //TC13


    @FindBy(css = ".nav.nav-pills.nav-justified>li>a")
    public List<WebElement> viewProductButtonList;


    @FindBy(css = ".product-information")
    public WebElement productDetail;


    @FindBy(css = "#quantity")
    public WebElement quantity;


    @FindBy(css = ".btn.btn-default.cart")
    public WebElement addToCartButton;


    @FindBy(xpath = "//tr[1]/td[4]/button")
    public WebElement quantityInCart;

    @FindBy(xpath = "//div[@class='single-products']//*[@class='productinfo text-center']/a")
    public List<WebElement> firstProductAddToCart;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cartIcon;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement addressDetailsHeader;

    @FindBy(xpath = "//*[text()='Review Your Order']")
    public WebElement reviewYourOrderHeader;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement messageTextBox;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[@name='name_on_card']")
    public WebElement nameOnCardTextBox;

    @FindBy(xpath = "//*[text()='Pay and Confirm Order']")
    public WebElement payAndConfirmOrderButton;


    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement alertSucessButton;

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCart;

    //TC16-17
    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement WiewCart;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement ProceedToCheckout;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement addressDetails;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement orderButton;

    @FindBy(xpath = "//*[@class='cart_quantity_delete']")
    public WebElement deletesTheProduct;

    @FindBy(xpath = "//*[text()='Cart is empty!']")
    public WebElement cartEmpty;

    //TC 18-19
    @FindBy(xpath = "//h2[text()='Category']")
    public WebElement category;

    @FindBy(xpath = "(//h4/a[@data-toggle ='collapse'])[1]")
    public WebElement women;

    @FindBy(xpath = "(//div[@class='panel-body']/ul/li/a)[1]")
    public WebElement dress;

    @FindBy(xpath = "//*[@class='active']")
    public WebElement active;
    @FindBy(xpath = "//h2[text()='Women - Dress Products']")
    public WebElement womenTopProducts;
    @FindBy(xpath = "(//h4/a[@data-toggle ='collapse'])[2]")
    public WebElement men;
    @FindBy(xpath = "(//div[@class='panel-body']/ul/li/a)[4]")
    public WebElement tshirt;
    @FindBy(xpath = "//div[@class='brands-name']/ul/li")
    public List<WebElement> brandsName;
    @FindBy(xpath = "//*[text()='Polo']")
    public WebElement polo;
    @FindBy(xpath = "//h2[text()='Brand - Polo Products']")
    public WebElement brandPoloProducts;
    @FindBy(xpath = "//*[text()='H&M']")
    public WebElement hm;
    @FindBy(css = ".title.text-center")
    public WebElement brandHMProducts;

    //TC 20
    @FindBy(css = ".features_items>.col-sm-4>div>div>div>p")
    public List<WebElement> allProductNameList;
    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProductsTitle;
    @FindBy(xpath = "//div[@class='single-products']//*[@class='productinfo text-center']/a")
    public List<WebElement> addToCartLinkListSearchedProducts;
    @FindBy(xpath = "//tr/td[2]/h4")
    public List<WebElement> shoppingCartProductNamesList;
    @FindBy(xpath = "//*[@class='cart_delete']/a")
    public List<WebElement> cartDeleteXList;


    // T21

    @FindBy(xpath = "//*[text()='Write Your Review']")
    public WebElement writeYourReviewText;

    @FindBy(id = "name")
    public WebElement productDetailsName;

    @FindBy(id = "email")
    public WebElement productDetailsEmail;

    @FindBy(id = "review")
    public WebElement productDetailsReview;

    @FindBy(id = "button-review")
    public WebElement productDetailsButtonReview;

    @FindBy(xpath = "//*[text()='Thank you for your review.']")
    public WebElement thankYouForYourReview;



    //TC25


    @FindBy(css = "#scrollUp")
    public WebElement scrollUp;

    @FindBy(xpath = "//h2[.='Full-Fledged practice website for Automation Engineers']")
    public WebElement automationEngineersTitle;


    // TC 22

    @FindBy(xpath = "//*[@class='recommended_items']")
    public WebElement recommendedItems22;

    //@FindBy (xpath = "//*[@id='cartModal']")
    //public WebElement cartModal22;

    @FindBy(xpath = "//div[@class='recommended_items']//div[@class='col-sm-4']/div/div/div/a/i)[1]")
    public WebElement addChart22;

    @FindBy(css = ".carousel-inner>div>.col-sm-4>div>div>div>a")
    public List<WebElement> addChart22List;

    @FindBy(xpath = "//div[@class='recommended_items']//div[@class='col-sm-4']/div/div/div/p")
    public List<WebElement> addChartItemsNameList;

    @FindBy(xpath = "//a[@href='/view_cart']/u")
    public WebElement viewCart22;

    @FindBy(xpath = "//tr/td/h4/a")
    public WebElement viewChartItem;


    //TC23
    @FindBy(css = "#address_delivery>li")
    public List<WebElement> deliveryAddress;
    @FindBy(css = "#address_invoice>li")
    public List<WebElement> billingAddress;
    @FindBy(css = "form>div[class=clearfix]>div")
    public List<WebElement> genderList1;

    //TC026
    @FindBy(css = ".single-widget")
    public WebElement singleWidget;

    @FindBy(xpath = "//*[.='Subscription']")
    public WebElement getSubscriptionTitle;

    @FindBy(css = ".logo.pull-left")
    public WebElement websiteAutomationEngineers;

    @FindBy(xpath = "(//*[.='Full-Fledged practice website for Automation Engineers'])[1]")
    public List<WebElement> websiteAutomationEngineersMessage;

    @FindBy(css = ".fa.fa-angle-up")
    public WebElement scrollUpp;

}
