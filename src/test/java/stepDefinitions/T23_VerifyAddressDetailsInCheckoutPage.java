package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutomationPage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class T23_VerifyAddressDetailsInCheckoutPage {

    AutomationPage page = new AutomationPage();
    List<String> registrationAddress = new ArrayList<>(Arrays.asList(Hooks.gender + " " + Hooks.firstname + " " + Hooks.lastname,
            Hooks.company,
            Hooks.address1,
            Hooks.address2,
            Hooks.city + " " + Hooks.state + " " + Hooks.zipCode,
            Hooks.country,
            Hooks.phoneNumber));

    @Then("Kullanici Teslimat adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrular")
    public void kullaniciTeslimatAdresininHesapKaydıSırasındaGirilenAdresleAynıOlduğunuDoğrular() {

        System.out.println("******* Registration Address *******");
        for (String w : registrationAddress) {

            System.out.println(w);
        }

        System.out.println("********* Delivery Address *********");
        for (int i = 1; i <= page.deliveryAddress.size() - 1; i++) {

            System.out.println(page.deliveryAddress.get(i).getText());
            assertEquals(registrationAddress.get(i - 1), page.deliveryAddress.get(i).getText());
        }

    }

    @Then("Kullanici Fatura adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrular")
    public void kullaniciFaturaAdresininHesapKaydıSırasındaGirilenAdresleAynıOlduğunuDoğrular() {
        System.out.println("------- Registration Address -------");

        for (String w : registrationAddress) {

            System.out.println(w);

        }

        System.out.println("------- Billing Address -------");

        for (int i = 1; i <= page.billingAddress.size() - 1; i++) {

            System.out.println(page.billingAddress.get(i).getText());
            assertEquals(registrationAddress.get(i - 1), page.billingAddress.get(i).getText());

        }
    }

    @Then("Kullanici kaydoldaki tum ayrintilari doldurur ve hesap oluşturur")
    public void kullaniciKaydoldakiTumAyrintilariDoldururVeHesapOluşturur() {

        new Hooks().register();

    }
}
