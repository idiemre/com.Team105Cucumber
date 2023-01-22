@wip

Feature: US1011 Kullanici herokupp sayfasinda butonlarin gorunur oldugunu test eder

  Scenario: TC16 kullanici bekleyerek butonlarrin gorunur olmasini saglar

  Given kullanici "herokuppUrl" anasayfaya gider
  Then  Add Element butonuna basar
  And Delete butonu gorunur oluncaya kadar bekler
  And Delete butonunun gorunur oldugunu test eder
  Then Delete butonuna basarak butonu siler
  And  Delete butonunun gorunmedigini test eder


# https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
# 1)“Add Element” butona basin
# 2)“Delete” butonu gorunur oluncaya kadar bekleyin
# 3)“Delete” butonunun gorunur oldugunu test edin
# 4)Delete butonuna basarak butonu silin
# 5)Delete butonunun gorunmedigini test edin