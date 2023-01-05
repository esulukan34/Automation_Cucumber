@TC24
Feature: Download Invoice after purchase order
  Scenario: Download Invoice after purchase order
    Given Kullanici automation anasayfasinda
    Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
    When  Kullanici sepete urun ekler
    Given Kullanici Cart dugmesine tıklar
    Then  Kullanici Cart sayfasini goruntulendigini dogrular
    When  Kullanici Proceed To Checkout butonuna tiklar
    And   Kullanici Register Login butonuna tiklar
    And   Kullanici kaydoldaki tum ayrintilari doldurur ve hesap olusturur
    Then  Kullanici ACCOUNT CREATED! dogrular ve Continue butonuna tiklar
    And   Kullanici Logged in as username gorunurlugunu dogrular
    When  Kullanici Cart butonuna tiklar
    And   Kullanici Proceed To Checkout butonuna tiklar
    Then  Kullanici Address Details ve Review Your Order dogrular
    And   Kullanici aciklama metin alanina aciklamayi girer ve Place Order a tiklar
    And   Kullanici odeme ayrintilarini girer: Karttaki Ad, Kart Numarasi, CVC, Son Kullanma Tarihi
    And   Kullanici Pay and Confirm Order butonuna tiklar
    Then  Kullanici Your order has been placed successfully! mesajini dogrular
    Then  Faturayı İndir düğmesini tıklayın ve faturanın başarıyla indirildiğini doğrulayın.
    Then  Kullanici Continue butonuna basar
    When  Kullanici Delete Account butonuna basar
    And   Kullanici ACCOUNT DELETED! gorunur oldugunu dogrular ve Continue butonuna tiklar



