Feature: US1014 Automation exercise sitesinde kullanici olusturma

  Scenario: TC19 kullaanici automation exercise sayfasinda kullanici olusturabilmeli

  1.http://automationexercise.com/index.php sayfasina gidelim
    
  2.Cucumber ile asagidaki testi yapalim
    Given kullanici "automationUrl" anasayfaya gider
    And user sign up linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin