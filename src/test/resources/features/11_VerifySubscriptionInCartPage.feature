@Test11
  Feature: Verify Subscription in Cart page

   Scenario: Verify Subscription in Cart page
     Given Kullanici automation anasayfasinda
     Then Kullanici ana sayfanın basarıyla göründüğünü doğrular
     Then Kullanici Cart düğmesine tıklar
     Then Kullanici altbilgiye doğru aşağı kaydırır
     Then Kullanici SUBSCRIPTION metnini doğrular
     Then Kullanici giriş alanına email adresini girer ve ok düğmesine tıklar
     And Kullanici You have been successfully subscribed!'in görünür olduğunu doğrular