package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AutomationPage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T13_VerifyProductquantityinCart {


    AutomationPage page = new AutomationPage();

    String quantity;


    @Then("Kullanici ana sayfadaki herhangi bir urun için View Product'a tiklar")
    public void kullanici_ana_sayfadaki_herhangi_bir_urun_icin_view_product_a_tiklar() {

        int index = random().nextInt(page.viewProductButtonList.size());
        jsScrollClick(page.viewProductButtonList.get(index));
        Driver.getDriver().navigate().refresh();
        try{
            jsScrollClick(page.viewProductButtonList.get(index));
        }catch (Exception e){

        }


    }

    @Then("Kullanici urun detayının acıldıgını dogrular")
    public void kullanici_urun_detayının_acıldıgını_dogrular() {

        assertTrue(page.productDetail.isDisplayed());
    }


    @Then("Kullanici quantity butonuna {int} girer")
    public void kullanici_quantity_butonuna_girer(Integer miktar) {



        quantity = String.valueOf(miktar);

        page.quantity.click();
        page.quantity.clear();
        page.quantity.sendKeys(quantity);

    }

    @When("Kullanici Add to cart butonuna tiklar")
    public void kullanici_add_to_cart_butonuna_tiklar() {

        jsScrollClick(page.addToCartButton);

    }

    @When("Kulllanici Cart sayfasinda urunun tam miktar ile goruntulendigini dogrular")
    public void kulllanici_cart_sayfasinda_urunun_tam_miktar_ile_goruntulendigini_dogrular() {


        //System.out.println("quantity = " + quantity);
        //System.out.println("page.quantityInCart.getText() = " + page.quantityInCart.getText());

        assertEquals(quantity, page.quantityInCart.getText());

    }

}
