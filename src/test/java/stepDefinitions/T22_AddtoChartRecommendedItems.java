package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;
import utilities.ReusableMethods;

public class T22_AddtoChartRecommendedItems {

    AutomationPage page = new AutomationPage();

    String expectedName, actualName;

    @Then("Sayfanin en altina kayar")
    public void sayfaninEnAltinaKayar() {

        ReusableMethods.jsScroll(page.recommendedItems22);

    }

    @Then("RECOMMENDED ITEMS görünür oldugunu dogrular")
    public void recommendedITEMSGorunurOldugunuDogrular() {

        Assert.assertTrue(page.recommendedItems22.isDisplayed());
    }

    @Then("Recommended Items urun secer ve Sepete Ekle'ye tıklar")
    public void recommendedItemsUrunSecerVeSepeteEkleYeTiklar() {

        int index = ReusableMethods.random().nextInt(page.addChart22List.size()); // 6 üründen 1 ini secicek

        ReusableMethods.visibilityOfWait(page.addChart22List.get(index)); // gelene kadar bekleyecek

        expectedName = page.addChartItemsNameList.get(index).getText();

        ReusableMethods.jsScrollClick(page.addChart22List.get(index)); // ürüne tıklayacak

        System.out.println(expectedName);
    }

    @Then("View Chart buttonuna tiklar")
    public void viewChartButtonunaTiklar() {

        page.viewCart22.click();
    }

    @Then("Urunun View Chart'ta görüntülendiğini doğrular")
    public void urununViewChartTaGoruntulendiginiDogrular() {

        actualName =page.viewChartItem.getText();
        System.out.println(actualName);

        Assert.assertEquals(expectedName, actualName);
        Assert.assertTrue(page.viewChartItem.isDisplayed());

    }

    @Then("Click on View Cart button")
    public void clickOnViewCartButton() {

        page.viewCart22.click();
    }

    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {

        actualName =page.viewChartItem.getText();
        System.out.println(actualName);

        Assert.assertEquals(expectedName, actualName);
        Assert.assertTrue(page.viewChartItem.isDisplayed());


    }


}

