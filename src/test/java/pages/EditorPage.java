package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//span[text()='New']")
    public WebElement newButonu;

    @FindBy (xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastName;

    @FindBy (xpath = "//input[@id='DTE_Field_position']")
    public WebElement position;

    @FindBy (xpath = "//input[@id='DTE_Field_office']")
    public WebElement office;

    @FindBy (xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extension;

    @FindBy (xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDate;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButonu;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchKutusu;

    @FindBy (xpath = "//td[@class='sorting_1']")
    public WebElement ilkIsimElementi;


}
