package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella iceredigini test eder")
    public void arama_sonuclarinin_nutella_iceredigini_test_eder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedAramaSonucu="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedAramaSonucu));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @Then("arama sonuclarinin Java iceredigini test eder")
    public void aramaSonuclarininJavaIcerediginiTestEder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedAramaSonucu="Java";

        Assert.assertTrue(actualAramaSonucu.contains(expectedAramaSonucu));
    }

    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazonAramaKutusunaSamsungYazipAratir() {
        amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung"+ Keys.ENTER);
    }

    @Then("arama sonuclarinin Samsung iceredigini test eder")
    public void aramaSonuclarininSamsungIcerediginiTestEder() {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();
        String expectedAramaSonucu="Samsung";

        Assert.assertTrue(actualAramaSonucu.contains(expectedAramaSonucu));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }
    }

    @Then("amazon arama kutusuna {string} yazip aratir")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime) {
        amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);
    }

    @And("arama sonuclarinin {string} iceredigini test eder")
    public void aramaSonuclarininIcerediginiTestEder(String arananKelime) {
        String actualAramaSonucu=amazonPage.aramaSonucuElementi.getText();


        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }

    @Then("url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {

        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(arananKelime));
    }
}
