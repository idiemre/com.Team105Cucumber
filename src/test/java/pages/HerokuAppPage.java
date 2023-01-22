package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuAppPage {

    public HerokuAppPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    public WebElement addButton;

    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    public WebElement deleteButton;


}