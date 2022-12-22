package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;

public class T03_LoginUserInCorrect {

    AutomationPage page = new AutomationPage();
    @Then("Kullanici Yanlis e-posta adresini ve şifreyi girer")
    public void kullaniciYanlisEPostaAdresiniVeŞifreyiGirer() {

        page.emailBoxLogin.sendKeys("mahmut@gmail.com");
        page.passwordBoxLogin.sendKeys("qwert1233.");
    }

    @And("Kullanici Your email or password is incorrect!'in gorundugunu dogrular")
    public void kullaniciYourEmailOrPasswordIsIncorrectInGorundugunuDogrular() {

        Assert.assertTrue(page.yourEmailOrPasswordIsIncorrect.isDisplayed());
    }
}
