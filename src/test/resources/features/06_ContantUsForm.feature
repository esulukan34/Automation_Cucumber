@Test06
Feature: Contant us form

  Scenario: Contant us form
    Given Kullanici automation anasayfasinda
    Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
    Then  Kullanici Contact Us butonuna tıklar
    Then  Kullanici GET IN TOUCH ifadesinin gorunur oldugunu dogrular
    Then  Kullanici name, email, subject and message kisimlarini doldurur
    Then  Kullanici dosya yükler
    Then  Kullanici submit butonuna tiklar
    Then  Kullanici Click Ok butonuna tiklar
    Then  Kullanici Verify success message Success! Your details have been submitted successfully.'mesajinin gorunur oldugunu dogrular
    And   Kullanici Home dugmesine tiklar ve ana sayfaya geldigini dogrular
