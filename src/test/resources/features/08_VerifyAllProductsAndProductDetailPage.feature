
  @TC008
  Feature: Verify All Products and product detail page

    Scenario: Verify All Products and product detail page

         Given Kullanici automation anasayfasinda
         Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
         And   Kullanici Urunler dügmesine tiklar
         Then  Kullanicinin TUM URUNLER sayfasina basariyla gittigini doğrular
         Then  Kullanici Urun listesi görünür oldugunu dogrular
         And   Kullanici ilk urunun Urunu Goruntule ye tiklar
         And   Kullanici urun detay sayfasina yonlendirilir
         Then  Kullanici ayrıntilarin gorunurr oldugunu dogrular urun adi, kategori, fiyat, bulunabilirlik, durum, marka