@p1
Feature: US1006 kullanici configuration dosyasindaki bilgilerle login olabilmeli
  
  Scenario: TC09 gecerli kullanici adi ve gecersiz sifre ile Pozitif Login Testi
    
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine tiklar
    And kullanici kutusuna "qdGecerliUsername" yazar
    And password kutusuna "qdGecerliPassword" yazar
    Then login butonuna basar
    And basarili giris yapildigini test eder



