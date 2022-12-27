package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutomationPage;

public class T11_VerifySubscriptionInCartPage {

    AutomationPage page = new AutomationPage();

    @Then("Kullanici Cart düğmesine tıklar")
    public void kullaniciCartDüğmesineTıklar() {

        page.cartButton.click();

    }
}
