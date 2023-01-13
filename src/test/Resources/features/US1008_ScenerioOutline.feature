Feature: Us1008 Scenerio Outline ile birden fazla data icin test calistirma
  @wip
  Scenario Outline:# amazon anasayfaya gidelim Nutella Java Samsung ve Apple icin arama yapi
      # arama sonuclarinin aradigimiz kelimeyi icerdigini test edelim

    Given kullanici "amazonUrl" anasayfaya gider
    Then  amazon arama kutusuna "<arananUrun>" yazip aratir
    And arama sonuclarinin "<arananUrun>" iceredigini test eder
    Then sayfayi kapatir


    Examples:
    |arananUrun|
    |Nutella   |
    |Java      |
    |Samsung   |
    |Apple     |