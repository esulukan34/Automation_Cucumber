package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class T24_Download {
    AutomationPage page=new AutomationPage();
    @Given("Kullanici Cart dugmesine tıklar")
    public void kullaniciCartDugmesineTıklar() {
        page.WiewCart.click();
    }

    @Then("Faturayı İndir düğmesini tıklayın ve faturanın başarıyla indirildiğini doğrulayın.")
    public void faturayıİndirDüğmesiniTıklayınVeFaturanınBaşarıylaIndirildiğiniDoğrulayın() {

        ReusableMethods.jsScrollClick(page.downloadInvoice);

        String filePath = "C:\\Users\\feyza2\\Downloads\\invoice.txt";
        assertTrue(Files.exists(Paths.get(filePath)));
    }
}
