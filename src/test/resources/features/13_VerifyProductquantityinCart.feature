@Test13
  Feature:  Verify Product quantity in Cart

    Scenario: Verify Product quantity in Cart
      Given Kullanici automation anasayfasinda
      Then  Kullanici ana sayfanın basarıyla göründüğünü doğrular
      Then  Kullanici ana sayfadaki herhangi bir urun için View Product'a tiklar
      Then  Kullanici urun detayının acıldıgını dogrular
      Then  Kullanici quantity butonuna 4 girer
      When  Kullanici Add to cart butonuna tiklar
      When  Kullanici View Cart butonuna tiklar
      And   Kulllanici Cart sayfasinda urunun tam miktar ile goruntulendigini dogrular

