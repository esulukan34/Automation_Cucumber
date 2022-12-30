@TC16
Feature: Place Order: Login before Checkout
  Scenario: Place Order: Login before Checkout
    Given Kullanici automation anasayfasinda
    Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
    Then Kullanici Signup - Login dügmesine tıklar
    Then Kullanici Dogru e-posta adresini ve sifreyi girerr
    Then Kullanici login button'una tiklar
    Then Kullanici Logged in as username gorunur oldugunu dogrular
    Then Kullanici sepete urun ekler
    Then Kullanici sepeti goruntuler
    Then Kullanici sepette oldugunu dogrular
    Then Kullanici odeme islemine devam eder adres ayrintilarini dogrular
    Then Kullanici odeme ayrintilarini girer: Karttaki Ad, Kart Numarasi, CVC, Son Kullanma Tarihi
    Then Kullanici Pay and Confirm Order butonuna tiklar
    Then Kullanici Your order has been placed successfully! mesajini dogrular
    Then Kullanici Delete Account butonuna basar
    Then Kullanici ACCOUNT DELETED! gorunur oldugunu dogrular ve Continue butonuna tiklar



