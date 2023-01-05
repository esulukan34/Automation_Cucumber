
@TC026
  Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

    Scenario: TC026 Verify Scroll Up without 'Arrow' button and Scroll Down functionality

        Given Kullanici automation anasayfasinda
        Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
        When  Sayfayi asagiya dogru kaydirin
        Then  ABONELIK in gorunur oldugunu dogrulayin
        When  Sayfayi yukari kaydir
        Then  Sayfanin yukari kaydirildigini ve Otomasyon Muhendisleri icin Tam Tesekkullu uygulama web sitesi metninin ekranda gorundugunu dogrulayin