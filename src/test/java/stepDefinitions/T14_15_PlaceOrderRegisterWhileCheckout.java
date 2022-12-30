package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T14_15_PlaceOrderRegisterWhileCheckout {


    AutomationPage page = new AutomationPage();

    @When("Kullanici sepete urun ekler")
    public void kullaniciSepeteUrunEkler() {

        try {
            ReusableMethods.jsScrollClick(page.firstProductAddToCart);

        } catch (Exception e) {

            System.out.println("Check first product");
            e.printStackTrace();
        }

    }

    @And("Kullanici Cart butonuna tiklar")
    public void kullaniciCartButonunaTiklar() {

        try {

            ReusableMethods.waitForVisibility(page.continueShoppingButton, 5);
            page.continueShoppingButton.click();

        } catch (Exception e) {

        }

        page.cartIcon.click();

    }

    @Then("Kullanici Cart sayfasini goruntulendigini dogrular")
    public void kullaniciCartSayfasiniGoruntulendiginiDogrular() {
        ReusableMethods.waitFor(2);

        Assert.assertTrue(page.shoppingCart.isDisplayed());

    }

    @When("Kullanici Proceed To Checkout butonuna tiklar")
    public void kullaniciProceedToCheckoutButonunaTiklar() {
        page.proceedToCheckoutButton.click();
    }


    @And("Kullanici Register Login butonuna tiklar")
    public void kullaniciRegisterLoginButonunaTiklar() {
        ReusableMethods.waitForVisibility(page.registerLoginButton, 5);
        page.registerLoginButton.click();

    }

    @And("Kullanici kaydoldaki tum ayrintilari doldurur ve hesap olusturur")
    public void kullaniciKaydoldakiTumAyrintilariDoldururVeHesapOlusturur() {

        page.userName.click();
        ReusableMethods.getActions().sendKeys(ReusableMethods.getFaker().name().name()).
                sendKeys(Keys.TAB).sendKeys(ReusableMethods.getFaker().internet().emailAddress()).perform();

        page.signUp2.click();

        page.enter.isDisplayed();

        page.mr.click();
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().internet().password()).perform();

        ReusableMethods.selectDropDown(page.day);
        ReusableMethods.selectDropDown(page.month);
        ReusableMethods.selectDropDown(page.year);

        ReusableMethods.jsScrollClick(page.newslatter);

        ReusableMethods.jsScrollClick(page.partners);

        ReusableMethods.jsScroll(page.firstname);

        ReusableMethods.getActions().click(page.firstname)
                .sendKeys(ReusableMethods.getFaker().name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().address().streetAddress()).perform();

        ReusableMethods.selectDropDown(page.country);
        ReusableMethods.jsScroll(page.state);
        ReusableMethods.getActions().click(page.state).
                sendKeys(Faker.instance().address().state()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().address().city()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(ReusableMethods.getFaker().phoneNumber().phoneNumber()).perform();

        page.createAccount.click();


    }

    @Then("Kullanici ACCOUNT CREATED! dogrular ve Continue butonuna tiklar")
    public void kullaniciACCOUNTCREATEDDogrularVeContinueButonunaTiklar() {

        // ReusableMethods.waitForVisibility(auto.accountCreate, 10);
        Assert.assertTrue(page.accountCreate.isDisplayed());
        ReusableMethods.jsScrollClick(page.continueButton);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.jsScrollClick(page.continueButton);

    }

    @And("Kullanici Logged in as username gorunurlugunu dogrular")
    public void kullaniciLoggedInAsUsernameGorunurlugunuDogrular() {

        page.logged.isDisplayed();
    }


    @Then("Kullanici Address Details ve Review Your Order dogrular")
    public void kullaniciAddressDetailsVeReviewYourOrderDogrular() {
        ReusableMethods.waitForVisibility(page.addressDetailsHeader, 5);

        ReusableMethods.waitForVisibility(page.reviewYourOrderHeader, 5);

    }

    @And("Kullanici aciklama metin alanina aciklamayi girer ve Place Order a tiklar")
    public void kullaniciAciklamaMetinAlaninaAciklamayiGirerVePlaceOrderATiklar() {
        page.messageTextBox.sendKeys(ReusableMethods.getFaker().toString());
        page.placeOrderButton.click();
    }

    @And("Kullanici odeme ayrintilarini girer: Karttaki Ad, Kart Numarasi, CVC, Son Kullanma Tarihi")
    public void kullaniciOdemeAyrintilariniGirerKarttakiAdKartNumarasiCVCSonKullanmaTarihi() {

        ReusableMethods.getActions().click(page.nameOnCardTextBox)
                .sendKeys("deneme")
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.getFaker().business().creditCardNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().number().digits(3))
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.dateMonth())
                .sendKeys(Keys.TAB)
                .sendKeys(ReusableMethods.dateYear())
                .perform();

    }

    @And("Kullanici Pay and Confirm Order butonuna tiklar")
    public void kullaniciPayAndConfirmOrderButonunaTiklar() {
        page.payAndConfirmOrderButton.click();
    }

    @Then("Kullanici Your order has been placed successfully! mesajini dogrular")
    public void kullaniciYourOrderHasBeenPlacedSuccessfullyMesajiniDogrular() {
        Assert.assertTrue(page.alertSucessButton.isDisplayed());
    }

    @And("Kullanici ACCOUNT DELETED! gorunur oldugunu dogrular ve Continue butonuna tiklar")
    public void kullaniciACCOUNTDELETEDGorunurOldugunuDogrularVeContinueButonunaTiklar() {

        ReusableMethods.waitForVisibility(page.accountDeletedText, 5);

        page.continueButton.click();

    }
}
