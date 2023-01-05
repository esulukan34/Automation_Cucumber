package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AutomationPage;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class T26_VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionality {

    AutomationPage page = new AutomationPage();
    @When("Sayfayi asagiya dogru kaydirin")
    public void sayfayiAsagiyaDogruKaydirin() {
        ReusableMethods.jsScroll(page.singleWidget);
    }

    @Then("ABONELIK in gorunur oldugunu dogrulayin")
    public void abonelıkInGorunurOldugunuDogrulayin() throws IOException {
        Assert.assertTrue(page.getSubscriptionTitle.isDisplayed());
        ReusableMethods.getScreenshotWebElement("Subscription",page.singleWidget);
    }

    @When("Sayfayi yukari kaydir")
    public void sayfayiYukariKaydir() {
        ReusableMethods.jsScrollClick(page.scrollUpp);

      //  ReusableMethods.waitForVisibility(page.websiteAutomationEngineers,5);
      //  ReusableMethods.jsScroll(page.websiteAutomationEngineers);

    }

    @Then("Sayfanin yukari kaydirildigini ve Otomasyon Muhendisleri icin Tam Tesekkullu uygulama web sitesi metninin ekranda gorundugunu dogrulayin")
    public void sayfaninYukariKaydirildiginiVeOtomasyonMuhendisleriIcinTamTesekkulluUygulamaWebSitesiMetnininEkrandaGorundugunuDogrulayin() throws IOException {

        for (WebElement each:page.websiteAutomationEngineersMessage) {
            assertTrue(each.isDisplayed());
        }

    }
}
