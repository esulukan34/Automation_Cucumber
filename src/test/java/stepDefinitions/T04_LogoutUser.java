package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static utilities.Driver.getDriver;

public class T04_LogoutUser {

    AutomationPage page = new AutomationPage();

    @Then("Kullanici gecerli e-posta adresini ve şifreyi girer")
    public void kullaniciGecerliEPostaAdresiniVeŞifreyiGirer() {

        page.emailBoxLogin.sendKeys(ConfigReader.getProperty("email"));
        page.passwordBoxLogin.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("Kullanici Logout button'una tıklar")
    public void kullaniciLogoutButtonUnaTıklar() {

        ReusableMethods.jsScrollClick(page.logoutButton);


    }

    @And("Kullanici LoginPage'de oldugunu dogrular")
    public void kullaniciLoginPageDeOldugunuDogrular() {

        page.loginToYourAccountText.isDisplayed();


    }
}