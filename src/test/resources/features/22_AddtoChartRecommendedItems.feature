Feature: Recommended Items sepete ekleme

  @TC_22
  Scenario: Recommended Items sepete ekleme
    Given Kullanici automation anasayfasinda
    Then Sayfanin en altina kayar
    Then RECOMMENDED ITEMS görünür oldugunu dogrular
    Then Recommended Items urun secer ve Sepete Ekle'ye tıklar
    Then View Chart buttonuna tiklar
    Then Urunun View Chart'ta görüntülendiğini doğrular




