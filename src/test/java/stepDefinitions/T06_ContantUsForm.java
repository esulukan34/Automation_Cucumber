package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T06_ContantUsForm {

    AutomationPage page = new AutomationPage();
    @Then("Kullanici Contact Us butonuna tıklar")
    public void kullaniciContactUsButonunaTıklar() {

        page.contactUs.click();
    }

    @Then("Kullanici GET IN TOUCH ifadesinin gorunur oldugunu dogrular")
    public void kullaniciGETINTOUCHIfadesininGorunurOldugunuDogrular() {

        assertTrue(page.getInTouchTitle.isDisplayed());
    }

    @Then("Kullanici name, email, subject and message kisimlarini doldurur")
    public void kullaniciNameEmailSubjectAndMessageKisimlariniDoldurur() {

       page.nameBoxContact.sendKeys(Faker.instance().name().firstName());
       page.emailBoxContact.sendKeys(Faker.instance().internet().emailAddress());
       page.subjectBoxContact.sendKeys(Faker.instance().toString());
       page.messageBoxContact.sendKeys(Faker.instance().toString());
    }

    @Then("Kullanici dosya yükler")
    public void kullaniciDosyaYükler() {

        String fis = "C:\\techpro Java\\AutomationExercise\\Automation_Cucumber\\src\\resources\\car-2.jpg";
        page.uploadFile.sendKeys(fis);
    }

    @Then("Kullanici submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {

       ReusableMethods.jsScrollClick(page.submitContact);

    }

    @Then("Kullanici Click Ok butonuna tiklar")
    public void kullaniciClickOkButonunaTiklar() {

        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Kullanici Verify success message Success! Your details have been submitted successfully.'mesajinin gorunur oldugunu dogrular")
    public void kullaniciVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyMesajininGorunurOldugunuDogrular() {

        assertTrue(page.successMessage.isDisplayed());
    }

    @And("Kullanici Home dugmesine tiklar ve ana sayfaya geldigini dogrular")
    public void kullaniciHomeDugmesineTiklarVeAnaSayfayaGeldiginiDogrular() {

        page.homeButtonContact.click();

        String expectedData = "https://www.automationexercise.com/";
        String actualData = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedData,actualData);
    }
}
