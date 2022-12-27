package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class T10_VerifySubscriptionInHomePage {

    AutomationPage page = new AutomationPage();

    @Then("Kullanici altbilgiye doğru aşağı kaydırır")
    public void kullaniciAltbilgiyeDoğruAşağıKaydırır() {

        ReusableMethods.jsScroll(page.subscriptionTitle);

    }

    @Then("Kullanici SUBSCRIPTION metnini doğrular")
    public void kullaniciSUBSCRIPTIONMetniniDoğrular() throws IOException {

        assertTrue(page.subscriptionTitle.isDisplayed());
        ReusableMethods.getScreenshotWebElement("SUBSCRIPTION Text", page.subscriptionTitle);
    }

    @Then("Kullanici giriş alanına email adresini girer ve ok düğmesine tıklar")
    public void kullaniciGirişAlanınaEmailAdresiniGirerVeOkDüğmesineTıklar() {

        page.subscriptionEmailBox.sendKeys(Faker.instance().internet().emailAddress());
        page.subscriptionOkButton.click();
    }

    @And("Kullanici You have been successfully subscribed!'in görünür olduğunu doğrular")
    public void kullaniciYouHaveBeenSuccessfullySubscribedInGörünürOlduğunuDoğrular() throws IOException {

        ReusableMethods.waitForClickablility(page.successMessageAlert,3);
        assertTrue(page.successMessageAlert.isDisplayed());
        ReusableMethods.getScreenshotWebElement("SuccessMessageAlert", page.successMessageAlert);

    }
}
