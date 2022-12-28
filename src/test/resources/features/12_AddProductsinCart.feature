@Test12
Feature: Add Products in Cart

  Scenario: Add Products in Cart
    Given Kullanici automation anasayfasinda
    Then Kullanici ana sayfanın basarıyla göründüğünü doğrular
    Then Kullanici Products butonuna tiklar
    Then Kullanici ilk ürün üzerine gelip  Add to cart tiklar
    Then Kullanici ikinci ürün üzerine gelip Add to cart tiklar
    Then Kullanici View Cart butonuna tiklar
    And Kullanici her iki ürünün de sepete eklendigini dogrular
    And Kullanici fiyatlarini, miktarlarini ve toplam fiyatlarini dogrular