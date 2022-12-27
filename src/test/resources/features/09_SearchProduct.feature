
  @TC009
  Feature: Search Product

    Scenario: Search Product

      Given Kullanici automation anasayfasinda
      Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
      And   Kullanici Urunler dügmesine tiklar
      Then  Kullanicinin TUM URUNLER sayfasina basariyla gittigini doğrular
      And   Kullanici arama box ina urun adini girer ve ara dugmesine tiklar
      And   Kullanici ARARAN URUNLER in gorunur oldugunu dogrular
      And   Kullanici aramayla ilgili tum urunlerin gorunur oldugunu dogrular
