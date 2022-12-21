@Test02
Feature: Login User with correct email and password

  Scenario: Login User with correct email and password
    Given Kullanici automation anasayfasinda
    Then Kullanici ana sayfanın basarıyla göründüğünü doğrular
    Then Kullanici Signup - Login dügmesine tıklar
    Then Kullanici Login to your account'un gorunur oldugunu dogrular
    Then Kullanici Dogru e-posta adresini ve şifreyi girer
    Then Kullanici login button'una tiklar
    Then Kullanici Logged in as username gorunur oldugunu dogrular
    Then Kullanici Delete Account butonuna basar
    #And  Kullanici ACCOUNT DELETED! gorunur oldugunu dogrular
