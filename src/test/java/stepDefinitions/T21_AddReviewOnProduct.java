package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.jsScroll;
import static utilities.ReusableMethods.waitForVisibility;

public class T21_AddReviewOnProduct {

    AutomationPage auto = new AutomationPage();


    @Then("Kullanici Incelemenizi Yazinin görünür oldugunu dogrular")
    public void kullaniciIncelemeniziYazininGörünürOldugunuDogrular() {

        jsScroll(auto.writeYourReviewText);
        assertTrue(auto.writeYourReviewText.isDisplayed());

    }

    @And("Kullanici Adi, e-postayi girin ve gozden gecirir")
    public void kullaniciAdiEPostayiGirinVeGozdenGecirir() {

        String name = Faker.instance().name().firstName(),
                email = Faker.instance().internet().emailAddress(),
                reviewAreaText = Faker.instance().toString();

        auto.productDetailsName.sendKeys(name);
        auto.productDetailsEmail.sendKeys(email);
        auto.productDetailsReview.sendKeys(reviewAreaText);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
      // System.out.println("deneme name getAttribute = " + auto.productDetailsName.getAttribute("value"));
      // System.out.println("deneme name = " + js.executeScript("return arguments[0].value", auto.productDetailsName));

        assertEquals(name, js.executeScript("return arguments[0].value", auto.productDetailsName));
        assertEquals(email, js.executeScript("return arguments[0].value", auto.productDetailsEmail));
        assertEquals(reviewAreaText, (String) js.executeScript("return arguments[0].value", auto.productDetailsReview));

    }

    @When("Kullanici Gonder dugmesini tiklar")
    public void kullaniciGonderDugmesiniTiklar() {

        auto.productDetailsButtonReview.click();

    }

    @Then("Kullanici {string} basari mesajini dogrular")
    public void kullaniciBasariMesajiniDogrular(String text) {

        waitForVisibility(auto.thankYouForYourReview, 5);

        assertEquals(text, auto.thankYouForYourReview.getText());

    }
}
