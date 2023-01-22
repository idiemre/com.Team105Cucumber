Feature: US1013 kullanici web tablosunda istedigi degerin varligini test eder

  Scenario: TC18 kullanici tabloda deger test edebilmeli

    Given kullanici "guru99Url" anasayfaya gider
    #And guru99 cookies kabul eder
    Then Company listesini consola yazdirir
    And "Sun Pharma." in listede oldugunu test eder