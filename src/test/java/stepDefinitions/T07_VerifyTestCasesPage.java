package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;

import static org.junit.Assert.assertEquals;

public class T07_VerifyTestCasesPage {

    AutomationPage page = new AutomationPage();
    @Then("Kullanici Test Cases butonuna tiklar")
    public void kullaniciTestCasesButonunaTiklar() {

        page.testCasesButton.click();



    }

    @And("Kullanicinin test senaryoları sayfasına başarıyla yönlendirildiğini doğrular")
    public void kullanicininTestSenaryolarıSayfasınaBaşarıylaYönlendirildiğiniDoğrular() {

        Assert.assertTrue(page.testCasesTitle.isDisplayed());
    }
}
