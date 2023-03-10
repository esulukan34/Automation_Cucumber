package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static utilities.Driver.getDriver;
import static utilities.Driver.selectDropDown;
import static utilities.ReusableMethods.*;

public class T16_PlaceOrderLoginbeforeCheckout {

    AutomationPage page = new AutomationPage();

    static String phoneNumber;
    static String firstname;
    static String lastname;
    static String country;

    @Then("Kullanici Dogru e-posta adresini ve sifreyi girerr")
    public void kullanici_dogru_e_posta_adresini_ve_sifreyi_girerr() {
        getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("autoUrl"));
        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windows.get(1));

        String email = Faker.instance().internet().emailAddress();
        String password = Faker.instance().internet().password();
        firstname = Faker.instance().name().firstName();
        lastname = Faker.instance().name().lastName();
        phoneNumber = Faker.instance().phoneNumber().cellPhone();

        jsScrollClick(page.signupLoginLink);
        page.nameBoxSignup.sendKeys(Faker.instance().name().name());
        page.emailBoxSignup.sendKeys(email);
        page.signupButton.click();
        page.genderList.get(0).click();
        page.passwordBoxNewSignup.sendKeys(password);

        selectDropDown(page.dayDDM);
        selectDropDown(page.monthDDM);
        selectDropDown(page.yearDDM);
        jsScrollClick(page.newsletter);
        jsScrollClick(page.partners);

        jsScroll(page.firstnameBoxNewSignup);
        waitFor(2);
        getActions()
                .click(page.firstnameBoxNewSignup)
                .sendKeys(firstname).sendKeys(Keys.TAB)
                .sendKeys(lastname).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().company().name()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB).perform();

        selectDdmIndex(page.country);
        country = select(page.country).getFirstSelectedOption().getText();
        jsScroll(page.country);
        waitFor(2);

        getActions()
                .click(page.state)
                .sendKeys(Faker.instance().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(phoneNumber).perform();
        jsScrollClick(page.createAccountButton);


        getDriver().switchTo().window(windows.get(0));


        page.emailBoxLogin.sendKeys(email);
        page.passwordBoxLogin.sendKeys(password);


       // page.emailBoxLogin.sendKeys("rgokbulut10@gmail.com");
       //  page.passwordBoxLogin.sendKeys("123456");

    }

    @Then("Kullanici sepeti goruntuler")
    public void kullanici_sepeti_goruntuler()    {
        page.WiewCart.click();
    }

    @Then("Kullanici sepette oldugunu dogrular")
    public void kullanici_sepette_oldugunu_dogrular() {
        String expectedResult = "https://automationexercise.com/view_cart";
        String actualResult = getDriver().getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("Kullanici odeme islemine devam eder adres ayrintilarini dogrular")
    public void kullanici_odeme_islemine_devam_eder_adres_ayrintilarini_dogrular() {
        page.ProceedToCheckout.click();
        Assert.assertTrue(page.addressDetails.isDisplayed());
        page.orderButton.sendKeys("Bu Nas??l ??r??n ?");
        page.placeOrderButton.click();
        getDriver().navigate().refresh();
        page.orderButton.sendKeys("Bu Nas??l ??r??n ?");
        page.placeOrderButton.click();
    }



}
