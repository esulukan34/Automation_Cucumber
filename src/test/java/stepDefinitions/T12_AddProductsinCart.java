package stepDefinitions;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;


public class T12_AddProductsinCart {

    AutomationPage page = new AutomationPage();


    @Then("Kullanici Products butonuna tiklar")
    public void kullanici_products_butonuna_tiklar() {

        page.products.click();
        Driver.getDriver().navigate().refresh();
        page.products.click();
    }

    @Then("Kullanici ilk ürün üzerine gelip  Add to cart tiklar")
    public void kullanici_ilk_ürün_üzerine_gelip_add_to_cart_tiklar() {

        ReusableMethods.jsScrollClick(page.addToChart);
        page.continueShopping.click();


    }


    @Then("Kullanici ikinci ürün üzerine gelip Add to cart tiklar")
    public void kullanici_ikinci_ürün_üzerine_gelip_add_to_cart_tiklar() {

        ReusableMethods.jsScrollClick(page.addToChart2);

    }

    @Then("Kullanici View Cart butonuna tiklar")
    public void kullanici_view_cart_butonuna_tiklar() {

        page.viewCart.click();

    }


    @Then("Kullanici her iki ürünün de sepete eklendigini dogrular")
    public void kullanici_her_iki_ürünün_de_sepete_eklendigini_dogrular() {

        int productListSize = page.productsList.size();
        assertTrue(productListSize == 2);
    }


    @Then("Kullanici fiyatlarini, miktarlarini ve toplam fiyatlarini dogrular")
    public void kullanici_fiyatlarini_miktarlarini_ve_toplam_fiyatlarini_dogrular() {

      //  System.out.println("first product price -> " + page.firstProductPrice.getText());
      //  System.out.println("second product total-> " + page.secondProductTotal.getText());

        Assert.assertTrue(page.firstProductPrice.isDisplayed()
        && page.secondProductPrice.isDisplayed()
        && page.firstProductQuantity.isDisplayed()
        && page.secondProductQuantity.isDisplayed()
        && page.firstProductTotal.isDisplayed()
        && page.secondProductTotal.isDisplayed());


    }

}
