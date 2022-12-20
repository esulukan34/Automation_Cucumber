package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUser01 {
    AutomationPage auto = new AutomationPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici automation anasayfasinda")
    public void kullanici_automation_anasayfasinda() {

        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    }
    @Then("Kullanici ana sayfanın basarıyla göründüğünü doğrular")
    public void kullanici_ana_sayfanın_basarıyla_göründüğünü_doğrular() {

        auto.home.isDisplayed();
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
        actions.sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).perform();

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
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys("5",Keys.TAB)
                .sendKeys("January",Keys.TAB)
                .sendKeys("1986",Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(faker.name().lastName())
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().streetAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("United State",Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys("Los Angeles")
                .sendKeys(Keys.TAB)
                .sendKeys("Malibu")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber(),Keys.ENTER).perform();
    }
    @Then("Kullanici Sign up for our newsletter! onay kutusunu secer")
    public void kullanici_sign_up_for_our_newsletter_onay_kutusunu_secer() {

    }
    @Then("Kullanici Receive special offers from our partners! onay kutusunu secer")
    public void kullanici_receive_special_offers_from_our_partners_onay_kutusunu_secer() {


    }
    @Then("Kullanici First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number kisimlarini doldurur")
    public void kullanici_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number_kisimlarini_doldurur() {


    }
    @Then("Kullanici Create Account button'na tıklar")
    public void kullanici_create_account_button_na_tıklar() {


    }
    @Then("Kullanici ACCOUNT CREATED! görünür")
    public void kullanici_account_created_görünür() {


    }
    @Then("Kullanici Continue butonuna basar")
    public void kullanici_continue_butonuna_basar() {


    }
    @Then("Kullanici Logged in as username")
    public void kullanici_logged_in_as_username() {


    }
    @Then("Kullanici Delete Account butonuna basar")
    public void kullanici_delete_account_butonuna_basar() {


    }
    @Then("Kullanici ACCOUNT DELETED! gorunur oldugunu dogrular ve Continue buttonuna basar")
    public void kullanici_account_deleted_gorunur_oldugunu_dogrular_ve_continue_buttonuna_basar() {

        
    }


}
