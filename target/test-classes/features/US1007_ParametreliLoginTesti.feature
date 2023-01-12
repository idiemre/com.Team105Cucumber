@wip
Feature: Kullanici yanlis bilgilerle giris yapamaz

  Scenario: TC10 gecerli kullanici adi ve sifre ile Pozitif Login Testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine tiklar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecersizPassword" yazar
    Then login butonuna basar
    And  giris yapilamadigini test eder
    And 3 saniye bekler
    Then sayfayi kapatir

  Scenario: TC11 gecersiz kullanici adi ve gecerli sifre ile Negatif Login Testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine tiklar
    And kullanici kutusuna "qdGecersizUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then login butonuna basar
    And  giris yapilamadigini test eder
    Then sayfayi kapatir

  Scenario: TC12 gecersiz kullanici adi ve gecersiz sifre ile Negatif Login Testi

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine tiklar
    And kullanici kutusuna "qdGecersizUsername" yazar
    And password kutusuna "qdGecersizPassword" yazar
    Then login butonuna basar
    And  giris yapilamadigini test eder
    Then sayfayi kapatir