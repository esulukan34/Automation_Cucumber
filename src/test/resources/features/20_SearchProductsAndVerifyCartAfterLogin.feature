Feature: Search Products and Verify Cart After Login

  @Test20
  Scenario: Search Products and Verify Cart After Login
    Given Kullanici automation anasayfasinda
    When Kullanici Urunler dügmesine tiklar
    Then Kullanicinin TUM URUNLER sayfasina basariyla gittigini doğrular
    When Kullanici arama kutusuna urun adini girer ve ara dugmesine tiklar
    Then Kullanici Aranan Urunler'in gorunur oldugunu dogrulayin
    Then Kullanici aramayla ilgili tum urunlerin gorunur oldugunu dogrular
    Then Kullanici urunleri sepete ekler
    Then Kullanici sepet dugmesine tiklar ve urunlerin sepette gorundugunu dogrular
    Then Kullanici Kaydol-Giris yap dugmesine tiklar ve giris bilgilerini girer
    Then Kullanici tekrar sepet sayfasina gider
    And Kullanici giris yaptiktan sonra bu urunlerin de sepette gorundugunu dogrular
