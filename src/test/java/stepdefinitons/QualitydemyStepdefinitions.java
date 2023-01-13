package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Then("ilk sayfa login linkine tiklar")
    public void ilk_sayfa_login_linkine_tiklar() {
       qualitydemyPage.ilkLoginLinki.click();
    }
    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String email) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(email));
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.loginButonu.submit();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {


        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @And("kullanici kutusuna manuel {string} yazar")
    public void kullaniciKutusunaManuelYazar(String userName) {
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(userName);
    }

    @And("password kutusuna manuel {string} yazar")
    public void passwordKutusunaManuelYazar(String password) {
        qualitydemyPage.passwordKutusu.sendKeys(password);
    }
}
