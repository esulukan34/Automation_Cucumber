@Test25
  Feature: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
      Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
        Given Kullanici automation anasayfasinda
        Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
        Then  Kullanici Sayfayı aşağıya doğru kaydırır
        Then  Kullanici ABONELİK'in görünür olduğunu doğrular
        When  Kullanici Yukarı doğru hareket etmek için sağ alt taraftaki oka tıklar
        And  Kullanici Sayfanın yukarı kaydırıldığını ve Otomasyon Mühendisleri için Tam Teşekküllü uygulama web sitesi metninin ekranda göründüğünü doğrular