@Test10
  Feature: Verify Subscription in home page

    Scenario: Verify Subscription in home page
    Given Kullanici automation anasayfasinda
    Then Kullanici ana sayfanın basarıyla göründüğünü doğrular
    Then Kullanici altbilgiye doğru aşağı kaydırır
    Then Kullanici SUBSCRIPTION metnini doğrular
    Then Kullanici giriş alanına email adresini girer ve ok düğmesine tıklar
    And Kullanici You have been successfully subscribed!'in görünür olduğunu doğrular