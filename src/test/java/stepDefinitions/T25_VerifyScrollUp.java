package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AutomationPage;

import static junit.framework.TestCase.assertTrue;
import static utilities.ReusableMethods.jsScroll;
import static utilities.ReusableMethods.jsScrollClick;

public class T25_VerifyScrollUp {

    AutomationPage page = new AutomationPage();

    @Then("Kullanici Sayfayı aşağıya doğru kaydırır")
    public void kullanici_sayfayı_aşağıya_doğru_kaydırır() {

        jsScroll(page.subscriptionTitle);
    }


    @Then("Kullanici ABONELİK'in görünür olduğunu doğrular")
    public void kullanici_aboneli̇k_in_görünür_olduğunu_doğrular() {

        assertTrue(page.subscriptionTitle.isDisplayed());

    }


    @When("Kullanici Yukarı doğru hareket etmek için sağ alt taraftaki oka tıklar")
    public void kullanici_yukarı_doğru_hareket_etmek_için_sağ_alt_taraftaki_oka_tıklar() {

        jsScrollClick(page.scrollUp);

    }

    @When("Kullanici Sayfanın yukarı kaydırıldığını ve Otomasyon Mühendisleri için Tam Teşekküllü uygulama web sitesi metninin ekranda göründüğünü doğrular")
    public void kullanici_sayfanın_yukarı_kaydırıldığını_ve_otomasyon_mühendisleri_için_tam_teşekküllü_uygulama_web_sitesi_metninin_ekranda_göründüğünü_doğrular() {

        assertTrue(page.automationEngineersTitle.isDisplayed());

    }
}
