package stepdefinitons;

import io.cucumber.java.en.Then;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuAppPage;
import utilities.Driver;

public class herokuAppStepdefinitions {

    HerokuAppPage herokuAppPage=new HerokuAppPage();

    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuAppPage.addButton.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() throws InterruptedException {
        Thread.sleep(89);
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuAppPage.deleteButton.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuAppPage.deleteButton.click();
       }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        int flag=3;

        try {
            herokuAppPage.deleteButton.click();
        } catch (NoSuchElementException e) {
            flag++;

        }
        Assert.assertTrue(flag==4);

    }

}
