@Test05

  Feature: Register User with existing email

    Scenario: Register User with existing email
      Given Kullanici automation anasayfasinda
      Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
      Then  Kullanici Signup - Login dügmesine tıklar
      Then  Kullanici New User Signup!'in görünür oldugunu dorgular
      Then  Kullanici NewUserSignup alanına gecerli isim ve email adresi girer
      Then  Kullanici Signup butonuna tıklar
      And   Kullanici Email Address already exist! yazisinin görünür oldugunu dogrular





