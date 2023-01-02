package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T19_ViewCartBrandProducts {

    AutomationPage page = new AutomationPage();

    @Then("Kullanici {string} düğmesine tıklar")
    public void kullanici_düğmesine_tıklar(String string) {
        page.products.click();
    }
    @Then("Kullanici Sol taraftaki çubukta Markaların göründüğünü doğrular")
    public void kullanici_sol_taraftaki_çubukta_markaların_göründüğünü_doğrular() {

        Driver.getDriver().navigate().refresh();
        assertEquals(page.brandsName.size(),8);
    }
    @Then("Kullanici Herhangi bir marka adına tıklar")
    public void kullanici_herhangi_bir_marka_adına_tıklar() {

        ReusableMethods.jsScrollClick(page.polo);
    }
    @Then("Kullanici marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrular")
    public void kullanici_marka_sayfasına_yönlendirildiğini_ve_marka_ürünlerinin_görüntülendiğini_doğrular() {
        assertTrue(page.active.isDisplayed());
        assertTrue(page.brandPoloProducts.isDisplayed());


    }
    @Then("Kullanici Sol taraftaki çubukta herhangi bir başka marka bağlantısına tıklar")
    public void kullanici_sol_taraftaki_çubukta_herhangi_bir_başka_marka_bağlantısına_tıklar() {

        ReusableMethods.jsScrollClick(page.hm);
    }
    @Then("Kullanici Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrular")
    public void kullanici_kullanıcının_o_marka_sayfasına_gittiğini_ve_ürünleri_görebildiğini_doğrular() {

        assertTrue(page.active.isDisplayed());
        assertTrue(page.brandHMProducts.isDisplayed());
    }

}
