package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class T08_VerifyAllProductsAndProductDetailPage {

    AutomationPage page = new AutomationPage();
    @And("Kullanici Urunler dügmesine tiklar")
    public void kullaniciUrunlerDügmesineTiklar() {
        page.productsButton.click();
    }

    @Then("Kullanicinin TUM URUNLER sayfasina basariyla gittigini doğrular")
    public void kullanicininTUMURUNLERSayfasinaBasariylaGittiginiDoğrular() {
        assertTrue(page.allProductPage.isDisplayed());
        Driver.getDriver().navigate().refresh();
        page.productsButton.click();
    }

    @Then("Kullanici Urun listesi görünür oldugunu dogrular")
    public void kullaniciUrunListesiGörünürOldugunuDogrular() throws IOException {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(3);
      // int number = 1;
      // for (WebElement each : page.allProductsList) {
      //     System.out.println(number + " => " + each.getText());
      //     number++;
      // }

        int number = 1;
        for (WebElement each:page.allProduct) {
            System.out.println(number + " => " + each.getText());
            assertTrue(each.isDisplayed());
        }


    }

    @And("Kullanici ilk urunun Urunu Goruntule ye tiklar")
    public void kullaniciIlkUrununUrunuGoruntuleYeTiklar() {
        ReusableMethods.jsScrollClick(page.viewProductList.get(0));
    }

    @And("Kullanici urun detay sayfasina yonlendirilir")
    public void kullaniciUrunDetaySayfasinaYonlendirilir() {
        assertTrue(page.productInformation.isDisplayed());
    }

    @Then("Kullanici ayrıntilarin gorunurr oldugunu dogrular urun adi, kategori, fiyat, bulunabilirlik, durum, marka")
    public void kullaniciAyrıntilarinGorunurrOldugunuDogrularUrunAdiKategoriFiyatBulunabilirlikDurumMarka() throws IOException {
           ReusableMethods.getScreenshotWebElement("Urun Bilgisi",page.productInformationScreenshot);

            assertTrue(page.productName.isDisplayed());
            assertTrue(page.productCategory.isDisplayed());
            assertTrue(page.productPrice.isDisplayed());
            assertTrue(page.productAvailability.isDisplayed());
            assertTrue(page.productCondition.isDisplayed());
            assertTrue(page.productBrand.isDisplayed());

    }
}
