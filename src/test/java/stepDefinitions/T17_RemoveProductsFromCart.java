package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;
import utilities.ReusableMethods;

public class T17_RemoveProductsFromCart {

    AutomationPage page = new AutomationPage();

    @Then("Kullanici sepeti temizler ve sepetin bos oldugunu dogrular")
    public void kullanici_sepeti_temizler_ve_sepetin_bos_oldugunu_dogrular() {
        page.deletesTheProduct.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(page.cartEmpty.isDisplayed());
    }
}
