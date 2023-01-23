package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/Resources/features",
        glue = "stepdefinitons",
        tags = "@wip",
        dryRun = false

)


public class Runner {
    /*
        Cucumber'da Runner class'i bos bir class'tir
        Runner class'ini diger class'lardan farkli kilan
        ve TestNG'deki xml dosyalari gibi calismayi saglayan
        2 adet notasyon vardir

        @RunWith notasyonu projemize cucumber junit dependency eklememeizin sebebidir
        bu sayede runner class'larimiz cucumber ile calisir

        @CucumberOptions notasyonu ile isteigimiz ozellikleri Runer class'ina ekleyebiliriz
        Raporlama gibi ekstra option'lari da ileride ekleyecegiz
        Ancak
        Oncelikli gorevi features dosyalari ile stepDefinitions 'da bulunan
        Java method'larini ilsiklendirmektir

        tags : features klasoru icerisinde yazilan tag(lari) aratip
        buldugu tum feature veya scenerio'lari calistirir

        dryRun : iki deger alabilir
        true : secilirse, verilen tag ile isaretli olan feeature veya scenerio'daki
               eksik stepdefinitions'lari bulup
               ilgili method'lari olusturur
               hic bir sekilde testimizi calistirmaz
               eksik adim yoksa test passed olarak isaretler

        false : secilirse, verilen tag ile isaretlenen
                Feature veya scenerio'lari calistirir
     */
}
