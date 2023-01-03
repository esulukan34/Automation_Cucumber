package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AutomationPage;
import utilities.ConfigReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;


public class T20_SearchProductsAndVerifyCartAfterLogin {

    AutomationPage page = new AutomationPage();
    int expectedSize;
    int actualSize;

    @When("Kullanici arama kutusuna urun adini girer ve ara dugmesine tiklar")
    public void kullaniciAramaKutusunaUrunAdiniGirerVeAraDugmesineTiklar() {

        int productIndex = random().nextInt(page.allProductNameList.size());
        getActions()
                .click(page.searchProduct)
                //.sendKeys(page.allProductNameList.get(productIndex).getText())
                .sendKeys("Tshirt")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

    }

    @Then("Kullanici Aranan Urunler'in gorunur oldugunu dogrulayin")
    public void kullaniciArananUrunlerInGorunurOldugunuDogrulayin() {

        assertTrue(page.searchedProductsTitle.isDisplayed());
    }

    @Then("Kullanici urunleri sepete ekler")
    public void kullaniciUrunleriSepeteEkler() {


        //jsScrollClick(page.addToCartLinkListSearchedProducts.get(0));
        //waitFor(3);
        expectedSize = page.addToCartLinkListSearchedProducts.size(); //

        for (int i = 0; i < page.addToCartLinkListSearchedProducts.size(); i++) {

            jsScrollClick(page.addToCartLinkListSearchedProducts.get(i));
            waitFor(1);

            if (page.addToCartLinkListSearchedProducts.size() - 1 == i) {

                jsScrollClick(page.cartButton);

            }else {

                jsScrollClick(page.continueShopping);
            }
        }
    }

    @Then("Kullanici sepet dugmesine tiklar ve urunlerin sepette gorundugunu dogrular")
    public void kullaniciSepetDugmesineTiklarVeUrunlerinSepetteGorundugunuDogrular() {

        //jsScrollClick(page.cartButton);//

        actualSize = page.shoppingCartProductNamesList.size();//

        for (int i = 0; i < page.shoppingCartProductNamesList.size(); i++) {

            assertTrue(page.shoppingCartProductNamesList.get(i).isDisplayed());

            jsScroll(page.shoppingCartProductNamesList.get(i));
        }
    }

    @Then("Kullanici Kaydol-Giris yap dugmesine tiklar ve giris bilgilerini girer")
    public void kullaniciKaydolGirisYapDugmesineTiklarVeGirisBilgileriniGirer() {

        jsScrollClick(page.signupLoginLink);
        page.emailBoxLogin.sendKeys(ConfigReader.getProperty("email2"));
        page.passwordBoxLogin.sendKeys(ConfigReader.getProperty("password2"));
        jsScrollClick(page.loginButton);
    }

    @Then("Kullanici tekrar sepet sayfasina gider")
    public void kullaniciTekrarSepetSayfasinaGider() {

        jsScrollClick(page.cartButton);
    }

    @And("Kullanici giris yaptiktan sonra bu urunlerin de sepette gorundugunu dogrular")
    public void kullaniciGirisYaptiktanSonraBuUrunlerinDeSepetteGorundugunuDogrular() {

        assertEquals(expectedSize, actualSize);

        for (int i = 0; i < page.shoppingCartProductNamesList.size(); i++) {

            assertTrue(page.shoppingCartProductNamesList.get(i).isDisplayed());

            jsScroll(page.shoppingCartProductNamesList.get(i));
        }

        // delete product
        while (page.cartDeleteXList.size() != 0) {

            jsScrollClick(page.cartDeleteXList.get(0));
            waitFor(1);
        }
    }
}
