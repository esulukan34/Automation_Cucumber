@Test03
Feature: Login User with incorrect email and password

  Scenario: Login User with incorrect email and password
    Given Kullanici automation anasayfasinda
    Then Kullanici ana sayfanın basarıyla göründüğünü doğrular
    Then Kullanici Signup - Login dügmesine tıklar
    Then Kullanici Login to your account'un gorunur oldugunu dogrular
    Then Kullanici Yanlis e-posta adresini ve şifreyi girer
    Then Kullanici login button'una tiklar
    And  Kullanici Your email or password is incorrect!'in gorundugunu dogrular
