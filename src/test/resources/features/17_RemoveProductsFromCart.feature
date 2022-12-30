@TC17
Feature: RemoveProductsFromCart
  Scenario: RemoveProductsFromCart
    Given Kullanici automation anasayfasinda
    Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
    Then  Kullanici sepete urun ekler
    Then  Kullanici sepeti goruntuler
    Then  Kullanici sepette oldugunu dogrular
    Then  Kullanici sepeti temizler ve sepetin bos oldugunu dogrular
