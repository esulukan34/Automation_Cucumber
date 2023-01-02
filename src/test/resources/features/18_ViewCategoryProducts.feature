Feature:
  @Test18
  Scenario:
    Given Kullanici automation anasayfasinda
    Then  Kullanici kategorilerin sol taraftaki çubukta göründüğünü doğrular
    Then  Kullanici 'Women' kategorisine tıklar
    And   Kullanici 'Women' kategorisi altındaki herhangi bir kategori bağlantısına tıklar, örneğin: Dress
    And   Kullanici Kategori sayfasının görüntülendiğini doğrular ve 'WOMEN - DRESS PRODUCTS' metnini onaylar
    And   Kullanici Sol taraftaki çubukta, 'Erkekler' kategorisinin herhangi bir alt kategori bağlantısına tıklar
    And   Kullanicinin o kategori sayfasına yönlendirildiğini doğrular


