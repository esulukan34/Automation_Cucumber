package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T18_ViewCategoryProducts {

    AutomationPage page = new AutomationPage();

    @Then("Kullanici kategorilerin sol taraftaki çubukta göründüğünü doğrular")
    public void kullanici_kategorilerin_sol_taraftaki_çubukta_göründüğünü_doğrular() {
        assertTrue(page.category.isDisplayed());
    }
    @Then("Kullanici {string} kategorisine tıklar")
    public void kullanici_kategorisine_tıklar(String string) {

        ReusableMethods.jsScrollClick(page.women);
    }
    @Then("Kullanici {string} kategorisi altındaki herhangi bir kategori bağlantısına tıklar, örneğin: Dress")
    public void kullanici_kategorisi_altındaki_herhangi_bir_kategori_bağlantısına_tıklar_örneğin_dress(String string) {

        page.dress.click();

    }
    @Then("Kullanici Kategori sayfasının görüntülendiğini doğrular ve {string} metnini onaylar")
    public void kullanici_kategori_sayfasının_görüntülendiğini_doğrular_ve_metnini_onaylar(String str) {

        Driver.getDriver().navigate().refresh();
        ReusableMethods.jsScrollClick(page.women);
        ReusableMethods.jsclick(page.dress);
        assertTrue(page.active.isDisplayed());
        ReusableMethods.waitForVisibility(page.womenTopProducts,10);
        System.out.println("str = " + str);
        String actualData = page.womenTopProducts.getText();
        System.out.println("actualData = " + actualData);
        assertEquals(str,actualData);


    }
    @Then("Kullanici Sol taraftaki çubukta, {string} kategorisinin herhangi bir alt kategori bağlantısına tıklar")
    public void kullanici_sol_taraftaki_çubukta_kategorisinin_herhangi_bir_alt_kategori_bağlantısına_tıklar(String string) {
        page.men.click();
        ReusableMethods.jsclick(page.tshirt);
    }
    @Then("Kullanicinin o kategori sayfasına yönlendirildiğini doğrular")
    public void kullanicinin_o_kategori_sayfasına_yönlendirildiğini_doğrular() {
        assertTrue(page.active.isDisplayed());
    }
}
