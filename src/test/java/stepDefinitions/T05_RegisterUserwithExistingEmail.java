package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class T05_RegisterUserwithExistingEmail {

    AutomationPage page = new AutomationPage();

    @Then("Kullanici NewUserSignup alanına gecerli isim ve email adresi girer")
    public void kullaniciNewUserSignupAlanınaGecerliIsimVeEmailAdresiGirer() {

        page.nameBoxSignup.sendKeys(ConfigReader.getProperty("name"));
        page.emailBoxSignup.sendKeys(ConfigReader.getProperty("email"));

    }

    @Then("Kullanici Signup butonuna tıklar")
    public void kullaniciSignupButonunaTıklar() {

        ReusableMethods.jsScrollClick(page.signupButton);
    }

    @And("Kullanici Email Address already exist! yazisinin görünür oldugunu dogrular")
    public void kullaniciEmailAddressAlreadyExistYazisininGörünürOldugunuDogrular() {

        page.emailAlreadyExistText.isDisplayed();
    }
}
