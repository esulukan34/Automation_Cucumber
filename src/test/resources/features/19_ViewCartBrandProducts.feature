Feature:
  @Test19
  Scenario: View ve Cart Brand Products
    Given Kullanici automation anasayfasinda
    Then  Kullanici 'Ürünler' düğmesine tıklar
    And   Kullanici Sol taraftaki çubukta Markaların göründüğünü doğrular
    And   Kullanici Herhangi bir marka adına tıklar
    And   Kullanici marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrular
    And   Kullanici Sol taraftaki çubukta herhangi bir başka marka bağlantısına tıklar
    And   Kullanici Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrular


