@TC21
  Feature: Add review on product
    Scenario: Add review on product
      Given Kullanici automation anasayfasinda
      When Kullanici Urunler dügmesine tiklar
      Then Kullanicinin TUM URUNLER sayfasina basariyla gittigini doğrular
      When Kullanici ana sayfadaki herhangi bir urun için View Product'a tiklar
      Then Kullanici Incelemenizi Yazinin görünür oldugunu dogrular
      And Kullanici Adi, e-postayi girin ve gozden gecirir
      When Kullanici Gonder dugmesini tiklar
      Then Kullanici "Thank you for your review." basari mesajini dogrular

