Feature: Verify address details in checkout page

  @Test23
  Scenario: Verify address details in checkout page
    Given Kullanici automation anasayfasinda
    Then Kullanici ana sayfanın basarıyla göründüğünü doğrular
    Then Kullanici Signup - Login dügmesine tıklar
    Then Kullanici kaydoldaki tum ayrintilari doldurur ve hesap oluşturur
    Then Kullanici ACCOUNT CREATED! dogrular ve Continue butonuna tiklar
    Then Kullanici Logged in as username gorunurlugunu dogrular
    Then Kullanici sepete urun ekler
    Then Kullanici Cart butonuna tiklar
    Then Kullanici Cart sayfasini goruntulendigini dogrular
    Then Kullanici Proceed To Checkout butonuna tiklar
    Then Kullanici Teslimat adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrular
    Then Kullanici Fatura adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrular
    Then Kullanici Delete Account butonuna basar
    And Kullanici ACCOUNT DELETED! gorunur oldugunu dogrular ve Continue butonuna tiklar
