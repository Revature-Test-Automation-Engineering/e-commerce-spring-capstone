package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfilePage extends Page {

    private WebDriver driver;

    public UserProfilePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath="//button[text() = 'Update']")
    public WebElement updateButton;

    @FindBy(id="deactivate")
    public WebElement deactivate;

    @FindBy(xpath="//button[text() = 'Deactivate']")
    public WebElement deactivateButton;

    @FindBy(id="cardNumber")
    public WebElement cardNumber;

    @FindBy(id="expDate")
    public WebElement cardDate;

    @FindBy(id="ccv")
    public WebElement ccv;

    @FindBy(xpath = "/html/body/div/main[2]/div/form/div/div[4]/div[1]/button")
    public WebElement addPayment;

    @FindBy(xpath="//button[contains(text(),'DELETE')][last()]")
    public WebElement deleteButton;
}
