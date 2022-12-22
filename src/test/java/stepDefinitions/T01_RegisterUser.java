package stepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.getDriver;

public class T01_RegisterUser {
    AutomationPage auto = new AutomationPage();


    @Given("Kullanici automation anasayfasinda")
    public void kullanici_automation_anasayfasinda() {

        getDriver().get(ConfigReader.getProperty("autoUrl"));
    }
    @Then("Kullanici ana sayfanın basarıyla göründüğünü doğrular")
    public void kullanici_ana_sayfanın_basarıyla_göründüğünü_doğrular() {

        String expectedData = "https://automationexercise.com/";
        String actualData = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedData,actualData);
    }
    @Then("Kullanici Signup - Login dügmesine tıklar")
    public void kullanici_signup_login_dügmesine_tıklar() {

        auto.signUp.click();
    }
    @Then("Kullanici New User Signup!'in görünür oldugunu dorgular")
    public void kullanici_new_user_signup_in_görünür_oldugunu_dorgular() {

        auto.userSignup.isDisplayed();
    }
    @Then("Kullanici Yeni kayit icin name ve email adresi girer")
    public void kullanici_yeni_kayit_icin_name_ve_email_adresi_girer() {
        auto.userName.click();
        ReusableMethods.getActions().sendKeys(ReusableMethods.getFaker().name().name()).
                sendKeys(Keys.TAB).sendKeys(ReusableMethods.getFaker().internet().emailAddress()).perform();

    }
    @Then("Kullanici Kaydol düğmesini tıklar")
    public void kullanici_kaydol_düğmesini_tıklar() {

        auto.signUp2.click();
    }
    @Then("Kullanici ENTER ACCOUNT INFORMATION ifadesinin göründüğünü doğrular")
    public void kullanici_enter_account_ınformatıon_ifadesinin_göründüğünü_doğrular() {

        auto.enter.isDisplayed();
    }
    @Then("Kullanici Title, Name, Email, Password, Date of birth kisimlarini doldurur")
    public void kullanici_title_name_email_password_date_of_birth_kisimlarini_doldurur() {

        auto.mr.click();
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().internet().password()).perform();

        ReusableMethods.selectDropDown(auto.day);
        ReusableMethods.selectDropDown(auto.month);
        ReusableMethods.selectDropDown(auto.year);

    }
    @Then("Kullanici Sign up for our newsletter! onay kutusunu secer")
    public void kullanici_sign_up_for_our_newsletter_onay_kutusunu_secer() {
        ReusableMethods.jsScrollClick(auto.newslatter);
    }
    @Then("Kullanici Receive special offers from our partners! onay kutusunu secer")
    public void kullanici_receive_special_offers_from_our_partners_onay_kutusunu_secer() {
        ReusableMethods.jsScrollClick(auto.partners);

    }
    @Then("Kullanici First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number kisimlarini doldurur")
    public void kullanici_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number_kisimlarini_doldurur() {
        ReusableMethods.getActions().click(auto.firstname)
                .sendKeys(ReusableMethods.getFaker().name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().address().streetAddress()).perform();

        ReusableMethods.selectDropDown(auto.country);
        ReusableMethods.jsScroll(auto.state);
        ReusableMethods.getActions().click(auto.state).
                        sendKeys(Faker.instance().address().state()).
                        sendKeys(Keys.TAB).
                        sendKeys(Faker.instance().address().city()).
                        sendKeys(Keys.TAB).
                        sendKeys(Faker.instance().address().zipCode()).
                        sendKeys(Keys.TAB).
                        sendKeys(ReusableMethods.getFaker().phoneNumber().phoneNumber()).perform();

    }
    @Then("Kullanici Create Account button'na tıklar")
    public void kullanici_create_account_button_na_tıklar() {
        auto.createAccount.click();

    }
    @Then("Kullanici ACCOUNT CREATED! görünür")
    public void kullanici_account_created_görünür() {
        ReusableMethods.waitForVisibility(auto.accountCreate,10);

    }
    @Then("Kullanici Continue butonuna basar")
    public void kullanici_continue_butonuna_basar() {
        ReusableMethods.jsScrollClick(auto.continueButton);

    }
    @Then("Kullanici Logged in as username gorunur oldugunu dogrular")
    public void kullanici_logged_in_as_username() {
        Driver.getDriver().navigate().refresh();
        auto.logged.isDisplayed();

    }
    @Then("Kullanici Delete Account butonuna basar")
    public void kullanici_delete_account_butonuna_basar() {
        ReusableMethods.jsScrollClick(auto.delete);

    }
    @Then("Kullanici ACCOUNT DELETED! gorunur oldugunu dogrular ve Continue buttonuna basar")
    public void kullanici_account_deleted_gorunur_oldugunu_dogrular_ve_continue_buttonuna_basar() {
        auto.accountDelete.isDisplayed();
        
    }


}
