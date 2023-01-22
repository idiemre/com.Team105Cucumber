Feature: US1010 kullanici Scenerio Outline ile editor sayfasinda kayit olusturur


  Scenario Outline: TC15 Editor sayfasinda birden fazla kayit olusturabilmeli

    When kullanici "editorUrl" anasayfaya gider
    Then new butonuna basar
    And  First name kutusuna "<firstName>" yazar
    And  Last name kutusuna "<lastName>" yazar
    And  Position kutusuna "<position>" yazar
    And  Office kutusuna "<office>" yazar
    And  Extension kutusuna "<Extension>" yazar
    And  Start date kutusuna "<startDate>" yazar
    And  Salary kutusuna "<salary>" yazar

    And  Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
    And  2 saniye bekler
    And sayfayi kapatir

    Examples:
     |firstName |lastName |position |office   |Extension |startDate  |salary |
     |Ilker     |Bulut    |QA       |Istanbul |Levent    |2021-01-01 |20000  |
     |Ramazan   |Can      |QA lead  | Ankara  |Kizilay   |2021-10-01 |25000  |
     |Sule      |saglam   |Test Lead| Izmir   |Konak     |2022-02-02 |23000  |
     |Yasar     |U        |QA       | Istanbul|Kadikoy   |2023-01-01 |25000  |
     |Meryem    |Toprak   |QA       | Istanbul|Kadikoy   |2023-01-01 |25000  |



