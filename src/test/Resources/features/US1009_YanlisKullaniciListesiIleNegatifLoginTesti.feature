Feature: US1009 Yanlis kullanici adi ve password listesi ile negatif login testi

  Scenario Outline: TC14 yanlis kullanici listesi ile giris yapilamamali
    
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine tiklar
    And kullanici kutusuna manuel "<yanlisUsername>" yazar
    And password kutusuna manuel "<yanlisPassword>" yazar
    And login butonuna basar
    And giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
    |yanlisUsername  |yanlisPassword|
    |ilker           |ilker@a.com   |
    |mehmet          |mehmet@b.com  |
    |yasar           |yasar@c.com   |
    |Adem            |adem@d.com    |
    |ozgur           |ozgur@e.com   |