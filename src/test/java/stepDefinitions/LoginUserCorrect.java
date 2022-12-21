package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginUserCorrect {

    AutomationPage page = new AutomationPage();
    @Then("Kullanici Login to your account'un gorunur oldugunu dogrular")
    public void kullaniciLoginToYourAccountUnGorunurOldugunuDogrular() {

        Assert.assertTrue(page.loginToYourAccountText.isDisplayed());
    }

    @Then("Kullanici Dogru e-posta adresini ve şifreyi girer")
    public void kullaniciDogruEPostaAdresiniVeŞifreyiGirer() {

        page.emailBoxLogin.sendKeys(Hooks.email);
        page.passwordBoxLogin.sendKeys(Hooks.password);
    }

    @Then("Kullanici login button'una tiklar")
    public void kullaniciLoginButtonUnaTiklar() {

        ReusableMethods.jsScrollClick(page.loginButton);
    }

    @And("Kullanici ACCOUNT DELETED! gorunur oldugunu dogrular")
    public void kullaniciACCOUNTDELETEDGorunurOldugunuDogrular() {


        Assert.assertTrue(page.accountDeletedText.isDisplayed());
    }
}
