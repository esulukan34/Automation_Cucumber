package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class TC09_SearchProduct {
    AutomationPage page = new AutomationPage();
    @And("Kullanici arama box ina urun adini girer ve ara dugmesine tiklar")
    public void kullaniciAramaBoxInaUrunAdiniGirerVeAraDugmesineTiklar() {
        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().refresh();
        page.productsButton.click();
        ReusableMethods.getActions().click(page.searchProduct).sendKeys("Madame Top For Women").click(page.searchButton).perform();

    }

    @And("Kullanici ARARAN URUNLER in gorunur oldugunu dogrular")
    public void kullaniciARARANURUNLERInGorunurOldugunuDogrular() {
        assertTrue(page.searchedProducts.isDisplayed());
    }

    @And("Kullanici aramayla ilgili tum urunlerin gorunur oldugunu dogrular")
    public void kullaniciAramaylaIlgiliTumUrunlerinGorunurOldugunuDogrular() throws IOException {
        for (WebElement each : page.searchedProductNames) {
            System.out.println(each.getText());
            assertTrue(each.isDisplayed());
        }
        ReusableMethods.jsScroll(page.wantedProduct);
        ReusableMethods.getScreenshotWebElement("Aranan urun",page.wantedProduct);
    }
}
