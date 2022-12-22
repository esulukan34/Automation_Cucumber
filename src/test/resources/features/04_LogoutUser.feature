@Test04

  Feature: Logout User

    Scenario: Logout User
      Given Kullanici automation anasayfasinda
      Then Kullanici ana sayfanın basarıyla göründüğünü doğrular
      Then Kullanici Signup - Login dügmesine tıklar
      Then Kullanici Login to your account'un gorunur oldugunu dogrular
      Then Kullanici gecerli e-posta adresini ve şifreyi girer
      Then Kullanici login button'una tiklar
      Then Kullanici Logged in as username gorunur oldugunu dogrular
      Then Kullanici Logout button'una tıklar
      And Kullanici LoginPage'de oldugunu dogrular